package com.company.views;

import com.company.controllers.DBConnect;

import java.util.Scanner;

public class UserData {
    private String movieTitle;
    private String movieDate;
    private String movieRating;

    public void getMovie(){
        Scanner input = new Scanner(System.in);
        DBConnect db = new DBConnect("movies.db");
        System.out.println("Please enter a Movie name");
        movieTitle=input.nextLine();
        System.out.println("Please enter the Movie's Release Year ");
        movieDate=input.nextLine();
        System.out.println("Please enter the Movie's Rating ");
        movieRating=input.nextLine();
        db.addData(movieTitle,movieDate,movieRating);
    }
}
