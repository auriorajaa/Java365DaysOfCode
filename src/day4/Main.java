package day4;

public class Main {
    public static void main(String[] args) {
        // Ternary Operator (Conditional Expression): A compact way to express conditional statements
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor"; // Ternary operator
        System.out.println("Status: " + status);

        // For Loop: Execute code repeatedly for a fixed number of times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop: Execute code as long as a condition is true
        int count = 0;
        while (count < 3) {
            System.out.println("While loop iteration " + (count + 1));
            count++;
        }

        // Do-While Loop: Similar to while loop, but guaranteed to execute at least once
        int num = 5;
        do {
            System.out.println("Do-while loop iteration " + num);
            num--;
        } while (num > 0);
    }
}

