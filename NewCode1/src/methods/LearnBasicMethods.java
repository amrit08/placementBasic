package methods;

public class LearnBasicMethods
{
    public static void main(String[] args)
    {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//we can pass the string arguments in main methos also using command line or
        // by changing edit configurations here only

//        for (String str : args)
//        {
//            System.out.println(str);
//        }
//        System.out.println(1);
//        System.out.println(2);
//        greet();
//        System.out.println(3);
//        System.out.println(4);

        int average =  average(10,20,true);
        System.out.println("toatal average is"+average);

        int min = minimum(-1,0);
        System.out.println("Minimum is"+min);

    }

     static  void greet()
     {
         System.out.println(5);
         System.out.println("Hello world");
         System.out.println(6);
    }

    public static int  average(int a , int b , boolean shouldAverage)
    {
        if (shouldAverage == false)
        {
            return -1;
        }

        int avg = (a+b)/2;
        //System.out.println("total average is"+avg);
        System.out.println("returning the average");
        return avg;
    }

    static  int minimum(int a , int b)
    {
        return a<b?a:b;

    }

}
