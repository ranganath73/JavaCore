/* 
My second thread
*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
    public static class TestThread extends Thread
    {
        static
        {
            System.out.println("This is a static block inside TestThread");
        }
        public void run()
        {
            System.out.println("This is the run method");
        }
    }
}