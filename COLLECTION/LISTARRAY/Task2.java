import java.util.ArrayList;
import java.util.Scanner; 


class Heroes{

    private String name, role, lane;
    private Boolean isMeta;

    Heroes(String name, String role, String lane, Boolean isMeta){
        this.name = name;
        this.role = role;
        this.lane = lane;
        this.isMeta = isMeta;   
    }

     
    void displayhero(){
        System.out.println("NAME: " +  name);
        System.out.println("ROLE: " +  role);
        System.out.println("LANE: " +  lane);
        System.out.println("META: " +  isMeta);

      
     }
}



public class Task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Heroes> heroes = new ArrayList<Heroes>();

    System.out.println("1. Add Heroes ");    
    System.out.println("2. Display Heroes");  

    System.out.print("Enter choice: ");
    int choice = s.nextInt(); 

    switch(choice){
        case 1: 
     
            System.out.print("Enter Hero name: ");
            String name = s.next();
    
            System.out.print("Enter role: ");
            String role = s.next();
      
            System.out.print("Enter lane: ");
            String lane = s.next();
            s.nextLine();
    
            System.out.print("Is Strong? True/False:  ");
             boolean isMeta = s.nextBoolean();
    
    
            Heroes h = new Heroes( name, role, lane,  isMeta);
    
            heroes.add(h);
    
            break;
        case 2:
        for(int i = 0; i < heroes.size(); i++){
            heroes.get(i).displayhero();
        }
        break;

        default:
        System.out.println("GoodBye!!!");
        return;  
    }
    
    
}
    
}





