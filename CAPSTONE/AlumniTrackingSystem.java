
import java.util.ArrayList;
import java.util.Scanner;

/* 
class AlumniProfile{

  String email; 
  String phone;
  String address;

  AlumniProfile(String email, String phone, String address){
       this.email = email;
       this.phone = phone; 
       this.address = address; 

  }

}
     
*/


class Alumni{

     String name; 
     String course; 
     int yearGraduated; 
     String currentJob;

    

   Alumni(String name, String course){
      this.name = name; 
      this.course = course; 
     }

     Alumni(String name, String course, int yearGraduated, String currentJob){

      this.name = name; 
      this.course = course; 
      this.yearGraduated = yearGraduated; 
      this.currentJob = currentJob; 
     }


     public void updateJob(String job){
         this.currentJob = job;
     }

     public void showInfo(){
           System.out.println("NAME: " + this.name);
           System.out.println("Course: " + this.course);
           System.out.println("Year Graduated: " + this.yearGraduated);
           System.out.println("CURRENTJOB: " + this.currentJob);
           System.out.println();
     }


     public void showAllAlumni(Admin admin){
       admin.showAllAlumni();
     }



}




class Admin{

   String campusName;
   ArrayList<Alumni> alumniList;
 

   Admin(ArrayList<Alumni> alumniList){
    this.alumniList = alumniList;
   }

   

   public void addAlumni(Alumni alumni){

     alumniList.add(alumni);
     System.out.println("Alumni Successfully Added!!");
   }


   public void showAllAlumni(){
     for(Alumni alumni : alumniList){
          alumni.showInfo();
     }
   }


   public void deleteAlumni(String name){
       for(int i = 0; i < alumniList.size(); i++){
          if(alumniList.get(i).name.equalsIgnoreCase(name)){
              System.out.println("This alumni will be remove!!");
              alumniList.get(i).showInfo();
              alumniList.remove(i);
              System.out.println(name + " Is successfully Removed");
              return;
          }
       }
       System.out.println("Alumni Not Found!!");    
   }
}



class Portal{
      Scanner sc = new Scanner(System.in);
       ArrayList<Alumni> alumniList = new ArrayList<Alumni>();
       Alumni alumni;
      Admin admin = new Admin(alumniList);
     

     public void askAlumniInfo(){

          System.out.print("Name: ");
          String name = sc.nextLine();

           System.out.print("Course: ");
           String course = sc.nextLine();

           System.out.print("Year graduated: ");
           int yearGraduated = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Current Job: ");
           String currentJob= sc.nextLine();
        
         alumni = new Alumni(name, course, yearGraduated, currentJob);

     }

     

     public void run(){
        
         for(int i = 0; i < 2; i++){
            askAlumniInfo();
            admin.addAlumni(alumni);
         }
        
          admin.showAllAlumni();          // FOR ADMIN DASHBOARD
        // alumni.showAllAlumni(admin);     FOR USER/ALUMNI DASHBOARD

        System.out.print("Enter name to remove");
        String name = sc.nextLine();
          admin.deleteAlumni(name);

           admin.showAllAlumni(); 
       
     }
} 



public class AlumniTrackingSystem{

  public static void main(String[] args) {


      Portal p = new Portal();

    while(true){

     p.run();
    }
  




      

    
  }

}








