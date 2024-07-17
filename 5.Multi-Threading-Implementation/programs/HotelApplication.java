public class HotelApplication
{
    public static void main(String args[]) { // Main Thread
        System.out.println("I will make Idly, Vada & Dosa.");
        ButlerApplication butlerThread = new ButlerApplication();  // Initiation = Instantiation => Objtect Creation
        butlerThread.start();
    }
}