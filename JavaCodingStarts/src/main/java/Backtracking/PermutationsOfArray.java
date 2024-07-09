package Backtracking;

import java.util.ArrayList;

public class PermutationsOfArray
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3};
        ArrayList<int[]> ans = new ArrayList<>();
        PermutationOfArray(a,0,a.length-1,ans);
        System.out.println("Printing ans using array list");

        for (int[] arr:ans)
        {
           printArray(arr);
        }

    }

    static void PermutationOfArray(int a[],int l,int r,ArrayList<int[]> ans)
    {
        if(l == r)
        {
            printArray(a);
            int b[] = new int[a.length];
            for (int i=0;i<a.length;i++)
            {
                b[i] = a[i];
            }
            ans.add(b);
            return;
        }

        for (int i=l;i<=r;i++)
        {
           swap(a,i,l);
           PermutationOfArray(a,l+1,r,ans);
           swap(a,i,l);//backtracking
        }

    }

    private static void swap(int[] a, int i,  int l)
    {
        int c = a[i];
        a[i] = a[l];
        a[l] = c;
    }

    static  void printArray(int a[]){
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();

    }

}
