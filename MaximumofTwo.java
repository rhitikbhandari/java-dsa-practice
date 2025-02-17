import java.util.Scanner;

public class MaximumofTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the First Number:");
        a = s.nextInt();
        System.out.println("Enter the Second Number:");
        b = s.nextInt();
        if (a > b) {
            System.out.println(+a);
        } else {
            System.out.println(+b);
        }
    }
}
