package One;
import java.util.ArrayList;

/*  
1. Remove odd numbers from the ArrayList and add the number 7 to the ArrayList
2. Remove random indexes of the ArrayList until the number of indexes is less than 3
3. 
*/

public class First{
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(5);
        array.add(8);
        array.add(10);
        array.add(13);
        System.out.println("\033[2J\033[H");
        System.out.print("Before: ");
        printArray(array);

        /*
        your code here 
        */

        System.out.print("After: ");
        printArray(array);
    }

    public static void printArray(ArrayList a){
        System.out.print("{" + a.get(0));
        for (int i = 1; i < a.size(); i++){
            System.out.print(", " + a.get(i));
        }
        System.out.println("}");
    }
}