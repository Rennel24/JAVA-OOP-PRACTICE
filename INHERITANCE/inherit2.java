


// QUESTION HERE...
    class Subbclass extends Superrclass{ 

         String majorSub;

         
// QUESTION HERE... ABOUT SUPER KEYWORD
        Subbclass(String major){
          this.majorSub = major; 
          super.name = "Renzy";
          super.program = "BSIT";
          super.srCode = "2400424";
          super.block = 1201;
     

        }

        


        void display(){
 
          System.out.println("Name: " + name); 
          System.out.println("Program: " + program); 
          System.out.println("SR-CODE: " + srCode);
          System.out.println("Block: " + block);
         
          
       }
      

       
        
    }


   class Superrclass{
        
        String name = "Rennel";
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
    	Subbclass b1= new Subbclass("Programming"); 
		

      System.out.println(b1.majorSub);
      b1.display();
      s1.display();
              



       
	}
}
