import java.util.Scanner;

public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter the number:");
        a = s.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Number is Even ");
                break;
            case 1:
                System.out.println("Number is Odd ");
                break;
            default:
                System.out.println("Envalid number");
        }
    }

}
