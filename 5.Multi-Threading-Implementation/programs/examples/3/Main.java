public class Main
{
    public static void main(String[] args)
    {
        Printer printer1 = new Printer("Jack");
        printer1.start();

        Printer printer2 = new Printer("Jack");
        printer2.start();
    }
}