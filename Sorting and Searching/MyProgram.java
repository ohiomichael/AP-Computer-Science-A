public class MyProgram{
    public static void main(String[] args){
        int[] array = arrayGenerator(20);
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

    // Insertion Sort
    public static int[] inerstionSort(int[] array){
        return null;
    }
}