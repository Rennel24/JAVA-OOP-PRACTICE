import java.util.Scanner; 


class Bank extends MainBank{
  
   
    public String accHolder;
    public String email;
    private String password; 
    private int accNumber ;
    public double balance = 0; 
    public int cashIn= 0;
    public int cashOut= 0;

    Bank(String accholder, String eMail, String pass, int number, double bal ){
          this.accHolder = accholder;
          this.email=eMail;
          this.password =pass;
          this.accNumber = number;
          this.balance = bal; 
    }
 
    void display(){
            System.out.println("NAME: " + accHolder);
            System.out.println("EMAIL: " + email);
            System.out.println("PASSWORD: " + password);
            System.out.println("ACCOUNT NUMBER: " + accNumber);
            System.out.println("CASH BALANCE: " + balance);

            
    }

          public int getAccountNumber() {
          return accNumber;
      }


 
       
     public void cashIn(){
         
       System.out.print("How many you would cash In? ");
       cashIn = myObj.nextInt(); 
         
       balance += cashIn;

      }

        public void cashOut(){
         
       System.out.print("How many you would cash Out? ");
       cashOut = myObj.nextInt(); 
         
       balance -= cashOut;

      }



    void changePass(String pass){
      
       System.out.print("ENTER NEW PASSWORD: "); 
       pass = myObj.next();

       this.password = pass;

    }


          public String getPassword() {
          return password;
      }
     

}


class Gcash extends Bank{


    Gcash(String accholder, String eMail, String pass, int number, double bal){
      super(accholder,eMail,pass,number,bal);
    }


   

        void display(){
            System.out.println("NAME: " + accHolder);
            System.out.println("EMAIL: " + email);
            System.out.println("PASSWORD: " + getPassword());
            System.out.println("ACCOUNT NUMBER: " + getAccountNumber());
            System.out.println("CASH BALANCE: " + balance);

    }

}


public class MainBank {

   public static Scanner myObj = new Scanner(System.in); 
        public static void main(String[] args) {
         
              String accHolder;
              String email;
              String password; 
              int accNumber ;
              double balance;
              String newPass = "";
              
          System.out.print("Enter your name: "); 
          accHolder = myObj.nextLine(); 

          System.out.print("Enter your Email: "); 
          email = myObj.nextLine(); 

          System.out.print("Enter your Password: "); 
          password = myObj.nextLine();

          System.out.print("Enter your AccountNumber: "); 
          accNumber = myObj.nextInt();

          System.out.print("Enter your money: "); 
          balance = myObj.nextDouble();  

        Gcash gcash= new Gcash(accHolder, email,password,accNumber,balance);
        Bank bank = new Bank(accHolder, email,password,accNumber,balance); 


          int opt; 

      do{
          System.out.print("CHOOSE OPERATION: \n"); 
          System.out.println("1. Display Info \n");
          System.out.println("2. Cash In \n");
          System.out.println("3. Cash Out \n");             
          System.out.println("4. Change Password \n");
          System.out.println("5. Get Password \n");   
          System.out.println("6. Get Account Number \n");
          System.out.println("7. Exit\n"); 


          System.out.print("Enter your choice: "); 
          opt = myObj.nextInt(); 


       switch(opt){
        case 1:bank.display();
          break;
          case 2:bank.cashIn();
          break;
          case 3:bank.cashOut();
          break;
          case 4:bank.changePass(newPass);        
          break;
          case 5:System.out.print(bank.getPassword());        
          break;
          case 6: System.out.print(bank.getAccountNumber());
          break;
          case 7:
          return ;
        } 

      }while(true);
  }

}
