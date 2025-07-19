// Sorry if you cant read this lab i was experimenting with code obfuscation
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] $$$) {
        Scanner $ = new Scanner(System.in);
        int _$;
        do {
            System.out.print("\u0045\u006E\u0074\u0065\u0072\u0020\u0061\u0020\u006E\u006F\u006E\u002D"
                + "\u006E\u0065\u0067\u0061\u0074\u0069\u0076\u0065\u0020\u006E\u0075\u006D\u0062"
                + "\u0065\u0072\u003A\u0020");
            _$ = $.nextInt();
        } while (_$ <= 0x0);
        
        System.out.println(new StringBuilder()
            .append("\u0054\u0068\u0065\u0020\u0073\u0075\u006D\u0020\u006F\u0066\u0020")
            .append("\u0074\u0068\u0065\u0020\u0064\u0069\u0067\u0069\u0074\u0073\u0020")
            .append("\u0069\u006E\u0020")
            .append(_$)
            .append("\u0020\u0069\u0073\u0020")
            .append($((_$)))
            .toString());
    }

    static int $(int $) {
        int $$ = 0x0;
        for(; $ > 0x0; $ = (int)($ * 0.1)) {
            $$ += $ % 0xA;
        }
        return $$;
    }
}