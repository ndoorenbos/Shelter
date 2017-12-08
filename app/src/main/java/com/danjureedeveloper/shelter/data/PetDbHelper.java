package com.danjureedeveloper.shelter.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.danjureedeveloper.shelter.data.PetContract.PetEntry;

/**
 * Created by ndoor on 9/6/2017.
 * {@link PetDbHelper} is the database helper for the pet table
 */

public class PetDbHelper extends SQLiteOpenHelper {

    // Tag used for log messages
    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    // Database Constants
    private static final String DATABASE_NAME = "shelter.db";   // Database Name
    private static final int DATABASE_VERSION = 1;              // Database Version

    // Construct instance of {@link ShelterDbHelper}
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " +
                PetEntry.TABLE_NAME + " (" +
                PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                PetEntry.COLUMN_PET_IMAGE + " BLOB DEFAULT NULL, " +
                PetEntry.COLUMN_PET_TYPE + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_DESCRIPTION + " TEXT DEFAULT, " +
                PetEntry.COLUMN_PET_AGE_YEARS + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_AGE_MONTHS + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_AGE_GENERATION + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_GENDER + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_lbs + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_OZ + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_SIZE + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_SHELTER + " TEXT, " +
                PetEntry.COLUMN_PET_CITY + " TEXT, " +
                PetEntry.COLUMN_PET_STATE + " INTEGER DEFAULT 0, " +
                PetEntry.COLUMN_PET_ZIP_CODE + " TEXT);";

        // Execute the SQL statement
        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);

        // TODO remove this log when publishing
        Log.v(LOG_TAG, SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // Database is still at version 1, do nothing
    }
}