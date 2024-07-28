import java.util.Random;
import java.util.Scanner;

class ActivitySelector {
    private String selectedActivity;
    private boolean isActivitySelected = false;
    private boolean isSpinnerReady = false;
    private Object lock = new Object();

    // Method to select an activity
    void selectActivity(String activity) {
        synchronized (lock) {
            selectedActivity = activity;
            isActivitySelected = true;
            lock.notify(); // Notify the waiting thread that an activity is selected
        }
    }

    // Method to spin the lucky spinner and get a random activity
    void spinLuckySpinner() {
        synchronized (lock) {
            Random random = new Random();
            String[] activities = {"sports", "swimming", "study", "running", "gaming"};
            int randomIndex = random.nextInt(activities.length);
            selectedActivity = activities[randomIndex];
            isActivitySelected = true;
            lock.notify(); // Notify the waiting thread that an activity is selected
        }
    }

    // Method to display the selected activity
    void displaySelectedActivity() {
        synchronized (lock) {
            while (!isActivitySelected) {
                try {
                    lock.wait(); // Wait for an activity to be selected
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Suggested activity: " + selectedActivity);
        }
    }
}
