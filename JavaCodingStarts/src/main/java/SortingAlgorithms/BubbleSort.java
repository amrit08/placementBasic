package SortingAlgorithms;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int a[] = {9,5,4,2,3};
        bubbleSort(a);
        for (int e:a)
            System.out.print(e+" ");
    }
    static void bubbleSort(int a[])
    {
        int n = a.length;
        for (int i=0;i<n-1;i++)
        {
            int flag =0;
            for (int j = 0;j <n-i-1; j++)
            {
                if (a[j]>a[j+1])
                {
                    flag =1;
                    a[j] = a[j]+a[j+1];
                    a[j+1] = a[j]-a[j+1];
                    a[j] = a[j]-a[j+1];
                }

            }
            if (flag == 0)
            {
                System.out.println(i);
                break;
            }
        }

    }
}

