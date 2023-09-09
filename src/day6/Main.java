package day6;

public class Main {
    public static void main(String[] args) {
        // Method with Variable Arguments
        int sum1 = calculateSum(1, 2, 3, 4, 5);
        int sum2 = calculateSum(10, 20, 30);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);

        // Method Overloading: Defining multiple methods with the same name but
        // different parameters
        int product1 = multiply(2, 3);
        double product2 = multiply(2.5, 3.5);

        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
    }

    // Method with Variable Arguments
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method Overloading: Multiply integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method Overloading: Multiply doubles
    public static double multiply(double a, double b) {
        return a * b;
    }
}
