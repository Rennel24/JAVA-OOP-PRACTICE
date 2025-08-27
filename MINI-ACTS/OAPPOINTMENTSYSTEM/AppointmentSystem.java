import java.util.Scanner;
class Date{

    static int day[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    static int month[] = {1,2,3,4,5,6,7,8,9};
    static int year = 2025;

    static String months[] = {"June", "July", "August", "September", "October", "November", "December", "January", "February", "March", "April", "May"};

    

    public static void displayMonths(){
     for(int i = 0; i < months.length; i++){
        System.out.println(i + 1 + ". " + months[i]);
     }
      
    }

    

}
class Student{

    Scanner s = new Scanner(System.in);

    String name;
    String srCode;

 public Student(String name, String srCode){
    this.name = name;
    this.srCode= srCode; 
 }

 


 public void setAppointment(){
    
    Date.displayMonths();
    System.out.print("CHOOSE MONTH: ");
    int response = s.nextInt();

    switch(response){

        case 1: 

         int i;
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + ", ");
           }

            System.out.println("Choose Day: ");
            int selectedDay = s.nextInt();

            for(i =0 ;i < 30; i++ ){
                if(Date.day[i] == selectedDay){
                    Date.day[i] = 0;
                }
            }

        break;
            case 2: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 3: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 4: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 5: 
           for(i=0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 6: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 7: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 8: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
            case 9: 
           for(i =0; i < 30; i++){
             System.out.print(Date.day[i] + " ");
           }
        break;
        default:
         System.out.println("Wrong input");
         return;



    }

   
    
    
    

   


 }

}

/* 
class Appointment{


}


class Registrar{

}
*/

public class AppointmentSystem {
    public static void main(String[] args) {

        Student stud = new Student("rennel", "24-00424");
        stud.setAppointment();
        
    }
    
}
