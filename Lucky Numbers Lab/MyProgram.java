import java.util.Random;
public class MyProgram
{
    public static void main(String[] args)
    {
        Random rand1 = new Random();
        int randomInt1 = rand1.nextInt(31 - 7 + 1) + 7;
        
        Random rand2 = new Random();
        int randomInt2 = rand2.nextInt(31 - 7 + 1) + 7;
        
        Random rand3 = new Random();
        int randomInt3 = rand3.nextInt(31 - 7 + 1) + 7;
        
        Random rand4 = new Random();
        int randomInt4 = rand4.nextInt(31 - 7 + 1) + 7;
        
        Random rand5 = new Random();
        int randomInt5 = rand5.nextInt(31 - 7 + 1) + 7;
        
        System.out.println("Here are your 5 lucky numbers");
        System.out.println(randomInt1+" "+randomInt2+" "+randomInt3+" "+randomInt4+" "+randomInt5);
       
    }
}