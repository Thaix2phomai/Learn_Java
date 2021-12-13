package service;

import model.Movies;

import java.util.ArrayList;

public interface IService {
    public ArrayList<Movies> getData();
    public void printMovies (ArrayList<Movies> moviesList);
    public void printByName (ArrayList<Movies> moviesList);
    public void printByTime (ArrayList<Movies> moviesList);
    public void printByView (ArrayList<Movies> moviesList);
}
