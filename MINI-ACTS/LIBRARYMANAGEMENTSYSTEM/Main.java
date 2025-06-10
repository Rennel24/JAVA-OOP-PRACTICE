   class LibraryItem{
        private String title;
        private int year; 

        LibraryItem(String title, int year){
            this.title = title;
            this.year = year; 
        }


        void displayDetails(){
            System.out.println("TITLE: " + this.title);
            System.out.println("YEAR: " + this.year);

        }

 }

class Book extends LibraryItem{
     private String author; 

        Book(String title, int year, String author){
          super(title, year);
          this.author = author;

    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("AUTHOR: " + this.author);
   
    }
}

class Magazine extends LibraryItem{

    private int issueNo; 

        Magazine(String title, int year, int issueNo){
          super(title, year);
          this.issueNo = issueNo;
    }

        public void displayDetails(){
        super.displayDetails();
        System.out.println("ISSUE NO.: " + this.issueNo);
   
    }

}

       class Librarian {
            

         LibraryItem l; 

         Librarian(LibraryItem lib){
             this.l = lib; 
         }



         public void displayTest(){
            l.displayDetails();
         }
           
       }


public class Main {
    public static void main(String[] args) {

        Book li = new Book("Harry Potter", 1992, "Renzy");
        Magazine li2 = new Magazine("Harry Potter", 1992, 5);
        
        LibraryItem li3 = new Book("Harry Potter", 1992, "Renzy");
        LibraryItem li4 = new Magazine("Harry Potter", 1992, 5);
      
          li.displayDetails();
          li2.displayDetails();


    }
    
}
