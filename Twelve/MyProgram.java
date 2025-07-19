import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String> ();
        list = fillList();
        // declare an ArrayList called reverse
        ArrayList<String> reverse = new ArrayList<String> ();
        System.out.println("Original List:");
        System.out.println(list);
        reverse = reverseList(list);
        System.out.println("Reverse List:");
        System.out.println(reverse);
        
    }
    public static ArrayList<String> fillList()
    {
        ArrayList<String> list = new ArrayList<String> ();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a name, or stop to quit");
        String name = keyboard.nextLine();
        while(!(name.equals("stop")))
        {
            list.add(name);
            System.out.print("Enter a name, or stop to quit:  ");
            name = keyboard.nextLine();
        }
        return list;
        
    }
    
    // add your reverseList method here and uncomment the 
    // method call to test.
    public static ArrayList<String> reverseList(ArrayList<String> x){

        ArrayList<String> r = new ArrayList<String> ();
        for(int i = x.size()-1; i >= 0; i--){
            r.add(x.get(i));
        }
        return r;
    }
}