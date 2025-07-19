public class TestFractions
{

  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);
    System.out.println(f1 + " + " + 3 + " = " + f1.add(3));

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);
    System.out.println(f1 + " * " + 5 + " = " + f1.multiply(5));

    System.out.println();
  }
  public static void testSub(){
    Fraction f1 = new Fraction(2,3);
    Fraction f2 = new Fraction(1,3);
    System.out.println(""+f1.sub(f2));
    System.out.println(""+f1.sub(1,3));
  }

  public static void testDiv(){
    Fraction f1 = new Fraction(2,3);
    Fraction f2 = new Fraction(1,3);
    System.out.println(""+f1.div(f2));
    System.out.println(""+f1.div(1,3));
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    Fraction s2 = new Fraction(1,7);
    Fraction s1 = new Fraction(2,3);
    System.out.println(s1);
    testConstructors();
    testArithmetic();
    testValues();
    System.out.println("***********************************************");
    System.out.println("New Tests Sub->");
    testSub();
    System.out.println("***********************************************");
    System.out.println("New Tests Div->");
    testDiv();

  }
}