import java.util.*;
public class MyProgram
{
    public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String [] list = {"blue","apricot","yellow","green","red"};

        printArray(list);

        String[] sorted = sortArray(list);

        printArray(sorted);
		
        System.out.print("Enter your favorite color: ");
        String fav = keyboard.nextLine();

        if (searchArray(sorted, fav)){
            System.out.println("Favorite Color was Found!");
        } else {
            System.out.println("Favorite Color was NOT Found");
        }


        keyboard.close();
	}

    public static void printArray(String[] arr){
        for(String x: arr){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static boolean searchArray(String[] arr, String y){

        for(String x: arr){
            if(x.equals(y))
             return true;
        }
        return false;
    }

    public static String[] sortArray(String[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }




}