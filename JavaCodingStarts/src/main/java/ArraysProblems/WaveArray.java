package ArraysProblems;

import java.util.Arrays;
import java.util.Collections;

public class WaveArray
{
    public static void main(String[] args)
    {
        int a[] ={6,1,2,9,4,7};
      //  waveArray(a);
        waveArrayNotLexographic(a);
        printArray(a);

      //  Arrays.sort(a);
        //*************if array is not sorted ***************//**********
//        int n = a.length;
//        for (int i=1;i<n;i=i+2)
//        {
//            if(a[i]>a[i-1])
//            {
//                int temp = a[i];
//                a[i] =a[i-1];
//                a[i-1] = temp;
//            }
//            if(i==n-1)
//            {
//                break;
//            }
//            if(a[i]>a[i+1])
//            {
//                int temp = a[i];
//                a[i] =a[i+1];
//                a[i+1] = temp;
//            }
//        }
//        for (int i:a)
//        {
//            System.out.print(i+" ");
//        }

    }

    static void waveArray(int a[])
    {
        Arrays.sort(a);
       /// Collections.sort(a);for list sorting
        int n = a.length;
        for (int i=1;i<n;i+=2)
        {
            swap(a,i,i-1);

        }
    }

    static void waveArrayNotLexographic(int a[])
    {
        int n = a.length;
        for (int i=1;i<n;i+=2)
        {
            if(a[i]>a[i-1])
            {
               swap(a,i,i-1);
            }

            if(i<n-1 && a[i]>a[i+1])
            {
                swap(a,i,i+1);
            }
        }

    }

    static void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] =a[j];
        a[j] = temp;
    }

    static void printArray(int a[])
    {
        for (int i:a)
        {
            System.out.print(i+" ");

        }

    }




}