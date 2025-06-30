import java.util.ArrayList;



class Student {

   private String studName; 
   
   public Student(String name){
     this.studName = name; 
   }
   
   String getStudName(){
       return studName;
   }
}


class University {

  private String univName;


 ArrayList<Department> departments;
 ArrayList<Student> students;


  public University(String univName, ArrayList<Department> departments, ArrayList<Student> students){
       this.univName = univName; 
       this.departments = departments; 
       this.students = students;
  }


  public void display(){                                  // DISPLAYING DEPARTMENTS
    System.out.println("University " + this.univName);
    System.out.println("DEPARTMENTS: " );
    for(Department department : departments){
       System.out.println("-" + department.getdepartment());
    }



    for(int i = 0 ; i < departments.size() ; i++){
      for( int j = 0; j < students.size() ; j++){

        if(departments.get(i).getdepartment().equalsIgnoreCase("Civil Engineering") 
         && students.get(j).getStudName().equalsIgnoreCase("Renzy") ){
        System.out.println("Department Of " + departments.get(i).getdepartment());
        System.out.println("Enrolled student " + students.get(j).getStudName());

      }else if(departments.get(i).getdepartment().equalsIgnoreCase("Chemical Engineering") 
         && students.get(j).getStudName().equalsIgnoreCase("sofia")){
          System.out.println("Department Of " + departments.get(i).getdepartment());
        System.out.println("Enrolled student " + students.get(j).getStudName());

      }else if(departments.get(i).getdepartment().equalsIgnoreCase("Ceramic Engineering") 
         && students.get(j).getStudName().equalsIgnoreCase("Icey")){
             System.out.println("Department Of " + departments.get(i).getdepartment());
             System.out.println("Enrolled student " + students.get(j).getStudName());
      }


      }

      
            System.out.println();


    }

  }



}


class Department{

   private String departmentName;

   public Department(String departmentName){
     this.departmentName = departmentName; 
    
   }

   String getdepartment(){
    return departmentName;
   }

}


public class Task2 {

    public static void main(String[] args) {

        ArrayList<Department> departments = new ArrayList<Department>();
        ArrayList<Student> students = new ArrayList<Student>();
        
         departments.add(new Department("Civil Engineering"));
         departments.add(new Department("Chemical Engineering"));
         departments.add(new Department("Ceramic Engineering"));


         students.add(new Student("Sofia"));
         students.add(new Student("Renzy"));
         students.add(new Student("Icey"));
    

      University university = new  University("BATANGAS STATE UNIVERSITY",departments, students);

          university.display();



    }
    
}
