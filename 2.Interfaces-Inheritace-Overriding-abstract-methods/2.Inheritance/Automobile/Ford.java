public class Ford extends Car implements Sound, Movable
{
    boolean roboticDriver;

    public void setGps(boolean roboticDriver)
    {
        this.roboticDriver = roboticDriver;
    }

    public boolean getRoboticDriver()
    {
        return roboticDriver;
    }

    @Override // annotation 
    public String move(String source, String destination) {

        return  "I move from " + source + " to " + destination + ". ";
    }

    @Override
    public String makeSound() {
        return "Vrooommm....";
    }
}