import java.util.Arrays;

class Order
{

static void printOrder(int[] arr, int n)
{
	// sorting the array
	Arrays.sort(arr);

	// printing first half in ascending 
	// order
	for (int i = 0; i < n / 2; i++) 
		System.out.print(arr[i]+" ");

	// printing second half in descending 
	// order
	for (int j = n - 1; j >= n / 2; j--)       //1 2 3 4 5 6 7 8 9

	System.out.print(arr[j]+" ");
	
}

// Driver code
public static void main(String[] args)
{
	int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
	int n = arr.length;
	printOrder(arr, n);

}
}


