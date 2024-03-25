public class Car
{
    int wheel;
    int gear;
    
    // Inheritance will avoid code repeatance
    // It follows DRY principle
    // DRY - Don't Repeat Yourself

    public void setWheel(int wheel)
    {
        this.wheel = wheel;
    }

    public void setGear(int gear)
    {
        this.gear = gear;
    }
    public int getWheel()
    {
        return wheel;
    }

    public int getGear()
    {
        return gear;
    }
}