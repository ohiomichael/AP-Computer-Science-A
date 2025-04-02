public class MyProgram{
    public static void main(String[] args){
        int[] array = arrayGenerator(20);
        printArray(array);
        bubbleSort(array);
        printArray(array);
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
}