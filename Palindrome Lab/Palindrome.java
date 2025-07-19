public class Palindrome
{
    public static boolean check(String a){
        String b = reverseString(a);
        if (a.equals(b)){
            return true;
        } else {
            return false;
        }
        
    }
    
    // Private Methods
    private static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}