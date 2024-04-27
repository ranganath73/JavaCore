import java.util.Scanner;

public class ErrorHandlingSuggestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // String input = "$A10";
        // String number = new String("10");
        // String number = new String('abc'); // # WRONG
        // char color = 'B';
        // char color = 65;  // Default value => 0
        // String input = "10";
        String input = scanner.nextLine();
        //int number = scanner.nextInt();
        try {
            // Integer intObj = new Integer(10);
            //   Integer intObj = 10;  // Auto-boxing
            //    Integer.compare(55,25);  // false
            // intObj.compareTo(10); https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
            int number = Integer.parseInt(input);
            System.out.println("You entered a valid number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            System.out.println("Consider using try-catch to handle such input errors.");
        }
    }
}
