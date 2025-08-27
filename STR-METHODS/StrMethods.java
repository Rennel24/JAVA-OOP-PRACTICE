




class StrengMethods{

     private String username, password; 

     StrengMethods(){
        this.username = "Renzy12345"; 
        this.password = "R!enzy099942424"; 
     }

     public void displayAcc(){
        System.out.println("ACCOUNT DETAILS: ");
        System.out.println("USERNAME:" + username.substring(0,2) + "***");
        System.out.println("PASSWORD:" + password.replaceAll(".", "*"));
     }
}


public class StrMethods {

    public static void main(String[] args) {
      StrengMethods account = new StrengMethods(); 
      account.displayAcc();
        
    }
    
}
