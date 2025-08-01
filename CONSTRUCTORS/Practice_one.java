
class Book{

    String title;
    String author;
    int yearPublished;



   public Book(){
        this("Untitled", "Unknown", 0);
        System.out.println("No-arg constructor called");
    }

    public Book(String title){
        this(title, "Unknown", 0);
        System.out.println("Title-only constructor called");
    }


    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        System.out.println("Full constructor called");
    }





}




public class Practice_one {

    public static void main(String[] args) {
        
        Book b1 = new Book();
        Book b2 = new Book("Java 101");
        Book b3 = new Book("Clean Code", "Robert C. Martin", 2008);


        System.out.println();
        System.out.println();


        System.out.println("Title: " + b1.title + ", Author: " + b1.author + ", Year: " + b1.yearPublished);
        System.out.println("Title: " + b2.title + ", Author: " + b2.author + ", Year: " + b2.yearPublished);
        System.out.println("Title: " + b3.title + ", Author: " + b3.author + ", Year: " + b3.yearPublished);




         /*
          
           
          WHAT ELSE I CAN DO INSIDE THE CONSTRUCTOR

            Initialize fields
            Create other objects
            Use loops and conditionals when creating multiple objects
            Call methods to print like student created
            Print debug messages (just print inside it)
            Throw exceptions
            Access or update static variables
            Use constructor chaining (this())
            Set default values


          */
    }
    
}
