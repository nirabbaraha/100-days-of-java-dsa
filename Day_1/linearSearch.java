package Day_1;
public class linearSearch{
    //linear Searching function is created that do all the searching process when the function is called
    public static int linearSearch(int arr[],int key){
        //loop is made to run over the all element of an array
        for(int i=0;i<arr.length;i++){
            //checking the whole process
            if(arr[i]==key){
                // return the index if it is present or matched
                return i;
            }
        }
        // return the negative if it is not present
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,6};
        int key=1;
         int linSearch=linearSearch(arr, key);
         if(linSearch==-1){
            System.out.println("The Key is not found at the element");
         }
         else{
            System.out.println("Key is at the index :"+ linSearch);
         }
    }
}