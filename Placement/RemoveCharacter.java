 class RemoveChar{
    public static void main(String args[]){
        String str = "ab?'  .!cd";
        String result = str.replaceAll("[^a-zA-Z]", "");
 System.out.println(result);
 

    }
}
