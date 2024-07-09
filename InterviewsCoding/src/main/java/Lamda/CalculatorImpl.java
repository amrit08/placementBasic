package Lamda;

interface Calculator
{
    void switchON();
   // void sum(int input);
    //int sub(int i1,int i2);
}

public class CalculatorImpl
{
    public static void main(String[] args)
    {

        Calculator c = ()-> System.out.println("Switch on");
        c.switchON();

       // Calculator c = (input)-> System.out.println("Sum"+input);
       // c.sum(234);

//      Calculator c = (i1,i2)->
//      {
//          if (i2<i1)
//          {
//              throw  new RuntimeException("message less");
//          }
//          else
//          {
//              return i2-i1;
//          }
//
//      };
//        System.out.println(c.sub(5,10));
    }
}
