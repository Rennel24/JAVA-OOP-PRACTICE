import java.util.ArrayList;
import java.util.Scanner;

class JobSeeker{

    String name; 
    String seekerId; 
    String desiredJob; 
    ArrayList<JobApplication> application;
    

    public JobSeeker(String name, String seekerId, String desiredJob, ArrayList<JobApplication> applicaiton ){
        this.name = name; 
        this.seekerId = seekerId;
        this.desiredJob = desiredJob; 
        this.application = applicaiton;
       

    }

    public void viewAvailableJobs(){
        
    }

    public void applyJobs(Job job){
        
    }

    public void viewMyApplication(){

    }



}



class JobApplication{


    String appId;
    String job;
    String jobSeeker;
     String status;

    public JobApplication(String appId, String job, String jobSeeker, String status){
        this.appId = appId; 
        this.job = job; 
        this.jobSeeker = jobSeeker;
        this.status = status;
    }

    public void updateStatus(String status){

        // BLOCK OF CODE HERE
        this.status = status;
    }



}



class Job{

   String jobId, jobTitle, description, employer, requiredSkills;

   public Job(String jobId, String jobTitle, String description , String employer, String requiredSkills){
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.description = description;
        this.employer = employer;
        this.requiredSkills = requiredSkills;
   }


   public void displayJobDetails(){

   }

}


class Employer{

    String employeeName, employerId, companyName;
    ArrayList<Job> jobs; 

    public Employer(String employeeName, String employerId, String companyName, ArrayList<Job> jobs){
        this.employeeName = employeeName;
        this.employerId = employerId;
        this.companyName = companyName;
        this.jobs = jobs;
    }


    public void postJobs(){


    }

    public void viewMyApplications(){

    }


    public void viewAvailableJobs(){

    }
}




class PortalSysten{

    ArrayList<JobSeeker> jobseeker = new ArrayList<>();
    ArrayList<Employer> employers = new ArrayList<>();
    ArrayList<Job> jobs  = new ArrayList<>();
    ArrayList<JobApplication> jobApps = new ArrayList<>();

      Scanner sc = new Scanner(System.in);

          String name;

        public void registerAsJobSeeker(){
            name = "renzy";
            String seekerId = "2325242";
            String desiredJob = "Web developer";

            JobSeeker js = new JobSeeker(name, seekerId, desiredJob, jobApps);

            jobseeker.add(js);
            System.out.println("Successully Registered.");

        }    

        public void registerEmployer(){
            
           System.out.print("Enter employee Name: ");
           String empName = sc.nextLine();

           System.out.print("Enter employerID: ");
           String empId= sc.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();
          
            Employer employer = new Employer(empId, empId, companyName, jobs);
            employers.add(employer);

            System.out.println("Successful Registration.");



        
    }

        public void viewAvailableJobs(){

         for(int i = 0; i < jobs.size(); i++){
            System.out.println("LIST OF JOBS: ");
            System.out.println("JOB " + (i+1) +": ");
            System.out.println("JOB TITLE" + jobs.get(i).jobTitle);
            System.out.println("JOB TITLE" + jobs.get(i).jobId);
            System.out.println("JOB TITLE" + jobs.get(i).description);
            System.out.println("JOB TITLE" + jobs.get(i).employer);
            System.out.println("JOB TITLE" + jobs.get(i).requiredSkills);
            System.out.println();
            
         } 


}

        public void applyForAJob(){

        }


}


public class JobPortalSystem {
    public static void main(String[] args) { 
        
    }
}
