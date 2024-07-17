public class Main
{
    public static void main(String[] args)
    {
        Printer printer1 = new Printer("Nick");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Jack");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }
}