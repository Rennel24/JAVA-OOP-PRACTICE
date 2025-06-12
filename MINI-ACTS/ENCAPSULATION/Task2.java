

class Employee{

    private String empId; 
    private double salary;

    Employee(String empId, double salary){
       this.empId = empId; 
       this.salary = salary; 
    }

     String getId(){
        return empId;
     }

     double getSalary(){
        return salary;
     }

     void setSalary(double newSalary){
        if(newSalary > 5000.00){
            this.salary = newSalary;
            System.out.println("SET SALARY SUCCESSFUL");
        }else{
            System.out.println("SET SALARY FAIELD, SHOULD BE HIGHER THAN 5000");
            return; 
        }
     }






}

public class Task2 {
    public static void main(String[] args) {
        

    Employee e = new Employee("2005", 100.00); 

   e.setSalary(6000.00);




    }

}
