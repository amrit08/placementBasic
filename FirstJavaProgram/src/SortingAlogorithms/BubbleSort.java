package SortingAlogorithms;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int a[] = {7,6,5,4,3,2};
        bubbleSort(a);
        for (int i:a)
        {
            System.out.print(i);
        }
    }


    static void bubbleSort(int a[])
    {
        int n = a.length;
        int temp;
        int count = 0;

        for (int i=0;i<n-1;i++)
        {
            int flag = 0;
            count++;
            for (int j=0;j<n-1-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag =1;

                }

            }

            if(flag == 0)
                break;

        }
        System.out.println("Number of Iteration is"+count);
    }

}
