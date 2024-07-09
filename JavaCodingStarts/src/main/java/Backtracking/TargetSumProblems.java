package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSumProblems
{
    public static void main(String[] args)
    {
        int a[] = {1,1,1,1};
        int sum = 2;
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> ans = targetSum(a,sum);
        for (ArrayList<Integer> list:ans)
        {
            System.out.println(list);
        }

    }
    public  static ArrayList<ArrayList<Integer>> targetSum(int a[],int sum)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        targetSumHelper(a,ans,0,sum,new ArrayList<>());
        return ans;
    }

    private static void targetSumHelper(int[] a, ArrayList<ArrayList<Integer>> ans,
                                        int index,int sum, ArrayList<Integer> cur)
    {
        if (sum == 0)
        {
            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);
            return;
        }

        for (int i = index;i<a.length;i++)
        {
            if (a[i]>sum) return;
            if (i>index && a[i] == a[i-1])
                continue;
            cur.add(a[i]);
            targetSumHelper(a,ans,i+1,sum-a[i],cur);
            cur.remove(cur.size()-1);

        }
    }


}
