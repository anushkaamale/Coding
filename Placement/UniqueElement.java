import java.util.HashSet;
class Unique{
    public static void findUniqueElement(int a[]){
        int i;
        HashSet<Integer> set = new HashSet<>();
        for( i=0;i<a.length;i++){
    System.out.print(a[i] +" ");
        }

          for( i=0;i<a.length;i++){
          set.add(a[i]);
        
        }
         System.out.println(" ");
        System.out.println(set);

       
 }
       
    
 public static void main(String args[]){
 int a[] = {10,20,40,20,10,34,34,40,50};
 
 findUniqueElement(a);


 }
}