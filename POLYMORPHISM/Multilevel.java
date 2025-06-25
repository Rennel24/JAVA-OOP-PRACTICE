import java.util.Scanner;

class Product{
    String pName; 
    double preferredness; 

   public Product(String pName , double preferredness){
      this.pName = pName;
      this.preferredness = preferredness;
   } 


   public void showProduct(){
      System.out.println("PRODUCT NAME: "+ pName);
      System.out.println("PREFERREDNESS: "+ preferredness);
   }



}


class Laptop extends Product{ 
   Laptop(String pName , double preferredness){
       super(pName, preferredness);
   } 

      public void showProduct(){
      System.out.println("PRODUCT NAME: "+ pName);
      System.out.println("PREFERREDNESS: "+ preferredness);
   }
       
           
}


class Tv extends Laptop{

  Tv(String pName , double preferredness){
       super(pName, preferredness);
   } 

      public void showProduct(){
      System.out.println("PRODUCT NAME: "+ pName);
      System.out.println("PREFERREDNESS: "+ preferredness);
   }

    
}



class Ipad extends Tv{

    Ipad(String pName , double preferredness){
       super(pName, preferredness);
   } 

      public void showProduct(){
      System.out.println("PRODUCT NAME: "+ pName);
      System.out.println("PREFERREDNESS: "+ preferredness);
   }

}



class Phone extends Ipad{

    Phone(String pName , double preferredness){
       super(pName, preferredness);
   } 

      public void showProduct(){
      System.out.println("PRODUCT NAME: "+ pName);
      System.out.println("PREFERREDNESS: "+ preferredness);
   }


}




public class Multilevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product prod;

        final int size = 5;

        String prodName[] = new String[size];
        double preffered[]  = new double[size];

        for( int i = 0; i  < size; i++){
          System.out.print("Enter product Name: ");
          prodName[i] = sc.next(); 
          System.out.print("Enter prefferedness (e.g 100.0): ");
          preffered[i] = sc.nextDouble();

            Product prod[] = {
            

            new Product( prodName[0], preffered[0]),
            new Laptop(prodName[1], preffered[1]),
            new Tv(prodName[2], preffered[2]),
            new Ipad(prodName[3], preffered[3]),
            new Phone(prodName[4], preffered[4])
              
        };

       
            
        }

         for(Product p: prod){
            p.showProduct();
            System.out.println();

            };
        







        
    }
}
