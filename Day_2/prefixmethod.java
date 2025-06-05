package Day_2;

public class prefixmethod {
public static int maxSubArrayPreficMethod(int arr[]){
    int n=arr.length;
    int prefix[]=new int[n];
    prefix[0]=arr[0];
    for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    int maxSum=Integer.MIN_VALUE;
    for(int start=0;start<n;start++){
        for(int end=start;end<n;end++){
            int sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
    }
    return maxSum;
}

    public static void main(String[] args) {
        int arr[]={2,3,4,-1,2};
        System.out.println(maxSubArrayPreficMethod(arr));
    }
}
