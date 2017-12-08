package com.danjureedeveloper.shelter.data;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.danjureedeveloper.shelter.data.PetContract.PetEntry;
import com.danjureedeveloper.shelter.R;

/**
 * Created by ndoor on 9/6/2017.
 * {@link PetProvider} is the {@link ContentProvider} for the pet table
 */

public class PetProvider extends ContentProvider {

    // Tag for the log messages
    public static final String LOG_TAG = PetProvider.class.getSimpleName();

    // Database helper object
    private PetDbHelper mDbHelper;

    // URI matcher codes for the content URI in the pet table
    private static final int PET = 100;         // For the Pet Table
    private static final int PET_ID = 101;      // For a Single Pet in the Pet Table

    /**
     * UriMatcher object to match a content URI to a corresponding code. Th input is passed into
     * the constructor represents the code to return for the root URI. NOTE: it is common to use
     * NO_MATCH as the input for this case
     */
    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    // State initializer, run the first time anything is called from this class
    static {
        // NOTE: the calls to addURI() go here, for all of the content URI patterns that the
        // provider should recognize. All paths added to the UriMatcher have a corresponding code
        // to return when a match is found.

        // The content URI of the form "content://com.danjureedeveloper.shelter/pet" will map to
        // the integer code {@link #PET}. This URI is used to provide access to MULTIPLE rows of
        // the pet table
        sUriMatcher.addURI(PetContract.CONTENT_AUTHORITY, PetContract.PATH_PET, PET);

        // The content URI of the form "content://com.danjureedeveloper.shelter/pet/#" will map to
        // the integer code {@link #PET_ID}. This URI is used to provide access to ONE single row
        // of the pet table
        sUriMatcher.addURI(PetContract.CONTENT_AUTHORITY, PetContract.PATH_PET + "/#", PET_ID);
    }

    // Initialize the provider and the database helper oject
    @Override
    public boolean onCreate() {
        // Initialize a PetDbHelper object to gain access to the shelter database
        mDbHelper = new PetDbHelper(getContext());
        return true;
    }

    // Perform the query for the given URI using the given projection, selection, selection args
    // and sort order
    @Override
    public Cursor query(@NonNull Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        // Get readable database
        SQLiteDatabase database = mDbHelper.getReadableDatabase();

        // This cursor will hold the result of the query
        Cursor cursor;

        // Figure out if the URI matcher can match the URI to a specific code
        int match = sUriMatcher.match(uri);
        switch (match) {
            case PET:
                // For the PET code, query the pet table directly with the given projection,
                // selection, selection arguments, and sort order.
                // NOTE: the cursor may contain multiple rows of the pet table.
                cursor = database.query(PetEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case PET_ID:
                // For the PET_ID code, extract out the ID from the URI. The selection will be
                // "_id=?" and the selection argument will be a String array containing the actual
                // ID.
                // NOTE: for every "?" in the selection, we need to have an element in the
                // selection arguments that will fill in the "?"
                selection = PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};

                // Perform a query on the pet table with the _id to return a cursor containing that
                // row of the table
                cursor = database.query(PetEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            default:
                // TODO remove this toast when publishing
                Toast.makeText(getContext(), String.valueOf(R.string.unknown_uri),
                        Toast.LENGTH_LONG).show();
                throw new IllegalArgumentException(String.valueOf(R.string.unknown_uri) + uri);
        }

        // Set notification URI on the cursor so we know what content URI the cursor was created
        // for.
        // NOTE: if the data at this URI changes then we know we need to update the cursor
        if (getContext() == null) {
            // TODO remove this toast when publishing
            Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.get_context_null),
                    Toast.LENGTH_LONG).show();
            throw new NullPointerException(String.valueOf(R.string.get_context_null));
        }
        cursor.setNotificationUri(getContext().getContentResolver(), uri);

        return cursor;
    }

    // Returns the MIME type of data for the content URI
    @Override
    public String getType(@NonNull Uri uri) {
        final int match = sUriMatcher.match(uri);
        switch (match) {
            case PET:
                return PetEntry.CONTENT_LIST_TYPE;
            case PET_ID:
                return PetEntry.CONTENT_ITEM_TYPE;
            default:
                // TODO remove this Toast when publishing
                Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.unknown_uri_match),
                        Toast.LENGTH_LONG).show();
                throw new IllegalStateException(String.format(
                        String.valueOf(R.string.unknown_uri_match), uri, match));
        }
    }

    // Insert new data into the provider using the given uri and ContentValues
    @Override
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        final int match = sUriMatcher.match(uri);

        switch (match) {
            case PET:
                return insertPet(uri, contentValues);
            default:
                // TODO remove this Toast when publishing
                Toast.makeText(getContext(), LOG_TAG +
                        String.valueOf(R.string.unsupported_uri_insert), Toast.LENGTH_LONG).show();
                throw new IllegalArgumentException(String.valueOf(R.string.unsupported_uri_insert)
                        + uri);
        }
    }

    // Delete the data at the given selection and selection arguments
    @Override
    public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {
        // Get write-able database
        SQLiteDatabase database = mDbHelper.getWritableDatabase();

        // Track the number of rows that were deleted
        int rowsDeleted;
        final int match = sUriMatcher.match(uri);

        switch (match) {
            case PET:
                // Delete all rows that match the selection and selection arguments for case PET
                rowsDeleted = database.delete(PetEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case PET_ID:
                // Delete a single row given by the ID in the URI
                selection = PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};
                rowsDeleted = database.delete(PetEntry.TABLE_NAME, selection, selectionArgs);
                break;
            default:
                // TODO remove this toast when publishing
                Toast.makeText(getContext(), LOG_TAG +
                        String.valueOf(R.string.unsupported_uri_delete), Toast.LENGTH_LONG).show();
                throw new IllegalArgumentException(
                        String.valueOf(R.string.unsupported_uri_delete) + uri);
        }

        // If 1 or more rows were deleted, then modify all listeners that the data at the given URI
        // has changed
        if (rowsDeleted != 0) {
            if (getContext() == null) {
                // TODO remove this Toast when publishing
                Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.get_context_null),
                        Toast.LENGTH_LONG).show();
                throw new NullPointerException(String.valueOf(R.string.get_context_null));
            }
            getContext().getContentResolver().notifyChange(uri, null);
        }

        // Return the number of rows deleted
        return rowsDeleted;
    }

    // Updates the data at the given selection and selection arguments, with the new contentValues
    @Override
    public int update(@NonNull Uri uri, ContentValues contentValues, String selection,
                      String[] selectionArgs) {
        final int match = sUriMatcher.match(uri);
        switch (match) {
            case PET:
                return updatePet(uri, contentValues, selection, selectionArgs);
            case PET_ID:
                // For the PET_ID code, extract the ID from the URI so we know which row to update.
                // Selection will be "_id=?" and selection arguments will be a String[] containing
                // the actual ID.
                selection = PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};
                return updatePet(uri, contentValues, selection, selectionArgs);
            default:
                // TODO remove this toast when publishing
                Toast.makeText(getContext(), LOG_TAG + String.valueOf(
                        R.string.unsupported_uri_update), Toast.LENGTH_LONG).show();
                throw new IllegalArgumentException(String.valueOf(
                        R.string.unsupported_uri_update) + uri);
        }
    }

    // This method inserts pets in the database with the given contentValues, applying the changes
    // to the rows specified in the selection and selection arguments (could be 0 or 1 or more
    // pets), then returns the number of rows that were successfully inserted
    private Uri insertPet(Uri uri, ContentValues contentValues) {
        // Check that the name value is not null
        String name = contentValues.getAsString(PetEntry.COLUMN_PET_NAME);
        if (name == null) {
            // TODO remove this Toast when publishing
            Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.needs_name),
                    Toast.LENGTH_LONG).show();
            throw new IllegalArgumentException(String.valueOf(R.string.needs_name));
        }

        // Otherwise, get write-able database to update the data
        SQLiteDatabase database = mDbHelper.getWritableDatabase();

        // Insert the new pet with the given values
        long id = database.insert(
                PetEntry.TABLE_NAME,    // The table name
                null,                   // The name of the column in which the framework can insert
                                        // NULL in the event that the contentValues is empty
                                        // NOTE: if this is set to "null" then the framework will
                                        // not insert a row when there are no values
                contentValues);

        // If the ID is -1 then the insertion failed, log an error and return null
        if (id == -1) {
            Log.e(LOG_TAG, String.valueOf(R.string.row_insert_failed) + uri);
            // TODO remove this toast when publishing
            Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.row_insert_failed),
                    Toast.LENGTH_LONG).show();
            return null;
        }

        // Notify all listeners that the data has changed for the pet content URI
        if (getContext() == null) {
            // TODO remove this toast when publishing
            Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.get_context_null),
                    Toast.LENGTH_LONG).show();
            throw new NullPointerException(String.valueOf(R.string.get_context_null));
        }
        getContext().getContentResolver().notifyChange(uri, null);

        // Return the new URI with the ID of the newly inserted row appended at the end
        return ContentUris.withAppendedId(uri, id);
    }

    // This method updates pets in the database with the given contentValues, applying the changes
    // to the rows specified in the selection and selection arguments (could be 0 or 1 or more
    // pets), then returns the number of rows that were successfully updated
    private int updatePet(Uri uri, ContentValues contentValues, String selection,
                          String[] selectionArgs) {

        // If the {@link PetEntry#COLUMN_PET_NAME} key is present, check that the name value is not
        // null
        if (contentValues.containsKey(PetEntry.COLUMN_PET_NAME)) {
            String name = contentValues.getAsString(PetEntry.COLUMN_PET_NAME);
            if (name == null) {
                // TODO remove this toast when publishing
                Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.needs_name),
                        Toast.LENGTH_LONG).show();
                throw new IllegalArgumentException(String.valueOf(R.string.needs_name));
            }
        }

        // If there are no values to update, then don't try to update the database
        if (contentValues.size() == 0) {
            return 0;
        }

        // Otherwise, get write-able database to update the data
        SQLiteDatabase database = mDbHelper.getWritableDatabase();

        // Perform the update on the database and get the number of rows affected
        int rowsUpdated = database.update(PetEntry.TABLE_NAME, contentValues, selection,
                selectionArgs);

        // If 1 or more rows were updated then notify all listeners that the data at the given URI
        // has changed
        if (rowsUpdated != 0) {
            if (getContext() == null) {
                // TODO remove this toast when publishing
                Toast.makeText(getContext(), LOG_TAG + String.valueOf(R.string.get_context_null),
                        Toast.LENGTH_LONG).show();
                throw new NullPointerException(String.valueOf(R.string.get_context_null));
            }
            getContext().getContentResolver().notifyChange(uri, null);
        }

        // Return the number of rows updated
        return rowsUpdated;
    }
}