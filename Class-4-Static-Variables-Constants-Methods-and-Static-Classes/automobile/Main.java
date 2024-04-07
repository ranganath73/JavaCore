public class Main
{
    public static void main(String[] args)
    {
        Car blueCar = new Car();

        blueCar.type = "B1 Series";
        
        Car.Engine v8 = new Car.Engine();

        v8.type = "V8 Engine";

        System.out.println("Car type is: " + blueCar.type);
        System.out.println("Car type is: " + v8.type);
        System.out.println("Car type is: " + v8.acceleration());
    }
}