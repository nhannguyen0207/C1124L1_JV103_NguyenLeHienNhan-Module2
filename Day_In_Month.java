import java.util.Scanner;

public class Day_In_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month you want to know? ");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println("29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
                default:
                    System.out.println("Invalid input");
        }
    }
}
