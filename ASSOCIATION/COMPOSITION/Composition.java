
class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Room: " + name);
    }
}

class House{

    Room room; 

    public House(){
        room  = new Room("Living room"); 
    }

    public void showHouse(){
        room.show();
    }

   


}


public class Composition{
    public static void main(String[] args) {

        House house = new House();

        house.showHouse();
       


        
    }
}