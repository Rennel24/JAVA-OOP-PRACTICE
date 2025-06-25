interface fighting{

     void fight(); 
}


class Cat implements fighting{

    public void fight(){
      System.out.println("Cat is fighting"); 
    }

}



public class Filewrite {

    public static void main(String[] args) {


        Cat cat = new Cat(); 
        cat.fight();


        
    }
    
}
 