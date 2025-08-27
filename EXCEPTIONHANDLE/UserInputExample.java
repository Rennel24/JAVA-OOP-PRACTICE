import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Asking for name
            System.out.print("Enter your name: ");
            String name = sc.nextLine(); // string input

            // Asking for age
            System.out.print("Enter your age: ");
            int age = sc.nextInt(); // numeric input

            sc.nextLine(); // consume leftover newline from nextInt()

            // Asking for address
            System.out.print("Enter your address: ");
            String address = sc.nextLine();

            // Output
            System.out.println("\n--- User Info ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please make sure your age is a number.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        finally {
            sc.close(); // close scanner
        }
    }
}
