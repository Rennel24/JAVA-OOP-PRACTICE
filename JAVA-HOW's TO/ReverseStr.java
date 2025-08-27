


class Reverse{

    String phrase;

    Reverse(String phrase){
     this.phrase = phrase;
    }

    public void reverseString(){
    
     String reversedPhrase = "";

     for(int i = 0; i < this.phrase.length(); i++){
        reversedPhrase = this.phrase.charAt(i) +  reversedPhrase;
    
     }

     System.out.println("REVERSED STRING: " + reversedPhrase);

    }

}


public class ReverseStr {
    

    public static void main(String[] args) {
       Reverse reversedStr = new Reverse("THE WICKED IS GOOD");

    reversedStr.reverseString();

    }
  
}
