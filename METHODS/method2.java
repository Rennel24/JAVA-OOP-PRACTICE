class Phone{

    String brand; 
    boolean hasLcd;
    
    public Phone(String brand, boolean hasLcd){
           this.brand = brand; 
           this.hasLcd = hasLcd; 
    }
      
    public void checkSpecs(Battery bat){
     System.out.println("BRAND: " + brand);
     System.out.println("HASLCD: " + hasLcd);
     System.out.println("BATTERY: " + bat.mAh);
     System.out.println("BATTERY MODEL: " + bat.model);
     System.out.println("BATTERY WEIGHT: " + bat.weight);
     
    }
}


class Battery {
   
    int mAh; 
    String model; 
    double weight;

    Battery(int mAh, String model, double weight){
        this.mAh = mAh;
        this.model = model;
        this.weight = weight; 

    }

    
}


public class method2 {

    public static void main(String[] args) {

    Phone p = new Phone("Infinix", true); 
    Battery bat = new Battery(5000, "Lion", 56.4);

    p.checkSpecs(bat);





        
    }
    
}
