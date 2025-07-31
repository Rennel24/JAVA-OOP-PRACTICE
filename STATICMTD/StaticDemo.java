public class StaticDemo {
    static int count = 0; // static variable (shared)
    String name;          // non-static variable (unique per object)

    public StaticDemo(String name) {
        this.name = name;
        count++; // shared variable updated for each new object
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo("Alice");
        StaticDemo s2 = new StaticDemo("Bob");

        s1.display();
        s2.display();
    }
}
