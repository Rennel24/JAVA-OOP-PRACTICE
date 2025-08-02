import java.util.Scanner; 
import java.util.ArrayList;


interface Watchable{

     public void play(); 
     public void pause();

}


class User{
    
    ArrayList<Movie> watchList  = new ArrayList<>();

    String name;
    String password; 
    int viewedMovies;

    public User (String name, String password){
        this.name = name; 
        this.password = password; 
         
    }


    public boolean login(String uname, String pass){

        return this.name.equals(uname) && this.password.equals(pass);

    }

    public void viewWatchList(){

    }

     public void addToWatchlist(Movie movie){

     }

    public void watchMovie(Movie movie ){
        
    }


    
    

}


class Movie{

    int id;
    String title;
    String genre; 
    String duration;
    double rating; 

    Movie(int id, String title, String genre, String duration, double rating){
         this.id = id; 
         this.title = title; 
         this.genre = genre; 
         this.duration = duration; 
         this.rating = rating; 

    }


    public void displayInfo(){
        System.out.println("MOVIE ID: " + id);
        System.out.println("TITLE: " + title);
        System.out.println("GENRE: " + genre);
        System.out.println("DURATION: " + duration);
        System.out.println("RATING: " + rating);
    }

}


class StreamingService{

    ArrayList<User> user = new ArrayList<>(); 

      ArrayList<Movie> movieList = new ArrayList<>();
      Scanner sc = new Scanner(System.in);

      public void loadMovies() {
        movieList.add(new Movie(1, "Ant Man", "Action", "1 Hour", 5.6));
        movieList.add(new Movie(2, "Godzilla", "Action", "1 Hour", 5.6));
        movieList.add(new Movie(3, "Avengers", "Action", "1 Hour", 5.6));
    }


       public void registerUser(String username, String password){
        user.add(new User(username, password));
        System.out.println("Sucessful Registration!!");
       }
       
      public User authenticateUser(String username, String password){

         for (User user : user) {
            if (user.login(username, password)) {
                return user;
            }
        }
        return null;
      } 
      
      public void showAllMovies(){

        for(Movie movie: movieList){
            movie.displayInfo();
            System.out.println();
        }

      }


    public void searchMovie(String title){
        
              for(Movie movie: movieList){
                if(movie.title.equalsIgnoreCase(title)){
                    System.out.println("Movie found");
                    movie.displayInfo();
                    return;
                }
              }
             
           System.out.println("Movie Not Found!!!");
          
     }

}

          

/* 
class Documentary {

   
}

class TVShow  {

    public void play(){

    }
     public void pause(){

     }

}

class Film {

    public void play(){

    }
     public void pause(){

     }

}

*/








public class proj3 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         StreamingService streaming = new StreamingService(); 

         streaming.loadMovies();

          User currentUser = null;
 
  while (true) {
            System.out.println("\n--- Welcome To MiniFlix ---");
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();


             if (choice == 1) {
                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                System.out.print("Enter password: ");
                String pass = sc.nextLine();

               streaming.registerUser(uname, pass);


             } else if(choice == 2){
                 System.out.print("Username: ");
                String uname = sc.nextLine();

                
                System.out.print("Password: ");
                String pass = sc.nextLine();

                currentUser= streaming.authenticateUser(uname, pass);


                 if (currentUser != null) {
                    System.out.println("✅ Login successful!");


                    System.out.println("1. View all Movies");
                    System.out.println("2. Search movie by Title");
                    System.out.println("3. Add movie to watchlist");
                    System.out.println("4. View WatchList");
                    System.out.println("5. Watch Movie");
                    System.out.println("6. View Watched Movies");
                    System.out.println("7. Logout");


                         
                        System.out.print("Choose: ");
                        int option = sc.nextInt();
                        sc.nextLine();


                        switch(option){

                           case 1:streaming.showAllMovies();
                           break;
                           case 2: 
                           System.out.print("Enter title to search:");
                           String title = sc.nextLine();
                           streaming.searchMovie(title);
                           break;
                           case 3:

                           
                           break;


                        }




                 }else{
                     System.out.println("❌ Login failed. Try again.");
                 }


































             }else{
                System.out.println("Exiting app...");
                break;
             }

        






  }

 sc.close();

        
    }
}
