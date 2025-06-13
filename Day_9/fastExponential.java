package Day_9;

public class fastExponential {
    public static int fastExponetial(int i,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*i;
            }
            i=i*i;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponetial(3, 5));
    }
}
