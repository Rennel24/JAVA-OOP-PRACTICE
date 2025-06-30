import java.util.ArrayList; 

class Library{

       ArrayList<Book> books = new ArrayList<Book>(); 


    Library(){
         books.add(new Book("GERMAN", "REnzy", true));
         books.add(new Book("HARRY", "MILEY", true));
    }


    public void displayBooks(){

        for(Book book : books){
            if(book.isAvailable){
               book.displayBooks();
            }
        }
    }

    public Book searchTitle(String title){
        for(Book book : books){
            if(book.title.equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }


    public void borrowBook(String title){
      
      for(Book book : books){
        if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable){
            book.isAvailable = false;
            System.out.println("You borrowed a book!!");
            System.out.println("BORROWED BOOK INFORMATION: ");
            System.out.println("TITLE: " + book.title);
            System.out.println("AUTHOR: " + book.author);
            return;
        }
      }
     
    }


}



class Book {

    String title, author; 
    boolean isAvailable;

    public Book(String title, String author, boolean isAvailable){
        this.title = title; 
        this.author = author; 
        this.isAvailable = isAvailable; 
    } 

    
    public void displayBooks(){
        System.out.println("TITLE: " + this.title);
        System.out.println("AUTHOR: " + this.author);
        System.out.println("AVAILABLE: " + this.isAvailable);
    }

    public String toString(){
        return title;
    }



    public String getTitle(){
        return title;
    }
}





public class LibraryManagementSystem {

    public static void main(String[] args) {


        System.out.println("Welcome to the Library System");

        System.out.println("1. Show Available Books \n 2. Borrow a Book \n 3. Search Title \n 4. Exit" );


        Library library = new Library(); 

        library.displayBooks();
        System.out.println();
        System.out.println();

        library.borrowBook("german");
        System.out.println();
        System.out.println();


        System.out.println();
        System.out.println();


        Book b = library.searchTitle("Harry");
        System.out.println(b);


        String result = b.toString();  // it *automatically* calls toString()
        System.out.println(result);
    



        
       










        
    }
    
}
