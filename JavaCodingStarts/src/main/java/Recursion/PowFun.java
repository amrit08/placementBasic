package Recursion;

public class PowFun
{
    public static void main(String[] args)
    {
        int a =7;
        int b =7;
        int m = 30;
        System.out.println(FastPowerModulo(a,b,m));
        System.out.println(FastPower(7,7));

    }
    static double Pow(double a, double b)
    {
        if ( b == 0)
        {
            return 1;
        }
        return Pow(a,b-1)*a;

    }

    static double FastPower(double a, int b)
    {
        if( b == 0)
        {
            return  1;
        }
        else if (b<0)
        {
            return FastPower(1/a,Math.abs(b));
        }
        else if (b%2 == 0)
        {
           return FastPower(a*a,b/2);
        }
        else
        {
            return a*FastPower(a,b-1);
        }

    }

    static double FastPowerModulo(double a, int b , int m)
    {
        if (b == 1)
        {
            return a;
        }
        if(b<0)
        {
            return FastPowerModulo(1 / a, Math.abs(b), m);
        }
        if(b%2 == 0)
        {
            return FastPowerModulo((a%m*a%m)%m,b/2,m);
        }
        else
            return (a%m * FastPowerModulo(a,b-1,m)%m)%m;

    }

}
