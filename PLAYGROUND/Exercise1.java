import java.util.ArrayList; 
import java.util.Scanner;



class Student{

   
    String name; 
    int age;
    Student(String name, int age){
        this.name = name; 
        this.age = age;
    }

    public void viewAllStudents(ArrayList<Student> students){

        for(Student student : students){
            System.out.println("STUDENT NAME: " + student.name);
            System.out.println("STUDENT AGE: " + student.age + "\n");
            
        }
    }
 

}



public class Exercise1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Student student = null;
        String name; 
        int age;

        ArrayList<Student> names = new ArrayList<>();

         for(int i = 0; i < 3; i++){ 
            
            System.out.print("ENTER NAME: ");
            name = sc.nextLine(); 
            System.out.print("Enter age: ");
            age = sc.nextInt();
            sc.nextLine();
            student= new Student(name, age);
            names.add(student);   
         }

         student.viewAllStudents(names);



    }


}