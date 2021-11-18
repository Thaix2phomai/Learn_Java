package test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Câu 1*/
        Calculator ca = new Calculator();
        /*ý 1*/
        ca.getPlus(6,8);
        /* ý 2*/
        ca.getMinus(7,10);
        /*ý 3*/
        ca.getMultiplication(8,5);
        /*ý 4*/
        ca.getDivision(10,2);

        /*Câu 2*/
        /*ý 1*/
        Bmi bm = new Bmi();
        bm.getBmi1(60, 1.70);

       /* ý 2*/
        double bmi2 = bm.getBmi2();
        System.out.println("2.Chỉ số BMI là: " + bmi2);

        /*ý 3*/
        double bmi3 = bm.getBmi3(60,1.70);
        System.out.println("3.Chỉ số BMI là: " + bmi3);

        /*so sánh
           ý 1 không lưu kết quả trả về
           ý 2 sửa giá trị ở trong code bất tiện
           ý 3 ngắn gọn truyền tham số cho hàm sử dụng linh động hơn lưu được kết quả trả về in ra màn hình
           => sử dụng ý 3 là lựa chọn tốt nhất
           */
    }


}
