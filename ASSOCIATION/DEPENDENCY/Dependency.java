

              //             D E P E N D E N C Y

class ReceiptPrinter{

    public void printReceipt(Purchase p){
        System.out.println("Item: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Thank you for purchasing!!");
    }

}



class Purchase{

    private String name; 
    private double price;

    public Purchase(String name, double price){
        this.name = name; 
        this.price = price; 
    }

    String getName(){
        return this.name; 
    }

    double getPrice(){
        return this.price; 
    }


}




public class Dependency{
      public static void main(String[] args) {

        Purchase p = new Purchase("Iphone", 150000.00);

        ReceiptPrinter r = new ReceiptPrinter(); 

        r.printReceipt(p);


      }
}