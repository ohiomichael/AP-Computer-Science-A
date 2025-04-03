public class MyProgram{
    public static void main(String[] args){
        int[] array = arrayGenerator(20);
        printArray(array);
        bubbleSort(array);
        printArray(array);
        System.out.print(binarySearch(array, 2));
    }

    // Method to generate random arrays
    public static int[] arrayGenerator(int x){
        int[] array = new int[x];
        for(int i = 0; i < x; i++){
            array[i] = (int)(Math.random()*6);
        }
        return array;
    }

    // Method to print out int arrays
    public static void printArray(int[] array){
        System.out.print("[");
        for(int x: array){
            System.out.print(x+",");
        }
        System.out.print("]");
    }

    // Bubble sort
    public static int[] bubbleSort(int[] array){
        boolean swaps = true;
        while(swaps){
            swaps = false;
            for(int i= 1; i < array.length;i++){

                // Handle Swaping
                if(array[i] > array[i-1]){
                    swaps = true;
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    // Binary search algorith
    public static String binarySearch(int[] array, int x){
        if(array.length == 1){
            if(array[0] == x){
                return ("Number FOUND!");
            } else {
                return ("Number Not Found");
            }
        }
        int[] values;
        int left = array[array.length/2];

        int mid = array.length / 2;
    
        if(left < x){
            // Left Side
            values = new int[mid];
            for(int i = 0; i < array.length/2; i++){
                values[i] = array[i];
            }
        } else {
            // Right Side
            values = new int[array.length - mid];
            for(int i = array.length/2; i < array.length; i++){
                values[i-(array.length/2)] = array[i];
            }
        }
        return binarySearch(values, x);
    }
}