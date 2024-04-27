import java.io.IOException;

// Custom exception class
class CustomException extends Exception {   // Exception is the #PARENT class or #SUPER class
    public CustomException(String message) {
        super(message);   // super() -> It calles the parent class constructor
    }
}

public class ExceptionDemo {
    // Method that throws a predefined exception
    public static void demonstratePredefinedException() {
        try {
            int result = 10 / 0; // Attempting division by zero
        } catch (ArithmeticException e) {
            System.out.println("Predefined Exception Caught: " + e.getMessage());
        }
    }

    // Method that throws a user-defined exception
    public static void demonstrateUserDefinedException() throws CustomException {
        try {
            throw new CustomException("Custom Exception Example");
        } catch (CustomException e) {
            System.out.println("User-Defined Exception Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Demonstrate predefined exception
            System.out.println("Demonstrating Predefined Exception:");
            demonstratePredefinedException();
            
            // Demonstrate user-defined exception
            System.out.println("\nDemonstrating User-Defined Exception:");
            demonstrateUserDefinedException();
        } catch (IOException e) {
            System.out.println("IOException Caught: " + e.getMessage());
        } finally {
            System.out.println("\nFinally block executed.");
        }
    }
}
