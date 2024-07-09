package array;

public class arrayP3
{
    public static void main(String[] args) {

        int a[] = {2,5,6,8,9,4};
        int end = a[a.length - 1];

        for (int i = 0;i<a.length;i++)
        {
            if (a[i]>end)
            {
                for (int j = a.length-2;j>=i;j--)
                {
                    a[j+1] = a[j];

                }
                a[i] = end;
                break;
            }

        }

        for (int i:a)
        {
            System.out.print(i);
        }
    }

}
