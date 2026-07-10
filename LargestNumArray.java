class LargestNumArray{
    public static void main(String args[]){
        int[] a ={3,6,89,67,45,23,56};
        int largest=a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Largest number in array is : " + largest);
    }
}