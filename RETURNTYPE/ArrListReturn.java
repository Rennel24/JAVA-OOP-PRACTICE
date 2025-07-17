import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Student{

    String name; 
    int age;
     
     public Student(String name, int age){
        this.name = name;
        this.age =age;
     }

     public void introduce(){
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
     }


}




public class ArrListReturn {


   List<Student> students;

    public ArrListReturn(){
        students  = new ArrayList<>();
    }



    public void addStudent(Student stud){
        students.add(stud);

    }


    public List<Student> getStudent(){
        return students;
    }



    public static void main(String[] args) {

      ArrListReturn arrList = new ArrListReturn(); 

       Student stud;
       Student stud1;

        stud = new Student("RENNEL", 19);
        stud1 = new Student("JAYVEE", 18);

    
       arrList.addStudent(stud);
       arrList.addStudent(stud1);


       List<Student> list =  arrList.getStudent();
        
    
       for(Student students : list){

         students.introduce();
       }













        
    }
    
}
