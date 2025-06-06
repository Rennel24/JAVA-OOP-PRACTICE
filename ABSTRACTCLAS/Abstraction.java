
abstract class Robot{

     abstract void introduce();     // abstract method 


     public void sayName(){
        System.out.print("I am a robot");
     }
}

class Bumblebee extends Robot{

    @Override
    
    void introduce(){
     System.out.println("I am bumblbee and my color is yellow");
    }


}


class Optimus extends Robot{

        @Override
    
    void introduce(){
     System.out.println("I am Optimus prime and my color is blue-red");
    }

}

public class Abstraction {
    
    public static void main(String[] args) {
        
    //Robot r = new Robot();/ This will cause an error  AN ABSTRACT IDEA
 
   Robot b = new Bumblebee();
   Robot o = new Optimus(); 

   o.introduce();
         
    }
}
