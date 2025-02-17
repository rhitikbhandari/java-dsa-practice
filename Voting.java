import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int Person;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Age:");
        Person = s.nextInt();
        if (Person >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
    }

}
