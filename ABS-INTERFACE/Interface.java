

interface WindAnimal{

     void fly(); 


}

 interface LandAnimal {
   void run(); 
    
}
 


abstract class Animal{
     
  String kind, color, habitat, food; 


    Animal(String kind, String color, String habitat, String food){
       this.kind = kind;
       this.color = color; 
       this.habitat  = habitat; 
       this.food= food; 
    }

    abstract void eating();
   

}


class Tiger extends Animal implements LandAnimal{

    Tiger(String kind, String color, String habitat, String food){
        super(kind, color, habitat, food); 
    }

    public void run(){
        System.out.println("The " + kind + " is running...");
    }

    void eating(){
        System.out.println(kind + " is eating..");
    }

}


class Bird extends Animal implements WindAnimal{
    
    Bird(String kind, String color, String habitat, String food){
        super(kind, color, habitat, food); 
    }


    public void fly(){
        System.out.println(kind + " is flying");
    }

        void eating(){
        System.out.println(kind + " is eating..");
    }

}





public class Interface {
    public static void main(String[] args) {
        
         
   Animal b1= new Bird("Wind Animal", "Green", "Himpapawid", "worms");  //USE ONLY TO ABSTRACTION
 
    // WORKING  Bird b= new Bird("Wind Animal", "Green", "Himpapawid", "worms");
     WindAnimal b= new Bird("Wind Animal", "Green", "Himpapawid", "worms");  //USE ONLY TO ABSTRACTION
        b.fly(); 
        b1.eating();
    }
    
}
