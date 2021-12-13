package controller;

import menu.Menu;
import model.Movies;
import service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Movies> moviesList;
    Scanner sc;

    public Controller() {
        service = new Service();
        moviesList = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            Menu.mainMenu();
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách phim: ");
                    service.printMovies(moviesList);
                    break;
                case 2:
                    System.out.println("Danh sách phim theo tên: ");
                    service.printByName(moviesList);
                    break;
                case 3:
                    System.out.println("Danh sách phim theo thời lượng: ");
                    service.printByTime(moviesList);
                    break;
                case 4:
                    System.out.println("Danh sách phim theo lượt xem: ");
                    service.printByView(moviesList);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này !!!");
            }
        }
    }
}
