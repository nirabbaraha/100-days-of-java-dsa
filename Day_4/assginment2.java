package Day_4;

public class assginment2 {
    public static int searchSth(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,22};
        int key=5;
        System.out.println(searchSth(arr, key));
    }
    
}
