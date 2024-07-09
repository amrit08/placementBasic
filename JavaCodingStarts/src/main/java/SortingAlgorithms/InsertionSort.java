package SortingAlgorithms;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int a[] = {10,9,8,7,6,5};
        insertionSort(a);
        for (int e:a)
            System.out.print(e+" ");

    }

   static void insertionSort(int a[])
   {
       int n = a.length;
       for(int i =1;i<n;i++)
       {
           for (int j=0;j<i;j++)
           {
               if(a[j]>a[i])
               {
                   int temp = a[j];
                   a[j] = a[i];
                   a[i] = temp;

               }
           }
       }
   }
}



