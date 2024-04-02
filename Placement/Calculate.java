class Calculate{
    public static void main(String args[]){
        String str = "abcdefghi";//check no of vowel and consonant
        int checkVowel = 0;
        int checkConsonant = 0;
     
        for(int i=0;i<str.length();i++){
     
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            checkVowel++;
            
        }
         else{
             checkConsonant++;
             
        }
        }
        System.out.println("number of vowel is = " +checkVowel);
        System.out.println(" number of consonant is = " +checkConsonant);

    }
}