package com.danjureedeveloper.shelter;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.danjureedeveloper.shelter.danjuree.StatesUSA;
import com.danjureedeveloper.shelter.data.PetContract;
import com.danjureedeveloper.shelter.data.PetContract.PetEntry;

/**
 * Created by ndoor on 9/5/2017.
 * {@link PetCursorAdapter} is an {@link CursorAdapter} for the list view that uses a {@link Cursor}
 * of pet data as its data source. This adapter knows how to create a pet card for each new row of
 * pet data in the {@link Cursor}.
 */

public class PetCursorAdapter extends CursorAdapter {

    // Tag for the log messages
    public static final String LOG_TAG = PetCursorAdapter.class.getSimpleName();

    /**
     * Constructs a new {@link PetCursorAdapter}
     * @param context is the app context
     * @param cursor is the cursor from which to get the data
     */
    public PetCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);      // No flags
    }

    /**
     * Creates a new blank card in the given list view. No data is set/bound to the views yet
     * @param context is the app context
     * @param cursor is the cursor from which to get the data, cursor is moved to correct position
     * @param viewGroup is the parent view to which the new view is attached
     * @return the newly created pet card
     */
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.pet_card, viewGroup, false);
    }

    /**
     * This method binds the pet data (in the current row pointed to by the cursor) to the given
     * card layout
     * @param view is the existing view, returned earlier by newView() method
     * @param context is the app context
     * @param cursor is the cursor from which to get the data, cursor is moved to correct row
     */
    @Override
    public void bindView(View view, final Context context, Cursor cursor) {

        // Find the individual views that we want to modify in the pet_car.xml layout
        LinearLayout linearLayoutPetCard = (LinearLayout)
                view.findViewById(R.id.linear_layout_pet_card);
        ImageView imageViewNoImage = (ImageView) view.findViewById(R.id.image_view_card_no_image);
        ImageView imageViewPetPhoto = (ImageView) view.findViewById(R.id.image_view_pet_card);
        TextView textViewPetName = (TextView) view.findViewById(R.id.text_view_card_name);
        TextView textViewDescription = (TextView) view.findViewById(R.id.text_view_card_type);
        TextView textViewAgeGroup = (TextView) view.findViewById(R.id.text_view_card_age);
        TextView textViewGender = (TextView) view.findViewById(R.id.text_view_card_gender);
        TextView textViewSize = (TextView) view.findViewById(R.id.text_view_card_size);
        TextView textViewShelter = (TextView) view.findViewById(R.id.text_view_card_shelter);
        TextView textViewLocation = (TextView) view.findViewById(R.id.text_view_card_location);

        // Find the columns of pet attributes that we are interested in
        int columnIndexID = cursor.getColumnIndex(PetEntry._ID);
        int columnIndexName = cursor.getColumnIndex(PetEntry.COLUMN_PET_NAME);
        int columnIndexPhoto = cursor.getColumnIndex(PetEntry.COLUMN_PET_IMAGE);
        int columnIndexType = cursor.getColumnIndex(PetEntry.COLUMN_PET_TYPE);
        int columnIndexDescription = cursor.getColumnIndex(PetEntry.COLUMN_PET_DESCRIPTION);
        int columnIndexAgeGroup = cursor.getColumnIndexOrThrow(PetEntry.COLUMN_PET_AGE_GENERATION);
        int columnIndexGender = cursor.getColumnIndex(PetEntry.COLUMN_PET_GENDER);
        int columnIndexSize = cursor.getColumnIndex(PetEntry.COLUMN_PET_SIZE);
        int columnIndexShelter = cursor.getColumnIndex(PetEntry.COLUMN_PET_SHELTER);
        int columnIndexShelterCity = cursor.getColumnIndex(PetEntry.COLUMN_PET_CITY);
        int columnIndexShelterState = cursor.getColumnIndex(PetEntry.COLUMN_PET_STATE);

        // Extract the value from the Cursor for the given column index
        final int petID = cursor.getInt(columnIndexID);                     // Unique ID
        // TODO set up full pet profile to take in the Pet ID of the clicked card

        String petName = cursor.getString(columnIndexName);                 // Pet Name
        byte[] petPhoto = cursor.getBlob(columnIndexPhoto);                 // Pet Photo
        int petType = cursor.getInt(columnIndexType);                       // Pet Species
        // TODO set up sort by species

        String petDescription = cursor.getString(columnIndexDescription);   // Pet Description
        int petAge = cursor.getInt(columnIndexAgeGroup);                    // Pet Age Description
        int petGender = cursor.getInt(columnIndexGender);                   // Pet Gender
        int petSize = cursor.getInt(columnIndexSize);                       // Pet Size Description
        String shelterName = cursor.getString(columnIndexShelter);          // Shelter Name
        String shelterCity = cursor.getString(columnIndexShelterCity);      // Shelter City
        int shelterState = cursor.getInt(columnIndexShelterState);          // Shelter State

        // Convert the pet photo byte[] into a Bitmap
        Bitmap petImage = PetContract.getBitmap(petPhoto);

        // Set the image for the pet card
        imageViewNoImage.setVisibility(View.GONE);
        imageViewPetPhoto.setImageBitmap(petImage);
        imageViewPetPhoto.setVisibility(View.VISIBLE);

        // Decode the age, gender, and size codes to get the corresponding Strings
        String petAgeString = PetContract.getPetAgeGroup(petAge);
        String petGenderString = PetContract.getPetGender(petGender);
        String petSizeString = PetContract.getPetSizeDescription(petSize);

        // Create the location String, use {@link StateUSA} class
        StatesUSA statesUSA = new StatesUSA(shelterState);
        String petStateAbbreviation = String.valueOf(statesUSA.getStateAbbrev());
        String location = shelterCity + ", " + petStateAbbreviation;

        // Set the TextViews with the corresponding pet data
        textViewPetName.setText(petName);
        textViewDescription.setText(petDescription);
        textViewAgeGroup.setText(petAgeString);
        textViewGender.setText(petGenderString);
        textViewSize.setText(petSizeString);
        textViewShelter.setText(shelterName);
        textViewLocation.setText(location);


        // Set OnClickListener for Edit of the Pet
        linearLayoutPetCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO set up a check to verify sign-in before continuing

                // Form the content URI that represents the specific pet that was clicked on by
                // appending the "id" (passed as an input to this method) onto the
                // {@link Pet_Entry#CONTENT_URI}
                Uri mCurrentPetURI = ContentUris.withAppendedId(PetEntry.CONTENT_URI, petID);

                // User clicked the list item information, create an intent to the
                // {@link PetEditorActivity}
                Intent editIntent = new Intent(context, PetEditorActivity.class);

                // Set the URI on the data field of the intent
                editIntent.setData(mCurrentPetURI);

                Toast.makeText(context, "To Edit Activity " + LOG_TAG, Toast.LENGTH_LONG).show();
                // Launch the {@link PetEditorActivity} to display the data for the current pet
//                context.startActivity(editIntent);
            }
        });
    }
}