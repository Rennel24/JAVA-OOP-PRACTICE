import java.util.Scanner; 

class Student{

     private String studentID;
     private String name;
     private  int age;
  

    public Student(String studentID , String name , int age){
        this.studentID = studentID ; 
        this.name = name; 
        this.age= age; 

    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Age: " + this.age);

    }


    public String getStudentId(){
        return this.studentID; 
    }

}


class StudentManager{

    private Student[] students; 

    StudentManager(){
        students = new Student[]{
            new Student("2400424", "Renzy", 19),
            new Student("2400425", "Marie", 20),
            new Student("2400426", "Carlos", 21)

        };
        
    }


    public Student findStudentByID(String id){
        for (int i = 0; i < students.length; i++) {
                if (students[i].getStudentId().equals(id)) {
                    return students[i];
                }
            }

       return null; 


}

}

public class ObjectReturnType {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter student ID to search");
        String id = s.next(); 


        StudentManager sm = new StudentManager(); 

        Student result = sm.findStudentByID(id); 

        if(result != null){
            System.out.println("STUDENT FOUND!!");
            result.displayInfo();
        }else{
            System.out.println("ID not Found!!");
        }

       
    }
    
}
