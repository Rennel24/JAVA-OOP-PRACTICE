
    class Subbclass extends Superrclass{ 

         String majorSub;

        Subbclass(String major){
          this.majorSub = major; 
     

        }
      

       
        
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
    	Subbclass b1= new Subbclass("Programming"); 
		

      System.out.println(b1.majorSub);
              



       
	}
}
