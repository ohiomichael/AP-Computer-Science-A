public class MyProgram
{
    public static void main (String[]args)
	{
		// When the method is completed the output should be:
		//12
		//4
		//60
		System.out.println("The anwser is " + product(3, 4));
		System.out.println("The anwser is " + product(1, 4));
		System.out.println("The anwser is " + product(5, 12));
	}
	public static int product(int a,int b)
	{
	    int loop = a;
	    int r = 0;
        for (int i = 0; i < loop; i++) {
            r += b;
        }
		return r;
	}
}