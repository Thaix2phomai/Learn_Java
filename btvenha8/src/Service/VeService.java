package Service;
import model.Verifier;
import java.util.ArrayList;
import java.util.Scanner;

public class VeService {
    ArrayList<Verifier> listVerifier;

    public void addVerifier() {
        listVerifier = new ArrayList<>();
        listVerifier.add(new Verifier("Ngọc", 26, "0504327982", "ngocday@gmail.com", 4000, 7));
        listVerifier.add(new Verifier("Thắng", 24, "0359743838", "thangmanh@gmail.com", 2500, 6));
        listVerifier.add(new Verifier("Hạnh", 28, "0304832793", "hnhanh@gmail.com", 5000, 15));
        listVerifier.add(new Verifier("Thịnh", 23, "0989970145", "thinhga@gmail.com", 3200, 4));
    }

    public void printVerifier() {
        System.out.println("Danh sách kiểm chứng viên: ");
        for (Verifier ve : listVerifier) {
            System.out.println(ve);
        }
    }

    public void findVerifier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên kiểm chứng viên cần tìm kiếm: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < listVerifier.size(); i++) {
            if (listVerifier.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(listVerifier.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có kiểm chứng viên cần tìm kiếm");
        }
    }
}