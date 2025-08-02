import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 




class Portal{

   Student student;
   Subject subject;

   Portal(Student stud, Subject sub){
        this.student = stud; 
        this.subject = sub;
   }


    void displayStudents(){
       System.out.println("STUDENT Informations: ");
       student.display();
       System.out.println();
       System.out.println("COURSE Informations: ");
       System.out.println("SUBJECT :" + subject.subjectName);
       System.out.println("CODE    : " + subject.subjectCode);
       System.out.println("UNITS   : " + subject.units);
    
    }
}


abstract class Person {

     String name, gender;
     int age ;



    Person(String name, String gender, int age){
       this.name= name; 
       this.gender = gender;
       this.age= age;
    }

    abstract void  display();


}

class Student extends Person{

    int studentId; 
   String gradeLevel; 



   Subject s;

   
   
      Student(String name, String gender, int age, int studentId, String gradeLevel){
         super(name, gender, age);
         this.studentId = studentId; 
         this.gradeLevel = gradeLevel;
      }

      
   void display(){

      System.out.println("NAME: " + this.name);
      System.out.println("GENDER: " + this.gender);
      System.out.println("AGE: " + this.age);
      System.out.println("STUDENT ID: " + this.studentId);
      System.out.println("GRADE LEVEL: " + this.gradeLevel);
   

   }

    


   void enrollSubject(Subject subject){
     this.s = subject; 
     System.out.println("Student Sucessfully enrolled");
   }



}





class Subject{

    int subjectCode , units;
    String subjectName;

    public Subject(String subjectName,int subjectCode, int units ){

        this.subjectCode = subjectCode; 
        this.units = units; 
        this.subjectName = subjectName;

    }


  

}


public class Proj2 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      ArrayList<Portal> stud = new ArrayList<Portal>();

     while(true){

       System.out.println("-------- M E N U -----------");

       System.out.println("1. ADD STUDENT");
       System.out.println("2. VIEW ALL STUDENT");
       System.out.println("3. EXIT");

       System.out.print("Enter choice: ");
       int ch = sc.nextInt(); 


     do{
     try{
       switch(ch){
         case 1:
      
          System.out.print("Enter name: ");
         String name = sc.nextLine();
         sc.next(); 
       
      
      

         System.out.print("Enter gender: ");
         String gender = sc.next();
        

         System.out.print("Enter age: ");
         int age = sc.nextInt();
   
         System.out.print("Enter Student ID");
         int studentId = sc.nextInt(); 

         System.out.print("Enter Year Level");
         String gradeLevel =  sc.next();
         sc.next();
         
         System.out.println();
         System.out.println("ENROLLMENT PROCESS:  ");
          
          System.out.println("Input subject Name: ");
          String subName = sc.nextLine();
          sc.next();

          System.out.println("Input course code: ");
          int courseCode = sc.nextInt();

          System.out.println("Input How many units (number only): ");
          int units = sc.nextInt();

          Student student = new Student( name, gender,  age, studentId,  gradeLevel);
          Subject subject = new Subject(subName, courseCode, units);


          student.enrollSubject(subject);
          Portal p = new Portal(student, subject);

          stud.add(p);


         break;
         case 2:

         
       
       }
     }catch(InputMismatchException e){
         System.out.println("DATA TYPE ERROR");
     }


   }while(true);
     

     }


        
    }
}
