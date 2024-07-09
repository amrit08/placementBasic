package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequencesProblems
{
    public static void main(String[] args)
    {
        int a[] = {4,4,4,6};
        Arrays.sort(a);

        ArrayList<ArrayList<Integer>> ans = subsequences(a);
        for (ArrayList<Integer> list:ans)
        {
            System.out.println(list);
        }

    }
    static ArrayList<ArrayList<Integer>> subsequences(int a[])
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subequenceHelper(a,ans,0,new ArrayList<>());
        return ans;
    }

    static void subequenceHelper(int a[],ArrayList<ArrayList<Integer>> ans,
                                 int index,ArrayList<Integer> cur)
    {
            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);

        for (int i=index;i<a.length;i++)
        {
            if (i>index && a[i] == a[i-1])
                continue;
            cur.add(a[i]);
            subequenceHelper(a,ans,i+1,cur);
            cur.remove(cur.size()-1);
        }
    }
}
