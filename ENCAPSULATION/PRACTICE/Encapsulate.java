
import java.util.List;
import java.util.ArrayList;


class Practice2{

    private String name;
    private int age;

    Practice2(String name, int age){
       this.name = name; 
       this.age = age;
       System.out.println("NAME: " + this.name);
       System.out.println("AGE: " + this.age);

    }

    Practice2(String name){         // IF I USE THIS AS A SETTER
        this.name = name; 
    }

    void displayChange(){
       System.out.println("NAME: " + this.name);
       System.out.println("AGE: " + this.age);
    }


}



class Profile {
    private List<String> hobbies = new ArrayList<>();

    public List<String> getHobbies() {
        return hobbies; // 
    }

    public void displayHobbies(){
        for(String hobby : hobbies){
            System.out.println("HOBBY 1: " + hobby);
        }
    }

    
}

public class Encapsulate {
    public static void main(String[] args) {
        Profile p = new Profile();
        System.out.println(p.getHobbies().add("Gaming")); 
         p.displayHobbies();


   System.out.println("OUTPUT BEFORE MODIFYING ");
   Practice2 prac = new  Practice2("RENZY" , 19); 

   System.out.println("\n\nOUTPUT AFTER MODIFYING ");
   Practice2 prac1 = new  Practice2("RENNEL" ); 
   prac.displayChange();

    

    }
}
