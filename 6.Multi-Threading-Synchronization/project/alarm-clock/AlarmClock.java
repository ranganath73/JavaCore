import java.util.ArrayList;
import java.util.List;

class AlarmClock {
    private List<Thread> alarms = new ArrayList<>();

    // Add a new alarm
    void setAlarm(int hours, int minutes) {
        AlarmThread alarmThread = new AlarmThread(hours, minutes);
        Thread thread = new Thread(alarmThread);
        alarms.add(thread);
        thread.start();
        System.out.println("Alarm set for " + hours + ":" + minutes);
    }

    // Stop all alarms
    void stopAllAlarms() {
        for (Thread alarm : alarms) {
            alarm.interrupt();
        }
        alarms.clear();
        System.out.println("All alarms stopped.");
    }
}