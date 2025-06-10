import java.util.Scanner; 

class Students{
    
    String name, program, section, srcode,favcourse; 
    int count; 

    Students(String naMe,String progGram,String secTion,String srCode,String favCourse){
        this.name = naMe; 
        this.program = progGram;
        this.section = secTion; 
        this.srcode = srCode; 
        this.favcourse = favCourse; 
        
    }



    void introduce(){
      System.out.println("My name is : " + name + " my program is " +program + " .My srCode is " + srcode  + " and my favorite course is " + favcourse);
    }
    
    
}

class Employee{

      String empName,  joB;
    
    Employee(String empname, String job){
        this.empName = empname; 
        this.joB = job;
    }

    void sayEmployee(){
       System.out.println("My name is " + empName + " and my job is " + joB);
    }

}



public class ArrayofObjects{
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in); 
        
      // Students stud[] = new Students("Renzy", "bsit", "2101", "SR001", "Java Programming");

 
    //  F I R S T    W A Y       

    /* 
      Students stud[] = new Students[3]; 

        
      stud[0] = new Students("Renzy", "bsit", "2101", "SR001", "Java Programming");
      stud[1] = new Students("Anna", "bsit", "2102", "SR002", "Data Structures");
      stud[2] = new Students("Mark", "bsit", "2103", "SR003", "Algorithms");
      


     
       for(Students s: stud){
             s.introduce();       
       } 

      
      for(int i = 0; i < stud.length; i++){
             stud[i].introduce();       
       } 

    */   

/*--------------------------------------------------------------------------------------------- */


  /*        S E C O N D    W  A  Y  

     Students s[] = { new Students("Renzy", "bsit", "2101", "SR001", "Java Programming"),
                     new Students("Rainzy", "BSCS", "2102", "SR001", "Java Programming")
         
       };

       for(Students s1 : s){
         s1.introduce();
       }


    */

/*--------------------------------------------------------------------------------------------- */

     /*                        3 R D   WAY                              //

      Students students = new Students("Renzy", "bsit", "2101", "SR001", "Java Programming");
      Students students1 = new Students("Renzy", "bsit", "2101", "SR001", "Java Programming");
     
      Students studs[] = {students, students1};

      for(Students estudent: studs){
          estudent.introduce();
      }
*/
/*--------------------------------------------------------------------------------------------- */

    //    GETTING USER INPUT FROM THE USER USING FOR LOOP  

             Employee emp[] = new Employee[3]; 

            for(int i =0; i < emp.length; i++){
              System.out.print("Enter employee " + ( i + 1) + " name: ");
              String name = sc.nextLine();

              System.out.print("Enter Job of employee: " +  ( i + 1) + ": " );
              String job = sc.nextLine();

              emp[i] = new Employee(name, job); 
              emp[i].sayEmployee();


            }
 



    }
}