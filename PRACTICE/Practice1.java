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
     String date;
     String purpose;
     Patient patient;           //← Aggregation
     Staff staff;         // ← Aggregation
    

    public Appointment(String appointmentId, String date,String purpose, Patient patient, Staff staff) {
       this.appointmentId = appointmentId;
       this.purpose = purpose;
       this.patient = patient; 
       this.staff = staff;
    }
    
    public void reSchedule(String newDate){
        this.date = newDate;

    }

    public void reschedule(String newDate, String newPurpose){
        this.date = newDate;
        this.purpose = newPurpose;

    }






}


interface HealthService{

    void registerPatient(Patient p);
    void createAppointment(Appointment a);
    void logCase(Patient p, Case c);
    ArrayList<Appointment> getAllAppointments();
}


class HealthServiceImpl implements HealthService{


    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;

    public HealthServiceImpl(ArrayList<Patient> patients, ArrayList<Appointment> appointments){
        this.patients = patients;
        this.appointments =appointments;
    }

       public void registerPatient(Patient p) {
         patients.add(p);
       }

        public void createAppointment(Appointment a){
            appointments.add(a);
        }

        public void logCase(Patient p, Case c) {
    
        }

      public  ArrayList<Appointment> getAllAppointments(){
          return appointments;
        }


}







class HealthSystemApp{

         ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
 
      public void run(){

        
         

          String name;
          Patient patient = null;
          HealthServiceImpl healthservice = null;
         
         System.out.println("Register Patient: ");
         name = "renzy";
         System.out.println("Enter name: ");
         name = "renzy";
         System.out.println("Patient age: ");
         int age = 19;
         System.out.println("Patient id: ");
         String studId = "24-00424"; 
         System.out.println("Patient Program: ");
         String program = "BSIT";   
         patient = new Patient(name, age, studId, program);

       healthservice = new HealthServiceImpl(patients, appointments);

       healthservice.registerPatient(patient);      //1.  REGISTER PATIENT


       System.out.println("Do you want to add Case: ");
         
    }                                                 //2. ADD CASE
 



         

    }


}


public class Practice1{

      public static void main(String[] args) {

         
        






    



       


        

      }


}