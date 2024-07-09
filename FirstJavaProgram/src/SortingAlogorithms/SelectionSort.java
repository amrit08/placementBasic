package SortingAlogorithms;

public class SelectionSort
{
    public static void main(String[] args)
    {

        int a[] = {4,1,8,2,3,7};
        selectionsort(a);

        for (int i:a)
        {
            System.out.print(i);
        }

    }
     static void selectionsort(int a[])
     {
         int n = a.length;
         int temp;
         int index =0;

         for (int i=0;i<n-1;i++)
         {
             int min = a[i];
             for (int j=i;j<n;j++)
             {
                if (a[j]<=min)
                {
                    min = a[j];
                    index = j;
                }

             }
             temp = a[index];
             a[index] = a[i];
             a[i] = temp;

         }
     }
}
