import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExerciseScheduler {
    private List<ExerciseSlot> availableSlots = new ArrayList<>();
    private List<Thread> exerciseThreads = new ArrayList<>();

    // Add available exercise slots
    void addExerciseSlot(String day, int startTime, int endTime) {
        ExerciseSlot slot = new ExerciseSlot(day, startTime, endTime);
        availableSlots.add(slot);
    }

    // Suggest the best date for exercise based on user preferences
    void suggestExerciseDate(String preference) {
        for (ExerciseSlot slot : availableSlots) {
            if (slot.isSlotAvailable()) {
                ExerciseThread exerciseThread = new ExerciseThread(slot, preference);
                Thread thread = new Thread(exerciseThread);
                exerciseThreads.add(thread);
                thread.start();
            }
        }

        // Wait for all exercise threads to finish
        for (Thread thread : exerciseThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All exercise suggestions have been processed.");
    }
}

class ExerciseSlot {
    private String day;
    private int startTime;
    private int endTime;
    private boolean isAvailable = true;

    ExerciseSlot(String day, int startTime, int endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    String getDay() {
        return day;
    }

    int getStartTime() {
        return startTime;
    }

    int getEndTime() {
        return endTime;
    }

    boolean isSlotAvailable() {
        return isAvailable;
    }

    void setSlotUnavailable() {
        isAvailable = false;
    }
}

class ExerciseThread implements Runnable {
    private ExerciseSlot slot;
    private String preference;

    ExerciseThread(ExerciseSlot slot, String preference) {
        this.slot = slot;
        this.preference = preference;
    }

    @Override
    public void run() {
        System.out.println("Checking " + slot.getDay() + " for exercise...");
        try {
            Thread.sleep(2000); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished checking " + slot.getDay());

        synchronized (slot) {
            if (slot.isSlotAvailable()) {
                System.out.println("Suggesting " + slot.getDay() + " for exercise based on " + preference);
                slot.setSlotUnavailable();
            }
        }
    }
}

public class ExerciseSchedulerDemo {
    public static void main(String[] args) {
        ExerciseScheduler scheduler = new ExerciseScheduler();

        // Add available exercise slots
        scheduler.addExerciseSlot("Monday", 8, 10);
        scheduler.addExerciseSlot("Tuesday", 7, 9);
        scheduler.addExerciseSlot("Wednesday", 9, 11);
        scheduler.addExerciseSlot("Thursday", 8, 10);
        scheduler.addExerciseSlot("Friday", 7, 9);

        // Get user's exercise preference
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exercise preference (e.g., cardio, strength): ");
        String preference = scanner.nextLine();

        // Suggest the best date for exercise
        scheduler.suggestExerciseDate(preference);
    }
}
    