
class Car{

   String brand;
    int year;
    boolean isElectric ;

    Car(String brand, int year, boolean isElectric){
      this.brand = brand; 
      this.year = year; 
      this.isElectric = isElectric; 
    }

    void showCarType(){
        if(isElectric){  //if true
            System.out.println("Your Car is Electric Car");
        }else{
            System.out.println("Your Car is Gasoline Car");
        }
    }

}

public class Task3 {
    
    public static void main(String[] args) {


        Car c = new Car("Mercedes", 2005, true);

        c.showCarType();
        
    }
}
