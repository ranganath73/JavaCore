import java.util.ArrayList;
import java.util.List;

/* 
List and threads
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //write your code here
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
