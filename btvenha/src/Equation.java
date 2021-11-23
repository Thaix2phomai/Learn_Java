import java.text.DecimalFormat;
import java.util.Scanner;

public class Equation {
        Scanner sc = new Scanner(System.in);
        DecimalFormat de = new DecimalFormat("#.##");
//Câu 1:
    public void simpleEquation () {
        int a;
        int b;
        double nghiem;
        System.out.println("Ta có PT bậc 1 ax + b = 0");
        System.out.print("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.print("Nhập vào số b: ");
        b = sc.nextInt();
        System.out.println("Ta có phương trình: " + a + "x + " + b + " = 0");
        if (a == 0){
            if(b==0){
                System.out.println("PT có vô số nghiệm");
            }else {
                System.out.println("PT vô nghiệm");
            }
        }else {
            nghiem = (double) -b/a;
            System.out.println("PT có nghiệm là: " + de.format(nghiem));
        }

    }

//Câu 2:
    public void quadraticEquation (){
        float a;
        float b;
        float c;
        System.out.println("Ta có PT bậc 2: ax^2 + bx + c = 0");
        System.out.print("Nhập số a: ");
        a = sc.nextFloat();
        System.out.print("Nhập số b: ");
        b = sc.nextFloat();
        System.out.print("Nhập số c: ");
        c = sc.nextFloat();
        System.out.println("Ta có phương trình: " + de.format(a) + "x^2 + " + de.format(b) + "x + " + de.format(c) + "= 0");
        if (a == 0){
            if (b==0){
                System.out.println("PT vô nghiệm" );
            } else {
                System.out.println("PT có 1 nghiệm là: " + "x = " + de.format(-c / b));
            }
            return;
        }

        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if(delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + de.format(x1) + " và x2 = " + de.format(x2));
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + de.format(x1));
        } else {
            System.out.println("Phương trình vô nghiệm!" );
        }

    }
}
