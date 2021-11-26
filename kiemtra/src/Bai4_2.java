public class Bai4_2 {
    public static void getPrimeNumber () {
        int n = 10;
        int squareRoot = (int) Math.sqrt(n);
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
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
