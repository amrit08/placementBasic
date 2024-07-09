package timecomplexity;

public class BigONotations
{
    public static void main(String[] args)
    {
        int a[] = {3,7,1,7,2,5};
        printAllPairs(a);
    }

    //O(1)
    static int getFirstNumber(int a[])
    {
        return a[0];
    }

    //O(n)
    static boolean check(int a[] , int key)
    {
        for (int i=0;i<a.length;i++)
        {
            if (a[i] == key)
                return true;

        }
        return false;
    }

    static void printAllPairs(int a[])
    {
        int count =0;
        int n =a.length;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                count++;
                System.out.println(a[i] +","+a[j]);
            }
            System.out.println();

        }
        System.out.println("Total pair is"+count);
    }


}
