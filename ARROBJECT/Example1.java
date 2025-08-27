import java.util.ArrayList;

class Department{

    ArrayList<Student> students = new ArrayList<>();  

    

}
class Course {
    String courseName;
    int units;

   public Course(String courseName, int units){
       this.courseName = courseName;
       this.units =units;
       
    }


}

class Student {
    String name;
    Course[] courses;

    Student(String name, Course[] course){
      this.name = name; 
      this.courses = course;
    }

    void displayCourses(){

        for(Course course: courses){
            System.out.println("COURSENAME: " + course.courseName);
            System.out.println("UNITS: " + course.units);
            System.out.println();
        }
    }


}



public class Example1{

 public static void main(String[] args)
    {
 
       

        Course course1 = new Course("CALCULUS", 3);
        Course course2 = new Course("PHYSICS", 3);
        Course course3 = new Course("PROGRAMMING", 3);

          Course[] courses = {course1, course2, course3};

        Student student = new Student("RENZY", courses);


        student.displayCourses();

    }

}