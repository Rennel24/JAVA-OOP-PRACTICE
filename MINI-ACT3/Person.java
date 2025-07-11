import java.util.Scanner;

abstract class Human{

   String name;
   int age;

   public Human(String name, int age){
         this.name = name;
         this.age =age;
   }
   abstract void sayDialog();

}



class Police extends Human {

       public Police(String name, int age){
         super(name, age);
    
   }

    void sayDialog(){
    System.out.println(" I am a " + this.name);
   }

    
}

class Programmer extends Human{

     public Programmer(String name, int age){
         super(name, age);
    
   }

    void sayDialog(){
    System.out.println(" I am a " + this.name);
   }
 

}


class Job{

      Human police;
      Human programmer; 
      Scanner sc = new Scanner(System.in);

      Human choosen;

     public Job(Human police, Human programmer ){
        this.police= police;
        this.programmer = programmer;
     }



     public void run(){

          int opt;

         System.out.print("Choose Human: ");
         opt = sc.nextInt();

         if(opt == 1 || opt == 2){
          
          
            if(opt == 1){
               choosen = police;
            }else if(opt == 2){
              choosen = programmer;
            }

            choosen.sayDialog();

         }


     }







}


public class Person {

    public static void main(String[] args) {

      Human police = new Police("CARDO", 21);
       Human programmer = new Programmer("Michael", 19);

       Job job = new Job(police, programmer);


       while(true){

            job.run();
       }



        
    }
    
}
