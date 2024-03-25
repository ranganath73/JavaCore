public class Main
{
    public static void main(String[] args)
    {
        Cat rosy = new Cat(4, "Meow"); 

        System.out.println(rosy.getSound());
        System.out.println(rosy.move("home1", "home2"));
    }
}