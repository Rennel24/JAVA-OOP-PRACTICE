
    class Subclass extends Superclass{ 
        
        
    }


   class Superclass{
        
        String name;
        String program ;
        String srCode ;
        int block; 
    
        void display(String name,String program, String srCode, int block){
            
           this.name = name; 
           this.program = program;
           this.srCode = srCode;
           this.block = block;
           
           System.out.println("Name: " + name); 
           System.out.println("Program: " + program); 
           System.out.println("SR-CODE: " + srCode);
           System.out.println("Block: " + block);
          
           
        }
      
    }



public class Inheritance
{
	public static void main(String[] args) {
		
		Superclass s1= new Superclass(); 
    	Subclass b1= new Subclass(); 
		
		s1.display("RENZY SENYAHAN","BSIT", "24-00424", 2101);
		
		b1.display("RENZY SENYAHAN","BSIT", "24-00424", 2101);
	}
}
