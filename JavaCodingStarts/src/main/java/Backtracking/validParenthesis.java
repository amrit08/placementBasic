package Backtracking;

public class validParenthesis
{
    public static void main(String[] args)
    {
        parenthesis("",0,0,2,0);
    }
    static void parenthesis(String s,int o, int c,int n,int i)
    {
        if( i == 2*n)
        {
            System.out.println(s);
            return;
        }
         if (o<n)
        {
            s = s+'(';
            parenthesis(s,o+1,c,n,i+1);
            s = s.substring(0,s.length()-1);//backtracking
        }
         if (o>c)
        {
            s = s+')';
            parenthesis(s,o,c+1,n,i+1);
           // s = s.substring(0,s.length()-1);

        }
    }

}
