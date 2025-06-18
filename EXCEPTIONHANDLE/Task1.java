
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //System.out.print("INPUT INTEGER: ");
       // int x = s.nextInt();                   possible error here because no exception handling

 /*      try{          
            System.out.print("INPUT INTEGER: ");
            int x = s.nextInt(); 
         }catch(Exception e){
            System.out.print("DATA TYPE ERROR ");      
         }
         System.out.println("Please fix the error");

*/

 
        try{          
            System.out.print("INPUT INTEGER: ");
            int x = s.nextInt(); 
        }catch(Exception e){
            System.out.print("DATA TYPE ERROR ");      
        }finally{
           s.close();
         }
         










    }
    
}
