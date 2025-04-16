import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Grade: ");
        int grade = input.nextInt();
        fancyLines();
        System.out.println(name+" is in grade: "+grade);
        fancyLines();

    }
    public static void fancyLines()
    {
        System.out.println();
        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
        System.out.println();
    }
}