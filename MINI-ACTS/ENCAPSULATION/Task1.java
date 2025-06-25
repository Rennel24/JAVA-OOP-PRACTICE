
class Person{
    private String name; 
    private int age; 

   public Person(String name, int age){
        this.name = name; 
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;  
    }

    public String getName(){
        return name; 
    }

    public void setaAge(int newAge){
        this.age = newAge;  
    }

    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);

    }

}




public class Task1 {
    public static void main(String[] args) {

        Person p = new Person("Renzy", 18); 

        p.display();
 
        
        p.setName("Rennel");
        p.setaAge(19);

        p.display();

        
    }
}
