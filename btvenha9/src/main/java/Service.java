import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public ArrayList<Customer> addCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer(Util.generateId(5), "Thái", LocalDate.of(2000, 6, 22), Gender.Nam, "Hà Nội", "0394106474", "thaithedoublecheese1@gmai.com"));
        listCustomer.add(new Customer(Util.generateId(5), "Cường", LocalDate.of(1992, 4, 15), Gender.Nam, "Lào Cai", "0989980116", "cuongvn@gmail.com"));
        listCustomer.add(new Customer(Util.generateId(5), "Ngọc", LocalDate.of(1996, 8, 6), Gender.Nữ, "Yên Bái", "0987714358", "ngoctech@gmail.com"));
        listCustomer.add(new Customer(Util.generateId(5), "Dũng", LocalDate.of(1998, 12, 4), Gender.Nam, "Ba Vì", "0319915424", "dungctc@gmail.com"));
        listCustomer.add(new Customer(Util.generateId(5), "Linh", LocalDate.of(2983, 2, 18), Gender.Nữ, "Phú Thọ", "0801254978", "linhlala@gmail.com"));
        return listCustomer;
    }

    public void printCustomer(ArrayList<Customer> listCustomer) {
        System.out.println("Danh sách khách hàng: ");
        for (Customer cu : listCustomer) {
            System.out.println(cu);

        }
    }

    public void printbyGender(ArrayList<Customer> listCustomer) {
        Mainmenu m = new Mainmenu();
        Service se = new Service();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            System.out.println("Tìm kiếm thông tin khách hàng theo giới tính: ");
            System.out.println("1 - Nam");
            System.out.println("2 - Nữ ");
            System.out.println("0 - Quay lại");
            System.out.print("Nhập giới tính khách hàng: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender().equals(Gender.Nam)) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender().equals(Gender.Nữ)) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 0:
                    isContinue = true;
                    m.choiceMenu(listCustomer);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public String enterEmail(String email){
        Scanner sc = new Scanner(System.in);
        if(!Validate.emailValidator(email)){
            System.out.println("Vui Lòng Nhập lại email");
            email = sc.nextLine();
            enterEmail(email);
        }
        return email;
    }

    public String enterPhone(String phone){
        Scanner sc = new Scanner(System.in);
        if(!Validate.phoneValidator(phone)){
            System.out.println("Vui Lòng Nhập lại số đt 10 chữ số ");
            phone = sc.nextLine();
            enterPhone(phone);
        }
        return phone;
    }

    public void newCustomer(ArrayList<Customer> listCustomer) {
        Gender gender = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        System.out.print("Ngày: ");
        int day = sc.nextInt();
        System.out.print("Tháng: ");
        int month = sc.nextInt();
        System.out.print("Năm: ");
        int year = sc.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.println("Nhập giới tính Nam (1) hoặc  Nữ (2) : ");
        int i = Integer.parseInt(sc.nextLine());
        if (i == 1) {
            gender = Gender.Nam;
        }
        if (i == 2) {
            gender = Gender.Nữ;
        }
        System.out.println("Nhập quê quán: ");
        String birthplace = sc.nextLine();
        System.out.println("Nhập SĐT: ");
        String phone = sc.nextLine();
        phone = enterPhone(phone);
        System.out.println("Nhập Email: ");
        String email = sc.nextLine();
        email = enterEmail(email);
        Customer newCustomer = new Customer(Util.generateId(5),name, birthday, gender, birthplace, phone, email); //Tạo đối tượng khách hàng mới
        listCustomer.add(newCustomer);
        System.out.println("Thêm thành công khách hàng mới \n" + newCustomer);
    }

    public void findCustomerID(ArrayList<Customer> listCustomer) {
        Scanner sc = new Scanner(System.in);
        Mainmenu m = new Mainmenu();
        System.out.println("Nhập ID khách hàng muốn tìm kiếm: ");
        String n = sc.nextLine();
        int count = 0;
        boolean isContinue = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId().equals(n) ) {
                System.out.println(listCustomer.get(i));
                count ++;
                while (!isContinue) {
                    System.out.println("1 - Thay đổi tên khách hàng");
                    System.out.println("2 - Thay đổi ngày sinh khách hàng");
                    System.out.println("3 - Thay đổi giới tính khách hàng" );
                    System.out.println("4 - Thay đổi quê quán khách hàng");
                    System.out.println("5 - Thay đổi SĐT khách hàng");
                    System.out.println("6 - Thay đổi email khách hàng");
                    System.out.println("7 - Xóa thông tin khách hàng");
                    System.out.println("0 - Quay lại menu chính");
                    System.out.println("Lựa chọn của bạn là: ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên mới:");
                            String newName = sc.nextLine();
                            listCustomer.get(i).setName(newName);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 2:
                            System.out.print("Nhập ngày sinh muốn sửa : ");
                            int day = sc.nextInt();
                            System.out.print("Nhập tháng sinh muốn sửa : ");
                            int month = sc.nextInt();
                            System.out.print("Nhập năm sinh muốn sửa : ");
                            int year = sc.nextInt();
                            LocalDate birthday = LocalDate.of(year,month,day);
                            listCustomer.get(i).setBirthday(birthday);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 3:
                            Gender gender = null;
                            System.out.print("Nhập giới tính Nam (1) hoặc  Nữ (2) : ");
                            int g = Integer.parseInt(sc.nextLine()) ;
                            if (g == 1){
                                gender = Gender.Nam;
                            } if (g ==2 ){
                                gender = Gender.Nữ;
                            }
                            listCustomer.get(i).setGender(gender);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 4:
                            System.out.print("Nhập quê quán muốn sửa : ");
                            String birthplace = sc.nextLine();
                            listCustomer.get(i).setBirthplace(birthplace);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 5:
                            System.out.println("Nhập SĐT mới:");
                            String newMobile = sc.nextLine();
                            listCustomer.get(i).setPhone(newMobile);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 7:
                            listCustomer.remove(i);
                            System.out.println("Đã xóa khách hàng có ID: " + n);
                            System.out.println("Hệ thống tự động quay lại menu chính");
                            m.choiceMenu(listCustomer);
                            break;
                        case 0:
                            isContinue = true;
                            m.choiceMenu(listCustomer);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                }
            }
        }
        if (count == 0){
            System.out.println("Không có id khách hàng tìm kiếm");
        }
    }
}

