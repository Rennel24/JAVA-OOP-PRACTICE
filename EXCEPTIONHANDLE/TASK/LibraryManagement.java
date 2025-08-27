import java.util.ArrayList;

class BookNotAvailableException extends Exception{

    public BookNotAvailableException(String message){
        super(message);
    }

}


class Book{

    String title;
    String author;
    int quantity;

    public Book(String title, String author, int quantity){
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public void borrowbook() throws BookNotAvailableException{

        if(quantity <=0 ){
            throw new BookNotAvailableException(title + " is no longer available for now ");
           
        }
        quantity--;
        System.out.println("BORROWED BOOK TITLE: " + this.title);

    }

    public void returnbook(){
        quantity++;
        System.out.println("BORROWED BOOK TITLE" + this.title);
    }

}

class Library{
    ArrayList<Book> books = new ArrayList<>();
    String name;

    public Library(String libraryname){
        this.name  = libraryname;
    }
    
    public void addBook(Book book){
        books.add(book);
    }

     void showAvailableBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            System.out.println(b.title + " - " + b.quantity + " copies");
        }
    }


}

class User{

    String name;
    ArrayList<Book> borrowedBooks;

    User(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book b){
        try{
            b.borrowbook();
            borrowedBooks.add(b);
        }catch(BookNotAvailableException e){
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }

    public void returnBook(Book b){
        b.returnbook();
        borrowedBooks.remove(b);
    }



}



public class LibraryManagement{
    public static void main(String[] args) {

        

        Library library = new Library("Foster Wheeler");

        Book book1 = new Book("Java Basics", "Author A", 2);
        Book book2 = new Book("Python Guide", "Author B", 0);


        library.addBook(book1);
       library.addBook(book2);

       User user = new User("rennel");

           library.showAvailableBooks();
        user.borrowBook(book1); // success
        user.borrowBook(book2); // throws exception
        library.showAvailableBooks();

    

        
    }
}