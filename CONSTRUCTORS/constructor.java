

 class Composition{

    boolean isLogical = false;
    Product p; 

    Composition(){
        isLogical = true;
        p = new Product();
         
        p.pName = "Renzyzy";
        p.comPany = "Apple";
    }

    void displayStatus(){
        System.out.println("IS COMPOSITION A LOGICAL ?  " + isLogical);
    }

    void display(){
        System.out.println(p.pName + " " + p.comPany);
    }
   

 }




class Product{
  
 String pName, comPany; 
 Boolean isHealthy;




    Product(){                //DEFAULT CONSTRUCTOR
        this.pName = "DEFAULT"; 
        this.comPany = "defaultCompany";
        this.isHealthy = false;
        System.out.println("Default Product Created!!");
    }
 
    Product(String name, String company, Boolean ishealthy){        //PARALIZED CONSTRUCTOR
        this.pName = name; 
        this.comPany =  company;
        this.isHealthy = true;
        System.out.println("Paralized Constructor Created!!");
    }


    Product(String name, String company){     // 2 PARAMETERS
        this.pName = name; 
        this.comPany =  company;
         System.out.println("Paralized Constructor Created!!");
    }

    Product(String name){           // ONE PARAMETER ONLY
        this.pName = name; 
         System.out.println("Paralized Constructor Created!!");
    }

   

}


class DefaultCons{

     DefaultCons(){

     }



}





public class constructor {

    public static void main(String[] args){

   Product p = new Product(); 

   Product p1 = new Product("Renzy", "IBM", true);
   Product p2 = new Product("Rennel", "Amazon");
   Product p3 = new Product("Renzy");

   DefaultCons d = new DefaultCons(); 

 

   Composition c = new Composition();

   c.displayStatus();
   c.display();



    }


}
