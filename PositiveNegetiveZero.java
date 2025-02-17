import java.util.Scanner;

public class PositiveNegetiveZero {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = s.nextInt();
        if (num > 0) {
            System.out.print("Number is positive ");
        } else if (num < 0) {
            System.out.print("Number is Negetive");
        } else {
            System.out.println("Number is Zero");
        }

    }

}
