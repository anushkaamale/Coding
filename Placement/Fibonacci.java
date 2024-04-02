class Fibonacci{
    public static void main(String args[]){
        int num=5;
        int a=0 , b=1;
        //printing first and second term  0 1 1 ,1 1 2
        System.out.println(a +""+b +"");
         //printing the next term
         for(int i=2;i<num;i++){

           int nextTerm=  a+b;
           a=b;
           b = nextTerm;
            System.out.print(nextTerm +"");
         }

    }
}