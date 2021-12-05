import service.Service;

public class Main {
    public static void main(String[] args) {
        Service se = new Service();
        se.addMovies();
        se.printMovies();
        System.out.println();
        se.actionMovies();
    }
}
