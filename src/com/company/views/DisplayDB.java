package com.company.views;

import com.company.models.Movie;

import java.util.ArrayList;

public class DisplayDB {

    public void displayFullDB(ArrayList<Movie> theMovies){
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }
    }
}

