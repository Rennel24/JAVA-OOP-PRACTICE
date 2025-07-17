import java.util.Scanner;
import java.util.ArrayList;

class Patient{


    private String name;
    private int age;
    private String studentId;
    private String program;
    
    private ArrayList<Case> caseHistory;

    public Patient(String name, int age, String studentId, String program){
 
        this.name = name; 
        this.age= age; 
        this.studentId = studentId; 
        this.program = program;
        this.caseHistory = new ArrayList<Case>();

    }

    public void addCase(Case c){
        caseHistory.add(c);
    }

    public ArrayList<Case> getCaseHistory() {
        return caseHistory;
    }


    //GETTERS AND SETTERS HERE
    

}


class Case{

    private String caseId;
    private String description;
    private String status ;
    private boolean isCritical;


    public Case(String caseId, String description, String status, boolean isCritical){
        this.caseId = caseId; 
        this.description  = description; 
        this.status = status;
        this.isCritical = isCritical;
    }



    public Case(String description, String status){
            this.description = description;
            this.status = status;
    }


    public void updateStatus(String newStatus) {
         this.status = newStatus;

    }

    public boolean isCritical(){
        return isCritical;
    }

    // GETTERS AND SETTERS HERE

}


abstract class Staff{

     String staffId;
     String name;
     String position;

     public Staff(String staffId, String name, String position){
          this.staffId = staffId;
          this.name = name;
          this.position = position;

     }

   
   abstract void attendAppointment(Appointment a);


}


class Doctor extends Staff{
 
         String specialization;

        public Doctor(String staffId, String name, String position,String specialization){
          super(staffId, name, position);
          this.specialization = specialization;
     }


     @Override
    void attendAppointment(Appointment a){

     }

}


class Nurse extends Staff{


     public Nurse(String staffId, String name, String position){
            super(staffId, name, position);

     }

    @Override
    void attendAppointment(Appointment a){

    }


}


class Appointment{

    
     String appointmentId;
     Patient patient;           //← Aggregation
     Staff staff;         // ← Aggregation
     String purpose;


    public Appointment() {

       
    }


}









public class Practice1{

      public static void main(String[] args) {
        

      }


}