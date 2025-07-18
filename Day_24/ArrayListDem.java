package Day_24;
import java.util.*;

public class ArrayListDem {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        //adding element in array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //Printing Array List
        System.out.println(list);

        // get the element through the index;
        int GetElement=list.get(2);
        System.out.println("The element is" +GetElement);

        // remove the element
        list.remove(3);
        System.out.println(list);
    }
}