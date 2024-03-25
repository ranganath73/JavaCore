
/**
 * Write a description of Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal {  // bean, fulfilled class, eligible to unit test
    
    int legs;
    String sound;
    
    public void setLegs(int legs) // setLegs - method is a setter method
    {
        this.legs = legs;              // this - Idhu, that - athu, [ this class ]
    }
    
    public int getLegs()  // getLegs - is a getter method
    {
        return legs;
    }
    
    public Animal(int legs)  // Constructor
    {
        this.legs = legs;
    }

}
