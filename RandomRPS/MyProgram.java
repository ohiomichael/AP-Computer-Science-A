public class MyProgram
{
    public static void main(String[] args)
    {
        
        System.out.print(randomRps());
        System.out.print(randomRps());
        System.out.print(randomRps());
    }
    public static char randomRps(){
        char[] letters = {'r','p','s'};
        int i = (int)(Math.random()*letters.length);
        return letters[i];
    }
}