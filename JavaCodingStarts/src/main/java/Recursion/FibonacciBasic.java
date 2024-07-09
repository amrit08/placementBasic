package Recursion;

public class FibonacciBasic
{
    public static void main(String[] args)
    {

        System.out.println(fib(5-1));
      // fib1(5);
//       int n = 5;
//       int a =0,b=1;
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//       int c=0;
//       for (int i=2;i<=n;i++)
//       {
//        //   System.out.print(a+" ");
//           c=a+b;
//         //  System.out.print(c+" ");
//           a=b;
//           b=c;
//           System.out.print(b+" ");
//       }
//
//       System.out.println();
//       System.out.println(c);
//       System.out.println(a);
//       System.out.println(b);

    }
    //Find the nth number in fibonacci series
    static int  fib(int n)
    {
        if (n == 1 || n == 0)
        {
            return n;
        }

         return  fib(n-1)+fib(n-2);
    }
    //// Find the fibonacci series of numbers of n using recur
    // not able to do it
    static int fib1(int n)
    {
        if (n>1)
        {
            int a = fib1(n-1)+fib1(n-2);
            System.out.println(a);
            return a;
        }

        System.out.println(n);
        return n;
    }

}
