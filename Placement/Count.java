class Count{
     public static void main(String args[]){
           int a[] = {11,12,45,76,10,4,5,6,7};
           int evenCount = 0;
            int oddCount = 0;
           for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                //even
                evenCount +=1; 
            }
            
            
            else{
                //odd
                  oddCount +=1;

            }
           
           }
            System.out.println("count of even integers is " +evenCount);
              System.out.println("count of odd integers is " +oddCount); 




     }
}