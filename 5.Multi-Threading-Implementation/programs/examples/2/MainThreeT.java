public class MainThreeT
{
    public static void main(String[] args)
    {
        Printer printer = new Printer("Natasha");
        Thread thread1 = new Thread(printer);
        thread1.start();

        Thread thread2 = new Thread(printer);
        thread2.start();

        Thread thread3 = new Thread(printer);
        thread3.start();
    }
}