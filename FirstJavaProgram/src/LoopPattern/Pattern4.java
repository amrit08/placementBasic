package LoopPattern;

public class Pattern4
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i =0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j=0;j<=2*i-1;j++)
            {
             if(j==2*i-1)
             {
                 System.out.print("*");

             }
             else
             {
                 System.out.print(" ");
             }

            }
            System.out.println();

        }

    }

}
