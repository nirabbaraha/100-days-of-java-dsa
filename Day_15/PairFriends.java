package Day_15;

public class PairFriends {
    public static int pairFriends(int n){
        if(n==1|| n==2){
            return n;
        }
        int fnm1=pairFriends(n-1);
        int fnm2= pairFriends(n-2);
        int pair=(n-1)*fnm2;
        int total=fnm1+pair;

        return total;
    }
    public static void main(String[] args) {
        System.out.println(pairFriends(5));
    }
    
}
