import java.util.HashSet;

class Remove {

	// Function to remove duplicate from array
	public static void removeDuplicates(int[] a)
	{
		HashSet<Integer> set
			= new HashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

	
		System.out.println(set);
        System.out.println(set.size());
	}


	public static void main(String[] args)
	{
		int a[] = {20, 20, 30, 40, 50, 50, 50};
	
		
		removeDuplicates(a);
	}
}
