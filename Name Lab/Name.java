public class Name 
{
    private String full;
    private String first;
    private String middle;
    private String last;
    private char in1;
    private char in2;
    private char in3;

    // Constructor
    public Name(String input){
        full = input;
        String [] arr = full.split(" ");
        first = arr[0];
        middle = arr[1];
        last = arr[2];

        in1 = first.charAt(0);
        in2 = middle.charAt(0);
        in3 = last.charAt(0);
    }

    //Returns
    public String getInitials(){
        return(""+in1+in2+in3);
    }
    public String toString(){
        return(
            "Full name: "+full+
            "\nFirst name: "+first+
            "\nMiddle name: "+middle+
            "\nLast name: "+last+
            "\nInitials: "+in1+in2+in3
        );
    }
    
}