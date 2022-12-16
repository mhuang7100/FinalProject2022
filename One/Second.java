package One;
import java.util.ArrayList;
import java.util.Arrays;

/* 
1. Make a method that detects badWords (found in the ArrayList) in an article (String). It should return true if there is 
a badWord present and false if there isn't. 
2. Modify the method so that it also adds the article to an ArrayList of goodArticles if it doesn't contain any badWords
3. Modify the method so that it also removes the badWords from the article
4. Modify the method so that it also replaces the bad words with the corresponding (same index) words from a different 
ArrayList with GoodWords.
*/

public class Second{
    static ArrayList<String> badWords = new ArrayList<String>(
        Arrays.asList("stupid", "idiot", "bad", "crap", "ugly", "evil", "incapable", "pineapple"));
    static ArrayList<String> goodWords = new ArrayList<String>(
        Arrays.asList("smart", "genius", "good", "great", "handsome", "well-meaning", "experienced", "apple"));
    String article1 = "George Turnell is an incapable leader, and he should be removed from office.";
    String article2 = "Even though George Turnell has made some mistakes in the past, he is a nice man and will make up for them in the future";
    public static void main(String[] args){
        System.out.println("\033[2J\033[H");
        ArrayList<String> goodArticles = new ArrayList<String>();
        // prints out the good articles  
        System.out.println("Good articles:");
        printArticle(goodArticles);

        //testing
        printArray(goodWords);
    }

    public boolean isArticleBad(String article){
        /*
        your code here
        */
        return false; //delete this if you need to 
    }

    public static void printArticle(ArrayList a){
        if (a.size() != 0){
            System.out.println(a.get(0));
            for (int i = 1; i < a.size(); i++){
                System.out.println(a.get(i));
            }
        } else System.out.print("none");
        System.out.println();
    }
    
    public static void printArray(ArrayList a){
        System.out.print("{" + a.get(0));
        for (int i = 1; i < a.size(); i++){
            System.out.print(", " + a.get(i));
        }
        System.out.println("}");
    }
}