public class Demo3 {
    // This is a constant, same for all circles
    public static final double PI = 3.14159;

    // Static method – not dependent on object state
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Non-static example (for comparison)
    private String circleName;

    public Demo3(String name) {
        this.circleName = name;
    }

    public void displayName() {
        System.out.println("This circle is called: " + circleName);
    }

    public static void main(String[] args) {
        // We don’t need an object to use static method or variable
        double area = Demo3.calculateArea(5);
        System.out.println("Area of circle with radius 5: " + area);
        System.out.println("Value of PI: " + Demo3.PI);

        // But we need an object to use non-static members
        Demo3 c1 = new Demo3("Circle A");
        c1.displayName();
    }
}
