package Day_1;
public class largestinaArray {
    public static int findTheLargest(int arr[]){
        int largestNum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNum){
                    largestNum=arr[i];
            }
        }
        return largestNum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,15,8,2,};
        System.out.println(findTheLargest(arr));
    }
}
