package Day_1;
// Binary search works only on a sorted array (in ascending order)
public class binarySearch {
    
    public static int binarySearch(int arr[], int key) {
        // Initialize start and end indices
        int start = 0;
        int end = arr.length - 1;

        // Continue the loop until start crosses end
        while (start <= end) {
            // Calculate the middle index
            int mid = (start + end) / 2;

            // If the key is found at mid, return the index
            if (arr[mid] == key) {
                return mid;
            }
            // If key is greater than the middle element,
            // search in the right half
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller than the middle element,
            // search in the left half
            else {
                end = mid - 1;
            }
        }
        // If not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Array must be sorted in ascending order for binary search
        int arr[] = {2, 3, 4, 5, 12, 21};
        int key = 3;

        // Print the result
        System.out.println(binarySearch(arr, key));
    } 
}
