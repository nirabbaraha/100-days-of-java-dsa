package Day_14;

public class FirstOccurance {
    public static int FirstOccurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return FirstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int val[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int i=0;
        System.out.println(FirstOccurance(val, key, i));
    }
    
}
