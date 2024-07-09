public class Main
{

    static  int s;
    static
    {
        System.out.println("Block1");
        s=10;
    }

    public static void main(String[] args)
    {

//        int [][]mat = new int[3][2];
//        System.out.println("dkjsfd daskfjs");
//        System.out.println(mat[1][0]);
//
//        System.out.println("Hello world!");
//        int a[] = {4,5,3,7,1};
//        System.out.println(a);
//        String s = "abc";
//        System.out.println(s.isEmpty());

        System.out.println(-5%2);
        // StringBuffer s1 = new StringBuffer();

        char[] s2 = {'a','b','c'};
        for (char c : s2)
        {
            System.out.println("char is"+c);
        }
        s2.toString();
        System.out.println();
        System.out.println();
       int mulValue= main(2,3);
        System.out.println(+mulValue);

    }
    public  static int main(int a, int b)
    {
        System.out.println("main method overloading");
    return a*b;
    }

}
