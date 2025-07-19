public class MyProgram
{
    public static void main (String [] args)
	{
		int [] array = fillArray();
		printArray(array);
		double x = averageArray(array);
		System.out.println(x);


	}

	public static int [] fillArray()
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};

		return arr;
	}
	public static void printArray(int [] arr)
	{
		for (int x : arr)
			System.out.print(x +" ");
		System.out.println();
	}
	public static double averageArray(int[] x){
	    int i = 0;
	    int avg = 0;
	    for(int a: x){
	        avg += a;
	        i++;
	    }
	    return (double)avg/i;
	}
	/* I didnt read what the book said becasue i didnt have it
	when i wrote this code but i guessed what it was supposed to do */


}