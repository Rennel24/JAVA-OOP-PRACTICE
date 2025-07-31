public class Demo4 {
    // Static variable (shared by all objects)
    static int sharedCounter = 0;

    // Non-static variable (unique for each object)
    int individualCounter = 0;

    public void increaseBoth() {
        sharedCounter++;
        individualCounter++;
    }

    public void display() {
        System.out.println("Shared Counter: " + sharedCounter);
        System.out.println("Individual Counter: " + individualCounter);
    }

    public static void main(String[] args) {
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();

        // obj1 modifies the static and non-static variables
        obj1.increaseBoth();
        System.out.println("Object 1:");
        obj1.display();

        System.out.println();

        // obj2 also modifies the static and non-static variables
        obj2.increaseBoth();
        System.out.println("Object 2:");
        obj2.display();

        System.out.println();

        // Let's see obj1 again
        System.out.println("Object 1 (after obj2 changed sharedCounter):");
        obj1.display();
    }
}
