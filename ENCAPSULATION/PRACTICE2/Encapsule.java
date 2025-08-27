
class BankAccount{

    private String phoneNo; 
    private String password; 

   public BankAccount(String phoneNo, String password){
        if(phoneNo.length()  == 11 && password.length()  > 3){
            this.phoneNo = phoneNo; 
            this.password = password;
        }else{
            System.out.println("INVALID LENGTH ");
            return;
        }
    
    }

    public void setPassword(String password){
        if(password.length() > 5)
        this.password = password;
        else
        System.out.println("Sorry but your password must be more than 5 characters!");
        return;
    }




}


public class Encapsule {

    public static void main(String[] args) {
    


        BankAccount bankacc = new BankAccount("09278345", "renz");
        







    }
    
}
