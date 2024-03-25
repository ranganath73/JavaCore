public class Cat extends Animal
{
    public Cat(int legs, String sound)
    {   // Animal(legs);
        super(legs);    // super - means super class - super class means parent class
        super.sound = sound; // Animal.sound = "Meow";
    }

    public String getSound()
    {
        return sound;
    }
}