import java.util.Random;
import java.util.Scanner;

public class ActivitySelectorDemo {
    public static void main(String[] args) {
        ActivitySelector activitySelector = new ActivitySelector();

        // Create a thread to display the selected activity
        Thread displayThread = new Thread(() -> {
            activitySelector.displaySelectedActivity();
        });
        displayThread.start();

        Scanner scanner = new Scanner(System.in);

        // Main loop for user input
        while (true) {
            System.out.print("Choose an activity (sports, swimming, study, running, gaming), or type 'spin' for luckyspinner: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("spin")) {
                activitySelector.spinLuckySpinner();
            } else if (isValidActivity(input)) {
                activitySelector.selectActivity(input);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    // Method to check if the input is a valid activity
    private static boolean isValidActivity(String input) {
        String[] validActivities = {"sports", "swimming", "study", "running", "gaming"};
        for (String activity : validActivities) {
            if (activity.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }
}
