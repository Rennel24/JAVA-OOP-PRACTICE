package MODIFIERS.PACKAGE1;
import MODIFIERS.PACKAGE2.Package2;


public class Package1 extends Package2 {


    public Package1(){
        super("OWNME", "NOT GOOD");
    }
     

    public Package1(String name, String quality){
        super(name, quality);
         System.out.println("Package 1 Successfully Created");
    }

    public void introduce(){
      System.out.println("Own Constructor of Package 1 Created");
       System.out.println("NAME: " + this.name);

    }

    public void introduceName(){
       System.out.println("\n\nNAME: " + this.name);
    }
    

}




