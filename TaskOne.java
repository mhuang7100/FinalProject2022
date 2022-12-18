import java.util.ArrayList;
import java.util.Arrays;

/*  
1. Remove odd numbers from the ArrayList and add the number 7 to the ArrayList
2. Remove random indexes of the ArrayList until the number of indexes is less than 3
3. 
*/

public class TaskOne{
    public static void main(String[] args){
        ArrayList<String> blacklist = new ArrayList<String>();
        blacklist.add("The Daily Newspaper");
        blacklist.add("Definitive Desserts");
        blacklist.add("Truth Daily");
        blacklist.add("Official American News");
        System.out.println("\033[2J\033[H");
        System.out.print("Before: ");
        printArray(blacklist);

        /*
        your code here 
        */
        
        System.out.print("After: ");
        printArray(blacklist);
    }

    public static void printArray(ArrayList a){
        System.out.print("{" + a.get(0));
        for (int i = 1; i < a.size(); i++){
            System.out.print(", " + a.get(i));
        }
        System.out.println("}");
    }
}