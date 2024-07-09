package Lamda;

interface  FunctionalInterface
{
    void m1();

    default void m2()
    {
        System.out.println("Default method -1");
    }

    default void m3()
    {
        System.out.println("Default method-2");
    }

    static void m4()
    {
        System.out.println("static method -1");
    }

}

public class MyFunctionalInterface
{
    public static void main(String[] args)
    {
       FunctionalInterface f =  ()->
       {
            System.out.println("jslka");
        };
       f.m1();

    }
}
