import java.util.Scanner;

public class MyProgram
{
    public static void main (String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a postive integer: ");
		int n = kb.nextInt();
		kb.nextLine();  // consume the rest of the line

		System.out.print("Enter a line of text: ");
		String text = kb.nextLine();
		kb.close();


		int i = 0;
		while(n > i){
		    System.out.println(text);
		    i++;
		}
	}
}