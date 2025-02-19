import java.util.Scanner; // overloading

public class Demo2 {
    public static void main(String[] args) {

        add(5, 6.5); // changing parameters in METHOD.

    }

    static void add() // Method 1
    {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the First Number:"); ////-------
        a = s.nextInt(); // ----- here we are Printing the numbers.
        System.out.println("Enter the Second number"); ////-------
        b = s.nextInt();
        System.out.println("Addtion: " + (a + b));
    }

    static void add(int a, int b) // Method 2 here we are using both integer variable.
    {
        System.out.println("Addition in Int: " + (a + b));
    }

    static void add(double a, int b) // Method 3 here we are using one double and one integer variable.
    {
        System.out.println("Addition in Double 3: " + (a + b));
    }

    static void add(int a, double b) // Method 4 here we are using one integer and one double variable.
    {
        System.out.println("Addition in Double 4: " + (a + b));
    }

}
