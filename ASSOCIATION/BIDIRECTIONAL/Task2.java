class Teacher{

    public String name; 
    public Subject subject; 

  Teacher(String name, Subject subject){
    this.name = name; 
    this.subject = subject;
  }


  public void setSubName(Subject subject){
    this.subject = subject; 
  }



  public void displayTeacher(){
     System.out.println("Teacher Name: " +  this.name);
     System.out.println("Assigned Subject: " +  subject.subjectName);

  }

}


class Subject{

        public String subjectName; 
        public Teacher teacher;

    public Subject(String subjectName, Teacher teacher){
       this.subjectName = subjectName; 
       this.teacher = teacher;
        }


        public void setTeacher(Teacher teacher){
             this.teacher = teacher;
        }

     


    public void displaySubject(){
     System.out.println("Subject Name: " +  this.subjectName);
     System.out.println("Assigned Teacher: " +  teacher.name);

    }






}


public class Task2 {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Kimberly", null);
        Subject sub = new Subject("Computer Programming", null);

        teacher.setSubName(sub);
        sub.setTeacher(teacher);

        teacher.displayTeacher();
        System.out.println();
        sub.displaySubject();






        
    }
    
}
