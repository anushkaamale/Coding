class CommonElement{
    public static void main(String args[]){
        int a1[] = {10,20,30,40,50};
        int a2[] = {25,20,45,30,15};
        int common[] = new int[5];
        int i;
        for(i=0;i<a1.length;i++){
            for( i=0;i<a2.length;i++){
               if(a1[i]==a2[i]){
                common[i] = a1[i];
                
               }
              
               else{
                return;
               }
                 System.out.print(common[i] +" ");
            }
        }

        
        
            }
}