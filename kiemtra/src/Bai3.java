import java.util.Random;

public class Bai3 {
    public static void primeNumber () {
        Random ra = new Random();
        int n = ra.nextInt(20);
        System.out.println("Số ngẫu nhiên là: " + n);
        if (!isPrimeNumber(n) ){
            System.out.println(n + " không là số nguyên tố");
        }else{
            System.out.println(n + " là số nguyên tố");
        }
    }

        public static boolean isPrimeNumber ( int n){
            if (n < 2) {
                return false;
            }
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

