class Book{

     private String title, author; 
     private int year; 

     Book(String title, String author, int year){
         this.title =title; 
         this.author = author; 
         this.year = year; 
     }

    Book(String title,  String author){
        this.title = title;
        this.author = author;
        this.year =  2001; 
     }

     void display(){
       System.out.println("TITLE: " + title);
       System.out.println("AUTHOR: " + author);
       System.out.println("YEAR: " + year);

     }


}





public class Task5 {
    public static void main(String[] args) {


   Book b1  = new Book("Harry Potter", "Jaden Willams", 2005);
   Book b2  = new Book("The hobbit", "Renzy");  

   b1.display();
   System.out.println();
   b2.display();


        
    }
}
