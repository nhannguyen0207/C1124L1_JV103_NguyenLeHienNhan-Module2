import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = sc.nextFloat();
        System.out.println("Enter height: ");
        height = sc.nextFloat();
        double bmi = weight/(height*height);
        System.out.println("BMI = "+bmi);
        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal weight");
        }else if (bmi>=25 && bmi<=29.9){
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }
    }
}
