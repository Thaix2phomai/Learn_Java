public class Bai1 {
    public static void square (){
        for (int i = 0 ; i <4 ; i++){
            for (int j = 0 ; j < 4 ; j++){
                System.out.print("* \t" );
            }
            System.out.println();
        }
    }
    public static void triangle () {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
