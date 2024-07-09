package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Pallindromepartioning
{
    public static void main(String[] args)
    {
        String s= "abbaca";
        List<List<String>> ans = pallindromePartitioning(s);
        for (List<String> list :ans)
        {
            for (String ss:list)
            {
                System.out.print(ss+" ");
            }
            System.out.println();
        }

    }
    static boolean isPallindrome(String s, int l,int r)
    {
        while (l<=r)
        {
            if(s.charAt(l) == s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }


    static List<List<String>> pallindromePartitioning(String s)
    {
        List<List<String>> ans = new ArrayList<>();

        palindromicHelper(s,ans,0,new ArrayList<>());


        return ans;
    }

    static void palindromicHelper(String s,List<List<String>> ans,
                                  int index ,List<String> cur)
    {
        if (index == s.length())
        {
            List<String> copyCur = new ArrayList<>(cur);
            ans.add(copyCur);
            return;
        }

        for (int i=index;i<s.length();i++)
        {
            if (isPallindrome(s,index,i))
            {
                cur.add(s.substring(index,i+1));
                palindromicHelper(s,ans,i+1,cur);
                cur.remove(cur.size()-1);

            }
        }

    }

}
