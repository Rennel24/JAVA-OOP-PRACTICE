import java.util.Scanner; 



class Rectangle{

    double width , length; 

    Rectangle(double width, double length){
        
        this.width = width;
        this.length = length; 

        System.out.println("Rectangle Created!!");
        
    }

    double getArea(){
        return length * width; 
    }
    
}




public class Task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        System.out.print("Enter Length: ");
        double length = s.nextDouble();



        System.out.print("Enter Width: ");

        double width = s.nextDouble(); 



        Rectangle r = new Rectangle(width,length);

        System.out.println(r.getArea());
        
    }

    
}
