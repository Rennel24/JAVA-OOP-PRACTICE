package ACCMODIFIERS;


// N O N   A C C E S S    M  O D I  F I ER
final class Vehicle{

   final static String name = "Rennel";   // cant modify and not need an object call

}


abstract class Car{
   
}


public class Product {
    
  // A C C E S S     M O D I F I E R S  FOR ATTRIBUTES AND METHODS AND CONSTRUCTORS
  private String name;                   
  public Double price;                  // FOR ATTRIBUTES 
  protected int quantity;

  public Product(String naMe, Double pRice, int qntity){  // PUBLIC CONSTRUCTOR
    this.name = naMe;
    this.price = pRice;
    this.quantity = qntity; 
    System.out.println("Public Constructor Created!");
  }


  private Product(String naMe, Double pRice){        // PRIVATE CONSTRUCTOR 
     this.name = naMe;
     this.price = pRice; 
     System.out.println("Private Constructor Created!");
  }

  protected Product(String naMe){                    // PROTECTED CONSTRUCTOR
    this.name = naMe;
    System.out.println("Protected Constructor Created!!");
  }





  



}
