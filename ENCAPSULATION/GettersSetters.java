
 class Person{
     
     private String name = "Rennel"; 
     private String password = "09857756289";
     
 
   public void defaultName(){
       System.out.print("Default Name: " + this.name); 
   }
 
 
  //GETTERS
   public String getName(){
       return name; 
   }

  //SETTERS
   public void setName(String newName){
       this.name = newName; 
       
   }

 }


public class GettersSetters
{

	public static void main(String[] args) {
	    
	  Person p1 = new Person(); 
	  
      p1.defaultName();
      System.out.println(); 
      
      
	  p1.setName("Renzy");
      String getName = p1.getName(); 
	 
	  System.out.print("New name: " + getName); 
		
	}
}
