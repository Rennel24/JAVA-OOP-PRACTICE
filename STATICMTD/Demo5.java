public class Demo5 {

    // Non-static method (needs an object to be called)
    public void sayHello() {
        System.out.println("Hello from non-static method!");
    }

    // Static method
    public static void staticCaller() {
        // sayHello(); ❌ This will cause an error (uncommenting this will break the code)

        // Correct way: create an object first
        Demo5 obj = new Demo5();
        obj.sayHello(); // ✅ Now we can call the non-static method
    }

    public static void main(String[] args) {
        staticCaller();
    }
}
