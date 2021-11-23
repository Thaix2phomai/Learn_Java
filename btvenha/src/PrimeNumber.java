//Câu 3:
public class PrimeNumber {
    public void getPrimeNumber () {
        int n = 20;
        int squareRoot = (int) Math.sqrt(n);
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        System.out.print(2);
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
