class AlarmThread implements Runnable {
    private int hours;
    private int minutes;

    AlarmThread(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Get the current time
                int currentHours = java.time.LocalTime.now().getHour();
                int currentMinutes = java.time.LocalTime.now().getMinute();

                // Check if the alarm time has been reached
                if (currentHours == hours && currentMinutes == minutes) {
                    System.out.println("Alarm triggered at " + currentHours + ":" + currentMinutes);
                    break;
                }

                Thread.sleep(1000); // Sleep for 1 second before checking again
            }
        } catch (InterruptedException e) {
            System.out.println("Alarm interrupted.");
        }
    }
}