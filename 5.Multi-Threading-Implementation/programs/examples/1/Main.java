public class Main
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();
    }
}