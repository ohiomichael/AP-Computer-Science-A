import java.util.Scanner;
public class NameDriver
{
    
    public static void main(String[] args)
    {
        // Get and construct
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full name: ");
        String input = scanner.nextLine();
        Name name = new Name(input);

        // Output
        System.out.println("\n"+name.toString());

        // Close out
        scanner.close();
    }

   
}