package LoopPattern;

public class Pattern1
{

    public static void main(String[] args) {

        int k = 1;
        for (int i = 1; i <=6; i++)
        {
           // int count = 0;
            for (int j = 1; j <=6-i; j++)
            {
                System.out.print(" ");
                //count++;
            }

//            while(count<5)
//            {
//                System.out.print("*");
//                count++;
//            }

            if (i==1)
            {
                System.out.print("*");
            }

            else
            {
                for (int j = 1; j <= 2; j++)
                {
                    System.out.print("*");
                    for (int l=1;l<=k;l++)
                    {
                        System.out.print(" ");

                    }

                }

                k = k+2;

            }
//            for (int j = 1; j <=4-i-1; j++)
//            {
//                System.out.print(" ");
//                //count++;
//            }


            System.out.println();
        }
       k=k-4;
        for (int i = 1;i<=5;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");

            }
            if (i==5)
            {
                System.out.print("*");
            }
            else
            {
                for (int j = 1; j <= 2; j++) {
                    System.out.print("*");
                    for (int l = 1; l <= k; l++) {
                        System.out.print(" ");

                    }

                }
                k = k-2;
            }
            System.out.println();

        }

    }
}
