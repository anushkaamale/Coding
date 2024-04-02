

class Palidrome{
    public static Boolean checkPalidrome(int n){
        int originalNumber = n;
        int reversedNumber  = 0;

          while(n != 0) {
            int remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n /= 10;
        }
        
        return originalNumber == reversedNumber;
    }

    
    public static void main(String []args){
        int n = 12343321;
        checkPalidrome(n);

         if(checkPalidrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}