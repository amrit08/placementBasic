package ArrayBasicProblems;
//Place the last Number in the sorted position in an array
public class PlaceLastNumber
{
    public static void main(String[] args)
    {

        int a[] = {2,5,6,8,9,1};
        method2(a);
        for (int e:a)
            System.out.print(e+" ");
    }
    // this method1 uses shifting method of my technique
    static void method1(int a[])
    {
        int index = 0;
        int last = a[a.length-1];
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>last)
            {
                index = i;
                break;
            }
        }
        int j = a.length-1;
        while (j>index)
        {
            a[j] = a[j-1];
            j--;
        }
        a[j] = last;

    }

    // this method2 uses swapping technique my logic
    static void method2(int a[])
    {

        int temp;
        for (int i =0;i<a.length-1;i++)
        {
            if (a[i]>a[a.length-1])
            {
                temp = a[i];
                a[i] = a[a.length-1];
                a[a.length-1] = temp;
            }
        }
    }

    //this method3 uses shifting technique of AB
    static void method3(int a[])
    {
        int n = a.length;
        int last = a[n-1];
        int swapIndex = n-2;
        while (swapIndex >=0 && a[swapIndex]>last)
        {
            swapIndex--;
        }
        for (int i = n-1;i>=swapIndex+2;i--)
        {
            a[i] = a[i-1];
        }
        a[swapIndex+1] = last;

    }

    static void method4(int a[])
    {
        int n = a.length;
        int last = a[n-1];
        int swapIndex = 0;
        while ( swapIndex <=n-1 && a[swapIndex]<last)
        {
            swapIndex++;
        }
        for (int i = n-1;i>=swapIndex+1;i--)
        {
            a[i] = a[i-1];
        }
        a[swapIndex] = last;

    }
}
