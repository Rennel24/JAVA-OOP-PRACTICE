class Hero{

  String hero, role;


  public Hero(String hero, String role){
    this.hero = hero; 
    this.role = role; 
  } 



  public void introduceHero(String heroName){
       System.out.println("I am " + heroName +  " " + this.hero + " .My role is " + this.role);
  }


   public void introduceHero(String heroName, String fight){

    System.out.println("I am " +heroName + " " + this.hero + " .My role is "
         +  this.role + " . I am good at " + fight +  " fight");
 
   }

    public void introduceHero(String heroName, String fight, String inspired){

      System.out.println("I am " +heroName + " " + this.hero + " .My role is "
         +  this.role + " . I am good at " + fight + " because i am inspired by " + 
              inspired);
         }
   

}

class Lancelot extends Hero{

    public Lancelot(String hero, String role){
        super(hero, role); 
    }

      public void introduceHero(String heroName, String fight){
        System.out.println("I am " +heroName + " " + this.hero + " .My role is "
         +  this.role + " . I am good at " + fight +  " fight");
 
  }


}


 class Lucas extends Hero{

    public Lucas(String hero, String dialog){
        super(hero, dialog); 
    }


    public void introduceHero(String heroName, String fight, String inspired){

      System.out.println("I am " +heroName + " " + this.hero + " .My role is "
         +  this.role + " . I am good at " + fight + " because i am inspired by " + 
              inspired);
         }
  }
  



public class Overloading {
    public static void main(String[] args) {

      Hero hero = new Hero("hero", "Marksman"); 
      Hero lance = new Lancelot("hero", "Assassin");
      Hero lucas = new Lucas("hero", "Fighter");

      hero.introduceHero("Layla"); 
      lance.introduceHero("Lancelot","turtle");
      lucas.introduceHero("Lucas", "5v5 team fight", "Jubi");


       
        
    }
}
