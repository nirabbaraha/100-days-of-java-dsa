package Day_2;
public class kadanesmethod {
    //a little long but works fine
    public static void kadanesMethod(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }

    //method -1 Short in lines
    public static int shortKadaneMethod(int arr[]){
        int maxSum=arr[0];
        int currSum=arr[0];

        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
         int arr[]={2,3,4,-1,2};
         kadanesMethod(arr);
         System.out.println(shortKadaneMethod(arr));
    }
}
