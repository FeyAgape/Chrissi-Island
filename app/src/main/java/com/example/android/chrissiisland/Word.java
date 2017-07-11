package com.example.android.chrissiisland;

/**
 * {@link Word} represents information about Chrissi.
 * It contains resource IDs for the main information, extra information, and
 * optional image file.
 */
public class Word {

    /** String resource ID for the main information about Chrissi */
    private int mMainInformationId;

    /** String resource ID for the Miwok translation of the word */
    private int mExtraInformationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     * Constructor one passes just one object.
     *
     * @param mainInformationId is the string resource ID for main information
     */
    public Word(int mainInformationId) {
        mMainInformationId = mainInformationId;
    }


    /**
     * Create a new Word object.
     * Constructor two passed two object.
     *
     * @param mainInformationId is the string resource ID for main information
     * @param extraInformationId is the string resource Id for extra information
     */
    public Word(int mainInformationId, int extraInformationId) {
        mMainInformationId = mainInformationId;
        mExtraInformationId = extraInformationId;
    }

    /**
     * Create a new Word object
     * Constructor three passes 3 objects.
     *
     * @param mainInformationId is the string resource ID for main information
     * @param extraInformationId is the string resource Id for extra information
     * @param imageResourceId is the drawable resource ID for the image associated with the word

     */
    public Word(int mainInformationId, int extraInformationId, int imageResourceId) {
        mMainInformationId = mainInformationId;
        mExtraInformationId = extraInformationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getMainInformationId() {
        return mMainInformationId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getExtraInformationId() {
        return mExtraInformationId;
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