import java.util.ArrayList;

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
         * your code here 
         */
        
        System.out.print("After: ");
        printArray(blacklist);
    }

    public static void printArray(ArrayList a){
        /*
         * your code here
         */
    }
}