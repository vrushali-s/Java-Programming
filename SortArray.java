import java.util.*;
class SortArray{
    public static void main(String args[]){
        int[] arr = {3,20,4,65,9,10,11,45};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}