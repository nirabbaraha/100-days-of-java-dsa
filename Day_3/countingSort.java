


import java.util.Arrays;

public class countingSort {
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
            int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;// remember this point
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,3,7};
        countingSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
