package RecursionProblems;

public class NCRProblems
{
    public static void main(String[] args)
    {

        System.out.println(ncr(5,5));

    }
    static  int ncr(int n , int r)
    {
        if (n==r || r==0)
            return 1;

        return ncr(n-1,r-1)+ncr(n-1,r);

    }

}
