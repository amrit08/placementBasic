package Recursion;

public class CountString
{
    public static void main(String[] args) {
        String s ="ababab";
        String t = "aba";
        System.out.println(CountOccurences(s,t));
//        int l1 = s.length();
//        int l2 = t.length();
//        int count =0;
//
//        for (int i=0;i<l1-l2+1;i++)
//        {
//            if(t.equals(s.substring(i,i+l2)))
//            {
//                count++;
//            }
//        }
//        System.out.println("Number of occurence of String is"+count);

    }

    static int CountOccurences(String s,String t)
    {
        return CountOccurencesHelper(s,t,0);
    }

    static int CountOccurencesHelper(String s, String t,int l)
    {
        if (l>s.length()-t.length())
            return  0;
        else if (t.equals(s.substring(l,l+t.length())))
        {
            return CountOccurencesHelper(s,t,l+1)+1;
        }

        return  CountOccurencesHelper(s,t,l+1);
    }


}
