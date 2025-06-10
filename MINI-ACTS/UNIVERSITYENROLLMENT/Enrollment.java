import java.util.Scanner; 

class Subject{

    String code, title; 

   Subject(String code, String title){
       this.code = code; 
       this.title = title; 
   }

   public void displayDetails(){
      System.out.println("--- Student Portal ---");
      System.out.println("Subject Code: " + this.code);
      System.out.println("Subject Title: " + this.title);
   }


}


class LectureSubject extends Subject{

    String prof; 

    LectureSubject(String code, String title, String prof){
       super(code, title); 
       this.prof = prof; 
   }

   public void displayDetails(){
    super.displayDetails();
    System.out.println("Professor: " + this.prof);

   }



}



class LabSubject extends Subject{
 
    String room; 

     LabSubject(String code, String title, String room){
       super(code, title); 
       this.room = room; 
   }

   public void displayDetails(){ 
    super.displayDetails();
    System.out.println("Lab Room: " + this.room);

   }

}



class StudentPortal{
    Scanner s = new Scanner(System.in); 





    

     public void displayChoice(){
        System.out.println("------STUDENT PORTAL----------");
        System.out.println("1. Lecture Subject");
        System.out.println("2. Lab Subject");
     }


    






}






public class Enrollment {

    public static void main(String[] args) {


       


        LectureSubject ls = new LectureSubject("IT101", "Intro to Programming", "Sir John");
        LabSubject lab = new LabSubject("IT101L", "Programming Lab", "LAB-204");


        ls.displayDetails();
        lab.displayDetails();


    



        
    }
    
}
