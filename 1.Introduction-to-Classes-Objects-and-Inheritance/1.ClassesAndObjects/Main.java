
/**
 * Write a description of Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Main {
    
    public static void main(String[] args)
    {
        // Animal cat = new Animal(4);
        // Animal human = new Animal(2);
        // int age;
        
        // Animal - it is a class / User defined data type.
        // cat - is an object / It belongs to Animal type
        Animal cat = new Animal();
        Animal human = new Animal();

        cat.setLegs(4);
        human.setLegs(2);
        
        System.out.println(cat.getLegs());
        System.out.println(human.getLegs());   ////
    }
}
