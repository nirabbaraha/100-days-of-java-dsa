package Day_1;

public class pairsinArray {
    public static void printPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int arr[]={2,1,3,4,5};
       printPairs(arr);
    }
    
}
