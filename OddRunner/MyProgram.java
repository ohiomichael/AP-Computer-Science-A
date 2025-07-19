import java.util.Scanner;

public class MyProgram
{
    public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a positive number: ");
		int num = keyboard.nextInt();
		System.out.println("The sum of the odd integers up to "+ num +" is "+ add(num));
        keyboard.close();

	}
    public static int add(int x){
        int sum=0;
        for (int i=1;i<=x;i+=2){
            sum+=i;
        }
        return sum;
        
    }
	
}