class SharedResource {
    synchronized void waitForSignal() {
        System.out.println(Thread.currentThread().getName() + " waiting for a signal...");
        try {
            wait(); // Wait for a signal to continue
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " received the signal and resumed.");
    }

    synchronized void sendSignal() {
        System.out.println("Sending a signal to all waiting threads...");
        notifyAll(); // Notify all waiting threads to resume
    }
}

class MyThread extends Thread {
    SharedResource resource;

    MyThread(SharedResource resource, String name) {
        this.resource = resource;
        super.setName(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        resource.waitForSignal();

        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class ThreadWithWaitNotifyDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource, "Thread 1");
        MyThread thread2 = new MyThread(sharedResource, "Thread 2");

        thread1.start();
        thread2.start();

        // Delay before sending the signal
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sharedResource.sendSignal();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
