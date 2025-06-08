import java.util.Scanner; 



class SavingsAcc extends Account{

    private double interestRte; 

    public SavingsAcc(int phone, double balance, double interestRte){
         super(phone,balance);
    }


    public double getInterestRate(){
          return this.interestRte; 
    }


}


class CheckingAcc extends Account{

    private double interestR ; 

        public CheckingAcc(int phone, double balance, double interestRte){
         super(phone,balance);
         this.interestR = interestRte;
    }


     public double getInterestRate(){
        return this.interestR;
     }

}





class ATM{
    private Scanner scanner;  

     Account acc ;

     public ATM(Account account){
        this.acc= account; 
        this.scanner = new Scanner(System.in);

     }

    public void displayMenu(){
        System.out.println("ATM MACHINE");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

    }


    public void run(){
        while(true){
           displayMenu();
           System.out.print("Enter your choice");
           int choice = scanner.nextInt(); 

           switch(choice){
            case 1: 
              System.out.println("Balance: " + acc.getBal());
             break; 
             case 2: 
               System.out.print("Enter amount: ");
               double wAmount = scanner.nextDouble(); 
                if(acc.withdraw(wAmount)){
                    System.out.println("Withdraw successfull!!");
                }else{
                    System.out.println("Withdraw unsuccessful");
                }
              break;
              case 3: 
              System.out.println("Enter amount to deposit"); 
              double dAmount = scanner.nextDouble();  
               if(dAmount  <= 0){
                  do{
                    System.out.println("Invalid deposit, please input greater ammount");
                    System.out.println("Enter right amount to deposit"); 
                     dAmount = scanner.nextDouble();  
                  }while(dAmount  <= 0);
               }else{
                  acc.deposit(dAmount);
                  System.out.println("Deposit Successfull");
               }
              break; 
              case 4:
              System.out.println("Thank you for using the ATM");
              break; 
              default: 
              System.out.println("INVALID CHOICE!!");
              break;


           }

        }
    }


}


class Account{

    private int phoneNo; 
    private double balance; 

    public Account(int phone, double balance){
        this.phoneNo = phone; 
        this.balance = balance; 
    }

    public double getBal(){
        return this.balance; 
    }

    public void setBal(double bal){
        this.balance = bal; 

    }

    public void deposit(double amount){
         this.balance += amount; 
    }

    public boolean withdraw(double amount){
       if(balance >= amount){
        balance -= amount; 
        return true; 
       }else{
        System.out.println("You cant withdraw");
        return false;
       }


    } 
}





public class AtmOOP {

    public static void main(String[] args) {

        SavingsAcc s = new SavingsAcc(278459992, 1000.00, 0.50);

        ATM atm = new ATM(s);
        
    }
    
}
