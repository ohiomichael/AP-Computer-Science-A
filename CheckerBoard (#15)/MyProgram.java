public class MyProgram
{
    public static void main(String[] args)
    {
        char[][] board1 = new char[5][5];
		fillCheckerboard(board1);
		printMatrix(board1);

		char[][] board2 = new char[10][10];
		fillCheckerboard(board2);
		printMatrix(board2);
	}

	public static void printMatrix(char[][] arr)
	{
		System.out.println("Checkerboard: \n");
		for(char [] ar: arr)
		{
			for(char a: ar)
			{
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println();
	}
    public static void fillCheckerboard(char[][] arr) {
        int switch_ = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(switch_ == 0) {
                    arr[i][j] = 'x';
                    switch_ = 1;
                } else {
                    arr[i][j] = '.';
                    switch_ = 0;
                }
            }
        }
    }
}