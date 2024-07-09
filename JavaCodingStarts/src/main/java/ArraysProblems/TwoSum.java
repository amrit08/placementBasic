package ArraysProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum
{
    public static void main(String[] args)
    {
        int a[] = {4,2,2,2,1,1,1,-1,-3,0,1,2,3,3,3};
        Arrays.sort(a);
       // System.out.println(twoSum(a,5,0));
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i=0;i<a.length-2;i++)
        {
            if (i>0 && a[i] == a[i-1]) continue;
            List<List<Integer>> ans = twoSum(a,-a[i],i+1);
                for (List<Integer> list:ans)
                {
                    list.add(0,a[i]);
                    triplets.add(list);
                }
        }
        System.out.println(triplets);
    }

    static List<List<Integer>> twoSum(int a[],int sum,int startFrom)
    {
        int l = startFrom;
        int r = a.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        while (l<r)
        {
            if(l> startFrom && a[l] == a[l-1])
            {
                l++;
                continue;
            }
            if (r<a.length-1 && a[r] == a[r+1])
            {
                r--;
                continue;
            }
            if (a[l]+a[r]>sum)
            {
                r--;
            }
            else if(a[l]+a[r]<sum)
            {
                l++;
            }
            else
            {
             List<Integer> list = new ArrayList<>();
             list.add(a[l]);
             list.add(a[r]);
             ans.add(list);
                l++;
                r--;
            }
        }
        return ans;
    }
}
