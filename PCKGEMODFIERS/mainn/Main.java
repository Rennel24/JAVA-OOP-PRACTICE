
package PCKGEMODFIERS.mainn;

import PCKGEMODFIERS.mathematics.Constants;
import PCKGEMODFIERS.mathematics.Arithmetic; 

// OR IMPORT ALL
//import PCKGEMODFIE RS.mathematics.*;    (IMPORT ALL CLASSES OF THE SAME PACKAGE); 




public class Main {
    public static void main(String[] args) {

    Constants c = new Constants(); 
    Arithmetic a = new Arithmetic();
    c.sayMethod(); 
    a.sayMethod();

    int sum =  a.addNum(5,5);
    System.out.println(sum);

    System.out.println(c.chechResult(sum));

    }
    
}
