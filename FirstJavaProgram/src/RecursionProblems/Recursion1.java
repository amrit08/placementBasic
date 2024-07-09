package RecursionProblems;

public class Recursion1
{
    public static void main(String[] args) {

       // fun(4);
       // bar(3);

        System.out.println( sum(10));
    }

    static  void fun(int n){
        if (n>0)
        {
            fun(n-1);
            System.out.println(n);

        }

    }

    static  void bar(int n){
        if (n>0)
        {
            System.out.println(n);
            bar(n-1);
            bar(n-1);

        }

    }

    static int sum(int n)
    {

        if( n == 1)
            return  1;

        return  sum(n-1)+n;

    }

}
