
import java.util.ArrayList;

class Student{
    String name;
    String program; 
    String orgname;

    public Student(String name, String program){
        this.name = name; 
        this.program = program; 
    }

   



}


class OrgName{

    public String orgname;
    public String description;

    public OrgName(String orgname, String description){
        this.orgname = orgname; 
        this.description = description;
    }



}

class Organization{

     ArrayList<Officer> officers = new ArrayList<>();
    ArrayList<Student> members = new ArrayList<>(); 
    ArrayList<OrgName> orgName = new ArrayList<>(); 


    public void addOrgName(OrgName orgname){
        this.orgName.add(orgname);
    }



    
}

class Officer extends Student{

     String position;
    public Officer(String name, String program, String position){
        super(name, program);
        this.position = position;
    }

}


class OrgManager{

    
    ArrayList<Organization> orgs = new ArrayList<>();



    public void createOrg(Organization org){

         orgs.add(org);
    }
    



}

public class OrgManagement {
    

    Organization org = new Organization(); 
 
    




    public static void main(String[] args) {


        String orgname = "JPCS"; 
        String description   = "Organization";

        OrgName organization = new OrgName(orgname, description); 

        


        


        
    }


}
