import java.util.Scanner; 
import java.util.ArrayList;


class User{

    String name;
    String password;

    User(String name, String password){
         this.name = name;
         this.password = password;
    }

   
     
        public boolean login(String name, String password) {

            return this.name.equals(name) && this.password.equals(password);
        
    }


}



class Portal{

      ArrayList<User> users = new ArrayList<>();


      public void registerUser(String name, String password){
        
         users.add(new User(name, password));
         System.out.println("REGISTER SUCCESSFULL!!");

      }

      public User authentication(String name, String password){

        for(User user : users){
            if(user.login(name, password)){
                return user;
            }
        }

        return null;
                 
      }



    /*     
          for(int i = 0; i < users.size(); i++){
            User user;
            if(user.login(name, pass)){
                return user;
            }
          }

          return null;

   */

}


public class LoginRegister {
    public static void main(String[] args) {

   
        Scanner sc = new Scanner(System.in); 
          User user = null;
          Portal p = new Portal();

      


    while(true){

        System.out.println("1. Register \n 2. Login");

         System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

        // REGISTER 
        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        p.registerUser(uname, pass);



       

    }else if(choice == 2){
        //LOGIN 

        System.out.print("Enter username: ");
         String uname = sc.nextLine();

        System.out.print("Enter password: ");
         String pass = sc.nextLine();

         user = p.authentication(uname, pass);


         if(user != null){
            System.out.println("LOGIN SUCCESSFULL!!");
         }else{
            System.out.println("LOGIN FAILED");
         }


   

        


    }else{
        System.out.println("Exiting...");
        return;
    }









    }
        
    }
    
}
