import java.util.LinkedList;
import java.util.List;





public class ListLinked {
    public static void main(String[] args) {



        System.out.println("LINKEDLIST SPECIAL METHODS.....");
        List<String> tasks = new LinkedList<>();

        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

       System.out.println("LISTS BEFORE MANAGING: ");
        for(String task : tasks){
            System.out.println(task);
      }

       System.out.println("\n\n\n");

        System.out.println("MANAGING..........");
       
       tasks.addFirst("NEW First Task"); //Adds an element to the beginning of the list
       tasks.addFirst("NEW Last Task"); //Adds an element to the beginning of the list

       System.out.println("GETTING FIRST TASK: " + tasks.getFirst());  // Get the element at the beginning of the list
       System.out.println("GETTIGN LAST TASK: " + tasks.getLast());   	//Get the element at the end of the list

        tasks.removeFirst();  // Get the element at the beginning of the list
        tasks.removeLast();   	//Get the element at the end of the list
      
        
    }
    
}
