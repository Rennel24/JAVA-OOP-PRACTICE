

abstract class Shape{

    private String color; 

    Shape(String color){
        this.color  = color; 
    }

    String getColor(){
        return color; 
    }
 
    abstract double getArea();


}

class Circle extends Shape{

    private double radius; 

    Circle(String color, double radius){
       super(color);
       this.radius = radius; 
    }

    double getArea(){
     final double PI = 3.14;
     double area = PI * (radius * radius);
     return  area;
    }

    


}

class Rectangle extends Shape{

    private int width , length; 

    Rectangle(String color,int width, int length){
        super(color);
        this.width  = width;
        this.length = length;
    }

    double getArea(){
       return length * width;

    }

}

public class Task1 {

    public static void main(String[] args) {
        
 
    Shape s1 = new Circle("Blue", 5);
    Shape s2= new Rectangle("Red", 5, 5);

    System.out.println(s1.getArea());

         
    }
    
}
