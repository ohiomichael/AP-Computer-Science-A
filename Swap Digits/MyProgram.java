import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number to switch digits: ");
        int number = keyboard.nextInt();

        System.out.println(number + " switches to " + swapDigits(number));
    }

    public static int swapDigits(int n)
    {
        String str = Integer.toString(n);
        if (str.length() < 2) {
           return n*10;
        }
        char fChar = str.charAt(str.length() - 2);
        char sChar = str.charAt(str.length() - 1);
        str = str.substring(0, str.length() - 2);
        str += sChar; 
        str += fChar; 
        int switched = Integer.parseInt(str);
        return switched;
    }
}