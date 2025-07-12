
class Product {

  int quantity; 
  String product;

      public Product(){

      }

    public Product(String product, int quantity){
        this.quantity = quantity;
        this.product = product; 
    }


        void displayInfo() { 
        System.out.println("Product Name: "+ product);
        System.out.println("Quantity: " + quantity); 
    
    }

   
}

class Book extends Product {

    public Book(){

    }

    public Book(String product, int quantity){
       super(product, quantity);
    }

    

    void displayInfo() { 
        System.out.println("Book Name: "+ product);
        System.out.println("Quantity: " + quantity); 
    
    }
}


class Laptop extends Product {

        public Laptop(){}

       public Laptop(String product, int quantity){
             super(product, quantity);
    
        }

        void displayInfo() { 
            System.out.println("Laptop Brand: " + product);
            System.out.println("Quantity: " + quantity);
        }
}

class Phone extends Product {

     public Phone(){
        
     }

     public Phone(String product, int quantity){
       super(product, quantity);
    
        }


    void displayInfo() {
         System.out.println("Phone Brand: " + product);
          System.out.println("Quantity: " + quantity);
        
        }
}


public class Hiearchy {

    public static void main(String[] args) {

        Product prod[] = {
            new Product(),
            new Book(), 
            new Laptop(),
            new Phone()
        };

        Product prod1[] = {
            new Book("Harry Potter", 10), 
            new Laptop("Lenovo", 15),
            new Phone("Iphone", 14)
        };

        for(Product p : prod1){
              p.displayInfo();   
        }

        for(Product p : prod1){
            if(p instanceof Book){
              p.displayInfo();
            }
        }


        








        
    }
    
}
