package com.danjureedeveloper.shelter.data;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.BaseColumns;

import com.danjureedeveloper.shelter.R;

import java.io.ByteArrayOutputStream;

/**
 * Created by ndoor on 9/5/2017.
 * Defines table contents for the pet database
 */

public final class PetContract {

    // Prevents someone from accidentally instantiating this contract class by providing an empty
    // constructor
    private PetContract() {
    }

    // Tag for the log messages
    public static final String LOG_TAG = PetContract.class.getSimpleName();

    // Content Authority, name for entire content provider
    public static final String CONTENT_AUTHORITY = "com.danjureedeveloper.shelter";

    // Base for all URI's for apps to contact the content provider
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Possible path to append to base content URI for possible URI's
    public static final String PATH_PET = "pet";

    // Inner class that defines the table contents of the pets table
    public static final class PetEntry implements BaseColumns {

        // Content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PET);

        // The MIME type of the {@link #CONTENT_URI) for a list of pets
        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                CONTENT_AUTHORITY + "/" + PATH_PET;

        // The MIME type of the {@link #CONTENT_URI} for a single pet
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" +
                CONTENT_AUTHORITY + "/" + PATH_PET;

        // Constants for no image
        public static final Bitmap NO_PET_IMAGE = null;

        // Name of the {@link PetEntry} table in the database
        public static final String TABLE_NAME = "pet";

        // Column titles for the pet table, pet attributes
        public static final String _ID = BaseColumns._ID;                   // Unique ID
        public static final String COLUMN_PET_NAME = "name";                // Pet Name
        public static final String COLUMN_PET_IMAGE = "image";              // Photo
        public static final String COLUMN_PET_TYPE = "type";                // Species
        public static final String COLUMN_PET_DESCRIPTION = "description";  // Type Description
        public static final String COLUMN_PET_AGE_YEARS = "years";          // Age Years
        public static final String COLUMN_PET_AGE_MONTHS = "months";        // Age Months
        public static final String COLUMN_PET_AGE_GENERATION = "generation";// Age Group
        public static final String COLUMN_PET_GENDER = "gender";            // Gender
        public static final String COLUMN_PET_lbs = "lbs";                  // Weight Pounds
        public static final String COLUMN_PET_OZ = "oz";                    // Weight Ounces
        public static final String COLUMN_PET_SIZE = "size";                // Size Description
        public static final String COLUMN_PET_SHELTER = "shelter";          // Shelter Name
        public static final String COLUMN_PET_CITY = "city";                // Shelter City
        public static final String COLUMN_PET_STATE = "state";              // Shelter State
        public static final String COLUMN_PET_ZIP_CODE = "zipcode";         // Shelter Zip Code

        // Constants for the gender spinner
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_MALE = 2;

        // Constants for the age group (generation) spinner
        public static final int GENERATION_UNKNOWN = 0;
        public static final int GENERATION_BABY = 1;
        public static final int GENERATION_ADULT = 2;

        // Constants for the size description spinner
        public static final int SIZE_UNKNOWN = 0;
        public static final int SIZE_SMALL = 1;
        public static final int SIZE_MEDIUM = 2;
        public static final int SIZE_LARGE = 3;
    }

    /**
     * This method checks if the given gender code is a valid option
     * @param gender is the the gender code to be verified
     * @return true/false
     */
    public static boolean isValidGender(int gender) {
        switch (gender) {
            case PetEntry.GENDER_UNKNOWN:   // Unknown
                return true;
            case PetEntry.GENDER_FEMALE:    // Female
                return true;
            case PetEntry.GENDER_MALE:      // Male
                return true;
            default:
                return false;
        }
    }

    /**
     * This method checks if the given generation code is a valid option
     * @param generation is the generation code to be verified
     * @return true/false
     */
    public static boolean isValidGeneration(int generation) {
        switch (generation) {
            case PetEntry.GENERATION_UNKNOWN:   // Unknown
                return true;
            case PetEntry.GENERATION_BABY:      // Baby
                return true;
            case PetEntry.GENERATION_ADULT:     // Adult
                return true;
            default:
                return false;
        }
    }

    /**
     * This method checks if the given years integer is within the valid range
     * @param years is the years portion of the pet's age
     * @return true/false
     */
    public static boolean isValidAgeYears(int years) {
        if (years < 0 || years > 40) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method checks if the given months integer is within the valid range
     * @param months is the months portion of the pet's age
     * @return true/false
     */
    public static boolean isValidAgeMonths(int months) {
        if (months < 0 || months > 11) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method checks if the given size code is a valid option
     * @param size is the size code to be verified
     * @return true/false
     */
    public static boolean isValidSize(int size) {
        switch (size) {
            case PetEntry.SIZE_UNKNOWN:     // Unknown
                return true;
            case PetEntry.SIZE_SMALL:       // Small
                return true;
            case PetEntry.SIZE_MEDIUM:      // Medium
                return true;
            case PetEntry.SIZE_LARGE:       // Large
                return true;
            default:
                return false;
        }
    }

    /**
     * This method verifies that the given ZipCode meets the 5 number standard
     * @param zipCode is the Zip Code to check given as a String
     * @return true/false
     */
    public static boolean isValidZipCode(String zipCode) {
        if (zipCode.length() == 5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method converts a Bitmap to a byte[]
     *
     * @param bitmap is the Bitmap image to be converted
     * @return byte[]
     */
    public static byte[] getByteArray(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }

    /**
     * This method converts a byte[] to a Bitmap
     *
     * @param image is the byte[] to convert
     * @return Bitmap
     */
    public static Bitmap getBitmap(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }

    /**
     * The method gets the String value of the given pet generation code
     * @param petAgeCode is the generation code
     * @return String value of generation
     */
    public static String getPetAgeGroup(int petAgeCode) {
        switch (petAgeCode) {
            case PetEntry.GENERATION_UNKNOWN:
                return String.valueOf(R.string.age_unknown);
            case PetEntry.GENERATION_BABY:
                return String.valueOf(R.string.age_baby);
            case PetEntry.GENERATION_ADULT:
                return String.valueOf(R.string.age_adult);
            default:
                return String.valueOf(R.string.age_unknown);
        }
    }

    /**
     * The method gets the String value of the given gender code
     * @param genderCode is the gender code of the pet
     * @return String value of gender
     */
    public static String getPetGender(int genderCode) {
        switch (genderCode) {
            case PetEntry.GENDER_UNKNOWN:
                return String.valueOf(R.string.gender_unknown);
            case PetEntry.GENDER_FEMALE:
                return String.valueOf(R.string.gender_female);
            case PetEntry.GENDER_MALE:
                return String.valueOf(R.string.gender_male);
            default:
                return String.valueOf(R.string.gender_unknown);
        }
    }

    /**
     * This method gets the String value of the given size code
     * @param sizeCode is the size code of the pet
     * @return String value of size
     */
    public static String getPetSizeDescription(int sizeCode) {
        switch (sizeCode) {
            case PetEntry.SIZE_UNKNOWN:
                return String.valueOf(R.string.size_unknown);
            case PetEntry.SIZE_SMALL:
                return String.valueOf(R.string.size_small);
            case PetEntry.SIZE_MEDIUM:
                return String.valueOf(R.string.size_medium);
            case PetEntry.SIZE_LARGE:
                return String.valueOf(R.string.size_large);
            default:
                return String.valueOf(R.string.size_unknown);
        }
    }
}