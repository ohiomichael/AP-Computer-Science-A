public class MyProgram {
    public static void main(String[] args) {
        printCheckerboard(5);
        System.out.println("\n\n\n");
        printCheckerboard(4);
    }

    public static void printCheckerboard(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("#o#o#".substring(0, n));
            } else {
                System.out.println("o#o#o".substring(0, n));
            }
        }
    }
}