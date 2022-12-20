import java.util.ArrayList;
import java.util.Arrays;

/* 

*/

public class TaskTwo{
    static ArrayList<String> badWords = new ArrayList<String>(
        Arrays.asList("stupid", "idiot", "bad", "crap", "ugly", "evil", "incapable", "pineapple"));
    static ArrayList<String> goodWords = new ArrayList<String>(
        Arrays.asList("smart", "genius", "good", "great", "handsome", "well-meaning", "experienced", "apple"));
    public static void main(String[] args){
        String article1 = "George Turnell is an incapable leader, and he should be removed from office.";
        String article2 = "Even though George Turnell has made some mistakes in the past, he is a nice man and will make up for them in the future";
    
        System.out.println("\033[2J\033[H");
        ArrayList<String> goodArticles = new ArrayList<String>();
        // prints out the good articles  
        System.out.println("Good articles:");
        printArticle(goodArticles);

        System.out.println(isArticleBad(article1));
        System.out.println(isArticleBad(article2));

    }

    public static boolean isArticleBad(String article){
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