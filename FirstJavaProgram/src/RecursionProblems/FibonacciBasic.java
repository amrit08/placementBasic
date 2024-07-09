package RecursionProblems;

public class FibonacciBasic
{
    public static void main(String[] args)
    {
       // int a=0,b=1,c=0;
//        for (int i=0;i<4;i++)
//        {
//            System.out.print(a+" ");
//            c = a+b;
//            a=b;
//            b=c;
//        }
//        System.out.println(a);
//        System.out.print(a);
//        System.out.print(b);

//        for (int i=2;i<=4;i++)
//        {
//            c = a+b;
//          //  System.out.print(c +" ");
//            a=b;
//            b=c;
//        }
//        System.out.println(c);
        System.out.println(fib(6));
    }

    static  int fib(int n)
    {
//        if (n == 0)
//            return 0;
//        else if (n==1)
//        {
//            return 1;
//        }
//        if (n<=1)
//            return n;
        if (n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);

    }

}
