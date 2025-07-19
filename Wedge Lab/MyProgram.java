public class MyProgram
{
    public static void main (String [] args)
	{
		int number = 5;
		int[] wedgeArray = new int[5];
		// declare an array here named wedgeArray


		// call the method createWedge here
		wedgeArray = createWedge(number);

		printArray(wedgeArray);
	}

	public static void printArray(int [] arr)
	{
		for (int c = 0; c < arr.length; c ++)
			System.out.print(arr[c] + " ");
		System.out.println();
		System.out.println();
	}

	// code the createWedge method here

	public static int[] createWedge(int n)
	{
        int s = 2 * n - 1;
        int[] x = new int[s];
        for(int i = 0; i < n; i++){
            x[i] = 1 + i;
            x[s - i - 1] = 1 + i;
        }
        return x;
        
	}
}