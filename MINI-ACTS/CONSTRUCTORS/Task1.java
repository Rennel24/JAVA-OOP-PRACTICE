class Student{

    String name , course; 
    int age; 


    Student(String name, String course, int age){
        this.name = name; 
        this.course = course; 
        this.age = age; 

    }


     public void displayInfo(){
        System.out.println("Student Details: "); 
        System.out.println("NAME: " + name); 
        System.out.println("AGE: " + age); 
        System.out.println("COURSE: " + course); 
        System.out.println();

     }

}


public class Task1 {
     public static void main(String[] args) {


        Student stud[] = new Student[2]; 


         stud[0] = new Student("Renzy", "BSIT", 19);
         stud[1] = new Student("Joan", "BSED", 19);

         for(int i = 0 ; i < stud.length; i++){
            stud[i].displayInfo();
         }

         for(Student s: stud){
            s.displayInfo();
         }


       // stud[0].displayInfo();
       // stud[1].displayInfo();
        
        System.out.print(stud[1].name); 






     }
}
