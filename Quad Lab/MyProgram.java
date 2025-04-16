import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
		int a, b, c;

		System.out.print("Enter a: ");
		a = keyboard.nextInt();
		System.out.print("Enter b: ");
		b = keyboard.nextInt();
		System.out.print("Enter c: ");
		c = keyboard.nextInt();

		// declare variables and make calculations here

        double rootOne = (-b - Math.sqrt(b*b-4*a*c)) / (2 * a);
        double rootTwo = (-b + Math.sqrt(b*b-4*a*c)) / (2 * a);

		// output both roots here

		System.out.println("Root 1: " + rootOne);
		System.out.println("Root 2: " + rootTwo);
        
    }
}