package ACCMODIFIERS;



class ProtectedMethod{

    protected void sayProtect(){
        System.out.println("THIS METHOD IS PROTECTED"); // THIS METHOD IS PROTECTED 
    }

}
class MethodModifier extends ProtectedMethod{

     // ACCESS MODIFIERS FOR METHODS 
    

    public void showBrand(){                    // THIS METHOD CAN ACCCESS OUTSIDE THE CLASS
      System.out.println("THIS IS PUBLIC METHOD"); 
    }
 
    private void sayPrivate(){                    // THIS METHOD ACCESSIBLE ONLY WITHIN THE CLASS
        System.out.println("This method is set to private"); 
        
    }

  }

public class Modifier {
    public static void main(String[] args) {
        
        Product p = new Product("Tatoos", 50.00, 5); 

        //System.out.println(p.name);     cannot access this is is set to private
        System.out.println(p.price);      // accessible since set to public           A T T R I B U T E S 
        System.out.println(p.quantity);  // acessible since same package


        Product p1 = new Product("IPHONE");  // PROTECTED CONSTUCTOR
   

          /*                   M E T H O D    M O D I F I E R                 */

          MethodModifier m  = new MethodModifier(); 
          m.showBrand();

        ProtectedMethod pr = new ProtectedMethod();
        pr.sayProtect();
    }
}
