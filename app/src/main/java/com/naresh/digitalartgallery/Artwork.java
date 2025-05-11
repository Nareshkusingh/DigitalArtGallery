package com.naresh.digitalartgallery;


public class Artwork {


    private String title;
    private String artist;
    private int imageResId; // Resource ID for the image

    public Artwork(String title, String artist, int imageResId) {
        this.title = title;
        this.artist = artist;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResId() {
        return imageResId;
    }
}