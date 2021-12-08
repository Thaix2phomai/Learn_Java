package Service;

import java.util.Scanner;

public class PickInfo {
    public static void menu() {
        System.out.println("Lựa chọn của bạn là: ");
        System.out.println("1 - Xem thông tin Lập trình viên ");
        System.out.println("2 - Xem thông tin Kiểm chứng viên ");
        System.out.println("3 - Tìm kiếm thông tin Lập trình viên ");
        System.out.println("4 - Tìm kiếm thông tin Kiểm chứng viên");
        System.out.println("0 - Dừng chương trình");
    }
    public static void chooseInfo() {
        ItService it = new ItService();
        VeService ve = new VeService();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        it.addProgrammer();
        ve.addVerifier();
        while (!isContinue) {
            menu();
            System.out.print("Nhập dịch vụ bạn muốn sử dụng: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    it.printProgrammer();
                    break;
                case 2:
                    ve.printVerifier();
                    break;
                case 3:
                    it.findProgrammer();
                    break;
                case 4:
                    ve.findVerifier();
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
