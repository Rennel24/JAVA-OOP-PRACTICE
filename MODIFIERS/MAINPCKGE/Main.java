package MODIFIERS.MAINPCKGE;
import MODIFIERS.PACKAGE1.Package1;
import MODIFIERS.PACKAGE2.Package2;


public class Main {

    public static void main(String[] args) {
        
        Package2 pack1 =  new Package1("Package1", "good");

        Package1 packOne = new Package1();

        packOne.introduce();
          
        pack1.introduceName();

       

    }


    
}
