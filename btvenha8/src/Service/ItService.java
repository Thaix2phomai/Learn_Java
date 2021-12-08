package Service;
import model.Programmer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ItService {
    ArrayList<Programmer> listProgrammer;
     public void addProgrammer () {
         listProgrammer = new ArrayList<>();
         listProgrammer.add(new Programmer("Thái", 21,"0394106474","thaithedoublecheese1@gmail.com", 10000, 10));
         listProgrammer.add(new Programmer("Khải", 23,"0913248596","khaihn@gmail.com",7000, 8));
         listProgrammer.add(new Programmer("Cường", 29,"0481236475","cuongvn@gmail.com", 9000, 12));
         listProgrammer.add(new Programmer("Tú", 28,"0641236438","tucall@gmail.com", 7500, 6));
     }

     public void printProgrammer (){
             System.out.println("Danh sách lập trình viên: ");
             for (Programmer pr : listProgrammer) {
                 System.out.println(pr);
         }
     }

     public void findProgrammer (){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập tên lập trình viên cần tìm kiếm: ");
         String name = sc.nextLine();
         int count = 0;
         for (int i = 0 ; i < listProgrammer.size(); i++){
             if(listProgrammer.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                 System.out.println(listProgrammer.get(i));
                 count++;
             }
         }
         if (count == 0){
             System.out.println("Không có lập trình viên cần tìm kiếm");
         }
     }
}
