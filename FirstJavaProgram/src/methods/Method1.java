package methods;

public class Method1 {
    public static void main(String[] args)
    {
        int a = 4;
        int b = 7;
        //System.out.println(Math.max(a,b));
        System.out.println(getrandom(3,6));
    }
    public static  int getrandom(int a , int b)
    {
        return (int)(Math.random()*(b-a+1)+a);

    }


}
