package com.example.selfie;

import android.graphics.Bitmap;

/**
 * Class to store a picture.
 * @author Tobias Rosenvinge
 * @since 11.12.2020
 **/
public class Picture {
    private Bitmap pictureBitmap;

    public Picture() {

    }

    /**
     * Gets the picture.
     * @return A Bitmap containing the picture.
     **/
    public Bitmap getPictureBitmap() {
        return pictureBitmap;
    }

    /**
     * Sets the picture.
     * @param pictureBitmap The picture to be stored.
     **/
    public void setPictureBitmap(Bitmap pictureBitmap) {
        this.pictureBitmap = pictureBitmap;
    }
}
