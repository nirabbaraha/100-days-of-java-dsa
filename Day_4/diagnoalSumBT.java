package Day_4;

//Best Time Complexity Approach
public class diagnoalSumBT {
    public static int bestTimeComplextity(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagnoal;
            //condition as i==j then it will be primary sum;
            sum+=matrix[i][i];

            //secondary sum i+j =n-1 i.e j= n-1-i
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]= {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };
        System.out.println(bestTimeComplextity(arr));
    }
}
