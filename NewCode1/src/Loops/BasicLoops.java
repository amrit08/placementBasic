package Loops;

import java.util.Scanner;

public class BasicLoops
{
    public static void main(String[] args)
    {// Scanner s = new Scanner(System.in);
//        System.out.println("Enter the value of n ");
//        int n = s.nextInt();

        //Table of n
//        for (int k = 1; k<=n;k++)
//        {
//            for (int i = 1; i <= 10; i++)
//            {
//                System.out.println(k + "*" + i + "=" + (k*i));
//            }
//            System.out.println();
//
//        }

        // sum of n natural numbers
           // int sum = n*(n+1)/2;
//            int sum = 0;
//            for (int i=1;i<=n;i++)
//            {
//                sum += i;
//
//            }
//        System.out.println("sum is"+sum);

        // sum of first n even  natural numbers
//        int sumeven = 0;
//        for (int i=1;i<=n;i++)
//        {
//                 sumeven += (2*i);
//
//        }
//        System.out.println("sum of even no. is"+sumeven);

       //***************** // Basic of while loops //********

//        boolean hasLearnt = false;
//
//        while (!hasLearnt)
//        {
//            System.out.println("went to school , tried to learn");
//            System.out.println("hAVE U lEARNED THE DSA");
//            hasLearnt = s.nextBoolean();
//        }

//           int i = 1;
//        while (i<=5)
//        {
//            System.out.println(i);
//            i++;
//
//        }
//        System.out.println("out of loop");


//        do
//        {
//            System.out.println(i);
//            i++;
//        }while (i<=5);
//
//        System.out.println("out of loop");

        //**************Break AND Continue*******************

//        for (int i = 0; i <= 20; i += 2)
//        {
//                System.out.println(i);
//                if (i >= 10)
//                    break;
//
//        }

//        for (int i = 0; i <= 20; i += 1)
//        {
//            if (i==2 || i == 8)
//                continue;
//            if (i>=15)
//                break;
//            System.out.println("Give toffe to"+i);
//
//        }

        // Basic pattern

        for(int i = 1 ; i<=5 ;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}

