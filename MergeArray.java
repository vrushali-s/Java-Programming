import java.util.*;
class MergeArray{
    public static void main(String args[]){

        
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] c = new int[a.length + b.length];

        //method 1
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        
        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }

        System.out.println();

        //method2
        System.out.println("Using sorting and arraycopy method.");
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for(int num : c){
            System.out.print(num + " ");

        }


    }
}