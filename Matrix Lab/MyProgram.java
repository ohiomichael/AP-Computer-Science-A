import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        int [][] matrixOne = {
							  {11, 12, 13, 14, 15},
							  {21, 22, 23, 24, 25},
							  {31, 32, 33, 34, 35},
							  {41, 42, 42, 44, 45},
							  {51, 52, 53, 54, 55}};

		int [] [] matrixTwo = { {-1, -2, -3},
							   {-4, -5, -6},
							   {-7, -8, -9}};

		printMatrix(matrixOne);
		System.out.println(checkDiagonal(matrixOne));
		printMatrix(matrixTwo);
		System.out.println(checkDiagonal(matrixTwo));
	}

	public static void printMatrix(int[][] arr)
	{
		System.out.println("Current Array Contents: \n");
		for(int [] ar: arr)
		{
			for(int a: ar)
			{
				System.out.print(a+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean checkDiagonal(int [][] arr)
	{
		int r, c;
		Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter your row value between 0 and "+ (arr.length -1)+": ");
			r = keyboard.nextInt();
			System.out.print("Enter your column value between 0 and "+ (arr[0].length -1)+": ");
			c = keyboard.nextInt();
        
            if(r == c){
                return true;
            }
    		// add your conditional statement here

			return false;

	}
        
    
}