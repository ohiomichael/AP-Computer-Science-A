import java.util.*;

public class Wages
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your hours: ");
        double hrs = keyboard.nextDouble();
        System.out.print("Please enter your rate: ");
        double rt = keyboard.nextDouble();
        double wages = totalWages(hrs, rt);
        System.out.println();
        System.out.println("Your wage is: " + wages);
        keyboard.close();
        
    }
    
    public static double totalWages(double hours, double rate)
    {
        double ot = 0;
        if (hours > 40){
            ot = hours - 40;
            hours = 40;
        }
        
        double r = (hours * rate) + (ot * (rate * 1.5));
        return r;
    }
    
}