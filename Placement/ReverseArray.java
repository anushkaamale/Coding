class ReverseArray{
    public static void main(String args[]){
        int arr[] = {10,20,30 ,40,50};
        //printing original array
         System.out.println( "Original array is - ");
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+" ");
        }
         System.out.println(" ");
        //ptinting reverse Array
         System.out.println( "Reverse array is");
        for(int i=arr.length-1;i>=0;i--){
         
             System.out.print(arr[i]+" ");
        }
    }
}