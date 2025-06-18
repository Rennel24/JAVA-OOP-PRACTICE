interface Animal {
    void eat();
    void walk();
    void sleep();
}


interface Mammals{
    
}


class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal a = new Dog(); 
        Dog d = new Dog(); 
        d.eat(); // Output: Dog is eating
    }
}
