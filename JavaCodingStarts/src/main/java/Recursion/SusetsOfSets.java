package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SusetsOfSets
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        String s = "abc";
        List<String> subsets = subsets(s, list);
        System.out.println(subsets);

//        int n = s.length();
//        for (int i=0;i<n;i++)
//        {
//            for (int j=i;j<n;j++)
//            {
//                System.out.println(s.substring(i,j+1));
//            }
//         }

    }

    static List<String> subsets(String s,List<String> list)
    {
        List<String> list1 =  subsets(s,list,0,"");
        return list1;
    }

    static List<String> subsets(String s,List<String> list, int i,String curr)
    {
        if (i == s.length())
        {
            list.add(curr);
            //System.out.println(curr);
            return list;
        }

        subsets(s,list,i+1,curr+s.charAt(i));
        subsets(s,list,i+1,curr);

        return list;
    }

}

