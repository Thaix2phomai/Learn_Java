import java.util.Scanner;

public class Controller {
    Service service;
    Scanner sc;

    public Controller() {
        service = new Service();
        sc = new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Lựa chọn của bạn là: ");
        System.out.println("1 - Xem thông tin nhân viên chạy bàn ");
        System.out.println("2 - Xem thông tin nhân viên làm bếp ");
        System.out.println("0 - Kết thúc chương trình");
    }


    public void mainMenu() {
        service.addWaiter();
        service.addKitchen();
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.printWaiter();
                    break;
                case 2:
                    service.printKitchen();
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