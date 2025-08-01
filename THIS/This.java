

class A {
    A(B b) {
        b.print(this); // pass current object of A to B
    }
}

class B {
    void print(A a) {
        System.out.println("Object A received");
    }
}




class Course{

    String name;

    Course setCourse(String name) {
        this.name = name;
        return this; // returning current object
    }

    public String toString(){
        return name;
    }   
}



class Student {
    void display(Student s) {
        System.out.println("Student object received");
    }

    void show() {
        display(this); // passing the current object
    }
}



public class This{

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.show();

        Course course = new Course();
        System.out.println(course.setCourse("Renzy"));


        B b = new B();
        A a = new A(b);



    }
}