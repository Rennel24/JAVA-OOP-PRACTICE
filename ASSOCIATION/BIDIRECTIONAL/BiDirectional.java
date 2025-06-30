
class Doctor {

    private String name ; 
    private Patient patient;  



    public Doctor(String name, Patient patient){
       this.name = name; 
       this.patient = patient; 

    }


    public String getDoctorName(){
        return this.name;
    }


   

    public void setPatient(Patient patient){
        this.patient = patient;
    }



    public void display(){
        System.out.println("Doctor: " + this.name);
        System.out.println("Patient Name: " + patient.getPatientName());

    }



}



class Patient{


    private String name ; 
    private Doctor doctor;  

  

    public Patient(String name, Doctor doctor){
        this.name = name; 
        this.doctor = doctor; 
            
    }

    public String getPatientName(){
        return this.name;
    }


    public Doctor doctor(){
        return this.doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor; 
    }



    public void display(){
        System.out.println("Patient: " + this.name);
        System.out.println("Doctor Name: " + doctor.getDoctorName());


    }


}







public class BiDirectional{

    public static void main(String[] args) {

 
     Doctor doc = new Doctor("Marie" , null); 
     Patient patient = new Patient("Icey" , null); 

     doc.setPatient(patient);
     patient.setDoctor(doc); 

     doc.display();
     patient.display();


     /*--------------------------------------------------------------- */
     // GET NAMES

     System.out.println(doc.getDoctorName());
     System.out.println(patient.getPatientName());
    

     




     
     






        
    }
}