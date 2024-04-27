public class RunThis
{
    public static void main(String[] args) //throws  Exception //InterruptedException
    {
        System.out.print("Hi" + " ");
        try {
            // This block will run when no exception
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            // This block will run when there is exception
            System.out.println("Interrupted");
        }
        
        System.out.print("Hi!");
    }
}