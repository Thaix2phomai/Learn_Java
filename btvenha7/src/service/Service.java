package service;

import model.Movies;

import java.util.ArrayList;

public class Service {
    ArrayList<Movies> moviesList;
    public void addMovies () {
        moviesList = new ArrayList<>();
        moviesList.add(new Movies("1C3","Insidious: The Last Key ", "Horror", 103, " Adam Robitel ", 2017));
        moviesList.add(new Movies("2F4","Warrior", "ACtion", 140, "Tommy Riordan", 2011));
        moviesList.add(new Movies("5K2","Ant-man And The Wasp", "Action, Fiction", 132, "Marvel", 2018));
        moviesList.add(new Movies("4P6","Wonder Woman", "Fiction", 90, "DC", 2017));
        moviesList.add(new Movies("9T8","Just go with it", "Comedy, Romantic", 116, "Brooklyn Decker", 2011));
    }

    public void printMovies () {
        System.out.println("Danh sách phim: ");
        for (Movies mo : moviesList) {
            System.out.println(mo);
        }
            }

    public void actionMovies (){
        System.out.println("Danh sách phim có thể loại hành động: ");
        String subtype = "action";
        for (int i =0 ; i < moviesList.size(); i++){
            if (moviesList.get(i).getType().toLowerCase().contains(subtype)){
                System.out.println(moviesList.get(i));
            }
        }
    }

}
