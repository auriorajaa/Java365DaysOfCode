package day3;

public class Main {
    public static void main(String[] args) {
        // Expression: A combination of values and operators that can be evaluated to a
        // single value
        int x = 5;
        int y = 10;
        int result = x + y; // This is an expression that evaluates to 15

        // Statement: A complete line of code that performs an action
        System.out.println("The result is: " + result); // This is a statement

        // Block: A group of statements enclosed in curly braces
        if (x < y) {
            // This is a block
            System.out.println("x is less than y.");
        } else {
            // This is another block
            System.out.println("x is greater than or equal to y.");
        }

        // If Statement: Conditional execution of code
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot outside.");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It's a pleasant day.");
        } else {
            System.out.println("It's cool outside.");
        }

        // Switch Statement: Selective execution based on a value
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
        }
    }
}
