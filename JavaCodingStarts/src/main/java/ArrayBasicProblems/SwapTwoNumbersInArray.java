package ArrayBasicProblems;
//SWAP the two numbers in array
public class SwapTwoNumbersInArray
{
    public static void main(String[] args)
    {
        int a[] = {2,5,1,8,9,4,3};
        int i =1 ,j=3;
        int temp;
//        temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;

        a[i] = a[i]+a[j];
        a[j] = a[i]-a[j];
        a[i] = a[i]-a[j];

        for (int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        int c=2,b=5;
        c = c+b;
        b = c-b;
        c = c-b;

        System.out.println(c+" "+b);

        int x = 2,y=5;
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("x is"+x +"\n"+"y is"+y);

    }
}
