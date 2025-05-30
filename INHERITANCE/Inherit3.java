
//INHERITANCE OVERIDING CONSTRUCTORS//

class User{
    String username; 
    String password; 

    User(String userName , String passWord){
      this.username = userName; 
      this.password = passWord; 
 
    }

    void displayUser(){
      System.out.println("USERNAME: " + username); 
      System.out.println("PASSWORD: " + password);
      
    }
}


class AdminUser extends User{

       String email; 

      AdminUser(String userName , String passWord,String eMail){
      super(userName, passWord);
      this.email = eMail;
      }


      void displayAdmin(){
      System.out.println("EMAIL: " + email); 
      System.out.println("USERNAME: " + username); 
      System.out.println("PASSWORD: " + password);
    
      
      }

}

public class Inherit3{
     public static void main(String[] args){


      User user = new User("RENZY", "09278459992");
      AdminUser admin = new AdminUser("RENNEL", "09278459992","senyahanrentzy@gmail.com");


      admin.displayUser(); 

     }

}



