
abstract class Robot{
    
     String name, color; 
     double batteryLevel; 

      Robot(String name,String color,  double batLevel){
        this.name = name; 
        this.batteryLevel = batLevel;
        this.color = color; 
      }

     abstract void introduce();     // abstract method 

     public void sayType(){
        System.out.print("I am a robot");
     }
}



class Bumblebee extends Robot{


    Bumblebee(String name, String color, double batLevel){
    super(name,color, batLevel);
    }

    @Override
    void introduce(){
     System.out.println("I am " + name + ". My color is "  + color + " and my batteryLevel is " + batteryLevel);
    } 

   void sayBumblebee(){
        System.out.println("I AM " + name);
    }



}


class Optimus extends Robot{

 
    Optimus(String name, String color, double batLevel){
    super(name,color, batLevel);
    }

    @Override
    void introduce(){
     System.out.println("I am " + name + ". My color is " + color + " and my batteryLevel is " + batteryLevel);
    }

       void sayOptimus(){
        System.out.println("I AM " + name);
    }


}

public class Abstraction {
    public static void main(String[] args) {
        
    //Robot r = new Robot();/ This will cause an error  AN ABSTRACT IDEA
 
   Robot b = new Bumblebee("Bumblebee", "yellow", 100.00);
   Robot o = new Optimus("Optimus", "red",90.00); 
  

    b.introduce();
    o.introduce();

    Bumblebee b1 = new Bumblebee("Bumblebee", "yellow", 100.00);
    b1.sayBumblebee();

    Optimus o1 = new Optimus("Optimus", "red",90.00); 
    o1.sayOptimus();
  
  




    }
}
