package com.example.movieslist;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private double duration;
    private double rating;
    private String genre;
    private int year;
    private boolean isAnimation;
    private int img;


    public Movie(String name, double duration, double rating, String genre, int year, boolean isAnimation, int img) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
        this.isAnimation = isAnimation;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAnimation() {
        return isAnimation;
    }

    public void setAnimation(boolean animation) {
        isAnimation = animation;
    }
}
