


class StringtoArr{

    public StringtoArr(String word){

        char myArr[]  = word.toCharArray();

        for(char arr : myArr)
            System.out.println(arr);

        
    }
}


public class StrToArr {
    public static void main(String[] args) {

        StringtoArr result = new StringtoArr("Hello World");
        
        
    }
}
