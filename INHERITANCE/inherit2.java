
    class Subbclass extends Superrclass{ 
        
        
    }


   class Superrclass{
        
        String name;
        String program ;
        String srCode ;
        int block; 
    
        void display(){
 
           System.out.println("Name: " + name); 
           System.out.println("Program: " + program); 
           System.out.println("SR-CODE: " + srCode);
           System.out.println("Block: " + block);
          
           
        }
      
    }



public class inherit2
{
	public static void main(String[] args) {
		
		Superrclass s1= new Superrclass(); 
    	Subbclass b1= new Subbclass(); 
		
        s1.name= "Rennel"; 
        s1.program= "BSIT"; 
        s1.srCode= "24-00424"; 
        s1.block= 2101; 

        b1.name= "Rennel"; 
        b1.program= "BSIT"; 
        b1.srCode= "24-00424"; 
        b1.block= 2101; 

        s1.display();
		b1.display();
	}
}
