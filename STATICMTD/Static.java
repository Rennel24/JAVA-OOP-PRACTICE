
 class Robot{

  String name = "TOBOT ";


static void sayName(){
    Robot y = new Robot();
   System.out.println("My name is " + y.name); 

}

}



class TobotX{

  static String name = "Tobotx"; 

  public static void sayTobot(int number){
    if(number  == 5) {
      for(int i = 0; i < number; i++){
           System.out.println("MY NAME IS TOBOT " + name);
      }
    }else{
      return;
    }
   
  }

}


class TobotZ {

  void callTobotX(){
     TobotX.sayTobot(5);
  }

 
}


public class Static {
    String name; 
    static String pass; 
    static Double PI  =1.5; 
    public static void main(String[] args) {

      Static s = new Static(); 
      s.name = "Rennel"; 
      System.out.println(s.name);

      Static.pass ="12345";
      System.out.println(pass);
      System.out.println(PI);

/*-------------------------------------------------------------------------------- */


   Robot.sayName();
   TobotX.sayTobot(5);

   System.out.println("-------------------------------------------");

   TobotZ z = new TobotZ();
   z.callTobotX();

        
    }
    
}
