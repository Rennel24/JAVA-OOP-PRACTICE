import java.util.Scanner;



 abstract class CollegeStudent{

     Scanner sc = new Scanner(System.in); 

     String naMe, passWord;
     final String srCode;
     int yr;
     int option;
     String rtrn; 

    CollegeStudent(String name, String srcode, String password, int yearlvl){
         this.naMe = name; 
         this.srCode = srcode;
         this.passWord = password; 
         this.yr = yearlvl; 
    }

    public void displayInfo(){
        System.out.println("NAME: " + naMe);
        System.out.println("SR-CODE: " + srCode);
        System.out.println("PASSWORD: " + passWord);
        System.out.println("YEAR-LEVEL: " + yr);
    }

    public String getPassword(){
        return passWord; 
    }


    public void joinOrgs(){
    System.out.println("1. CICS ");
    System.out.println("2. SSC ");
    System.out.println("3. ACCESS");
    System.out.println("4. INTES ");
    System.out.println("5. JPCS ");

    System.out.print("CHOOSE ORGS: ");
    option = sc.nextInt();

    System.out.println(naMe + " SUCCESSFULLY JOINED ORGS!!");


    }

 
    abstract void displaySubjects(); 

    abstract void viewGrades();


}




class FirstYear extends CollegeStudent{  
  
    FirstYear(String naMe, String srCode, String passWord, int yr){
         super(naMe,srCode,passWord,yr);

    }

        public void displayInfo(){
        System.out.println("NAME: " + naMe);
        System.out.println("SR-CODE: " + srCode);
        System.out.println("PASSWORD: " + passWord);
        System.out.println("YEAR-LEVEL: " + yr);
    }

        public String getPassword(){
        return passWord; 
    }

   public void joinOrgs(){

    System.out.println("1. CICS ");
    System.out.println("2. SSC ");
    System.out.println("3. ACCESS");
    System.out.println("4. INTES ");
    System.out.println("5. JPCS ");

    System.out.print("CHOOSE ORGS: ");
    option = sc.nextInt();

    System.out.println(naMe + " SUCCESSFULLY JOINED ORGS!!");


    }

   public void displaySubjects(){
    
        System.out.println("1. 1ST SEM: ");
        System.out.println("2. 2ND SEM: ");
        
        System.out.println("CHOOSE SEMESTER: ");
        option = sc.nextInt();

        switch(option){
            case 1: 
                 System.out.println("FIRST YEAR - FIRST SEMESTER\n");

                System.out.printf("%-10s %-50s %-7s %-5s %-5s %-15s\n", 
                                "Code", "Course Title", "Units", "Lec", "Lab", "Prerequisite");
                System.out.println("---------------------------------------------------------------------------------------------");

                System.out.printf("%-10s %-50s %-7d %-5d %-5d %-15s\n", "IT 111", "Introduction to Computing", 3, 2, 3, "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 102", "Mathematics in the Modern World", 3, 3, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 108", "Art Appreciation", 3, 3, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "FILI 101", "Kontekstwalisadong Komunikasyon sa Filipino", 3, 3, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "PATHFit 1", "Movement Competency Training", 2, 2, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "NSTP 111", "National Service Training Program 1", 3, 3, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 103", "The Life and Works of Rizal", 3, 3, "-", "-");
                System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 104", "The Contemporary World", 3, 3, "-", "-");

                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.printf("%-10s %-50s %-7d %-5d %-5d\n", "", "TOTAL", 23, 22, 3);
                
                System.out.println("TYPE r to return: "); 
                rtrn = sc.next(); 
                if(rtrn == "r" || rtrn == "R"){
                    return;
                }

        break;

        case 2: 
         System.out.println("FIRST YEAR - SECOND SEMESTER\n");

        System.out.printf("%-10s %-50s %-7s %-5s %-5s %-15s\n",
                          "Code", "Course Title", "Units", "Lec", "Lab", "Prerequisite");
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.printf("%-10s %-50s %-7d %-5d %-5d %-15s\n", "CS 111", "Computer Programming", 3, 2, 3, "IT 111");
        System.out.printf("%-10s %-50s %-7d %-5d %-5d %-15s\n", "CS 131", "Data Structures and Algorithms", 3, 2, 3, "IT 111");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "MATH 111", "Linear Algebra", 3, 3, "-", "GEd 102");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "FILI 102", "Filipino sa Iba't Ibang Disiplina", 3, 3, "-", "-");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 105", "Readings in Philippine History", 3, 3, "-", "-");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "GEd 109", "Science, Technology and Society", 3, 3, "-", "-");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "PATHFit 2", "Exercise-Based Fitness Activities", 2, 2, "-", "PATHFit 1");
        System.out.printf("%-10s %-50s %-7d %-5d %-5s %-15s\n", "NSTP 121", "National Service Training Program 2", 3, 3, "-", "NSTP 111");

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-50s %-7d %-5d %-5d\n", "", "TOTAL", 23, 21, 6);

        System.out.println("TYPE r to return: "); 
                rtrn = sc.next(); 
                if(rtrn == "r" || rtrn == "R"){
                    return;
                }

        break;

        }

    }

   void viewGrades(){

    }
}

  





public class Student {
 
    public static int year; 

    public void getInfo(){

       Scanner sc = new Scanner(System.in); 

        System.out.println("       COLLEGE STUDENT CLASSIFICATION SYSTEM     ");

        System.out.println("Enter your name: ");
        String name =  sc.nextLine(); 

        System.out.println("Enter your SR-CODE: ");
        String srCode =  sc.next(); 

        System.out.println("Enter your password ");
        String pass  = sc.next(); 

        System.out.println("1. First Year");
        System.out.println("2. Second Year");
        System.out.println("3. Third Year");
        System.out.println("4. Fourth Year");
        System.out.println();

        System.out.println("Enter your year-Level (): ");
        year = sc.nextInt(); 
 }



    public static void main(String[] args) {

    
      switch(year){
        case 1: 
       


      }
        
    }
}
