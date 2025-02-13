import java.util.Scanner;

public class Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args) {
        //a*x+b=c
        System.out.println("Give linear equation: a*x+b=c");
        float a;
        float b;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextFloat();
        System.out.println("Enter b:");
        b=sc.nextFloat();
        System.out.println("Enter c:");
        c=sc.nextFloat();
        if (a==0){
            System.out.println("Can't be solved");
        }else if (a!=0){
            float x=(c-b)/a;
            System.out.println("x = "+x);
        }
    }
}
