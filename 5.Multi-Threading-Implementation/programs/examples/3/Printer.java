public class Printer extends Thread
{
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("I'm " + this.name);
    }
}