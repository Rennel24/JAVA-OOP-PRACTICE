import java.util.Scanner;

 class Account {
    String email,  username;
    private String password; 


    
 
     Account(String eMail, String userName, String passWord){
       
        this.email = eMail;
        this.username = userName;
        this.password = passWord;
    }

    Account(String eMail, String userName){
         this.email = eMail;
        this.username = userName;
    }


     void initialize(){
       System.out.println("I am " + username + " and my email is " + email); 
       

  }


}

 class AdminAccount extends Account{
    
    AdminAccount(String eMail, String userName, String passWord){
        super(eMail,userName, passWord);
    }

    void initialize(){
       System.out.println("I am " + username + " and my email is " + email); 
       

  }
   
}


 class UserAccount extends Account {

      UserAccount(String eMail, String userName, String passWord){
        super(eMail,userName, passWord);
    }


     void initialize(){
       System.out.println("I am " + username + " and my email is " + email); 
       

  }
}



 class StudentAccount extends Account{

      StudentAccount(String eMail, String userName, String passWord){
        super(eMail,userName, passWord);
    }

    
    void initialize(){
       System.out.println("I am " + username + " and my email is " + email); 
       

  }

}


public class polymorphism{

    public static Scanner sc = new Scanner(System.in); 

     String name, email, password;   

     void getAccountInfo(){  // WHY NEED KO PA TO GAWING STATIC BAGO GAMITIN SA MAIN METHOD

    
    System.out.print("Enter your email: ");
    email = sc.next();

    System.out.print("ENTER YOUR NAME: "); 
    name = sc.next(); 

    System.out.print("Enter your password: ");
    password = sc.next();

    }



    public static void main(String[] args){

    polymorphism poly = new polymorphism();
    System.out.println("OPENING.....\n\n");
do{
    System.out.println("1. User Account");
    System.out.println("2. Admin Account");
    System.out.println("3. Student Account");


    System.out.print("Choose account to open: "); 
    int opt = sc.nextInt(); 

 
switch(opt){
    case 1: 
       poly.getAccountInfo();
       UserAccount acc = new UserAccount(poly.email,poly.name,poly.password);
       acc.initialize();
       break;

    case 2 : 
       poly.getAccountInfo();
       AdminAccount admin = new AdminAccount(poly.email,poly.name, poly.password);
       admin.initialize();
       break;

    case 3:  
       poly.getAccountInfo();
       StudentAccount stud = new StudentAccount(poly.email,poly.name,poly.password);
       stud.initialize();
       break;

    }
    
}while(true);


    }
}