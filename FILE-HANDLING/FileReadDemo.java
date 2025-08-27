import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            File file = new File("E:/Text/text.txt");
            Scanner sc = new Scanner(file); // Open the file
            System.out.println("File opened successfully!");
            System.out.println("Contents of the file:");

            // Loop through each line and print it
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
