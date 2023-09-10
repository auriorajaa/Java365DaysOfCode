package day7;

public class Main {
    public static void main(String[] args) {
        // Recursive Method: A method that calls itself
        int factorialOf5 = calculateFactorial(5);
        System.out.println("Factorial of 5: " + factorialOf5);

        // Scope in Java: Understanding where variables are accessible
        int x = 10; // This is a variable in the main method's scope
        System.out.println("x in main method: " + x);

        {
            int y = 20; // This is a variable in a block's scope
            System.out.println("y in block: " + y);

            int xInBlock = 30; // This is a new variable in the block's scope, shadowing the outer 'x'
            System.out.println("xInBlock in block: " + xInBlock);
        }

        // This 'x' is still the main method's 'x'
        System.out.println("x after block: " + x);

        // This 'y' is not accessible here because it's out of scope
        // System.out.println("y after block: " + y);
    }

    // Recursive Method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
}
