public class Bai2 {
    public static void count () {
        String string = "You only live once, but if you do it right, once is enough";
        System.out.println(string);
        String[] words = string.split(" ");
        System.out.println("Số từ trong chuỗi là: " +words.length);

        int count = 0;
        for (int i = 0 ; i < string.length(); i++){
            String str = String.valueOf(string.charAt(i)) ;
            if (str.equals("o")){
                count ++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n Số ký tự là: " + count);
    }
}

