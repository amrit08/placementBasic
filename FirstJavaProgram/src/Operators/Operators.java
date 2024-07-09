package Operators;

import java.util.Scanner;

public class Operators
{
    public static void main(String[] args)
    {
     int a = 100;
     int b = 89 ;
     int c = 200;

//     if (a>b && a>c)
//         System.out.println("a is largest"+a);
//     else if (b>c)
//         System.out.println(" b is largest"+b);
//     else
//         System.out.println("c is largest"+c);

   int max  = (a>b && a>c)?(a):(b>c?b:c);

      //  int max = a>b?(System.out.println(a);):(System.out.println(b););
        System.out.println("max is "+max);

        int day;
        Scanner s = new Scanner(System.in);
        day = s.nextInt();
        switch (day)
        {
            case 1: case 2:
                System.out.println("day is 1");
                break;
            case 3:
                System.out.println("day is 3");
                break;
            case 4:
                System.out.println("day is 4");
                break;
            case 5:
                System.out.println("day is 5");
                break;
            case 6:
                System.out.println("day is 6");
                break;

            default:
                System.out.println("no is prsksa");
        }

    }

}
