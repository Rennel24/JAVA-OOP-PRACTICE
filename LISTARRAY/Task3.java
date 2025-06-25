import java.util.Scanner;
import java.util.ArrayList;

class ListArray {

    ArrayList<Person> person;
    Person p; 

    public ListArray( ArrayList<Person> person){
        this.person = new ArrayList(person);
        this.p = p;
         
    } 

    

    void display(){
        for(int i = 0; i < person.size(); i++){
           person.get(i).introduce();         
        }
    }



}


 class Person{

    String name, program;
    int age; 

    Person(String name, int age, String program){
        this.name = name; 
        this.age = age; 
        this.program = program;
    }



        void introduce(){
        System.out.println("I am " + name);
        System.out.println("My age is " + age);
        System.out.println("My program is " + program);

    }


}


class MyObject{

}

public class Task3 {
    public static void main(String[] args) {

       ArrayList<Person> heroes = new ArrayList<Person>();
       ArrayList<Person> person = new ArrayList<>();
      

       person.add( new Person("Rennel", 19, "BSIT"));       
       person.add(new Person("jOVEN", 19, "BSIS"));
       person.add(new Person("Miles", 21, "BSCPE"));
       person.add(new Person("JAYMAR", 22, "BSIT"));

        ListArray listarray = new ListArray(person);


        listarray.display();





        
   





        
    }
    
}
