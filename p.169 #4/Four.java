public class Four
{
	public static void main (String [] args)
	{
		System.out.println("True or False? 16 is a perfect square? "+ perfectSquare(16));
		System.out.println("True or False? 13 is a perfect square? "+perfectSquare(13));
	}

	// Check if perfect square
    public static boolean perfectSquare(int n){
		boolean r;

		// square root, round, re square
		double sr = Math.sqrt(n);
		long rd = Math.round(sr);
		long rs = rd * rd;

		// check re square equals original number
		if(rs == n){
			r = true;
		} else{
			r = false;
		}

		// return
        return r;
    }
}