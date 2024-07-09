package ArraysProblems;

import java.util.*;

public class MinimumDifference
{
    public static void main(String[] args)
    {
        int a[] = {12,9,8,2,11,5,4,5};
        List<List<Integer>> listList = minimumDiff(a);
        System.out.println(listList);
        //Its my logic **************************//******************//
//        int n = a.length;
//        Arrays.sort(a);
//        HashMap<List<Integer>,Integer> map = new HashMap<>();
//        List<List<Integer>> listList = new ArrayList<>();
//        int diff =0;
//        int min = a[0];
//        for (int i=0;i<n-1;i++)
//        {
//            List<Integer> list = new ArrayList<>();
//            list.add(a[i]);
//            list.add(a[i+1]);
//            diff = a[i+1]-a[i];
//            if(diff<=min)
//                min =diff;
//            map.put(list,diff);
//        }
//        System.out.println(map);
//        System.out.println(min);
//        Set<Map.Entry<List<Integer>,Integer>> entries = map.entrySet();
//        for (Map.Entry<List<Integer>,Integer> entry :entries)
//        {
//            if(entry.getValue() == min)
//                listList.add(entry.getKey());
//        }
//
//        System.out.println(listList);

    }

    static List<List<Integer>> minimumDiff(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(a);
        int n = a.length;
        for (int i=1;i<n;i++)
        {
//            if (a[i]-a[i-1]<minDiff)
//            {
//                minDiff = a[i]-a[i-1];
//            }
            minDiff = Math.min(minDiff,a[i]-a[i-1]);
        }

        for (int i=1;i<n;i++)
        {
            if (a[i]-a[i-1] == minDiff)
            {
                List<Integer> list = new ArrayList<>();
                list.add(a[i-1]);
                list.add(a[i]);
                ans.add(list);
            }
        }
        return ans;
    }
}
