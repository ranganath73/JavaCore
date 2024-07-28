class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
        resource.printNumbers();
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource, "Thread 1");
        MyThread thread2 = new MyThread(sharedResource, "Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
