
class Person{

    String naMe = "RENZY"; 

  public Person(String name){
       System.out.println("HIS NAME IS: " + name);
  }

 

   void sayClass(){
      System.out.println("THIS PRINTS THE METHOD OF A PARENT CLASS");
   }



}

class Toddler extends Person{
  String name = "jejemon"; 


      public Toddler(){
         super("Renzy");
      }


   void displaySuper(){
    System.out.println("THIS PRINTS THE ATTRIBUTE OF SUPER CLASS: " + super.naMe);
    System.out.println("THIS PRINTS THE ATTRIBUTE OF SUB CLASS: " + name);
   }

 
  void sayClass(){
     super.sayClass();
     System.out.println("THIS PRINTS THE METHOD OF A CHILD CLASS");
  } 

  
}

public class SuperK {

    public static void main(String[] args) {


    Toddler t = new Toddler(); 

     t.displaySuper();
     t.sayClass();

        
    }

    
}
