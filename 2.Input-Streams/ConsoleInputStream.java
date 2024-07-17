import java.io.*;

public class ConsoleInputStream
{
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String input =  buffReader.readLine();

        System.out.println("You entered the string: " + input);
    }
}