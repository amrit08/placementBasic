package methods;
public class LearnMathsClass
{
    public static void main(String[] args)
    {
        int a= 2,b=4;
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.abs(-34.45));
        System.out.println(getRandom(10,20));
        System.out.println(Math.floor(5.8));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.round(6.8));

    }
// get random number between 1 to 6
    public static int getRandom()
    {
        return (int) (Math.random()*6) +1;

    }

    //get random number between a and b
    public static int getRandom(int a , int b)
    {
        return (int) (Math.random()*(b-a+1)+a);

    }
}
