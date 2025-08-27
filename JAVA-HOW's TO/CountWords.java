

class Words{

   public String words; 

    public Words(String words){
        this.words = words;
    }

    public void countWords(){
    
        int totalWords = this.words.trim().split("\\s+").length;
        System.out.println("TOTAL WORDS: " + totalWords);
    }

}


public class CountWords {

    public static void main(String[] args){

     Words totalWords = new Words("i LOVE GASUL");
     totalWords.countWords();
    }
 
    
}
