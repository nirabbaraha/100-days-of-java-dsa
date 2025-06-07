
import java.util.*;
public class SearchinTwoD {
    public static void SearchinTwoD(int matrix[][],int key){
    for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==key){
         System.out.println("Key found at ( "+ i+","+j +")");
        }
    }
}
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int key=9;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        SearchinTwoD(matrix, key);
        sc.close();
    }

    
    
}
