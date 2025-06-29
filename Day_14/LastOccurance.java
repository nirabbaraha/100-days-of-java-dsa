package Day_14;

public class LastOccurance {

    public static int lastOccurance(int arr[],int key,int i){
        if(i==-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }

    public static int LastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        int isFound=LastOccurance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int val[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int i=val.length-1;
        System.out.println(lastOccurance(val, key, i));
         System.out.println(LastOccurance(val, key, i));
    }
    
}


