public class MyProgram{
    public static void main(String[] args){
        printTriangle(5);
        System.out.println();
        printTriangle2(5);
    }

    public static void printTriangle(int x){
        if(x == 0){
            return;
        }
        printTriangle(x-1);
        for(int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle2(int x){
        if(x == 0){
            return;
        }
        for(int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println();

        printTriangle2(x-1);
    }
}