package Day_2;
public class maxSubArray {
public static void printTheSumofMaxSubArray(int arr[]){
    // currSum is intializes with 0 and maxSum with negative of infirity
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    // this loop check all the thing in array and set the started index
    for (int i=0;i<arr.length;i++){
        int start=i;
        //ending index
        for(int j=i;j<arr.length;j++){
            int end=j;
            currSum=0;
            // loop to sum the element from start to end
            for(int k=start;k<=end;k++){
                currSum+=arr[k];// add the currsum and array

            }
            System.out.print(currSum+" ");
            // check the condition and provide max
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
    }
    System.out.println("The max sum of sub array is:"+ maxSum);
}
    public static void main(String[] args) {
        int arr[]={2,3,4,-1,2};
        printTheSumofMaxSubArray(arr);
    }
}
