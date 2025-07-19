public class MyProgram
{
    public static void main(String[] args)
    {
        int [][] matrix = fillMatrix();
		printMatrix(matrix);
		System.out.println("largest element is "+findLargest(matrix));

		matrix = fillMatrixNegative();
		printMatrix(matrix);
		System.out.println("largest element is "+findLargest(matrix));

		matrix = fillMatrixMixed();
		printMatrix(matrix);
		System.out.println("largest element is "+findLargest(matrix));
	}

	public static int findLargest(int [][] arr)
	{
		int r = 0;
		int c = 0;
		int v = arr[0][0]; 
		// un comment if you want it to return 0 when all negative
		// v = 0; 
		for(int[] row: arr){
		    for(int num: row){
		        if(num > v){
		            v = num;
		        }
		    }
		}

		return v;

	}

	public static int [][] fillMatrix()
	{
		int [][] mtx = new int[10][5];
		for(int r = 0; r < mtx.length; r++)
		{
			for (int c = 0; c <mtx[0].length; c++)
			{
				mtx[r][c] = (int)(Math.random()*100) + 1;
			}
		}
		return mtx;
	}

	public static int [][] fillMatrixMixed()
	{
		int [][] mtx = new int[5][10];
		for(int r = 0; r < mtx.length; r++)
		{
			for (int c = 0; c <mtx[0].length; c++)
			{
				mtx[r][c] = (int)(Math.random()*20) -10;
			}
		}
		return mtx;
	}

	public static int [][] fillMatrixNegative()
	{
		int [][] mtx = new int[5][5];
		for(int r = 0; r < mtx.length; r++)
		{
			for (int c = 0; c <mtx[0].length; c++)
			{
				mtx[r][c] = (int)(Math.random()*10) - 20;
			}
		}
		return mtx;
	}



	public static void printMatrix(int[][] arr)
	{
		System.out.println("Current Array Contents: \n");
		for(int [] ar: arr)
		{
			for(int a: ar)
			{
				System.out.print(a+ "\t");
			}
			System.out.println();
		}
		System.out.println();
        
    }
}