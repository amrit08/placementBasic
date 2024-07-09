package Recursion;

public class MatrixPath
{
    public static void main(String[] args)
    {
        System.out.println(matrixPath(2,2));

    }
    static  int matrixPath(int n,int m)
    {
        if (n==1 || m ==1)
            return 1;
        return matrixPath(n-1,m)+matrixPath(n,m-1);

    }
}


