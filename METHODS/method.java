
class College extends Student{

       void sayDialog(String fname){
       this.name = fname; 
       System.out.println("My name is " + name + " and" + " I hate Studying");
   }

}


class Highschool extends Student{
 
      void sayDialog(String fname){ 
      this.name = fname; 
       System.out.println("My name is " + name + " and" + " I still love Studying"); 
   }

}


 class Elementary extends Student{

     void sayDialog(String fname){
      this.name = fname;
      System.out.println("My name is " + name + " and" + " I really love Studying");
    }
 }

 class Student{

   String dialog; 
   String name;
   private int idNumber; 
    

   void sayDialog(String fname, int id){
      this.name= fname;
      this.idNumber = id;
       System.out.println("My name is " + name + " and" + " I love Studying." + "My id is " + idNumber);
       
   }

   int getId(){ 
     return this.idNumber; 
   }

}


public class method {

    public static void main(String[] args) {
  /*       
   Student stud = new Student();
   Student elem = new Elementary(); 
   Student hs = new Highschool();   
   Student college = new College();         // METHOD OVERRIDING        
  */

  Student stud = new Student();
  Elementary elem = new Elementary();
  Highschool hs = new Highschool();
  College collge = new College(); 

  stud.sayDialog("Student",107364);
  elem.sayDialog("Patrick");
  hs.sayDialog("John");
  collge.sayDialog("SGA");
    
  
  System.out.println(stud.getId()); 

    }
    
}
