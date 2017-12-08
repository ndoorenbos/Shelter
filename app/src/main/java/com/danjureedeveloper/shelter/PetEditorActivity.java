package com.danjureedeveloper.shelter;

import android.app.LoaderManager;
import android.content.Loader;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Allows user to create a new pet or edit an existing one
 */
public class PetEditorActivity extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<Cursor> {

    // EditText fields to enter pet data
    EditText editTextPetName; // edit_text_pet_edit_name
    EditText editTextType; // edit_text_pet_edit_type
    EditText editTextYears; // edit_text_pet_edit_years
    EditText editTextMonths; // edit_text_pet_edit_months
    EditText editTextLbs; // edit_text_pet_edit_lbs
    EditText editTextOz; // edit_text_pet_edit_oz
    EditText editTextShelterName; // edit_text_pet_edit_shelter
    EditText editTextShelterCity; // edit_text_pet_edit_city
    EditText editTextShelterZipCode; // edit_text_pet_edit_zip_code

    // Views for the pet photo
    RelativeLayout relativeLayoutPhoto; // relative_layout_pet_edit_photo
    ImageView imageViewPhoto; // image_view_pet_edit_photo
    ImageView imageViewNoPhoto; // image_view_pet_edit_no_photo
    TextView textViewNoPhoto; // text_view_pet_edit_no_photo

    // Spinner views
    Spinner spinnerType; // spinner_pet_edit_type
    Spinner spinnerGeneration; // spinner_pet_edit_generation
    Spinner spinnerGender; // spinner_pet_edit_gender
    Spinner spinnerSize; // spinner_pet_edit_size
    Spinner spinnerState; // spinner_pet_edit_state

    // Identifiers
    private static final int REQUEST_IMAGE_CAPTURE = 1;     // Request to Use Camera
    private static final int EXISTING_PET_LOADER = 0;       // Pet Loader

    // Content URI for the existing pet (null if it is a new pet)
    private Uri mCurrentPetUri;


//    // Supplier's State, possible values are in the ProductContract.java file
//    private int mState = ProductEntry.STATE_UNKNOWN;
//
//    // Product's Image Bitmap
//    private Bitmap mImageBitmap = ProductEntry.NO_PRODUCT_IMAGE;
//
//    // True if the user updates part of the product form
//    private boolean mProductHasChanged = false;
//
//    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//            mProductHasChanged = true;
//            return false;
//        }};
//

    private PackageManager mPackageManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_editor);

        // TODO new or existing pet
        //        // Examine the intent that was used to launch this activity in order to figure out if we
//        // are creating or editing a product
//        Intent intent = getIntent();
//        mCurrentProductUri = intent.getData();
//
//        // If the intent DOES NOT contain a product content URI then this is a new product
//        if (mCurrentProductUri == null) {
//            // This is a new product so change the app bar to say "Add a Product"
//            setTitle(getString(R.string.item_editor_activity_title_new_product));
//
//            // Invalidate the options menu so the delete menu option can be hidden
//            invalidateOptionsMenu();
//        } else {
//            // Otherwise this is an existing product so change the app bar to say "Edit Product"
//            setTitle(getString(R.string.item_editor_activity_title_existing_pet));
//
//            // Initialize a loader to read the product data from the database and display the
//            // current values in the editor
//            getLoaderManager().initLoader(EXISTING_PRODUCT_LOADER, null, this);
//        }
//

        // Check for a camera
        mPackageManager = getPackageManager();
        mPackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA);


        // TODO set up save
        // TODO set up delete
        // TODO set up update
        // TODO set up blank form
        // TODO set up edit form from a passed in cursor
        // TODO set up reading of form to cursor
        // TODO set up writing to database
        // TODO set up photo ability
        // TODO set up menu
    }

//        // Find all relevant views that we will need to interact with
//        mNameEditText = (EditText) findViewById(R.id.name_edit_text);
//        mCodeEditText = (EditText) findViewById(R.id.code_edit_text);
//        mQuantityEditText = (EditText) findViewById(R.id.quantity_edit_text);
//        mPriceEditText = (EditText) findViewById(R.id.price_edit_text);
//        mSupplierEditText = (EditText) findViewById(R.id.supplier_edit_text);
//        mAddy1EditText = (EditText) findViewById(R.id.addy1_edit_text);
//        mAddy2EditText = (EditText) findViewById(R.id.addy2_edit_text);
//        mCityEditText = (EditText) findViewById(R.id.city_edit_text);
//        mZipEditText = (EditText) findViewById(R.id.zip_edit_text);
//        mPhoneEditText = (EditText) findViewById(R.id.phone_edit_text);
//        mEmailEditText = (EditText) findViewById(R.id.email_edit_text);
//        mWebsiteEditText = (EditText) findViewById(R.id.website_edit_text);
//        mStateSpinner = (Spinner) findViewById(R.id.spinner_state);
//        mPhotoRelativeLayout = (RelativeLayout) findViewById(R.id.photo_relative_layout);
//        mPhotoImageView = (ImageView) findViewById(R.id.product_image_view);
//        mNoPhotoImageView = (ImageView) findViewById(R.id.product_no_image_view);
//        mNoPhotoTextView = (TextView) findViewById(R.id.no_image_text_view);
//
//        // Set TouchListener on the views to determine if the user clicked on anything
//        mNameEditText.setOnTouchListener(mTouchListener);
//        mCodeEditText.setOnTouchListener(mTouchListener);
//        mQuantityEditText.setOnTouchListener(mTouchListener);
//        mPriceEditText.setOnTouchListener(mTouchListener);
//        mPhotoRelativeLayout.setOnTouchListener(mTouchListener);
//        mSupplierEditText.setOnTouchListener(mTouchListener);
//        mAddy1EditText.setOnTouchListener(mTouchListener);
//        mAddy2EditText.setOnTouchListener(mTouchListener);
//        mCityEditText.setOnTouchListener(mTouchListener);
//        mStateSpinner.setOnTouchListener(mTouchListener);
//        mZipEditText.setOnTouchListener(mTouchListener);
//        mPhoneEditText.setOnTouchListener(mTouchListener);
//        mEmailEditText.setOnTouchListener(mTouchListener);
//        mWebsiteEditText.setOnTouchListener(mTouchListener);
//
//        mPhotoRelativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dispatchTakePictureIntent();
//            }
//        });
//
//        setupSpinner();
//    }


    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
//
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        super.onPrepareOptionsMenu(menu);
//
//        // If this is a new product hide the "Delete" menu item
//        if (mCurrentProductUri == null) {
//            MenuItem menuItemDelete = menu.findItem(R.id.action_delete);
//            menuItemDelete.setVisible(false);
//
//            MenuItem menuItemSell = menu.findItem(R.id.menu_editor_sell);
//            menuItemSell.setVisible(false);
//
//            MenuItem menuItemReceived = menu.findItem(R.id.menu_editor_received);
//            menuItemReceived.setVisible(false);
//
//            MenuItem menuItemOrder = menu.findItem(R.id.menu_editor_order);
//            menuItemOrder.setVisible(false);
//        }
//        return true;
//    }
//
//    @Override
//    public void onBackPressed() {
//        // If the product hasn't changed continue with handling back button press
//        if (!mProductHasChanged) {
//            super.onBackPressed();
//            return;
//        }
//
//        // Otherwise if there are unsaved changes setup a dialog to warn the user
//        // Creating a click listener to handle the user confirming that changes should be discarded
//        DialogInterface.OnClickListener discardButtonClickListener =
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        // If user clicked "Discard" close the current activity
//                        finish();
//                    }
//                };
//
//        // Show dialog that there are unsaved changes
//        showUnsavedChangesDialog(discardButtonClickListener);
//    }
//
//    // This method generates a warning dialog when product data could be lost
//    private void showUnsavedChangesDialog(
//            DialogInterface.OnClickListener discardButtonClickListener) {
//        // Create an AlertDialog.Builder and set the message and click listeners for the positive
//        // and negative buttons on the dialog
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.unsaved_changes_dialog_msg);
//        builder.setPositiveButton(R.string.discard, discardButtonClickListener);
//        builder.setNegativeButton(R.string.keep_editing, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // User clicked the "Keep Editing" button so dismiss the dialog, continue editing
//                if (dialog != null) {
//                    dialog.dismiss();
//                }
//
//            }
//        });
//
//        // Create and show the AlertDialog
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }
//
//    // Setup the dropdown spinner that allows the user to select the state of the supplier address
//    private void setupSpinner() {
//        // Create an adapter for the Spinner with the list of options from the String[] with ID
//        // array_state_options, using the default Spinner layout
//        ArrayAdapter stateSpinnerAdapter = ArrayAdapter.createFromResource(this,
//                R.array.array_state_options, android.R.layout.simple_spinner_item);
//
//        // Specify dropdown layout style, simple list view with 1 item per line
//        stateSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//
//        // Apply the adapter to the Spinner
//        mStateSpinner.setAdapter(stateSpinnerAdapter);
//
//        // Set the integer selection to the constant values
//        mStateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selection = (String) parent.getItemAtPosition(position);
//                if (!TextUtils.isEmpty(selection)) {
//                    if (selection.equals(getString(R.string.Alabama))) {
//                        mState = ProductEntry.STATE_ALABAMA;        // Alabama
//                    } else if (selection.equals(getString(R.string.Alaska))) {
//                        mState = ProductEntry.STATE_ALASKA;         // Alaska
//                    } else if (selection.equals(getString(R.string.Arizona))) {
//                        mState = ProductEntry.STATE_ARIZONA;        // Arizona
//                    } else if (selection.equals(getString(R.string.Arkansas))) {
//                        mState = ProductEntry.STATE_ARKANSAS;       // Arkansas
//                    } else if (selection.equals(getString(R.string.California))) {
//                        mState = ProductEntry.STATE_CALIFORNIA;     // California
//                    } else if (selection.equals(getString(R.string.Colorado))) {
//                        mState = ProductEntry.STATE_COLORADO;       // Colorado
//                    } else if (selection.equals(getString(R.string.Connecticut))) {
//                        mState = ProductEntry.STATE_CONNECTICUT;    // Connecticut
//                    } else if (selection.equals(getString(R.string.Deleware))) {
//                        mState = ProductEntry.STATE_DELAWARE;       // Delaware
//                    } else if (selection.equals(getString(R.string.Florida))) {
//                        mState = ProductEntry.STATE_FLORIDA;        // Florida
//                    } else if (selection.equals(getString(R.string.Georgia))) {
//                        mState = ProductEntry.STATE_GEORGIA;        // Georgia
//                    } else if (selection.equals(getString(R.string.Hawaii))) {
//                        mState = ProductEntry.STATE_HAWAII;         // Hawaii
//                    } else if (selection.equals(getString(R.string.Idaho))) {
//                        mState = ProductEntry.STATE_IDAHO;          // Idaho
//                    } else if (selection.equals(getString(R.string.Illinois))) {
//                        mState = ProductEntry.STATE_ILLINOIS;       // Illinois
//                    } else if (selection.equals(getString(R.string.Indiana))) {
//                        mState = ProductEntry.STATE_INDIANA;        // Indiana
//                    } else if (selection.equals(getString(R.string.Iowa))) {
//                        mState = ProductEntry.STATE_IOWA;           // Iowa
//                    } else if (selection.equals(getString(R.string.Kansas))) {
//                        mState = ProductEntry.STATE_KANSAS;         // Kansas
//                    } else if (selection.equals(getString(R.string.Kentucky))) {
//                        mState = ProductEntry.STATE_KENTUCKY;       // Kentucky
//                    } else if (selection.equals(getString(R.string.Louisiana))) {
//                        mState = ProductEntry.STATE_LOUISIANA;      // Louisiana
//                    } else if (selection.equals(getString(R.string.Maine))) {
//                        mState = ProductEntry.STATE_MAINE;          // Maine
//                    } else if (selection.equals(getString(R.string.Maryland))) {
//                        mState = ProductEntry.STATE_MARYLAND;       // Maryland
//                    } else if (selection.equals(getString(R.string.Massachusetts))) {
//                        mState = ProductEntry.STATE_MASSACHUSETTS;  // Massachusetts
//                    } else if (selection.equals(getString(R.string.Michigan))) {
//                        mState = ProductEntry.STATE_MICHIGAN;       // Michigan
//                    } else if (selection.equals(getString(R.string.Minnesota))) {
//                        mState = ProductEntry.STATE_MINNESOTA;      // Minnesota
//                    } else if (selection.equals(getString(R.string.Mississippi))) {
//                        mState = ProductEntry.STATE_MISSISSIPPI;    // Mississippi
//                    } else if (selection.equals(getString(R.string.Missouri))) {
//                        mState = ProductEntry.STATE_MISSOURI;       // Missouri
//                    } else if (selection.equals(getString(R.string.Montana))) {
//                        mState = ProductEntry.STATE_MONTANA;        // Montana
//                    } else if (selection.equals(getString(R.string.Nebraska))) {
//                        mState = ProductEntry.STATE_NEBRASKA;       // Nebraska
//                    } else if (selection.equals(getString(R.string.Nevada))) {
//                        mState = ProductEntry.STATE_NEVADA;         // Nevada
//                    } else if (selection.equals(getString(R.string.New_Hampshire))) {
//                        mState = ProductEntry.STATE_NEW_HAMPSHIRE;  // New Hampshire
//                    } else if (selection.equals(getString(R.string.New_Jersey))) {
//                        mState = ProductEntry.STATE_NEW_JERSEY;     // New Jersey
//                    } else if (selection.equals(getString(R.string.New_Mexico))) {
//                        mState = ProductEntry.STATE_NEW_MEXICO;     // New Mexico
//                    } else if (selection.equals(getString(R.string.New_York))) {
//                        mState = ProductEntry.STATE_NEW_YORK;       // New York
//                    } else if (selection.equals(getString(R.string.North_Carolina))) {
//                        mState = ProductEntry.STATE_NORTH_CAROLINA; // North Carolina
//                    } else if (selection.equals(getString(R.string.North_Dakota))) {
//                        mState = ProductEntry.STATE_NORTH_DAKOTA;   // North Dakota
//                    } else if (selection.equals(getString(R.string.Ohio))) {
//                        mState = ProductEntry.STATE_OHIO;           // Ohio
//                    } else if (selection.equals(getString(R.string.Oklahoma))) {
//                        mState = ProductEntry.STATE_OKLAHOMA;       // Oklahoma
//                    } else if (selection.equals(getString(R.string.Oregon))) {
//                        mState = ProductEntry.STATE_OREGON;         // Oregon
//                    } else if (selection.equals(getString(R.string.Pennsylvania))) {
//                        mState = ProductEntry.STATE_PENNSYLVANIA;   // Pennsylvania
//                    } else if (selection.equals(getString(R.string.Rhode_Island))) {
//                        mState = ProductEntry.STATE_RHODE_ISLAND;   // Rhode Island
//                    } else if (selection.equals(getString(R.string.South_Carolina))) {
//                        mState = ProductEntry.STATE_SOUTH_CAROLINA; // South Carolina
//                    } else if (selection.equals(getString(R.string.South_Dakota))) {
//                        mState = ProductEntry.STATE_SOUTH_DAKOTA;   // South Dakota
//                    } else if (selection.equals(getString(R.string.Tennessee))) {
//                        mState = ProductEntry.STATE_TENNESSEE;      // Tennessee
//                    } else if (selection.equals(getString(R.string.Texas))) {
//                        mState = ProductEntry.STATE_TEXAS;          // Texas
//                    } else if (selection.equals(getString(R.string.Utah))) {
//                        mState = ProductEntry.STATE_UTAH;           // Utah
//                    } else if (selection.equals(getString(R.string.Vermont))) {
//                        mState = ProductEntry.STATE_VERMONT;        // Vermont
//                    } else if (selection.equals(getString(R.string.Virginia))) {
//                        mState = ProductEntry.STATE_VIRGINIA;       // Virginia
//                    } else if (selection.equals(getString(R.string.Washington))) {
//                        mState = ProductEntry.STATE_WASHINGTON;     // Washington
//                    } else if (selection.equals(getString(R.string.West_Virginia))) {
//                        mState = ProductEntry.STATE_WEST_VIRGINIA;  // West Virginia
//                    } else if (selection.equals(getString(R.string.Wisconsin))) {
//                        mState = ProductEntry.STATE_WISCONSIN;      // Wisconsin
//                    } else if (selection.equals(getString(R.string.Wyoming))) {
//                        mState = ProductEntry.STATE_WYOMING;        // Wyoming
//                    } else {
//                        mState = ProductEntry.STATE_UNKNOWN;        // Unknown
//                    }
//                }
//            }
//
//            // AdapterView is an abstract class, onNothingSelected must be defined
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                mState = 0;     // Unknown
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu options from the res/menu/menu_editor.xml file
//        getMenuInflater().inflate(R.menu.menu_editor, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // User clicked on a menu option in the app bar, action buttons or overflow menu
//        switch (item.getItemId()) {
//            // Respond to a click on the "Save" menu option/icon
//            case R.id.menu_editor_save:
//                // Save product to database
//                saveProduct();
//                // Exit activity
//                finish();
//                return true;
//            // Respond to a click on the "Delete" menu option
//            case R.id.action_delete:
//                // Pop up confirmation dialog for deletion
//                showDeleteConfirmationDialog();
//                return true;
//            // Respond to a click on the "Sell" menu option
//            case R.id.menu_editor_sell:
//                // Start up the QuantityActivity, pass the remove integer
//                trackProductQuantity(QuantityActivity.REMOVE_PRODUCT);
//                return true;
//            // Respond to a click on the "Order Received" menu option
//            case R.id.menu_editor_received:
//                // Start up the QuantityActivity, pass the add integer
//                trackProductQuantity(QuantityActivity.ADD_PRODUCT);
//                return true;
//            // Respond to a click on the "Order" menu option
//            case R.id.menu_editor_order:
//                orderChoiceDialog();
//                return true;
//            // Respond to a click on the "Up" arrow button in the app bar
//            case android.R.id.home:
//                // If the product hasn't changed, continue with navigating up to the parent activity
//                if (!mProductHasChanged) {
//                    NavUtils.navigateUpFromSameTask(ItemEditorActivity.this);
//                    return true;
//                }
//
//                // Otherwise if there are unsaved changes, setup a dialog to warn the user
//
//                // Create a click listener to handle the user confirming that changes should be
//                // discarded
//                DialogInterface.OnClickListener discardButtonClickListener =
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                // User clicked "Discard" button, navigate to parent activity
//                                NavUtils.navigateUpFromSameTask(ItemEditorActivity.this);
//                            }
//                        };
//
//                // Show a dialog that notifies the user they have unsaved changes
//                showUnsavedChangesDialog(discardButtonClickListener);
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
//        // Define a projection that contains all the columns in the product table
//        String[] projection = {
//                ProductEntry._ID,                       // Product Table ID#
//                ProductEntry.COLUMN_PRODUCT_NAME,       // Product Name
//                ProductEntry.COLUMN_PRODUCT_CODE,       // Product Code
//                ProductEntry.COLUMN_PRODUCT_QUANTITY,   // Product Quantity In-Stock
//                ProductEntry.COLUMN_PRODUCT_PRICE,      // Product Sales Price
//                ProductEntry.COLUMN_PRODUCT_IMAGE,      // Product Image
//                ProductEntry.COLUMN_PRODUCT_SUPPLIER,   // Product Supplier
//                ProductEntry.COLUMN_PRODUCT_ADDY1,      // Supplier Address Line 1
//                ProductEntry.COLUMN_PRODUCT_ADDY2,      // Supplier Address Line 2
//                ProductEntry.COLUMN_PRODUCT_CITY,       // Supplier City
//                ProductEntry.COLUMN_PRODUCT_STATE,      // Supplier State
//                ProductEntry.COLUMN_PRODUCT_ZIP,        // Supplier Zip-Code
//                ProductEntry.COLUMN_PRODUCT_PHONE,      // Supplier Phone#
//                ProductEntry.COLUMN_PRODUCT_EMAIL,      // Supplier E-mail Address
//                ProductEntry.COLUMN_PRODUCT_WEBSITE};   // Supplier Website URL
//
//        // Execute the ContentProvider's query method on a background thread
//        return new CursorLoader(this,   // Parent Activity Context
//                mCurrentProductUri,     // Query the content URI for the current product
//                projection,             // Columns to include in the resulting cursor
//                null,                   // No selection clause
//                null,                   // No selection arguments
//                null);                  // Default sort order
//    }
//
//    @Override
//    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
//        // Bail out early if the cursor is null or there is less than 1 row in the cursor
//        if (cursor == null || cursor.getCount() < 1) {
//            return;
//        }
//
//        // Proceed with moving to the first row of the cursor and reading data from it
//        // Note: this should be the only row in the cursor
//        if (cursor.moveToFirst()) {
//            // Find the column index of the product attributes which we want
//            int nameColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_NAME);
//            int codeColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_CODE);
//            int quantityColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_QUANTITY);
//            int priceColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_PRICE);
//            int imageColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_IMAGE);
//            int supplierColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_SUPPLIER);
//            int address1ColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_ADDY1);
//            int address2ColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_ADDY2);
//            int cityColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_CITY);
//            int stateColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_STATE);
//            int zipCodeColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_ZIP);
//            int phoneColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_PHONE);
//            int emailColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_EMAIL);
//            int websiteColumnIndex = cursor.getColumnIndex(ProductEntry.COLUMN_PRODUCT_WEBSITE);
//
//            // Extract the value from the Cursor for the given column index
//            mProductName = cursor.getString(nameColumnIndex);
//            mCatalogNumber = cursor.getString(codeColumnIndex);
//            mCurrentQuantity = cursor.getInt(quantityColumnIndex);
//            double price = cursor.getDouble(priceColumnIndex);
//            byte[] image = cursor.getBlob(imageColumnIndex);
//            String supplier = cursor.getString(supplierColumnIndex);
//            String address1 = cursor.getString(address1ColumnIndex);
//            String address2 = cursor.getString(address2ColumnIndex);
//            String city = cursor.getString(cityColumnIndex);
//            int state = cursor.getInt(stateColumnIndex);
//            String zipCode = cursor.getString(zipCodeColumnIndex);
//            mPhoneNumber = cursor.getString(phoneColumnIndex);
//            mEmailAddress = cursor.getString(emailColumnIndex);
//            String website = cursor.getString(websiteColumnIndex);
//
//            // Update the views on the screen with the values extracted from the database
//            mNameEditText.setText(mProductName);
//            mCodeEditText.setText(mCatalogNumber);
//            mQuantityEditText.setText(Integer.toString(mCurrentQuantity));
//            mPriceEditText.setText(Double.toString(price));
//            mSupplierEditText.setText(supplier);
//            mAddy1EditText.setText(address1);
//            mAddy2EditText.setText(address2);
//            mCityEditText.setText(city);
//            mZipEditText.setText(zipCode);
//            mPhoneEditText.setText(mPhoneNumber);
//            mEmailEditText.setText(mEmailAddress);
//            mWebsiteEditText.setText(website);
//
//            if (image != null) {
//                mNoPhotoTextView.setVisibility(View.GONE);
//                mNoPhotoImageView.setVisibility(View.GONE);
//                mPhotoImageView.setVisibility(View.VISIBLE);
//                mPhotoImageView.setImageBitmap(ProductEntry.getPhoto(image));
//            }
//
//            // Map the constant value from the database into each of the drop down options. Call
//            // setSelection() so that the option is displayed on the screen as the current selection
//            switch (state) {
//                case ProductEntry.STATE_ALABAMA:
//                    mStateSpinner.setSelection(1);
//                    break;
//                case ProductEntry.STATE_ALASKA:
//                    mStateSpinner.setSelection(2);
//                    break;
//                case ProductEntry.STATE_ARIZONA:
//                    mStateSpinner.setSelection(3);
//                    break;
//                case ProductEntry.STATE_ARKANSAS:
//                    mStateSpinner.setSelection(4);
//                    break;
//                case ProductEntry.STATE_CALIFORNIA:
//                    mStateSpinner.setSelection(5);
//                    break;
//                case ProductEntry.STATE_COLORADO:
//                    mStateSpinner.setSelection(6);
//                    break;
//                case ProductEntry.STATE_CONNECTICUT:
//                    mStateSpinner.setSelection(7);
//                    break;
//                case ProductEntry.STATE_DELAWARE:
//                    mStateSpinner.setSelection(8);
//                    break;
//                case ProductEntry.STATE_FLORIDA:
//                    mStateSpinner.setSelection(9);
//                    break;
//                case ProductEntry.STATE_GEORGIA:
//                    mStateSpinner.setSelection(10);
//                    break;
//                case ProductEntry.STATE_HAWAII:
//                    mStateSpinner.setSelection(11);
//                    break;
//                case ProductEntry.STATE_IDAHO:
//                    mStateSpinner.setSelection(12);
//                    break;
//                case ProductEntry.STATE_ILLINOIS:
//                    mStateSpinner.setSelection(13);
//                    break;
//                case ProductEntry.STATE_INDIANA:
//                    mStateSpinner.setSelection(14);
//                    break;
//                case ProductEntry.STATE_IOWA:
//                    mStateSpinner.setSelection(15);
//                    break;
//                case ProductEntry.STATE_KANSAS:
//                    mStateSpinner.setSelection(16);
//                    break;
//                case ProductEntry.STATE_KENTUCKY:
//                    mStateSpinner.setSelection(17);
//                    break;
//                case ProductEntry.STATE_LOUISIANA:
//                    mStateSpinner.setSelection(18);
//                    break;
//                case ProductEntry.STATE_MAINE:
//                    mStateSpinner.setSelection(19);
//                    break;
//                case ProductEntry.STATE_MARYLAND:
//                    mStateSpinner.setSelection(20);
//                    break;
//                case ProductEntry.STATE_MASSACHUSETTS:
//                    mStateSpinner.setSelection(21);
//                    break;
//                case ProductEntry.STATE_MICHIGAN:
//                    mStateSpinner.setSelection(22);
//                    break;
//                case ProductEntry.STATE_MINNESOTA:
//                    mStateSpinner.setSelection(23);
//                    break;
//                case ProductEntry.STATE_MISSISSIPPI:
//                    mStateSpinner.setSelection(24);
//                    break;
//                case ProductEntry.STATE_MISSOURI:
//                    mStateSpinner.setSelection(25);
//                    break;
//                case ProductEntry.STATE_MONTANA:
//                    mStateSpinner.setSelection(26);
//                    break;
//                case ProductEntry.STATE_NEBRASKA:
//                    mStateSpinner.setSelection(27);
//                    break;
//                case ProductEntry.STATE_NEVADA:
//                    mStateSpinner.setSelection(28);
//                    break;
//                case ProductEntry.STATE_NEW_HAMPSHIRE:
//                    mStateSpinner.setSelection(29);
//                    break;
//                case ProductEntry.STATE_NEW_JERSEY:
//                    mStateSpinner.setSelection(30);
//                    break;
//                case ProductEntry.STATE_NEW_MEXICO:
//                    mStateSpinner.setSelection(31);
//                    break;
//                case ProductEntry.STATE_NEW_YORK:
//                    mStateSpinner.setSelection(32);
//                    break;
//                case ProductEntry.STATE_NORTH_CAROLINA:
//                    mStateSpinner.setSelection(33);
//                    break;
//                case ProductEntry.STATE_NORTH_DAKOTA:
//                    mStateSpinner.setSelection(34);
//                    break;
//                case ProductEntry.STATE_OHIO:
//                    mStateSpinner.setSelection(35);
//                    break;
//                case ProductEntry.STATE_OKLAHOMA:
//                    mStateSpinner.setSelection(36);
//                    break;
//                case ProductEntry.STATE_OREGON:
//                    mStateSpinner.setSelection(37);
//                    break;
//                case ProductEntry.STATE_PENNSYLVANIA:
//                    mStateSpinner.setSelection(38);
//                    break;
//                case ProductEntry.STATE_RHODE_ISLAND:
//                    mStateSpinner.setSelection(39);
//                    break;
//                case ProductEntry.STATE_SOUTH_CAROLINA:
//                    mStateSpinner.setSelection(40);
//                    break;
//                case ProductEntry.STATE_SOUTH_DAKOTA:
//                    mStateSpinner.setSelection(41);
//                    break;
//                case ProductEntry.STATE_TENNESSEE:
//                    mStateSpinner.setSelection(42);
//                    break;
//                case ProductEntry.STATE_TEXAS:
//                    mStateSpinner.setSelection(43);
//                    break;
//                case ProductEntry.STATE_UTAH:
//                    mStateSpinner.setSelection(44);
//                    break;
//                case ProductEntry.STATE_VERMONT:
//                    mStateSpinner.setSelection(45);
//                    break;
//                case ProductEntry.STATE_VIRGINIA:
//                    mStateSpinner.setSelection(46);
//                    break;
//                case ProductEntry.STATE_WASHINGTON:
//                    mStateSpinner.setSelection(47);
//                    break;
//                case ProductEntry.STATE_WEST_VIRGINIA:
//                    mStateSpinner.setSelection(48);
//                    break;
//                case ProductEntry.STATE_WISCONSIN:
//                    mStateSpinner.setSelection(49);
//                    break;
//                case ProductEntry.STATE_WYOMING:
//                    mStateSpinner.setSelection(50);
//                    break;
//                default:
//                    mStateSpinner.setSelection(0);
//                    break;
//            }
//        }
//    }
//
//    @Override
//    public void onLoaderReset(Loader<Cursor> loader) {
//        // If the loader is invalidated, clear out all the data from the input fields
//        // Update the views on the screen with the values extracted from the database
//        mNameEditText.setText("");
//        mCodeEditText.setText("");
//        mQuantityEditText.setText("");
//        mPriceEditText.setText("");
//        mImageBitmap = ProductEntry.NO_PRODUCT_IMAGE;
//        mNoPhotoTextView.setVisibility(View.VISIBLE);
//        mNoPhotoImageView.setVisibility(View.VISIBLE);
//        mPhotoImageView.setVisibility(View.GONE);
//        mSupplierEditText.setText("");
//        mAddy1EditText.setText("");
//        mAddy2EditText.setText("");
//        mCityEditText.setText("");
//        mStateSpinner.setSelection(ProductEntry.STATE_UNKNOWN);
//        mZipEditText.setText("");
//        mPhoneEditText.setText("");
//        mEmailEditText.setText("");
//        mWebsiteEditText.setText("");
//    }
//
//    // This method saves the input data from the editor into the database
//    private void saveProduct() {
//
//        // Read from the input fields, use trim to eliminate leading/trailing white space
//        mProductName = mNameEditText.getText().toString().trim();
//        mCatalogNumber = mCodeEditText.getText().toString().trim();
//        String quantityString = mQuantityEditText.getText().toString().trim();
//        String priceString = mPriceEditText.getText().toString().trim();
//        String supplierString = mSupplierEditText.getText().toString().trim();
//        String address1String = mAddy1EditText.getText().toString().trim();
//        String address2String = mAddy2EditText.getText().toString().trim();
//        String cityString = mCityEditText.getText().toString().trim();
//        String zipCodeString = mZipEditText.getText().toString().trim();
//        mPhoneNumber = mPhoneEditText.getText().toString().trim();
//        mEmailAddress = mEmailEditText.getText().toString().trim();
//        String websiteString = mWebsiteEditText.getText().toString().trim();
//
//        // Check if this is supposed to be a new product and if all of the fields in the editor are
//        // blank
//        if (mCurrentProductUri == null &&
//                TextUtils.isEmpty(mProductName) ||
//                TextUtils.isEmpty(mCatalogNumber) ||
//                mImageBitmap == ProductEntry.NO_PRODUCT_IMAGE ||
//                TextUtils.isEmpty(quantityString) ||
//                TextUtils.isEmpty(priceString) ||
//                TextUtils.isEmpty(supplierString) ||
//                TextUtils.isEmpty(address1String) ||
//                TextUtils.isEmpty(address2String) ||
//                TextUtils.isEmpty(cityString) ||
//                mState == ProductEntry.STATE_UNKNOWN ||
//                TextUtils.isEmpty(zipCodeString) ||
//                TextUtils.isEmpty(mPhoneNumber) ||
//                TextUtils.isEmpty(mEmailAddress) ||
//                TextUtils.isEmpty(websiteString)) {
//            // No need to create ContentValues and no need to do any ContentProvider operations
//            return;
//        }
//
//        // Create a ContentValues object where column names are the keys and product attributes
//        // from the editor are the values
//        ContentValues values = new ContentValues();
//        values.put(ProductEntry.COLUMN_PRODUCT_NAME, mProductName);
//        values.put(ProductEntry.COLUMN_PRODUCT_CODE, mCatalogNumber);
//        values.put(ProductEntry.COLUMN_PRODUCT_SUPPLIER, supplierString);
//        values.put(ProductEntry.COLUMN_PRODUCT_ADDY1, address1String);
//        values.put(ProductEntry.COLUMN_PRODUCT_ADDY2, address2String);
//        values.put(ProductEntry.COLUMN_PRODUCT_CITY, cityString);
//        values.put(ProductEntry.COLUMN_PRODUCT_STATE, mState);
//        values.put(ProductEntry.COLUMN_PRODUCT_ZIP, zipCodeString);
//        values.put(ProductEntry.COLUMN_PRODUCT_PHONE, mPhoneNumber);
//        values.put(ProductEntry.COLUMN_PRODUCT_EMAIL, mEmailAddress);
//        values.put(ProductEntry.COLUMN_PRODUCT_WEBSITE, websiteString);
//
//        // If the quantity and priceare not provided, don't try to parse into a Numeric Form
//        int quantity = 0;
//        if (!TextUtils.isEmpty(quantityString)) {
//            quantity = Integer.parseInt(quantityString);
//        }
//        values.put(ProductEntry.COLUMN_PRODUCT_QUANTITY, quantity);
//
//        double price = 0;
//        if (!TextUtils.isEmpty(priceString)) {
//            price = Double.parseDouble(priceString);
//        }
//        values.put(ProductEntry.COLUMN_PRODUCT_PRICE, price);
//
//        // If there is not a photo provided, don't try to convert the Bitmap to a byte[], enter null
//        byte[] imageByte = null;
//        if (mImageBitmap != null) {
//            imageByte = ProductEntry.getBytes(mImageBitmap);
//        }
//        values.put(ProductEntry.COLUMN_PRODUCT_IMAGE, imageByte);
//
//        // Determine if this is a new or existing product by checking is mCurrentProductUri is null
//        if (mCurrentProductUri == null) {
//            // This is a new product so insert a new product into the provider, returning the
//            // content URI for the new product
//            Uri newUri = getContentResolver().insert(ProductEntry.CONTENT_URI, values);
//
//            // Show a toast message about the success or failure of the insertion
//            if (newUri == null) {
//                // If the new content URI is null there was an error with insertion
//                Toast.makeText(this, getString(R.string.product_insert_failed),
//                        Toast.LENGTH_LONG).show();
//            } else {
//                // Otherwise, the insertion was successful
//                Toast.makeText(this, getString(R.string.product_insert_success),
//                        Toast.LENGTH_LONG).show();
//            }
//        } else {
//            // This is an existing product so update the product with the content URI:
//            // mCurrentProductUri and pass in the new ContentValues. Pass in null for the selection
//            // and selection args because mCurrentProductUri will already identify the correct row
//            // in the database that we want to modify
//            int rowsAffected = getContentResolver().update(mCurrentProductUri, values, null, null);
//
//            // Show a toast message about the success or failure of the update
//            if (rowsAffected == 0) {
//                // If no rows were affected there was an error with the update
//                Toast.makeText(this, getString(R.string.product_update_failed),
//                        Toast.LENGTH_LONG).show();
//            } else {
//                // Otherwise, the update was successful
//                Toast.makeText(this, getString(R.string.product_update_success),
//                        Toast.LENGTH_LONG).show();
//            }
//        }
//    }
//
//    // This method shows a delete confirmation dialog
//    private void showDeleteConfirmationDialog() {
//        // Create an AlertDialog.Builder and set the message and click listeners for the positive
//        // and negative buttons on the dialog
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.delete_product_dialog_msg);
//        builder.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // User clicked the "Delete" button so dismiss the dialog and delete the product
//                deleteProduct();
//            }
//        });
//        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // User clicked the "Cancel" button so dismiss the dialog to continue editing product
//                if (dialog != null) {
//                    dialog.dismiss();
//                }
//            }
//        });
//
//        // Create and show the AlertDialog
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }
//
//    // This method performs the deletion of the product in the database
//    private void deleteProduct() {
//        // Only perform th deletion if the product is existing
//        if (mCurrentProductUri != null) {
//            // Call the ContentResolver to delete the product at the given content URI. Pass in
//            // null for the selection and selection args because the mCurrentProductUri content URI
//            // already identifies the product we want.
//            int rowsDeleted = getContentResolver().delete(mCurrentProductUri, null,null);
//
//            // Show a toast message about the success or failure of the deletion
//            if (rowsDeleted == 0) {
//                // If no rows were deleted there was an error with the deletion
//                Toast.makeText(this, getString(R.string.product_delete_failure),
//                        Toast.LENGTH_LONG).show();
//            } else {
//                // Otherwise, the deletion was successful
//                Toast.makeText(this, getString(R.string.product_delete_success),
//                        Toast.LENGTH_LONG).show();
//            }
//        }
//
//        // Close the activity
//        finish();
//    }
//
//    // This method verifies there is a camera and uses an Intent to start that activity
//    private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        } else {
//            Toast.makeText(this, R.string.no_camera, Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
//            mImageBitmap = (Bitmap) extras.get("data");
//            mNoPhotoTextView.setVisibility(View.GONE);
//            mNoPhotoImageView.setVisibility(View.GONE);
//            mPhotoImageView.setVisibility(View.VISIBLE);
//            mPhotoImageView.setImageBitmap(mImageBitmap);
//        }
//    }
//
//    // This method grabs the quantity from the current product and starts the
//    // {@link QuantityActivity}
//    private void trackProductQuantity(int addOrSubtract) {
//        Intent quantityIntent = new Intent(ItemEditorActivity.this, QuantityActivity.class);
//
//        // Add extras and set the data URI of the intent
//        quantityIntent.setData(mCurrentProductUri);
//        quantityIntent.putExtra("addOrSubtract", addOrSubtract);
//        quantityIntent.putExtra("currentQuantity", mCurrentQuantity);
//
//        startActivity(quantityIntent);
//    }
//
//    // This method opens a dialog to order by phone or email
//    private void orderChoiceDialog() {
//        // Create an AlertDialog.Builder and set the message and click listeners for the positive
//        // and negative buttons on the dialog
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.choose_order_method);
//        builder.setPositiveButton(R.string.by_phone, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // User clicked the "Phone" button
//                orderProductPhone(mPhoneNumber);
//            }
//        });
//        builder.setNegativeButton(R.string.by_email, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // User clicked the "E-mail" button
//                orderProductEmail(mEmailAddress, mCurrentQuantity, mCatalogNumber, mProductName);
//            }
//        });
//
//        // Create and show the AlertDialog
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
//    }
//
//    // This method creates an intent to make a phone call using the passed phone number
//    private void orderProductPhone(String phoneNumber) {
//        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
//        phoneIntent.setData(Uri.parse("tel:" + phoneNumber));
//        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(phoneIntent);
//        }
//    }
//
//    // This method creates an intent to send an e-mail using the passed e-mail address
//    private void orderProductEmail(String emailAddress, int quantity, String code, String name) {
//        String TO = emailAddress;
//        String mMessage;
//
//        // Constants for E-mail
//        String mEmailSubject = getString(R.string.order_subject);
//        String mEmailMessage = getString(R.string.order_message);
//        String mEmailQuantity = getString(R.string.order_quantity);
//        String mEmailCatalogNumber = getString(R.string.order_catalog);
//
//        // Create e-mail message
//        mMessage = mEmailMessage + "\n" + name + mEmailCatalogNumber + code + mEmailQuantity +
//                quantity + ".";
//
//        // Intent to write e-mail with extras
//        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
//        emailIntent.setData(Uri.parse("mailto:"));
//        emailIntent.setType("text/plain");
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, mEmailSubject);
//        emailIntent.putExtra(Intent.EXTRA_TEXT, mMessage);
//
//        startActivity(Intent.createChooser(emailIntent, "Choose an Email client :"));
//    }
//}
