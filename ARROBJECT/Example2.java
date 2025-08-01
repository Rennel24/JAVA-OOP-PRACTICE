import java.util.Scanner;

class Employee {
    String name;
    int age;
    String department;

    // Constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("-------------------");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many employees to register
        System.out.print("Enter number of employees to register: ");
        int count = input.nextInt();
        input.nextLine(); // clear the newline

        // Create array to hold employees
        Employee[] employees = new Employee[count];

        // Input employee info
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Employee #" + (i + 1));
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // clear newline

            System.out.print("Department: ");
            String department = input.nextLine();

            employees[i] = new Employee(name, age, department);
        }

        // Ask for name to search
        System.out.print("\nEnter name to search: ");
        String searchName = input.nextLine();

        boolean found = false;

        for (Employee emp : employees) {
            if (emp.name.equalsIgnoreCase(searchName)) {
                System.out.println("\nEmployee Found:");
                emp.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        input.close();
    }
}
