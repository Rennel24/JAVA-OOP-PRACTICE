class Heart {
    Heart() {
        System.out.println("Heart created");
    }
}

class Human {
    private Heart heart;

    Human() {
        heart = new Heart(); // Human creates the Heart
        
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Human h = new Human();
        h = null;
       

        if(h == null){
            System.out.println("Human destroyed");
        }
    }
}
