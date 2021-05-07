package com.company;
class Movie {
    String title;
    int rating;
    String genre;
    void playIt(){
        System.out.println("Playing the movie");
    }
}
public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title="Story";
        one.rating=4;
        one.genre="Tragic";
        Movie two = new Movie();
        two.title="Love";
        two.rating=3;
        two.genre="comedy";
        two.playIt();
        Movie three = new Movie();
        three.rating=5;
        three.title="Ishq";
        three.genre="horror";
    }
}
