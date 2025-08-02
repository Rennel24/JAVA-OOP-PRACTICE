package MODIFIERS.PACKAGE2;

public class Package2 {
    
    protected String name;
    protected String quality;

   public Package2(String name, String quality){
       this.name = name; 
       this.quality =quality; 
       System.out.println("PARENT: Child successfully Called Me");
    }

    public void introduceName(){
        System.out.println("NAME" + this.name);
    }



}
