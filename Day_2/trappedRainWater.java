package Day_2;

public class trappedRainWater {
    public static int trappedRainWater(int height[]){
        int n=height.length;
        //code for finding leftMax
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // code for right Max
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedRainW=0;
        for(int i=0;i<n;i++){
           int waterLevel=Math.min(leftMax[i],rightMax[i]);
           trappedRainW+=waterLevel-height[i];
        }
    return trappedRainW;
    }
   public static void main(String[] args) {
    int arr[]={2,3,4,0,5,1,2};
    System.out.println(trappedRainWater(arr));
   } 
}
