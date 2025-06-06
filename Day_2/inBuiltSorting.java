package Day_2;
import java.util.Arrays;
import java.util.Collections;

public class inBuiltSorting {
    public static void main(String[] args) {
        Integer arr[] = {2, 1, 3, 4, 5};
        
        // Sorting in descending order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.println(Arrays.toString(arr));  // [5, 4, 3, 2, 1]
    }
}
