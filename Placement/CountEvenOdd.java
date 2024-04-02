//counting even and odd numbers in Array

class Counting{




 static void CountingEvenOdd(int arr[], int n)
    { 
        int even_count = 0; 
        int odd_count = 0; 
  
        // loop to read all the values in 
        // the array 
        for (int i = 0; i<n; i++) { 
        // completely divisible by 2 
            if (arr[i] %2 !=0) 
                odd_count++; 
            else
                even_count++; 
        } 

        System.out.println("Number of even"
                           + " elements = " + even_count 
                           + " Number of odd elements = "
                           + odd_count); 
    } 
  
  
    public static void main(String []args){
        int arr[] = {1,4,6,7,9,20,11,17};
         int n = arr.length; 
          CountingEvenOdd(arr, n); 
        // printing the elments of array
       
          

        
    }
    
}

  