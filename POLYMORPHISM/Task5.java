
class Employee {
    
    String position;

    Employee(String position){
       this.position = position;
    } 

    double calculateSalary() {     
        return 0; 
    
    }
}


class RegularEmployee extends Employee {

    RegularEmployee(String position){
         super(position);
    }

    double calculateSalary() { 
        return 20000; 
    }
}


class ContractEmployee extends Employee {

      ContractEmployee(String position){
         super(position);
    }
    double calculateSalary() { 
        return 15000; 
    }
}



class Manager extends Employee {

      Manager(String position){
         super(position);
    }

    double calculateSalary() { 
        return 30000; 
    }
}



public class Task5 {

    public static void main(String[] args) {

        System.out.println("SALARY RANGES : ");

         Employee emp[] = {
            new RegularEmployee("Regular Employee"),
            new ContractEmployee("Contract Employee"), 
            new Manager("Manager")
        };

        for(Employee e : emp){
            System.out.println("Salary of " + e.position + " is " + e.calculateSalary());
            System.out.println();
        }

    }
    
}
