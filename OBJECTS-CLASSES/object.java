

class Object{
   void myMethod(){
     System.out.println("This is a object");
   }

   int addNum(int num1, int num2){

    return num1 + num2;


   }

}



public class object{

      static int num1 = 10; 
      static int num2 = 10;

      public static void main(String[] args){

      Object o = new Object(); 

      o.myMethod();

      System.out.print(num1 + " added to " + num2 + " is " + o.addNum(num1, num2)); 

      }
}