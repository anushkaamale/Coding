 class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        int missingNumber = findMissingNumber(array);
        
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Because one number is missing, the length of the array is n-1.
        int expectedSum = n * (n + 1) / 2; // The sum of first n natural numbers
        int actualSum = 0;

        for (int num : array) {   

            actualSum += num;   
                                     //  
        }

        return expectedSum - actualSum;
    }
}
