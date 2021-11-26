import java.util.Scanner;

public class Bai6 {
    public static void multiArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] marr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                marr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(marr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Các phần tử ở đường chéo chính: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j){
                    System.out.print(marr[i][j] + " ");
                }
            }
        }
    }
}
