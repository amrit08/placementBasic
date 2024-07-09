package ArraysProblems;

import java.util.Arrays;

public class makeMatrixEqual
{
    public static void main(String[] args)
    {
//        int a[][]={
//                {3,63,42},
//                {18,12,12},
//                {15,21,18},
//                {33,84,24}};

        int a[][] = {{2,4,6,8,10,1000}};
        int k=2;
        System.out.println(makeMatricsEqual(a,k));
    }
    static int makeMatricsEqual(int a[][],int k)
    {
        int n = a.length;
        if (n==0) return 0;
        int m = a[0].length;
        int total = n*m;
        int b[] = new int [total];

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                b[i*m+j] = a[i][j];
            }
        }
        Arrays.sort(b);
        int median = b[total/2];
        return makeMatrixEqualHelper(b,median,k);
//        for (int i=0;i<b.length;i++)
//        {
//            System.out.println(i+" "+b[i]+" "+makeMatrixEqualHelper(b,b[i],k));
//        }
//        return 0;
    }

    static int makeMatrixEqualHelper(int b[],int m,int k)
    {
        int count =0;
        for (int i=0;i<b.length;i++)
        {
            count+= Math.abs(b[i]-m)/k;
        }
        return count;
    }

}
