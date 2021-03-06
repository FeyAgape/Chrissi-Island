package com.example.android.chrissiisland;

/**
 * {@link Location} represents information about Chrissi.
 * It contains resource IDs for the main information, extra information, and
 * optional image file.
 */
public class Location {

    /** String resource ID for the main information about Chrissi */
    private int mMainInformationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object
     * Constructor one passes just one object.
     *
     * @param mainInformationId is the string resource ID for main information
     */
    public Location(int mainInformationId) {
        mMainInformationId = mainInformationId;
    }

    /**
     * Create a new Location object
     * Constructor three passes 3 objects.
     *
     * @param mainInformationId is the string resource ID for main information
     * @param imageResourceId is the drawable resource ID for the image associated with the word

     */
    public Location(int mainInformationId, int imageResourceId) {
        mMainInformationId = mainInformationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the main information.
     */
    public int getMainInformationId() {
        return mMainInformationId;
    }


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}