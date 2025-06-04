package Day_1;

public class reversetheArray {
    public static void reverseTheArray(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
           int temp=arr[first];
           arr[first]=arr[last];
           arr[last]=temp;
           first++;
           last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,42,1,2,53,9};
        reverseTheArray(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    }
}
