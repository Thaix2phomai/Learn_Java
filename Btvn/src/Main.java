import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        int n = Integer.parseInt(sc.nextLine());
        ProductManagement [] product =  new ProductManagement [n];
        for (int i=0; i < n ; i ++){
            System.out.print("Nhập mã sản phẩm " + (i+1) + " :");
            String id = sc.nextLine();
            System.out.print("Nhập tên sản phẩm " + (i+1) + " : ");
            String name = sc.nextLine();
            System.out.print("Nhập mô tả cho sản phẩm " + (i+1) + " : ");
            String describe = sc.nextLine();
            System.out.print("Nhập số lượng sản phẩm " + (i+1) + " : ");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá sản phẩm " + (i+1) + " : ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập kiểu sản phẩm " + (i+1) + " : ");
            String type = sc.nextLine();
            if ((i+1) !=n ){
                System.out.println("Nhập sản phẩm tiếp theo! ");
            }
            ProductManagement pr = new ProductManagement(id,name, describe,quantity, price, type);
            product[i] = pr;

        }
        for (int i =0; i<n;i++){
            System.out.println("Thông tin của sản phẩm " + (i+1) + "\n" + product[i]);
        }

        System.out.print("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(product[i].name.contains(findName)){
                count++;
                System.out.println("Thông tin của sản phẩm vừa tìm là: " + "\n" + product[i]);
            }
        }
        if(count == 0){
            System.out.println("ko có sản phẩm tìm kiếm!");
        }

    }
}
