
class Student {

    private String name; 
    private int age; 
    private School school ;


    Student(String name, int age, School school){
       this.name = name; 
       this.age = age; 
       this.school = school; 
    }



  void displayInfo(){
     System.out.println("NAME: " + this.name);
     System.out.println("AGE: " + this.age);
     System.out.println("School Name: " + school.getSchoolName());
     System.out.println("School Address: " + school.getAddress());
     
    }

}


class School{

    private String schoolName;
    private String address;

   
    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public String getAddress() {
        return address;
    }

}



public class SimpAssociation{
       

    public static void main(String[] args) {


        School school = new School("Batangas State University", "Alangilan Batangas");

        Student stud = new Student("Rennel Senyahan", 19, school);


        stud.displayInfo();
        
    }


}