import java.util.Scanner;

public class Array {
    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử %d: ", i);
            arr[i] = sc.nextLine();
        }

        System.out.println("Phần tử mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "]" + " " + arr[i]);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Java")) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có phần tử Java");
        } else {
            System.out.println("Số lần phần tử Java xuất hiện: " + count);
        }

        System.out.print("Nhập chuỗi:  ");
        String st = sc.nextLine();
        System.out.print("Vị trí của chuỗi trong mảng: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(st)) {
                    System.out.print("[" + i + "]" + " ");
                }
            }
    }
}
