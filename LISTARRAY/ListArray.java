
import java.util.ArrayList;

   
      


    class Student{
        private String name, building , program, srCode; 
        

        Student(String name, String building , String program, String srCode){
         this.name = name;
         this.building = building; 
         this.program = program; 
         this.srCode = srCode; 
        }

        void introduce(){ 
            System.out.println("My name is " + name + " from the building " + building + 
            " .My program is " + program);
        }
      }
    


public class ListArray {

  
     public static void main(String[] args) {

           ArrayList<String> names = new ArrayList<String>();     // ARRAYLIST OF STRING

           ArrayList<Student> students = new ArrayList<Student>(); //ARRAYLIST OF OBJECT


                               // A D D I N G  O B J E C  T S  TO  THE  ARRAY

                  //  Student s = new Student("Renzy", "CICS", "BSIT", "24-00424");
                  //  students.add(s);

             students.add(new Student("Renzy", "CICS", "BSIT", "24-00424"));
             students.add(new Student("Rennel", "CICS", "BSIT", "24-00424"));


             //ACCESSING ELEMENTS IN THE ARRAY
            students.get(1).introduce();
            Student s = students.get(0);
             s.introduce();



              //U P D A T E   V A L U E S    I N     T H E  A R R A Y 
            Student s1 = new Student("Mosh", "CICS", "BSIT", "24-00424");
            students.set(1,s1);
            students.get(1).introduce();


            //  D E L E T I N G    V A L U E S   I N   T H E   A R R A Y;

            students.remove(0);
            students.get(0).introduce();
            students.clear();



            // I T E R A T I N G    A R R A Y
            System.out.println();
             students.add(new Student("Renzy", "CICS", "BSIT", "24-00424"));
             students.add(new Student("Rennel", "CICS", "BSIT", "24-00424"));
            for(int i = 0; i < students.size(); i++){
                 students.get(i).introduce();
            }
 










          
     }
   
}
