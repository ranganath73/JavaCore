public class Main
{
    public static void main(String[] args)
    {
        BMW B1Series = new BMW();  // using no-args constructor

        B1Series.setWheel(4);
        B1Series.setGear(4);
        B1Series.setGps(true);

        System.out.println("Number of wheels in my car is: " + B1Series.getWheel());
        System.out.println("Number of gears in my car is: " + B1Series.getGear());
        System.out.println("Is this car has GPS: " + B1Series.getGps());
    }
}