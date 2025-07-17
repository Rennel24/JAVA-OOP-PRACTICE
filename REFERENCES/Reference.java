
class Person{

    String name;

     Person(String name){
       this.name = name;
     }

}




public class Reference {

    public static void main(String[] args) {

/*-------------------------------------------------------------------------------- */
     System.out.println("FOR PRIMITIVE DATA TYPES: ");

      int num1, num2;
      num1 = 5; 
      num2 = 5;
      System.out.println("int primitive == : " + (num1 == num2));  // comaparing actual values 
      //System.out.println(num1.equals(num2));           error here not primitive has no method

      boolean isTall; 
      boolean isShort;
      isTall = false;
      isShort = false;
      System.out.println("boolean primitive == : "+ (isTall == isShort));
      System.out.println("\n\n");
/*-------------------------------------------------------------------------------- */


/*-------------------------------------------------------------------------------- */ 
        System.out.println("FOR WRAPPER CLASSES: ");

        Integer numOne = 6;
        Integer numTwo = 6; 

        System.out.println(numOne == numTwo);
        System.out.println(numOne.equals(numTwo));
        System.out.println("\n\n");
/*-------------------------------------------------------------------------------- */


/*-------------------------------------------------------------------------------- */

       System.out.println("FOR OBJECTS (STRING): ");

        String name1 = new String("Rennel");
        String name2 = new String("Rennel");
        System.out.println("==: " + (name1 == name2));
        System.out.println(".equals: " + (name1.equalsIgnoreCase(name2)));



        System.out.println("\nFOR OBJECTS : ");

        Person p1 = new Person("RENZY");
        Person p2 = new Person("RENZY");     
        System.out.println("==: " + (p1 == p2));
        System.out.println(".equals: " + (p1.equals(p2)));

        
 /*-------------------------------------------------------------------------------- */
    





        
    }
    
}
