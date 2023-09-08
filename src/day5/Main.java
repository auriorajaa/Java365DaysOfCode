package day5;

public class Main {
    public static void main(String[] args) {
        // Break and Continue Statements
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // Break the loop when i equals 3
                break;
            }
            System.out.println("Break: " + i);
        }

        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                // Skip iteration when j equals 3
                continue;
            }
            System.out.println("Continue: " + j);
        }

        // For-Each Loop: Iterating through elements in an array or collection
        String[] fruits = { "Apple", "Banana", "Orange" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Method: Reusable blocks of code
        int result = addNumbers(5, 3);
        System.out.println("Method Result: " + result);

        // Method with Parameters and Return Value
        String fullName = getFullName("John", "Doe");
        System.out.println("Full Name: " + fullName);
    }

    // Method that takes two parameters and returns an integer
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method that takes two parameters and returns a string
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
