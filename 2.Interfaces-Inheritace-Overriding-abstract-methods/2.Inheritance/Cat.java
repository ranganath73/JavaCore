
public class Cat extends Animal implements Movable, Sound
{
    public Cat(int legs, String sound)
    {   // Animal(legs);
        super(legs);    // super - means super class - super class means parent class
        // super.sound = sound; // Animal.sound = "Meow";
    }

    // public String getSound()
    // {
    //     return sound;
    // }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override // annotation 
    public String move(String source, String destination) {

        return  "I move from " + source + " to " + destination + ". ";
    }
}