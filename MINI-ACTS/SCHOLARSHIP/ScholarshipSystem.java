import java.util.ArrayList;


class Student{

    String srCode, name, program, year;
    ArrayList<ScholarApplication> scholarshipApplications;

    
    public void applyForScholarship(){


    }
    public void viewMyApplications(){

    } 


    public void checkEligibility(Scholarship scholarship){
        
    }


    


    
}

class ScholarApplication{

    String applicationId, studentId, scholarshipId, status , dateApplied;

    public ScholarApplication(String applicationId, String studentId, String scholarshipId, String status , String dateApplied){
        this.applicationId = applicationId;
        this.studentId = studentId;
        this.scholarshipId = scholarshipId;
        this.status = status;
        this.dateApplied = dateApplied;

    }

    public void viewApplicationStatus(){

    }


}


class Admin{

    String adminName;



    public void viewAllApplications() {

    }
    public void approveApplication() {

    }
    public void rejectApplication() {

    }
    public void generateSummaryReport() {
        
    }

}

class Scholarship{

    String scholarshipId, name, description, requirements, deadline;

    Scholarship(String scholarshipId,String name, String description, String requirements, String deadline){
       this.scholarshipId = scholarshipId;
       this.name =name;
       this.description = description;
       this.requirements = requirements;
       this.deadline  = deadline;

    }
    public void displayDetails(){

    }

}

public class ScholarshipSystem {

    public static void main(String[] args) {
        
    }
    
}
