package com.omdevs.bookmyshowclone.entity;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private int id;
    private String title;
    private String genre;
    private String director;
    private int year;
    private int runtime;
    public Movie() {

    }
    public Movie(int id, String title, String genre, String director, int year, int runtime) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.runtime = runtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
