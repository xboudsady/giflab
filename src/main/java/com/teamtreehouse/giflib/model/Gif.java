package com.teamtreehouse.giflib.model;

public class Gif {
    private String name;
    private LocatDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(String name, LocatDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.usernam = usernam;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocatDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocatDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return usernam;
    }

    public void setUsername(String usernam) {
        this.usernam = usernam;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
