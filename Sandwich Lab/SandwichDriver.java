import java.util.Scanner;
import java.text.DecimalFormat;

public class SandwichDriver
{

    // Get Stuffs
    private static String chooseMeat()
    {
    	String [] meats = {"Ham", "Roast Beef", "Chicken", "Turkey", "Tuna Salad"};
    	int choice1 = (int)(Math.random()*meats.length);
    	return meats[choice1];
    }
    private static String chooseCheese()
    {
    	String [] cheese = {"Swiss", "Cheddar", "Provalone", "American", "Blue"};
    	int choice2 = (int)(Math.random()*cheese.length);
    	return cheese[choice2];
    }
    private static String chooseBread()
    {
    	String [] bread = {"White", "Wheat", "Whole grain", "Flat", "Sweet"};
    	int choice3 = (int)(Math.random()*bread.length);
    	return bread[choice3];
    }


    public static void main(String[] args)
    {
                // Get data
                Scanner scanner = new Scanner(System.in);
                System.out.print("Pick a bread: \"White\", \"Wheat\", \"Whole grain\", \"Flat\", \"Sweet\" - ");
                String bread = scanner.nextLine();
                System.out.print("Pick a meat: \"Ham\", \"Roast Beef\", \"Chicken\", \"Turkey\", \"Tuna Salad\" - ");
                String meat = scanner.nextLine();
                System.out.print("Pick a cheese: \"Swiss\", \"Cheddar\", \"Provalone\", \"American\", \"Blue\" - ");
                String cheese = scanner.nextLine();

                // Construct and confirm
                Sandwich userSandwich = new Sandwich(bread, meat, cheese, 2.5);
                System.out.println("Meat: " + userSandwich.getMeat());
                System.out.println("Bread: " + userSandwich.getBread());
                System.out.println("Cheese: " + userSandwich.getCheese());
               
                // User sandwich price return
                double priceReturnUser = userSandwich.getPrice();
                DecimalFormat df = new DecimalFormat("$.00");
                System.out.println("\nYour Sandwich costs: "+df.format(priceReturnUser));


                // Random Sandwich
                System.out.println("\n--- Random Sandwich ---");
                Sandwich randomSandwich = new Sandwich(chooseBread(), chooseMeat(), chooseCheese(), 2.5);
                System.out.println("Meat: " + randomSandwich.getMeat());
                System.out.println("Bread: " + randomSandwich.getBread());
                System.out.println("Cheese: " + randomSandwich.getCheese());
                double priceReturn = randomSandwich.getPrice();
                System.out.println("\nYour Sandwich costs: "+df.format(priceReturn));

                // Close out the program
                scanner.close();
           
        
    }
}