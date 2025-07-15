import java.util.ArrayList;
import java.util.Scanner; 

class Heroes{
     
    void displayhero(String name, String role, String lane, boolean isMeta){
        System.out.println("NAME: " +  name);
        System.out.println("ROLE: " +  role);
        System.out.println("LANE: " +  lane);
        System.out.println("META: " +  isMeta);

      
     }
}



public class Task1 {
    public static void main(String[] args) {
  
         Scanner s = new  Scanner(System.in); 

        Heroes h  = new Heroes();
        ArrayList<Heroes> heroes = new ArrayList<Heroes>();

          for(int i = 0; i < heroes.size(); i++){
              System.out.print("Enter your name");
              String name = s.next();
              System.out.print("Enter role name");
              String role = s.next();
              System.out.print("Enter your name");
              String lane = s.next();
              System.out.print("Enter your name");
              Boolean isMeta = s.nextBoolean();
              h.displayhero(name,role,lane,isMeta);
              heroes.add(h);
           
            
          }

          
    }
}
