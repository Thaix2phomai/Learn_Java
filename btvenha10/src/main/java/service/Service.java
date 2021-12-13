package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    @Override
    public ArrayList<Movies> getData() {
        ArrayList<Movies> moviesList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("movies.json");
            Type objectType = new TypeToken<ArrayList<Movies>>() {
            }.getType();
            moviesList = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return moviesList;
    }

    @Override
    public void printMovies(ArrayList<Movies> moviesList) {
        for (Movies mo : moviesList) {
            System.out.println(mo);
        }
    }

    @Override
    public void printByName(ArrayList<Movies> moviesList) {
        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o1.getMoviename().replace("[-+.^:,]","").compareTo(o2.getMoviename().replace("[-+.^:,]",""));
            }
        });
        printMovies(moviesList);
    }

    @Override
    public void printByTime(ArrayList<Movies> moviesList) {
        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o2.getLength() - o1.getLength();
            }
        });
        printMovies(moviesList);
    }

    @Override
    public void printByView(ArrayList<Movies> moviesList) {
        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o2.getView() - o1.getView();
            }
        });
        printMovies(moviesList);
    }

}