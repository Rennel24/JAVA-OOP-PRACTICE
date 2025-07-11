class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void showInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Arf! Arf!");
    }

    @Override
    public void showInfo() {
        super.showInfo();  // reuse name and age display
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void showInfo() {
        super.showInfo();  // reuse name and age display
        System.out.println("Color: " + color);
    }
}



class MainMenu{

    Animal dog;
    Animal cat;


     MainMenu(Animal dog, Animal cat){
          this.dog  =dog;
          this.cat = cat;
     }


     public void sayDog(){
         dog.makeSound();
     }

     
}



public class Poly{
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno", 3, "Labrador");
        Animal a2 = new Cat("Mittens", 2, "Orange");

        MainMenu menu = new MainMenu(a1, a2);


         menu.sayDog();



    }
}
