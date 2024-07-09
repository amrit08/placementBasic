package ExceptionHandling;

import java.util.Scanner;

public class CustomExceptions
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        try
        {
            int age = s.nextInt();
            if (age > 100)
            {
               throw new MyException("error is this only ");
               //throw new ArithmeticException("hello error");
            }
        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
        catch (MyException e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{

    public MyException(String message)
    {
        super(message);
    }

//    public String toString()
//    {
//        return "my erroe is this jdhfk ajfahkaf  amrit";
//    }

}


