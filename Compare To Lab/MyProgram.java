import java.util.*;

public class MyProgram {
    public static void main(String[] args){
        String s1 = "ABC";
        String s2 = "CBA";
        String s3 = "BAC";
        String o1 = findFirst(s1, s2, s3);
        System.out.println(o1);
        String o2 = findLast(s1, s2, s3);
        System.out.println(o2);
        orderStrings(s1, s2, s3);
        
    }
    public static String findFirst(String f1, String f2, String f3){
        String[] fa = {f1, f2, f3};
        Arrays.sort(fa);
        String rf = fa[0];
        return rf;
    }
    public static String findLast(String l1, String l2, String l3){
        String[] la = {l1, l2, l3};
        Arrays.sort(la);
        String rl = la[2];
        return rl;
    }
    public static String findMiddle(String m1, String m2, String m3){
        String[] ma = {m1, m2, m3};
        Arrays.sort(ma);
        String rm = ma[1];
        return rm;
    }
    public static void orderStrings(String d1, String d2, String d3){
        findFirst(d1,d2,d3);
        System.out.println(findFirst(d1,d2,d3)+", "+findMiddle(d1,d2,d3)+", "+findLast(d1,d2,d3));
        

        
      
    }
}