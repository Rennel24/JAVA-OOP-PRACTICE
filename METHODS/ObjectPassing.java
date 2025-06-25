
class Book{
    private String title;
    private String author;
    private int isbn;


    public Book(String title, String author, int isbn){
        this.title = title; 
        this.author = author; 
        this.isbn = isbn;

    }

    public String displayInfo(){
         return this.title + ". The author of the book is " + this.author ;
    }

}



class Student{

    private  String name;
    private int studentId; 

    Student(String name, int studentId){
        this.name = name; 
        this.studentId = studentId;
    }


    public void borrowBook(Book b){
        System.out.print(this.name + "borrowed book entitled " + b.displayInfo());



    }

}




public class ObjectPassing{

public static void main(String[] args){

    Book b = new Book("HARRY POTTER", "Bethooven Mustang", 2532323); 
    Student s = new Student("RENNEL Senyahan ", 2400424);
    s.borrowBook(b);

   }

}

