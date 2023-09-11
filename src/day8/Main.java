package day8;

/* 

As I mentioned earlier on my Twitter account... for the next 7 days, 
I will be reviewing the same material 
that I have already studied for the past week. 

*/

public class Main {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 25; // Integer
        char grade = 'A'; // Character
        boolean isStudent = true; // Boolean
        String name = "John"; // String

        // Non-Primitive Data Type (String is a non-primitive)
        String greeting = "Hello, ";
        String message = greeting + name;

        // Printing the values
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is a student: " + isStudent);
        System.out.println("Name: " + name);
        System.out.println("Greeting: " + greeting);
        System.out.println("Message: " + message);
    }
}