import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Custom exception class for file not found
class FileDoesNotExistException extends Exception {
    public FileDoesNotExistException(String message) {
        super(message);
    }
}

public class FileManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name to read: ");
        String fileName = scanner.nextLine();

        try {
            String fileContent = readFile(fileName);
            System.out.println("File content:");
            System.out.println(fileContent);
        } catch (FileDoesNotExistException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Error: The specified file was not found.");
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }

    // Method to read a file's content, may throw FileDoesNotExistException and FileNotFoundException
    public static String readFile(String fileName) throws FileDoesNotExistException, FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileDoesNotExistException("The specified file does not exist.");
        }

        Scanner fileScanner = new Scanner(file);
        StringBuilder content = new StringBuilder();
        while (fileScanner.hasNextLine()) {
            content.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();

        return content.toString();
    }
}
