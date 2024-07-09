package LoopPattern;

public class Pattern3 {
    public static void main(String[] args)
    {
        int n=6;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int k = i;
            while (k>1)
            {
                System.out.print(k+" ");
                k--;
            }
            for (int l=1;l<=i;l++)
            {
                System.out.print(l+" ");
            }

            System.out.println();

        }

    }
}
