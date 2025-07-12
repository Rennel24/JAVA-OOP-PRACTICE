
class Company{

   private String companyName; 
   private Employee employee ; 
   
   public Company(String companyName, Employee employee){
        this.companyName = companyName; 
        this.employee = employee; 
   }

   public void display(){
    System.out.println("The Company " + this.companyName + " has a employee name " + 
     employee.getName() + ". His id is " + employee.getId());
    
   }
   
}

class Employee {

    private String name;
    private int id; 

  public Employee(String name, int id){
      this.name = name; 
      this.id = id; 
  }

  public String getName(){
    return this.name; 
  }

  public int getId(){
    return this.id; 
  }

}


public class Aggregation{

   public static void main (String[] args){


    Employee emp = new Employee("Renzy" , 2323);
    Company company = new Company("Tesla", emp);

    company.display();





   }

}




