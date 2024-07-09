package Recursion;

public class JosephusProblem
{
    public static void main(String[] args)
    {
        System.out.println(joshephus(6,4));
    }

    static int joshephus(int n,int k)
    {
        if (n==1)
            return 0;

        return (joshephus(n-1,k)+k)%n;

    }

}
