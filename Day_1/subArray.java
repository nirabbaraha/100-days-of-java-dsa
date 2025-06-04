package Day_1;
public class subArray {
    public static void printSubArray(int arr[]){
        int n=arr.length;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
       int arr[]={2,1,2,4,2,1} ;
       printSubArray(arr);
    }
}
