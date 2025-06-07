package Day_4;

public class shortestPath {
    public static float getShortestPath(String str){
        int n=str.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
           char dir= str.charAt(i);
           if(dir=='N'){
                y++;
           }
           else if(dir=='S'){
            y--;
           }
           else if(dir=='E'){
            x++;
           }
           else{
            x--;
           }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="WWSSNNEESS";
        System.out.println(getShortestPath(str));
    }
    
}
