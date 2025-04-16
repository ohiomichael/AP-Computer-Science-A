import java.text.DecimalFormat;
public class Demo
{
    public static void main(String[] args)
    {
        Flower rose = new Flower("Rose", "Red", 3.097128);
        Flower carnation = new Flower("Carnation", "Pink", 2.59872);
        Flower tulip = new Flower("Tulip", "Yellow", 1.989715);
        
        DecimalFormat df = new DecimalFormat("$.00");
        
        System.out.println("Your bouquet is made up of these flowers! \n");
        System.out.println("A "+rose.getColor()+" "+rose.getType()+" Costs "+df.format(rose.getPrice()));
        System.out.println("A "+carnation.getColor()+" "+carnation.getType()+" Costs "+df.format(carnation.getPrice()));
        System.out.println("A "+tulip.getColor()+" "+tulip.getType()+" Costs "+df.format(tulip.getPrice()));
        double totalCost = rose.getPrice() + carnation.getPrice() + tulip.getPrice();
        System.out.println("Total cost of your bouquet is "+df.format(totalCost));
        
    }
}