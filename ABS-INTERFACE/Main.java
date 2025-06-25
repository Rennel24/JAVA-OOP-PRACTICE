interface Animal {

    String name = "Renzy";

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

    public void walk (){
        System.out.println("Dog is walking");

    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    
}


class Cat extends Dog {

        public void eat() {
        System.out.println("Cat is eating");
    }

       public void walk (){
        System.out.println("Cat is walking");

    }

        public void sleep(){
        System.out.println("Cat is sleeping");
    }

}


public class Main {
    public static void main(String[] args) {
        //Animal a = new Dog(); 
        Dog d = new Dog(); 
        d.eat(); // Output: Dog is eating

        Animal c = new Cat();
        c.walk();

    }
}
