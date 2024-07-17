import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class BuffFileWriter
{
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"))) {
            String message = "Hello, Amigo! This is a very importent message!";
            bufferedWriter.append(message, 0, 7);
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}