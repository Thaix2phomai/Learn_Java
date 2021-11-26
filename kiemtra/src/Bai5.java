import java.util.Locale;
import java.util.Scanner;

public class Bai5 {
    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        name.trim();
        String[] array = name.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += String.valueOf(array[i].charAt(0)).toUpperCase() + array[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(result);

        System.out.println("Nhập chuỗi bất kỳ: ");
        String chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(chuoi.length() - i - 1);
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}

