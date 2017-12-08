package com.danjureedeveloper.shelter.danjuree;

/**
 * Created by ndoor on 9/5/2017.
 * {@link StatesUSA} is a class for working with States of the USA in English
 */

public class StatesUSA {

    // Variables
    private int mStateCode = STATE_UNKNOWN;
    private String mStateName = UNKNOWN;
    private String mStateAbbrev = UNKNOWN;

    // String[]
    private String[] mStateNameArray = {
            "R.string.unknown",         // Resource ID for Unknown
            "R.string.alabama",         // Resource ID for Alabama
            "R.string.alaska",          // Resource ID for Alaska
            "R.string.arizona",         // Resource ID for Arizona
            "R.string.arkansas",        // Resource ID for Arkansas
            "R.string.california",      // Resource ID for California
            "R.string.colorado",        // Resource ID for Colorado
            "R.string.connecticut",     // Resource ID for Connecticut
            "R.string.delaware",        // Resource ID for Delaware
            "R.string.florida",         // Resource ID for Florida
            "R.string.georgia",         // Resource ID for Georgia
            "R.string.hawaii",          // Resource ID for Hawaii
            "R.string.idaho",           // Resource ID for Idaho
            "R.string.illinois",        // Resource ID for Illinois
            "R.string.indiana",         // Resource ID for Indiana
            "R.string.iowa",            // Resource ID for Iowa
            "R.string.kansas",          // Resource ID for Kansas
            "R.string.kentucky",        // Resource ID for Kentucky
            "R.string.louisiana",       // Resource ID for Louisiana
            "R.string.maine",           // Resource ID for Maine
            "R.string.maryland",        // Resource ID for Maryland
            "R.string.massachusetts",   // Resource ID for Massachusetts
            "R.string.michigan",        // Resource ID for Michigan
            "R.string.minnesota",       // Resource ID for Minnesota
            "R.string.mississippi",     // Resource ID for Mississippi
            "R.string.missouri",        // Resource ID for Missouri
            "R.string.montana",         // Resource ID for Montana
            "R.string.nebraska",        // Resource ID for Nebraska
            "R.string.nevada",          // Resource ID for Nevada
            "R.string.new_hampshire",   // Resource ID for New Hampshire
            "R.string.new_jersey",      // Resource ID for New Jersey
            "R.string.new_mexico",      // Resource ID for New Mexico
            "R.string.new_york",        // Resource ID for New York
            "R.string.north_carolina",  // Resource ID for North Carolina
            "R.string.north_dakota",    // Resource ID for North Dakota
            "R.string.ohio",            // Resource ID for Ohio
            "R.string.oklahoma",        // Resource ID for Oklahoma
            "R.string.oregon",          // Resource ID for Oregon
            "R.string.pennsylvania",    // Resource ID for Pennsylvania
            "R.string.rhode_island",    // Resource ID for Rhode Island
            "R.string.south_carolina",  // Resource ID for South Carolina
            "R.string.south_dakota",    // Resource ID for South Dakota
            "R.string.tennessee",       // Resource ID for Tennessee
            "R.string.texas",           // Resource ID for Texas
            "R.string.utah",            // Resource ID for Utah
            "R.string.vermont",         // Resource ID for Vermont
            "R.string.virginia",        // Resource ID for Virginia
            "R.string.washington",      // Resource ID for Washington
            "R.string.west_virginia",   // Resource ID for West Virginia
            "R.string.wisconsin",       // Resource ID for Wisconsin
            "R.string.wyoming"          // Resource ID for Wyoming
    };

    private String[] mStateAbbrevArray = {
            "R.string.unknown", // Resource ID for unknown
            "R.string.al",      // Resource ID for AL
            "R.string.ak",      // Resource ID for AK
            "R.string.az",      // Resource ID for AZ
            "R.string.ar",      // Resource ID for AR
            "R.string.ca",      // Resource ID for CA
            "R.string.co",      // Resource ID for CO
            "R.string.ct",      // Resource ID for CT
            "R.string.de",      // Resource ID for DE
            "R.string.fl",      // Resource ID for FL
            "R.string.ga",      // Resource ID for GA
            "R.string.hi",      // Resource ID for HI
            "R.string.id",      // Resource ID for ID
            "R.string.il",      // Resource ID for IL
            "R.string.in",      // Resource ID for IN
            "R.string.ia",      // Resource ID for IA
            "R.string.ks",      // Resource ID for KS
            "R.string.ky",      // Resource ID for KY
            "R.string.la",      // Resource ID for LA
            "R.string.me",      // Resource ID for ME
            "R.string.md",      // Resource ID for MD
            "R.string.ma",      // Resource ID for MA
            "R.string.mi",      // Resource ID for MI
            "R.string.mn",      // Resource ID for MN
            "R.string.ms",      // Resource ID for MS
            "R.string.mo",      // Resource ID for MO
            "R.string.mt",      // Resource ID for MT
            "R.string.ne",      // Resource ID for NE
            "R.string.nv",      // Resource ID for NV
            "R.string.nh",      // Resource ID for NH
            "R.string.nj",      // Resource ID for NJ
            "R.string.nm",      // Resource ID for NM
            "R.string.ny",      // Resource ID for NY
            "R.string.nc",      // Resource ID for NC
            "R.string.nd",      // Resource ID for ND
            "R.string.oh",      // Resource ID for OH
            "R.string.ok",      // Resource ID for OK
            "R.string.or",      // Resource ID for OR
            "R.string.pa",      // Resource ID for PA
            "R.string.ri",      // Resource ID for RI
            "R.string.sc",      // Resource ID for SC
            "R.string.sd",      // Resource ID for SD
            "R.string.tn",      // Resource ID for TN
            "R.string.tx",      // Resource ID for TX
            "R.string.ut",      // Resource ID for UT
            "R.string.vt",      // Resource ID for VT
            "R.string.va",      // Resource ID for VA
            "R.string.wa",      // Resource ID for WA
            "R.string.wv",      // Resource ID for WV
            "R.string.wi",      // Resource ID for WI
            "R.string.wy"       // Resource ID for WY
    };

    // Constants for State integer
    private static final int STATE_UNKNOWN = 0;
    private static final int STATE_ALABAMA = 1;
    private static final int STATE_ALASKA = 2;
    private static final int STATE_ARIZONA = 3;
    private static final int STATE_ARKANSAS = 4;
    private static final int STATE_CALIFORNIA = 5;
    private static final int STATE_COLORADO = 6;
    private static final int STATE_CONNECTICUT = 7;
    private static final int STATE_DELAWARE = 8;
    private static final int STATE_FLORIDA = 9;
    private static final int STATE_GEORGIA = 10;
    private static final int STATE_HAWAII = 11;
    private static final int STATE_IDAHO = 12;
    private static final int STATE_ILLINOIS = 13;
    private static final int STATE_INDIANA = 14;
    private static final int STATE_IOWA = 15;
    private static final int STATE_KANSAS = 16;
    private static final int STATE_KENTUCKY = 17;
    private static final int STATE_LOUISIANA = 18;
    private static final int STATE_MAINE = 19;
    private static final int STATE_MARYLAND = 20;
    private static final int STATE_MASSACHUSETTS = 21;
    private static final int STATE_MICHIGAN = 22;
    private static final int STATE_MINNESOTA = 23;
    private static final int STATE_MISSISSIPPI = 24;
    private static final int STATE_MISSOURI = 25;
    private static final int STATE_MONTANA = 26;
    private static final int STATE_NEBRASKA = 27;
    private static final int STATE_NEVADA = 28;
    private static final int STATE_NEW_HAMPSHIRE = 29;
    private static final int STATE_NEW_JERSEY = 30;
    private static final int STATE_NEW_MEXICO = 31;
    private static final int STATE_NEW_YORK = 32;
    private static final int STATE_NORTH_CAROLINA = 33;
    private static final int STATE_NORTH_DAKOTA = 34;
    private static final int STATE_OHIO = 35;
    private static final int STATE_OKLAHOMA = 36;
    private static final int STATE_OREGON = 37;
    private static final int STATE_PENNSYLVANIA = 38;
    private static final int STATE_RHODE_ISLAND = 39;
    private static final int STATE_SOUTH_CAROLINA = 40;
    private static final int STATE_SOUTH_DAKOTA = 41;
    private static final int STATE_TENNESSEE = 42;
    private static final int STATE_TEXAS = 43;
    private static final int STATE_UTAH = 44;
    private static final int STATE_VERMONT = 45;
    private static final int STATE_VIRGINIA = 46;
    private static final int STATE_WASHINGTON = 47;
    private static final int STATE_WEST_VIRGINIA = 48;
    private static final int STATE_WISCONSIN = 49;
    private static final int STATE_WYOMING = 50;

    // Constants for the state names
    private static final String UNKNOWN = "unknown";
    private static final String ALABAMA = "alabama";
    private static final String ALASKA = "alaska";
    private static final String ARIZONA = "arizona";
    private static final String ARKANSAS = "arkansas";
    private static final String CALIFORNIA = "california";
    private static final String COLORADO = "colorado";
    private static final String CONNECTICUT = "connecticut";
    private static final String DELAWARE = "deleware";
    private static final String FLORIDA = "florida";
    private static final String GEORGIA = "georgia";
    private static final String HAWAII = "hawaii";
    private static final String IDAHO = "idaho";
    private static final String ILLINOIS = "illinois";
    private static final String INDIANA = "indiana";
    private static final String IOWA = "iowa";
    private static final String KANSAS = "kansas";
    private static final String KENTUCKY = "kentucky";
    private static final String LOUISIANA = "louisiana";
    private static final String MAINE = "maine";
    private static final String MARYLAND = "maryland";
    private static final String MASSACHUSETTS = "massachusetts";
    private static final String MICHIGAN = "michigan";
    private static final String MINNESOTA = "minnesota";
    private static final String MISSISSIPPI = "mississippi";
    private static final String MISSOURI = "missouri";
    private static final String MONTANA = "montana";
    private static final String NEBRASKA = "nebraska";
    private static final String NEVADA = "nevada";
    private static final String NEW_HAMPSHIRE = "new_hampshire";
    private static final String NEW_JERSEY = "new_jersey";
    private static final String NEW_MEXICO = "new_mexico";
    private static final String NEW_YORK = "new_york";
    private static final String NORTH_CAROLINA = "north_carolina";
    private static final String NORTH_DAKOTA = "north_dakota";
    private static final String OHIO = "ohio";
    private static final String OKLAHOMA = "oklahoma";
    private static final String OREGON = "oregon";
    private static final String PENNSYLVANIA = "pennsylvania";
    private static final String RHODE_ISLAND = "rhode_island";
    private static final String SOUTH_CAROLINA = "south_carolina";
    private static final String SOUTH_DAKOTA = "south_dakota";
    private static final String TENNESSEE = "tennessee";
    private static final String TEXAS = "texas";
    private static final String UTAH = "utah";
    private static final String VERMONT = "vermont";
    private static final String VIRGINIA = "virginia";
    private static final String WASHINGTON = "washington";
    private static final String WEST_VIRGINIA = "west_virginia";
    private static final String WISCONSIN = "wisconsin";
    private static final String WYOMING = "wyoming";

    // Constants for the state abbreviations
    private static final String AL = "al";
    private static final String AK = "ak";
    private static final String AZ = "az";
    private static final String AR = "ar";
    private static final String CA = "ca";
    private static final String CO = "co";
    private static final String CT = "ct";
    private static final String DE = "de";
    private static final String FL = "fl";
    private static final String GA = "ga";
    private static final String HI = "hi";
    private static final String ID = "id";
    private static final String IL = "il";
    private static final String IN = "in";
    private static final String IA = "ia";
    private static final String KS = "ks";
    private static final String KY = "ky";
    private static final String LA = "la";
    private static final String ME = "me";
    private static final String MD = "md";
    private static final String MA = "ma";
    private static final String MI = "mi";
    private static final String MN = "mn";
    private static final String MS = "ms";
    private static final String MO = "mo";
    private static final String MT = "mt";
    private static final String NE = "ne";
    private static final String NV = "nv";
    private static final String NH = "nh";
    private static final String NJ = "nj";
    private static final String NM = "nm";
    private static final String NY = "ny";
    private static final String NC = "nc";
    private static final String ND = "nd";
    private static final String OH = "oh";
    private static final String OK = "ok";
    private static final String OR = "or";
    private static final String PA = "pa";
    private static final String RI = "ri";
    private static final String SC = "sc";
    private static final String SD = "sd";
    private static final String TN = "tn";
    private static final String TX = "tx";
    private static final String UT = "ut";
    private static final String VT = "vt";
    private static final String VA = "va";
    private static final String WA = "wa";
    private static final String WV = "wv";
    private static final String WI = "wi";
    private static final String WY = "wy";

    // Instantiate the {@link StateUSA} object
    public StatesUSA(int stateCode) {
        mStateCode = stateCode;
    }

    // This method returns the String Resource ID of the state name
    public String getStateName() {
        String stringResourceID;

        // Find the state name of the given code
        switch (mStateCode) {
            case STATE_UNKNOWN:
                mStateName = UNKNOWN;
            case STATE_ALABAMA:
                mStateName = ALABAMA;
            case STATE_ALASKA:
                mStateName = ALASKA;
            case STATE_ARIZONA:
                mStateName = ARIZONA;
            case STATE_ARKANSAS:
                mStateName = ARKANSAS;
            case STATE_CALIFORNIA:
                mStateName = CALIFORNIA;
            case STATE_COLORADO:
                mStateName = COLORADO;
            case STATE_CONNECTICUT:
                mStateName = CONNECTICUT;
            case STATE_DELAWARE:
                mStateName = DELAWARE;
            case STATE_FLORIDA:
                mStateName = FLORIDA;
            case STATE_GEORGIA:
                mStateName = GEORGIA;
            case STATE_HAWAII:
                mStateName = HAWAII;
            case STATE_IDAHO:
                mStateName = IDAHO;
            case STATE_ILLINOIS:
                mStateName = ILLINOIS;
            case STATE_INDIANA:
                mStateName = INDIANA;
            case STATE_IOWA:
                mStateName = IOWA;
            case STATE_KANSAS:
                mStateName = KANSAS;
            case STATE_KENTUCKY:
                mStateName = KENTUCKY;
            case STATE_LOUISIANA:
                mStateName = LOUISIANA;
            case STATE_MAINE:
                mStateName = MAINE;
            case STATE_MARYLAND:
                mStateName = MARYLAND;
            case STATE_MASSACHUSETTS:
                mStateName = MASSACHUSETTS;
            case STATE_MICHIGAN:
                mStateName = MICHIGAN;
            case STATE_MINNESOTA:
                mStateName = MINNESOTA;
            case STATE_MISSISSIPPI:
                mStateName = MISSISSIPPI;
            case STATE_MISSOURI:
                mStateName = MISSOURI;
            case STATE_MONTANA:
                mStateName = MONTANA;
            case STATE_NEBRASKA:
                mStateName = NEBRASKA;
            case STATE_NEVADA:
                mStateName = NEVADA;
            case STATE_NEW_HAMPSHIRE:
                mStateName = NEW_HAMPSHIRE;
            case STATE_NEW_JERSEY:
                mStateName = NEW_JERSEY;
            case STATE_NEW_MEXICO:
                mStateName = NEW_MEXICO;
            case STATE_NEW_YORK:
                mStateName = NEW_YORK;
            case STATE_NORTH_CAROLINA:
                mStateName = NORTH_CAROLINA;
            case STATE_NORTH_DAKOTA:
                mStateName = NORTH_DAKOTA;
            case STATE_OHIO:
                mStateName = OHIO;
            case STATE_OKLAHOMA:
                mStateName = OKLAHOMA;
            case STATE_OREGON:
                mStateName = OREGON;
            case STATE_PENNSYLVANIA:
                mStateName = PENNSYLVANIA;
            case STATE_RHODE_ISLAND:
                mStateName = RHODE_ISLAND;
            case STATE_SOUTH_CAROLINA:
                mStateName = SOUTH_CAROLINA;
            case STATE_SOUTH_DAKOTA:
                mStateName = SOUTH_DAKOTA;
            case STATE_TENNESSEE:
                mStateName = TENNESSEE;
            case STATE_TEXAS:
                mStateName = TEXAS;
            case STATE_UTAH:
                mStateName = UTAH;
            case STATE_VERMONT:
                mStateName = VERMONT;
            case STATE_VIRGINIA:
                mStateName = VIRGINIA;
            case STATE_WASHINGTON:
                mStateName = WASHINGTON;
            case STATE_WEST_VIRGINIA:
                mStateName = WEST_VIRGINIA;
            case STATE_WISCONSIN:
                mStateName = WISCONSIN;
            case STATE_WYOMING:
                mStateName = WYOMING;
            default:
                mStateName = UNKNOWN;
        }

        stringResourceID = "R.string." + mStateName;
        return stringResourceID;
    }

    // This method returns the String Resource ID of the state abbreviation
    public String getStateAbbrev() {
        String stringResourceID;

        // Find the state name of the given code
        switch (mStateCode) {
            case STATE_UNKNOWN:
                mStateAbbrev = UNKNOWN;
            case STATE_ALABAMA:
                mStateAbbrev = AL;
            case STATE_ALASKA:
                mStateAbbrev = AK;
            case STATE_ARIZONA:
                mStateAbbrev = AZ;
            case STATE_ARKANSAS:
                mStateAbbrev = AR;
            case STATE_CALIFORNIA:
                mStateAbbrev = CA;
            case STATE_COLORADO:
                mStateAbbrev = CO;
            case STATE_CONNECTICUT:
                mStateAbbrev = CT;
            case STATE_DELAWARE:
                mStateAbbrev = DE;
            case STATE_FLORIDA:
                mStateAbbrev = FL;
            case STATE_GEORGIA:
                mStateAbbrev = GA;
            case STATE_HAWAII:
                mStateAbbrev = HI;
            case STATE_IDAHO:
                mStateAbbrev = ID;
            case STATE_ILLINOIS:
                mStateAbbrev = IL;
            case STATE_INDIANA:
                mStateAbbrev = IN;
            case STATE_IOWA:
                mStateAbbrev = IA;
            case STATE_KANSAS:
                mStateAbbrev = KS;
            case STATE_KENTUCKY:
                mStateAbbrev = KY;
            case STATE_LOUISIANA:
                mStateAbbrev = LA;
            case STATE_MAINE:
                mStateAbbrev = ME;
            case STATE_MARYLAND:
                mStateAbbrev = MD;
            case STATE_MASSACHUSETTS:
                mStateAbbrev = MA;
            case STATE_MICHIGAN:
                mStateAbbrev = MI;
            case STATE_MINNESOTA:
                mStateAbbrev = MN;
            case STATE_MISSISSIPPI:
                mStateAbbrev = MS;
            case STATE_MISSOURI:
                mStateAbbrev = MO;
            case STATE_MONTANA:
                mStateAbbrev = MT;
            case STATE_NEBRASKA:
                mStateAbbrev = NE;
            case STATE_NEVADA:
                mStateAbbrev = NV;
            case STATE_NEW_HAMPSHIRE:
                mStateAbbrev = NH;
            case STATE_NEW_JERSEY:
                mStateAbbrev = NJ;
            case STATE_NEW_MEXICO:
                mStateAbbrev = NM;
            case STATE_NEW_YORK:
                mStateAbbrev = NY;
            case STATE_NORTH_CAROLINA:
                mStateAbbrev = NC;
            case STATE_NORTH_DAKOTA:
                mStateAbbrev = ND;
            case STATE_OHIO:
                mStateAbbrev = OH;
            case STATE_OKLAHOMA:
                mStateAbbrev = OK;
            case STATE_OREGON:
                mStateAbbrev = OR;
            case STATE_PENNSYLVANIA:
                mStateAbbrev = PA;
            case STATE_RHODE_ISLAND:
                mStateAbbrev = RI;
            case STATE_SOUTH_CAROLINA:
                mStateAbbrev = SC;
            case STATE_SOUTH_DAKOTA:
                mStateAbbrev = SD;
            case STATE_TENNESSEE:
                mStateAbbrev = TN;
            case STATE_TEXAS:
                mStateAbbrev = TX;
            case STATE_UTAH:
                mStateAbbrev = UT;
            case STATE_VERMONT:
                mStateAbbrev = VT;
            case STATE_VIRGINIA:
                mStateAbbrev = VA;
            case STATE_WASHINGTON:
                mStateAbbrev = WA;
            case STATE_WEST_VIRGINIA:
                mStateAbbrev = WV;
            case STATE_WISCONSIN:
                mStateAbbrev = WI;
            case STATE_WYOMING:
                mStateAbbrev = WY;
            default:
                mStateAbbrev = UNKNOWN;
        }

        stringResourceID = "R.string." + mStateAbbrev;
        return stringResourceID;
    }

    // This method takes a state name String and gets that state's code
    public int getStateCodeName(String stateName) {
        mStateName = stateName.trim().toLowerCase();
        mStateCode = STATE_UNKNOWN;

        // Find the state code from the given name
        switch (mStateName) {
            case UNKNOWN:
                mStateCode = STATE_UNKNOWN;
            case ALABAMA:
                mStateCode = STATE_ALABAMA;
            case ALASKA:
                mStateCode = STATE_ALASKA;
            case ARIZONA:
                mStateCode = STATE_ARIZONA;
            case ARKANSAS:
                mStateCode = STATE_ARKANSAS;
            case CALIFORNIA:
                mStateCode = STATE_CALIFORNIA;
            case COLORADO:
                mStateCode = STATE_COLORADO;
            case CONNECTICUT:
                mStateCode = STATE_CONNECTICUT;
            case DELAWARE:
                mStateCode = STATE_DELAWARE;
            case FLORIDA:
                mStateCode = STATE_FLORIDA;
            case GEORGIA:
                mStateCode = STATE_GEORGIA;
            case HAWAII:
                mStateCode = STATE_HAWAII;
            case IDAHO:
                mStateCode = STATE_IDAHO;
            case ILLINOIS:
                mStateCode = STATE_ILLINOIS;
            case INDIANA:
                mStateCode = STATE_INDIANA;
            case IOWA:
                mStateCode = STATE_IOWA;
            case KANSAS:
                mStateCode = STATE_KANSAS;
            case KENTUCKY:
                mStateCode = STATE_KENTUCKY;
            case LOUISIANA:
                mStateCode = STATE_LOUISIANA;
            case MAINE:
                mStateCode = STATE_MAINE;
            case MARYLAND:
                mStateCode = STATE_MARYLAND;
            case MASSACHUSETTS:
                mStateCode = STATE_MASSACHUSETTS;
            case MICHIGAN:
                mStateCode = STATE_MICHIGAN;
            case MINNESOTA:
                mStateCode = STATE_MINNESOTA;
            case MISSISSIPPI:
                mStateCode = STATE_MISSISSIPPI;
            case MISSOURI:
                mStateCode = STATE_MISSOURI;
            case MONTANA:
                mStateCode = STATE_MONTANA;
            case NEBRASKA:
                mStateCode = STATE_NEBRASKA;
            case NEVADA:
                mStateCode = STATE_NEVADA;
            case NEW_HAMPSHIRE:
                mStateCode = STATE_NEW_HAMPSHIRE;
            case NEW_JERSEY:
                mStateCode = STATE_NEW_JERSEY;
            case NEW_MEXICO:
                mStateCode = STATE_NEW_MEXICO;
            case NEW_YORK:
                mStateCode = STATE_NEW_YORK;
            case NORTH_CAROLINA:
                mStateCode = STATE_NORTH_CAROLINA;
            case NORTH_DAKOTA:
                mStateCode = STATE_NORTH_DAKOTA;
            case OHIO:
                mStateCode = STATE_OHIO;
            case OKLAHOMA:
                mStateCode = STATE_OKLAHOMA;
            case OREGON:
                mStateCode = STATE_OREGON;
            case PENNSYLVANIA:
                mStateCode = STATE_PENNSYLVANIA;
            case RHODE_ISLAND:
                mStateCode = STATE_RHODE_ISLAND;
            case SOUTH_CAROLINA:
                mStateCode = STATE_SOUTH_CAROLINA;
            case SOUTH_DAKOTA:
                mStateCode = STATE_SOUTH_DAKOTA;
            case TENNESSEE:
                mStateCode = STATE_TENNESSEE;
            case TEXAS:
                mStateCode = STATE_TEXAS;
            case UTAH:
                mStateCode = STATE_UTAH;
            case VERMONT:
                mStateCode = STATE_VERMONT;
            case VIRGINIA:
                mStateCode = STATE_VIRGINIA;
            case WASHINGTON:
                mStateCode = STATE_WASHINGTON;
            case WEST_VIRGINIA:
                mStateCode = STATE_WEST_VIRGINIA;
            case WISCONSIN:
                mStateCode = STATE_WISCONSIN;
            case WYOMING:
                mStateCode = STATE_WYOMING;
            default:
                mStateCode = STATE_UNKNOWN;
        }

        return mStateCode;
    }


    // This method takes a state abbreviation String and gets that state's code
    public int getStateCodeAbbrev(String stateAbbrev) {
        mStateAbbrev = stateAbbrev.trim().toLowerCase();
        mStateCode = STATE_UNKNOWN;

        // Find the state code from the given abbreviation
        switch (mStateAbbrev) {
            case UNKNOWN:
                mStateCode = STATE_UNKNOWN;
            case AL:
                mStateCode = STATE_ALABAMA;
            case AK:
                mStateCode = STATE_ALASKA;
            case AZ:
                mStateCode = STATE_ARIZONA;
            case AR:
                mStateCode = STATE_ARKANSAS;
            case CA:
                mStateCode = STATE_CALIFORNIA;
            case CO:
                mStateCode = STATE_COLORADO;
            case CT:
                mStateCode = STATE_CONNECTICUT;
            case DE:
                mStateCode = STATE_DELAWARE;
            case FL:
                mStateCode = STATE_FLORIDA;
            case GA:
                mStateCode = STATE_GEORGIA;
            case HI:
                mStateCode = STATE_HAWAII;
            case ID:
                mStateCode = STATE_IDAHO;
            case IL:
                mStateCode = STATE_ILLINOIS;
            case IN:
                mStateCode = STATE_INDIANA;
            case IA:
                mStateCode = STATE_IOWA;
            case KS:
                mStateCode = STATE_KANSAS;
            case KY:
                mStateCode = STATE_KENTUCKY;
            case LA:
                mStateCode = STATE_LOUISIANA;
            case ME:
                mStateCode = STATE_MAINE;
            case MD:
                mStateCode = STATE_MARYLAND;
            case MA:
                mStateCode = STATE_MASSACHUSETTS;
            case MI:
                mStateCode = STATE_MICHIGAN;
            case MN:
                mStateCode = STATE_MINNESOTA;
            case MS:
                mStateCode = STATE_MISSISSIPPI;
            case MO:
                mStateCode = STATE_MISSOURI;
            case MT:
                mStateCode = STATE_MONTANA;
            case NE:
                mStateCode = STATE_NEBRASKA;
            case NV:
                mStateCode = STATE_NEVADA;
            case NH:
                mStateCode = STATE_NEW_HAMPSHIRE;
            case NJ:
                mStateCode = STATE_NEW_JERSEY;
            case NM:
                mStateCode = STATE_NEW_MEXICO;
            case NY:
                mStateCode = STATE_NEW_YORK;
            case NC:
                mStateCode = STATE_NORTH_CAROLINA;
            case ND:
                mStateCode = STATE_NORTH_DAKOTA;
            case OH:
                mStateCode = STATE_OHIO;
            case OK:
                mStateCode = STATE_OKLAHOMA;
            case OR:
                mStateCode = STATE_OREGON;
            case PA:
                mStateCode = STATE_PENNSYLVANIA;
            case RI:
                mStateCode = STATE_RHODE_ISLAND;
            case SC:
                mStateCode = STATE_SOUTH_CAROLINA;
            case SD:
                mStateCode = STATE_SOUTH_DAKOTA;
            case TN:
                mStateCode = STATE_TENNESSEE;
            case TX:
                mStateCode = STATE_TEXAS;
            case UT:
                mStateCode = STATE_UTAH;
            case VT:
                mStateCode = STATE_VERMONT;
            case VA:
                mStateCode = STATE_VIRGINIA;
            case WA:
                mStateCode = STATE_WASHINGTON;
            case WV:
                mStateCode = STATE_WEST_VIRGINIA;
            case WI:
                mStateCode = STATE_WISCONSIN;
            case WY:
                mStateCode = STATE_WYOMING;
            default:
                mStateCode = STATE_UNKNOWN;
        }

        return mStateCode;
    }

    // This method checks if the state code is a valid option
    public boolean isValidStateCode() {

        switch (mStateCode) {
            case STATE_UNKNOWN:
                return true;
            case STATE_ALABAMA:
                return true;
            case STATE_ALASKA:
                return true;
            case STATE_ARIZONA:
                return true;
            case STATE_ARKANSAS:
                return true;
            case STATE_CALIFORNIA:
                return true;
            case STATE_COLORADO:
                return true;
            case STATE_CONNECTICUT:
                return true;
            case STATE_DELAWARE:
                return true;
            case STATE_FLORIDA:
                return true;
            case STATE_GEORGIA:
                return true;
            case STATE_HAWAII:
                return true;
            case STATE_IDAHO:
                return true;
            case STATE_ILLINOIS:
                return true;
            case STATE_INDIANA:
                return true;
            case STATE_IOWA:
                return true;
            case STATE_KANSAS:
                return true;
            case STATE_KENTUCKY:
                return true;
            case STATE_LOUISIANA:
                return true;
            case STATE_MAINE:
                return true;
            case STATE_MARYLAND:
                return true;
            case STATE_MASSACHUSETTS:
                return true;
            case STATE_MICHIGAN:
                return true;
            case STATE_MINNESOTA:
                return true;
            case STATE_MISSISSIPPI:
                return true;
            case STATE_MISSOURI:
                return true;
            case STATE_MONTANA:
                return true;
            case STATE_NEBRASKA:
                return true;
            case STATE_NEVADA:
                return true;
            case STATE_NEW_HAMPSHIRE:
                return true;
            case STATE_NEW_JERSEY:
                return true;
            case STATE_NEW_MEXICO:
                return true;
            case STATE_NEW_YORK:
                return true;
            case STATE_NORTH_CAROLINA:
                return true;
            case STATE_NORTH_DAKOTA:
                return true;
            case STATE_OHIO:
                return true;
            case STATE_OKLAHOMA:
                return true;
            case STATE_OREGON:
                return true;
            case STATE_PENNSYLVANIA:
                return true;
            case STATE_RHODE_ISLAND:
                return true;
            case STATE_SOUTH_CAROLINA:
                return true;
            case STATE_SOUTH_DAKOTA:
                return true;
            case STATE_TENNESSEE:
                return true;
            case STATE_TEXAS:
                return true;
            case STATE_UTAH:
                return true;
            case STATE_VERMONT:
                return true;
            case STATE_VIRGINIA:
                return true;
            case STATE_WASHINGTON:
                return true;
            case STATE_WEST_VIRGINIA:
                return true;
            case STATE_WISCONSIN:
                return true;
            case STATE_WYOMING:
                return true;
            default:
                return false;
        }
    }

    // This method gets a String[] of State Name Resource IDs
    public String[] getStateNameArray() {
        return mStateNameArray;
    }

    // This method gets a String[] of State Abbreviation Resource IDs
    public String[] getStateAbbrevArray() {
        return mStateAbbrevArray;
    }
}

// TODO place these in the strings resource file for state names
//<!-- Strings of USA State Names -->
//<string name="unknown">Unknown</string>
//<string name="alabama">Alabama</string>
//<string name="alaska">Alaska</string>
//<string name="arizona">Arizona</string>
//<string name="arkansas">Arkansas</string>
//<string name="california">California</string>
//<string name="colorado">Colorado</string>
//<string name="connecticut">Connecticut</string>
//<string name="delaware">Delaware</string>
//<string name="florida">Florida</string>
//<string name="georgia">Georgia</string>
//<string name="hawaii">Hawaii</string>
//<string name="idaho">Idaho</string>
//<string name="illinois">Illinois</string>
//<string name="indiana">Indiana</string>
//<string name="iowa">Iowa</string>
//<string name="kansas">Kansas</string>
//<string name="kentucky">Kentucky</string>
//<string name="louisiana">Louisiana</string>
//<string name="maine">Maine</string>
//<string name="maryland">Maryland</string>
//<string name="massachusetts">Massachusetts</string>
//<string name="michigan">Michigan</string>
//<string name="minnesota">Minnesota</string>
//<string name="mississippi">Mississippi</string>
//<string name="missouri">Missouri</string>
//<string name="montana">Montana</string>
//<string name="nebraska">Nebraska</string>
//<string name="nevada">Nevada</string>
//<string name="new_hampshire">New Hampshire</string>
//<string name="new_jersey">New Jersey</string>
//<string name="new_mexico">New Mexico</string>
//<string name="new_york">New York</string>
//<string name="north_carolina">North Carolina</string>
//<string name="north_dakota">North Dakota</string>
//<string name="ohio">Ohio</string>
//<string name="oklahoma">Oklahoma</string>
//<string name="oregon">Oregon</string>
//<string name="pennsylvania">Pennsylvania</string>
//<string name="rhode_island">Rhode Island</string>
//<string name="south_carolina">South Carolina</string>
//<string name="south_dakota">South Dakota</string>
//<string name="tennessee">Tennessee</string>
//<string name="texas">Texas</string>
//<string name="utah">Utah</string>
//<string name="vermont">Vermont</string>
//<string name="virginia">Virginia</string>
//<string name="washington">Washington</string>
//<string name="west_virginia">West Virginia</string>
//<string name="wisconsin">Wisconsin</string>
//<string name="wyoming">Wyoming</string>

// TODO place these in the strings resource file for state abbreviations
//<!-- Strings for state spinner -->
//<string name="al">AL</string>
//<string name="ak">AK</string>
//<string name="az">AZ</string>
//<string name="ar">AR</string>
//<string name="ca">CA</string>
//<string name="co">CO</string>
//<string name="ct">CT</string>
//<string name="de">DE</string>
//<string name="fl">FL</string>
//<string name="ga">GA</string>
//<string name="hi">HI</string>
//<string name="id">ID</string>
//<string name="il">IL</string>
//<string name="in">IN</string>
//<string name="ia">IA</string>
//<string name="ks">KS</string>
//<string name="ky">KY</string>
//<string name="la">LA</string>
//<string name="me">ME</string>
//<string name="md">MD</string>
//<string name="ma">MA</string>
//<string name="mi">MI</string>
//<string name="mn">MN</string>
//<string name="ms">MS</string>
//<string name="mo">MO</string>
//<string name="mt">MT</string>
//<string name="ne">NE</string>
//<string name="nv">NV</string>
//<string name="nh">NH</string>
//<string name="nj">NJ</string>
//<string name="nm">NM</string>
//<string name="ny">NY</string>
//<string name="nc">NC</string>
//<string name="nd">ND</string>
//<string name="oh">OH</string>
//<string name="ok">OK</string>
//<string name="or">OR</string>
//<string name="pa">PA</string>
//<string name="ri">RI</string>
//<string name="sc">SC</string>
//<string name="sd">SD</string>
//<string name="tn">TN</string>
//<string name="tx">TX</string>
//<string name="ut">UT</string>
//<string name="vt">VT</string>
//<string name="va">VA</string>
//<string name="wa">WA</string>
//<string name="wv">WV</string>
//<string name="wi">WI</string>
//<string name="wy">WY</string>
