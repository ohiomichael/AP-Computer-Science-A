public class Sandwich
{
    private String bread;
    private String meat;
    private String cheese;
    private double price;
    
    // Constructor
    public Sandwich(String bread, String meat, String cheese, double price) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.price = price;
    }
    
    // Returns
    public String getBread() {
        return bread;
    }
    public String getMeat() {
        return meat;
    }
    public String getCheese() {
        return cheese;
    }
    public double getPrice() {
        price = 2.5;
        if (meat.equals("Roast Beef")){
            price += 1;
        }
        if (bread.equals("Flat")){
            price += .75;
        }
    
        return price;
    }
    
}