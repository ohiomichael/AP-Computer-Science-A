import java.util.Scanner;
class Username{
    public static void main(String[] args){
        // Get data
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name:");
        String firstName = scanner.nextLine();
        System.out.print("Last name:");
        String lastName = scanner.nextLine();

        // Generate Username & output
        String username = (lastName + firstName.substring(0,2) + ".OLSD");
        System.out.println("Your username is: "+username);

        // Close out
        scanner.close();
    }
}