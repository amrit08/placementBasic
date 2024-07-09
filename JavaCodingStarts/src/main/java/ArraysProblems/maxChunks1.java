package ArraysProblems;

public class maxChunks1
{
    public static void main(String[] args)
    {
        int a[] = {0,1,2,4,3};
        System.out.println(maxChunks(a));

    }
    static  int maxChunks(int a[])
    {
        int n = a.length;
        int maxSoFar = a[0];
        int chunks = 0;
        for (int i=0;i<n;i++)
        {
            maxSoFar = Math.max(maxSoFar,a[i]);
            if (i == maxSoFar )
            {
                chunks++;
            }

        }
        return  chunks;
    }
}
