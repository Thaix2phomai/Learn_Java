package test;
 /*Câu 2:*/
public class Bmi {
    public void getBmi1 (double weight, double height){
        System.out.println("Cân nặng: " + weight + "kg");
        System.out.println("Chiều cao: " +height + "m");
        System.out.println("1.Chỉ số BMI là: " + (weight/(height*height)));
    }
    public double getBmi2 (){
        double weight = 60 ;
        double height = 1.70 ;
        double bmi = weight/(height*height) ;
        return bmi ;
    }
    public double getBmi3 (double weight, double height){

        return weight/(height*height);
    }

}
