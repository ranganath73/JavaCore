import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add(1, "Orange");

        System.out.println(colors);
        System.out.println(colors.size());
    }
}