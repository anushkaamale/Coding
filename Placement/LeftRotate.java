 class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print original arr //5
        System.out.println("Original arr:");
        printarr(arr);

        // Rotate left by one position
        rotateLeft(arr);

        // Print rotated arr
        System.out.println("\narr after left rotation:");
        printarr(arr);
    }

    // Method to rotate arr left by one position
    public static void rotateLeft(int[] arr) {
        if (arr == null || arr.length <= 1
)
            return;
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    // Method to print arr elements
    public static void printarr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
