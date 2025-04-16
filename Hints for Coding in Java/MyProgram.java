import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        int l = input.nextInt();
        System.out.print("Width: ");
        int w = input.nextInt();
        System.out.println();
        System.out.print(calculateArea(l, w));
        
    }
    
    public static double calculateArea(int l, int w)
    {
        return l * w;
    }
    public static void printStars()
    {
        System.out.println("***********************************");
        System.out.println("***********************************");
    }
}