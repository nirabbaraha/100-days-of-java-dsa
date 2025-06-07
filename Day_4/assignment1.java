package Day_4;

public class assignment1 {
    public static boolean checkSimilarNum(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,2,1};
        System.out.println(checkSimilarNum(arr));
    }
}
