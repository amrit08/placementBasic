package ArraysProblems;

import java.util.ArrayList;

public class MutipleRightRotation
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        int b[] = {2,3};
        ArrayList<int[]> list = new ArrayList<>();
        // int c[][] = new int[b.length][a.length];
        //  int row = 0;

        System.out.println("Array before rotation");
        for (int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int k = 0;
        for (int j=1;j<=3;j++)
        {
            int x=a[a.length-1];
            for (int i=a.length-1;i>0; i--)
            {
                a[i] = a[i-1];
            }
            a[0] = x;
            if (b[k] == j)
            {
                int d[] = new int[a.length];

                for (int m=0;m<a.length;m++)
                {
                    d[m]=  a[m];
                }

                list.add(d);
//                    for (int l=0;l<c[0].length;l++)
//                    {
//                        c[row][l] = a[l];
//                    }
                k++;
//                    row++;
            }
        }

        System.out.println("Array after rotation");
//        for (int i[]:c)
//        {
//            for (int j:i)
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        for (int i[] :list)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }




    }


}
