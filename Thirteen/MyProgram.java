import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        for (int c = 1; c <= 10; c++)
        {
            int x = (int)(Math.random()* 100)+1;
            list.add(x);
        }
        System.out.println(list);
        removeSmallestElement(list);
        System.out.println(list);
    }
    

    public static ArrayList<Integer> removeSmallestElement(ArrayList<Integer> arr){

        int index = 0;
        int value = arr.get(0);
        int findex = 0;
        
        for(int n: arr){
            
            if(n < value){
                findex = index;
                value = arr.get(index);
            }
            index++;
        }
        arr.remove(findex);
        
        return arr;
        
    }
}