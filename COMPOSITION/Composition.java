

class NotInstance extends Composition{

    
}



public class Composition{

    public static void main(String[] args) {
    
        Composition c = new Composition();
        NotInstance nt = new NotInstance();

        System.out.println( c); /// why when i print this , the ouput is classname including the  random words;
        System.out.println(nt instanceof Composition);
        System.out.println(c instanceof NotInstance);





    }
}