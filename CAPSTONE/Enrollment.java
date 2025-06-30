import java.util.Scanner; 
import java.util.ArrayList;


abstract class User{

String username, role, password;
String adminId;  

User(String username, String password){
   this.username = username; 
   this.password = password;
}

User(String username, String password, String adminId){
   this.username = username; 
   this.password = password;
   this.adminId = adminId;
}



 


 /// abstract void viewDashBoard();


}



 class Admin extends User{

    Admin(String username, String password, String adminId){
    super(username, password,adminId);
    
   }


     public boolean login(String uname, String pass, String adminId) {
        return this.username.equals(uname) && this.password.equals(pass) &&
        this.adminId.equals(adminId) ;
    }


    /*
   public void addCourse(Course course){
     
   }

   public void removeCouse(String courseCode){

   }

   void viewAllCourses(ArrayList<Course> courses){

   }

   public void viewEnrolledStudents(Course course){
       
   }

   public void viewDashBoard(){

   }
 
   */



}


class Student extends User{

    Scanner sc =  new Scanner(System.in);
    
    String studentName; 

    ArrayList<Course> enrolledCourses = new ArrayList<Course>();


   Student(String username, String password){
    super(username, password);

   }

   

   public boolean login(String uname, String pass) {
        return this.username.equals(uname) && this.password.equals(pass);
    }



   void enrollCourse(Course course){

       System.out.print("YOUR NAME: ");
       String name =  sc.nextLine();


     System.out.print("YOUR COURSE: ");
     course.courseName = sc.nextLine();

    System.out.print("COURSECODE:" );
     course.courseCode = sc.nextLine();



     
    
   }




   void viewEnrolledCourses(){

   }


    public void viewDashBoard(){

    }

}


class Course {

String courseCode; 
String courseName; 
  ArrayList<Student> enrolledStudents;

   

  public Course(String courseCode, String courseName,ArrayList<Student> enrolledStudents){
    this.courseCode = courseCode;
    this.courseName = courseName;
    this.enrolledStudents = enrolledStudents; 
    
 
  }


  public void enrollStudent(Student student){

    enrolledStudents.add(student);



  }


  public void viewStudents(){

  }


  //public String toString(){

 // }


}

 
class CourseManagement{

    ArrayList<Admin> admins = new ArrayList<Admin>(); 
    ArrayList<Student> students = new ArrayList<Student>(); 


    public void registerAdmin(String fName, String username, String password, String adminId){
      admins.add(new Admin(username, password, adminId));
      System.out.println("✅Admin registered!");
    }

   public void registerStudent(String fName, String username, String password){
      students.add(new Student(username, password));
      System.out.println("✅Student registered!");
    }

    
    public Admin authenticateAdmin(String username, String password, String adminId) {
        for (Admin admin : admins) {
            if (admin.login(username, password,adminId)) {
                return admin;
            }
        }
        return null;
    }


     public Student authenticateStudent(String username, String password) {
        for (Student student : students) {
            if (student.login(username, password)) {
                return student;
            }
        }
        return null;
    }


}





class Portal{

Scanner sc = new Scanner(System.in);

 CourseManagement coursem = new CourseManagement(); 

  Admin admin = null;
  Student student = null;


       public void run(){
        
      int choice; 

      while(true){

        System.out.println("1. Register \n 2. Login \3. Exit");
        System.out.print("Choice: ");
        choice = sc.nextInt();  

        if(choice == 1){

          System.out.println("1. Register As Admin : ");
          System.out.println("2. Register As User : ");

          System.out.print("Choice: ");
          choice = sc.nextInt(); 
          sc.nextLine();

            if(choice == 1){
                System.out.println("Enter Fullname: ");
                String fullname =  sc.nextLine();   
                System.out.println("Enter username: ");
                String username = sc.nextLine(); 
                System.out.println("Enter Password: ");
                String password = sc.nextLine(); 
                System.out.println("Enter Authorize Admin Id: ");
                String adminId = sc.next(); 

                coursem.registerAdmin(fullname,username, password, adminId);
                System.out.println("Admin Successfully Registered!!!");
            }else if(choice == 2){

                     //register as student
                 System.out.println("Enter Fullname: ");
                String fullname =  sc.nextLine();   
                System.out.println("Enter username: ");
                String username = sc.nextLine(); 
                System.out.println("Enter Password: ");
                String password = sc.nextLine(); 

                coursem.registerStudent(fullname, username, password);
                System.out.println("Student Successfully Registered!!!");
            }else{
              return;
            }

        }else if(choice == 2){       
          // LOGIN
          System.out.println("1. Login As admin : ");
          System.out.println("2. Login As Student : ");

          System.out.println("Choice: ");
          choice = sc.nextInt(); 
          sc.nextLine();


          if(choice == 1){
           // login as admin    
            System.out.println("Enter username: ");
            String username = sc.nextLine(); 
            System.out.println("Enter Password: ");
            String password = sc.nextLine(); 
            System.out.println("Enter Admin Id: ");
            String adminId = sc.next(); 


            admin = coursem.authenticateAdmin(username, password, adminId);

            if(admin != null){
              System.out.println("Successfully Login!!");
            }else{
              System.out.println("Login Failed!!");
            }



          }else if(choice ==2){
             // login as student
              System.out.println("Enter username: ");
              String username = sc.nextLine(); 
              System.out.println("Enter Password: ");
              String password = sc.nextLine(); 

              student = coursem.authenticateStudent(username, password);


            if(admin != null){
              System.out.println("Successfully Login!!");
            }else{
              System.out.println("Login Failed!!");
            }

          }else{
            return;
          }

        }else{
          return;
        }

      }
      

       }






}




public class Enrollment {
    public static void main(String[] args) {


          
        Portal p = new Portal();

        p.run();





        
    }
}
