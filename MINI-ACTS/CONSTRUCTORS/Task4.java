import java.util.Scanner; 



 class SavingsAccount{

 }


class BankAccount{

      Scanner s = new Scanner(System.in); 

    private String owner;
    private double balance; 

    BankAccount(String owner, double balance){
       this.owner  = owner; 
       this.balance = balance; 

    }

    void deposit(double amount){     
        balance += amount; 
        System.out.println("DEPOSIT SUCCESSFUL");

        System.out.println("Do you want to deposit more? (Y/N): ");
        String respond = s.nextLine(); 

        if(respond == "y" || respond == "Yes" || respond == "Y"){
            do{
                System.out.println("Enter amount");
                double amnt = s.nextDouble(); 
                balance += amnt; 

                System.out.println("Do you want to deposit more? (Y/N): ");
                respond = s.nextLine(); 
             }while(respond == "y" || respond == "Yes" || respond == "Y");

        }else{
            return; 
        }



    }


    void widthdraw(double amoUnt){
        System.out.println("Enter amount");
        if(amoUnt < balance){
            balance -= amoUnt; 
            System.out.println("Withdraw Sucessfully!! ");
            System.out.println("Remaining balance " + balance);
            return;
        }else{
            System.out.println("Insufficient balance");
            return;
        }
    }


    double checkbal(){
        return balance;
    }

    String checkOwner(){
        return owner;
    }

   
}


class Kiosk{

    Scanner s = new Scanner(System.in);

    SavingsAccount savings;
    BankAccount bank; 
 
   
    Kiosk(BankAccount b, SavingsAccount s){
        this.bank = b;
        this.savings = s; 
    }


    public void display(){
            System.out.println("-----MENU---------");
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. CHECK OWNER");
            System.out.println("5. EXIT");

    }


    void run(){
        while(true){
            display();
            System.out.println("Choose Options: ");
            int opt = s.nextInt(); 
            switch(opt){
                case 1: 
                    System.out.print("1. Enter Amount: ");
                    double amt = s.nextDouble();
                    bank.deposit(amt);
                    break;

                 case 2:
                    System.out.print("2. Enter Amount: ");
                    amt = s.nextDouble();
                    bank.widthdraw(amt);
                    break;
                case 3:
                    System.out.println("CURRENT BALANCE: " + bank.checkbal());
                    break;
                case 4:
                    System.out.println("OWNER: " + bank.checkOwner());
                    break;
                case 5:
                    System.out.print("Exiting....");
                    return;
            }







        }
    }






}



public class Task4 {
    public static void main(String[] args) {

           Scanner s = new Scanner(System.in); 

        System.out.print("Enter your name: ");
        String name = s.next(); 

        System.out.print("Input your balance: ");
        double balance = s.nextDouble();

        BankAccount b = new BankAccount(name, balance);
        SavingsAccount ss = new SavingsAccount();


        Kiosk k = new Kiosk(b,ss);

        k.run();




        
    }
    
}
