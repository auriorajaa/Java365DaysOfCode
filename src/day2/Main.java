package day2;

public class Main {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Math operations
        int sum = numbers[0] + numbers[1]; // Addition
        int difference = numbers[3] - numbers[2]; // Subtraction
        int product = numbers[2] * numbers[4]; // Multiplication
        int quotient = numbers[4] / numbers[1]; // Division
        int remainder = numbers[3] % numbers[2]; // Modulus

        // Comparison operations
        boolean isEqual = numbers[2] == numbers[3]; // Equal
        boolean isNotEqual = numbers[1] != numbers[4]; // Not Equal
        boolean isLessThan = numbers[0] < numbers[2]; // Less Than
        boolean isGreaterThan = numbers[4] > numbers[3]; // Greater Than
        boolean isLessOrEqual = numbers[0] <= numbers[1]; // Less Than or Equal
        boolean isGreaterOrEqual = numbers[3] >= numbers[2]; // Greater Than or Equal

        // Boolean operations
        boolean andResult = true && false; // Logical AND
        boolean orResult = true || false; // Logical OR
        boolean notResult = !true; // Logical NOT

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Less Than: " + isLessThan);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Is Less or Equal: " + isLessOrEqual);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);
    }
}
