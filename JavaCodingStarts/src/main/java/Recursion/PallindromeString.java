package Recursion;

public class PallindromeString
{
    public static void main(String[] args)
    {
        String s = "abab";
        System.out.println( isPallindrome(s));
    }

    static boolean isPallindrome(String s)
    {
       return ispallindromeHelper(s,0,s.length()-1);
    }

        static boolean ispallindromeHelper(String s, int l, int r)
        {
            if (l>=r)
            {
                return true;
            }
            else if (s.charAt(l) == s.charAt(r))
            {
                return ispallindromeHelper(s,l+1,r-1);
            }
            return false;

        }

}
