package ExceptionHandling;

import com.sun.jdi.ClassNotPreparedException;

import java.io.IOException;

public class MainClass
{
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Hello Guys How are you");



//        try
//        {
//            int res = 2/2;
//            System.out.println(a[1]);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//            //e.printStackTrace();

//        }
//        catch (NullPointerException e)
//        {
//            System.out.println("nukk poieur jdshak");
//        }

//        int a[] = new int[5];
//        System.out.println("Hello Guys How are you");
//        try
//        {
//            int res = 2/0;
//            System.out.println(a[8]);

//        }
//        catch (Exception e)
//        {
//            System.out.println("all exception handles"+e);
//        }
//

//        catch (NullPointerException  | ArithmeticException| ArrayIndexOutOfBoundsException e )
//        {
//            System.out.println("Handling exceptions");
//
//        }
//        catch (RuntimeException e)
////        {
////            System.out.println(e);
////        }

//        finally
//        {
//            System.out.println("I will run always");
//        }
//        System.exit(0);
        try
        {
           int number =  getNumberFromArray(a);
        }

        catch (IndexOutOfBoundsException e)
        {
            System.out.println("error is there");
            System.out.println(e.getMessage());
            System.out.println(e);
         //   e.printStackTrace();
        }
        catch (Error error)
        {
            System.out.println(error);
        }

        finally
        {
            System.out.println("I will run always");
        }

        System.out.println("Bye guys");
    }

    static int getNumberFromArray(int a[]) throws ArithmeticException
    {
        return a[8];
    }

}
