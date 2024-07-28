import java.util.ArrayList;
import java.util.List;

public class AlarmClockDemo {
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();

        // Set two alarms
        alarmClock.setAlarm(9, 0); // 9:00 AM
        alarmClock.setAlarm(13, 30); // 1:30 PM

        // Allow time for the alarms to trigger
        try {
            Thread.sleep(10000); // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop all alarms
        alarmClock.stopAllAlarms();
    }
}
