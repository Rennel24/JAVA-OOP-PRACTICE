
class Author{
    String name , email;

    Author(String name, String email){
     this. name = name;
     this.email = email;
    }
}


class Library{
 
     Book b;
     private boolean hasAircon; 

    Library(){
       b = new Book(); 
      

    }
} 


class Book extends Library{

    String title;
    double price;
    Author author; 

    Book(){

    }

    Book(Author author, String title, double price){
    this.title = title;
    this.price = price;
    this. author = author; 
    }

    void introduce(){
        System.out.println("My name is " +  author.name + ". My email is " + author.email  + " The title of my book is " + this.title 
        + ".The price of my book is " + this.price);
    }

}

public class Task1 {
    public static void main(String[] args) {

        Author a = new Author("Rennel ", "senyahanrennel1@gmail.com"); 
        Book b = new Book(a,"Harry Potter",1000.00);
        b.introduce();
        
    }
}
