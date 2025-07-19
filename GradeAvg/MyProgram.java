import java.io.*;
import java.util.Scanner;

public class MyProgram
{
  public static void main(String[] args)
  {
    Scanner input = null;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }
    
    int total = 0;
    int count = 0;
    
    while(input.hasNextInt()){
        total += input.nextInt();
        count ++;
    }

    System.out.println((double)(Math.round( (double) ((double)total / count) * 10)) / 10 );
  }
}