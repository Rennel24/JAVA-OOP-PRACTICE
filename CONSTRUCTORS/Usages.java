class Dog { // Initialize fields
    String name;
    Dog(String name) {
        this.name = name; // Initialize fields
    }
}

class Account {        
    String type;

    Account(String type) {
        if (type.equalsIgnoreCase("admin")) {          // Use conditionals
            System.out.println("Admin account created."); // Print debug messages
        } else {
            System.out.println("Regular user account created."); // Print debug messages
        }
        this.type = type; // Initialize fields
    }
}

/*-------------------------------------------------------------------------------------- */
class Student {
    String name;
    Student(String name) {
        this.name = name; // Initialize fields
    }
}

class ClassRoom {
    Student[] students;

    ClassRoom() {
        students = new Student[3]; // Initialize fields
        for (int i = 0; i < students.length; i++) {         // Use loops
            students[i] = new Student("Student " + (i + 1)); // Create other objects
            System.out.println("Student " + (i + 1) + " created"); // Print debug messages
        }
    }
}

/*-------------------------------------------------------------------------------------- */

class User {
    User() {
        System.out.println("User object created!"); // Print debug messages
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name; // Initialize fields
        greet();          // Call methods
    }

    void greet() {
        System.out.println("Hello, " + name); // Print debug messages
    }
}

class AgeCheck {
    int age;

    AgeCheck(int age) {
        if (age < 0) {                                        // Use conditionals
            throw new IllegalArgumentException("Age can't be negative!"); // Throw exceptions
        }
        this.age = age; // Initialize fields
    }
}

class Counter {
    static int count = 0;

    Counter() {
        count++;                                      // Access or update static variables
        System.out.println("Object number: " + count); // Print debug messages
    }
}

class Animal {
    String type;

    Animal() {
        this("Unknown"); // Use constructor chaining (this())
    }

    Animal(String type) {
        this.type = type; // Initialize fields
        System.out.println("Animal: " + type); // Print debug messages
    }
}

class Book {
    String title;

    Book() {
        title = "Untitled"; // Set default values
    }
}
