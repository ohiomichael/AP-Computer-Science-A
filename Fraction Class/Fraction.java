/*
ASSIGNMENT ->
Add subtract and divide methods to the Fraction class and test them. If the parameter for the divide method is a zero fraction, divide should throw an IllegalArgumentException. 
 */

 public class Fraction
 {
   // *** instance variables ***
   private int num;
   private int denom;
 
   // *** Constructors ***
 
   public Fraction()       // no-args constructor
   {
     num = 0;
     denom = 1;
   }
 
   public Fraction(int n)
   {
     num = n;
     denom = 1;
   }
 
   public Fraction(int n, int d)
   {
     if (d != 0)
     {
       num = n;
       denom = d;
       reduce();
     }
     else
     {
       throw new IllegalArgumentException(
            "Fraction construction error: denominator is 0");
     }
   }
 
   public Fraction(Fraction other)  // copy constructor
   {
     num = other.num;
     denom = other.denom;
   }
 
   // *** public methods ***
 
   // Returns the sum of this fraction and other
   public Fraction add(Fraction other)
   {
     int newNum = num * other.denom + denom * other.num;
     int newDenom = denom * other.denom;
     return new Fraction(newNum, newDenom);
   }
 
   // Returns the sum of this fraction and m
   public Fraction add(int m)
   {
     return new Fraction(num + m * denom, denom);
   }
 
   // Returns the difference of this fraction and other
   public Fraction sub(Fraction other){
     int newNum = (num * other.denom) - (denom * other.num);
     int newDenom = (denom * other.denom);
     Fraction newFrac = new Fraction(newNum, newDenom);
     return newFrac;
   }
 
   // Returns the difference of this fraction and other
   public Fraction sub(int a, int b){
     int newNum = (num * b) - (denom * a);
     int newDenom = (denom * b);
     Fraction newFrac = new Fraction(newNum, newDenom);
     return newFrac;
   }
   public Fraction div(Fraction other) {
     if (other.num == 0) {
         throw new IllegalArgumentException("Cannot divide by zero");
     }
     int newNum = num * other.denom;
     int newDenom = denom * other.num;
     return new Fraction(newNum, newDenom);
   }
 
   public Fraction div(int a, int b) {
       if (a == 0 || b == 0) {
           throw new IllegalArgumentException("Cannot divide by zero");
       }
       int newNum = num * b;
       int newDenom = denom * a;
       return new Fraction(newNum, newDenom);
   }
 
   // Returns the product of this fraction and other
   public Fraction multiply(Fraction other)
   {
     int newNum = num * other.num;
     int newDenom = denom * other.denom;
     return new Fraction(newNum, newDenom);
   }
 
   // Returns the product of this fraction and m
   public Fraction multiply(int m)
   {
     return new Fraction(num * m, denom);
   }
 
   // Returns the value of this fraction as a double
   public double getValue()
   {
     return (double)num / (double)denom;
   }
 
   // Returns a string representation of this fraction
   public String toString()
   {
     return num + "/" + denom;
   }
 
   // *** private methods ***
 
   // Reduces this fraction by the gcf and makes denom > 0
   private void reduce()
   {
     if (num == 0)
     {
       denom = 1;
       return;
     }
 
     if (denom < 0)
     {
       num = -num;
       denom = -denom;
     }
 
     int q = gcf(Math.abs(num), denom);
     num /= q;
     denom /= q;
   }
 
   //  Returns the greatest common factor of two positive integers
   private int gcf(int n, int d)
   {
     if (n <= 0 || d <= 0)
     {
       throw new IllegalArgumentException(
                   "gcf precondition failed: " + n + ", " + d);
     }
 
     if (n % d == 0)
       return d;
     else if (d % n == 0)
       return n;
     else
       return gcf(n % d, d % n);
   }
 }