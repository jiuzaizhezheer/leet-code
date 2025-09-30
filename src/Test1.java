import java.io.File;

public class Test1{
   public static void main(String[] args) {
       int a = 10;
       int b = a++;
       int c = ++a;
       int d = c--;
       int e = --d;
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("c = " + c);
       System.out.println("d = " + d);
       System.out.println("e = " + e);
   }
}