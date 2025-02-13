import java.util.Scanner;

public class Operator_Expression {
    public static void main(String[] args) {
        float length;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextFloat();
        System.out.println("Enter height: ");
        height = sc.nextFloat();
        float area = length * height;
        System.out.println("Area = "+area);
    }
}
