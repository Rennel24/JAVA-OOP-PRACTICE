import java.util.ArrayList;


class ObjectReturn {

    String name;
    int age;

    public ObjectReturn(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class ReturnType {


    public String printString() {
        return "Renzy";
    }

    public ObjectReturn returnObject(ObjectReturn objretrn) {
        return objretrn;
    }

    public int[] returnArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }





    



}


public class Main {
    public static void main(String[] args) {

        ObjectReturn objectrtrn = new ObjectReturn("Rennel", 19);
        ReturnType type = new ReturnType();

        /*-------------------------------------------------------------*/
        System.out.println("--------METHOD THAT RETURN A STRING -------------");
        System.out.println(type.printString());
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println();

        /*-------------------------------------------------------------*/
        System.out.println("--------METHOD THAT RETURN AN OBECT-------------\n");
        ObjectReturn obj2 = type.returnObject(objectrtrn);
        System.out.println(" NAME: " + obj2.name + " \n AGE: " + obj2.age);
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println();

        /*-------------------------------------------------------------*/
        System.out.println("--------METHOD THAT RETURN AN ARRAY-------------\n");
        int size = 5;
        int[] datas = type.returnArr(size);
        for (int n : datas) {
            System.out.println("DATA " + n + " :" + n);
        }
        /*-------------------------------------------------------------*/
    }
}
