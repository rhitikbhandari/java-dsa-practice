import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        a = sc.nextInt();
        System.out.println("enter the second number: ");
        b = sc.nextInt();
        System.out.println("sum is " + (a + b));

    }
}