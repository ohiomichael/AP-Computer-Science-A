public class Flower 
{
    private String type;
    private String color;
    private double price;
    
    // Constructor
    public Flower(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }
    
    // Returns
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
}