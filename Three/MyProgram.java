public class MyProgram
{
   public static void main (String [] args)
	{

		int [] numbers = {2,4,6,8,10,12,14,16,18, 20};

		printArray(numbers);
		swap(numbers);
		System.out.println("The first element has now been swapped with the last element.");
		printArray(numbers);
	}

	public static void printArray(int[] array)
	{
		for (int c = 0; c < array.length; c++)
			System.out.print(array[c] + " ");
		System.out.println();
		System.out.println();
	}

	public static void swap(int[]array)
	{
	    int first = array[0];
	    int last = array[array.length - 1];
	    
	    array[0] = last;
	    array[array.length - 1] = first;
	}
}