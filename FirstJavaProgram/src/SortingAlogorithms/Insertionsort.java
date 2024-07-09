package SortingAlogorithms;

public class Insertionsort
{
    public static void main(String[] args)
    {
        int a[] = {20,1,8,2,3,7};
        insertionsort(a);

        for (int i :a)
        {
            System.out.print(i+" ");
        }

    }

    static  void insertionsort(int a[])
    {
        int n = a.length;
        int temp;
        for (int i = 0;i<n-1;i++)
        {
            for (int j = 0;j<i+1;j++)
            {
                if (a[j]>a[i+1])
                {
                    temp = a[j];
                    a[j] = a[i+1];
                    a[i+1] = temp;

                }
            }
        }

    }



}
