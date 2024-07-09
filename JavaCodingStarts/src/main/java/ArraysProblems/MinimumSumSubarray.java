package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class MinimumSumSubarray
{
    public static void main(String[] args)
    {
        int a[] = {1,2,5,6,7,2};
      //  int n  = a.length;
      //  List<Integer> list = minSumSubArray(a,7);
//        System.out.println(list);
//        System.out.println(list.size());
        System.out.println(mimimumSubArray(a,16));

    }
    static List<Integer> minSumSubArray(int a[], int k)
    {
        List<Integer> list = new ArrayList<>();
        int index1 =0;
        int index2 =0;
        int minSum = Integer.MAX_VALUE;
//        list.add(0,0);
//        list.add(1,0);
        int minLength = Integer.MAX_VALUE;
        int length = 0;
        int n = a.length;
        int cs[] = new int[n];
        cs[0] = a[0];
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        if (k>sum)
        {
            list.add(0,0);
            return list;
        }
        for (int i=1;i<n;i++)
        {
            cs[i] = a[i]+cs[i-1];
        }
        for (int i=0;i<n-1;i++)
        {
           // List<Integer> list1 = new ArrayList<>();
            if (a[i]>=k)
            {
                minLength = 1;
                list.add(a[i]);
                return list;
            }
            for (int j=i+1;j<n;j++)
            {
                length = j-i+1;
                if (sum(cs,i,j)>= k && length <=minLength)
                {
                    minLength = length;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        for (int i = index1;i<=index2;i++)
        {
            list.add(a[i]);
        }
        return list;
    }

    static int sum(int cs[],int i,int j)
    {
        int sum=0;
        if (i==0)
        {
            sum = cs[j];
        }
        else
        {
            sum = cs[j]-cs[i-1];
        }
        return sum;
    }
    static int mimimumSubArray(int a[],int k)
    {
        int l=0,r=0;
        int n = a.length;
        int length = 0;
        int minLength = Integer.MAX_VALUE;
        int sum=0;
        int s=0 ,e=0 ;
        while (l<=r &&r<n)
        {
            sum += a[r];
            length = r-l+1;
            while (sum>=k)
            {
                if (length<minLength)
                {
                    minLength = length;
                    s=l;
                    e = r;
                }
                sum = sum-a[l];
                l++;
                length = r-l+1;
            }
                r++;
        }
        if (s ==0)
        {
            return 0;
        }
        System.out.println("Subarray index is"+s+" "+e);
        return minLength;
    }
}
