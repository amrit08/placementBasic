package SortingAlgorithms;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int a[] = {10,9,8,7,6,5};
        selectionSort(a);
        for (int e:a)
            System.out.print(e+" ");


    }
    static void selectionSort(int a[])
    {
        int index =0;
        int n = a.length;
        for (int i=0;i<n-1;i++)
        {
            //int min = Integer.MAX_VALUE;
            int min = i;//assume i is the minimum index
            for (int j=i+1;j<n;j++)
            {
//                if (a[j]<min)
//                {
//                    index = j;
//                    min = a[j];
//                }
                if(a[j]<a[min])
                {
                    min = j;
                  //  index = min;
                }

            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

    }

}

