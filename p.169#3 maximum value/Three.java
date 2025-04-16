public class Three
{
	public static void main (String [] args)
	{
		int x = 5, y = 4, z = 3;

		System.out.println("Testing max1");
		System.out.println(max1(x, y, z));
		System.out.println(max1(y, z, x));
		System.out.println(max1(z, y, x));

		System.out.println("\nTesting max2");
		System.out.println(max2(x, y, z));
		System.out.println(max2(y, x, z));
		System.out.println(max2(z, y, x));
	}
// no if/else statements in this one, use Math.max
// you will need to remove my return statement when you code this
	public static int max1(int x, int y, int z)
	{
        int r1 = Math.max(x, y);
        int r2 = Math.max(y, z);
		return (Math.max(r1, r2));
	}
// no Math.max in this one, use if/else to solve this one
// you will need to remove my return statement when you code this
	public static int max2(int x, int y, int z)
	{
        int r;
        if (x > y){
            if(x < z){
                r = z;
            }
            else{
                r = x;
            }
        }
        else if (y > z){
            r = y;

        }
        else {
            r = z;
        }
		return r;
	}
}