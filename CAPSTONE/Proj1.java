import java.util.ArrayList;
import java.util.Scanner; 

abstract class Person{

    private String name, gender;
    protected int age;

    Person(String name, String gender, int age ){
          this.name = name;
          this.gender = gender;
          this.age = age; 
    }

    public String getName(){
        return name;
    }

    abstract void displayProfile();

}


class Student extends Person{

    private double grades[];
    private int studentId; 

    Student(String name, String gender, int age, double grades[], int studentId){
        super(name,gender, age);
        this.grades = grades;
        this.studentId = studentId;
    }



    


    public double computeGwa(){

         double total = 0; 

         for(int i = 0; i < grades.length; i++){

            total += grades[i]; 

         }

          double gwa  = total/grades.length; 
         return gwa;

    }

     void displayProfile(){
        System.out.println("My name is " +  getName() + " my age is " + age +  ".My student ID is " +  studentId +  " . My average grade is " + computeGwa());
    }


}

class Teacher extends Person{
      
    private double salary;
    private int teachId; 

      Teacher(String name, String gender, int age, double salary, int teachId){
        super(name,gender, age);
        this.salary = salary; 
        this.teachId = teachId; 

    }

    


         void displayProfile(){
        System.out.println("HELLO my name is " + getName() + ". My ID is " + teachId  + " . I am " + age + " years old. My current salary is "
         +  salary);
    }

}




 
public class Proj1 {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<Person>();
        

       while(true){
             System.out.println("1. Add Student");
             System.out.println("2. Add Teacher");
             System.out.println("3. View All Profiles");
             System.out.println("4. Exit");            

                 Scanner sc = new Scanner(System.in);
                 System.out.print("Pick your option: ");
                int opt = sc.nextInt();

                switch(opt){
                case 1: 
                     System.out.println("Enter name: ");
                     String name = sc.next(); 
                     System.out.println("Enter Gender: ");
                     String gender = sc.next(); 
                     System.out.println("Enter Age: ");
                     int age = sc.nextInt(); 

                       double grades[] = new double[3];   //EXPLAIN

                     System.out.println("Enter grades in Programming: ");
                     grades[0] =sc.nextDouble();

                      System.out.println("Enter grades in Computer Networking: ");
                     grades[1] =sc.nextDouble();

                      System.out.println("Enter grades in Database Management: ");
                     grades[2] =sc.nextDouble();
                     
                      System.out.println("Enter student ID: ");
                      int id = sc.nextInt();
                     
                    Student stud = new Student(name,gender,age,grades,id);
                    person.add(stud);
                    stud.displayProfile();

                    break;
                   case 2: 

                    System.out.print("Enter name: ");
                    name = sc.next();
                    sc.nextLine(); // <-- This clears the leftover newline

                    System.out.print("Enter Gender: ");
                    gender = sc.nextLine();

                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine(); // <-- Clears leftover newline again

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine(); // <-- Optional but safe

                    System.out.print("Enter Teacher ID: ");
                    id = sc.nextInt();


                     person.add(new Teacher(name, gender, age, salary, id));

                     break;

                    case 3: 
                    System.out.println("-----ALL PROFILES: -----");
                    for(int i = 0; i < person.size(); i++){

                        person.get(i).displayProfile();

                    }
                    break;

                    default:
                    return;  

                }

            }
            

    

    }

    
}
