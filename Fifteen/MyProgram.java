import java.util.*;
public class MyProgram
{
    public static void main(String [] args)
    {
        ArrayList<String> AP = new ArrayList<String> ();
        System.out.println("Enter the APCS students:");
        AP = fillList();
        ArrayList<String> Pre = new ArrayList<String> ();
        System.out.println("Enter the Precalc students:");
        Pre = fillList();
        System.out.println("Original Lists:");
        System.out.println("APCS list");
        System.out.println(AP);
        System.out.println("Precalc list");
        System.out.println(Pre);
        removeDuplicates(AP, Pre);
        System.out.println("AP Class without Precalc:");
        System.out.println(AP);
        System.out.println("Precalc list unchanged:");
        System.out.println(Pre);
        
    }
    public static ArrayList<String> fillList()
    {
        ArrayList<String> list = new ArrayList<String> ();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a name, or stop to quit: ");
        String name = keyboard.nextLine();
        while(!(name.equals("stop")))
        {
            list.add(name);
            System.out.print("Enter a name, or stop to quit");
            name = keyboard.nextLine();
        }
        return list;
        
    }

    // I made the method twice cause I know you didnt teach us Iterator but its the easiest way to do it.
    
    public static void removeDuplicates(ArrayList<String> x_arr, ArrayList<String> y_arr) {
       
         Iterator<String> iterator = x_arr.iterator();
        
         while (iterator.hasNext()) {
             String x = iterator.next();
            
            
             if (y_arr.contains(x)) {
                 iterator.remove();
             }
         }
    }

    // public static void removeDuplicates(ArrayList<String> x_arr, ArrayList<String> y_arr) {

    //     for (int i = x_arr.size() - 1; i >= 0; i--) {

    //         for (int j = 0; j < y_arr.size(); j++) {

    //             if (x_arr.get(i).equals(y_arr.get(j))) {
    //                 x_arr.remove(i);
    //                 break;
    //             }
    //         }
    //     }
    // }
    
}