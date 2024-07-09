package ArraysProblems;

public class SortColors
{
    public static void main(String[] args)
    {
        int a[] = {2,0,2,1,1,0,1,1,2,2,2,0,0,1};
        for (int i:a)
        {
            System.out.print(i+" ");
        }

        System.out.println();
        sortThreePonters(a);
        for (int l:a)
        {
            System.out.print(l+" ");
        }
        //int n = a.length;
//        int c0=0,c1=0,c2=0;
//        //Basic approach
//        for (int i:a)
//        {
//            System.out.print(i+" ");
//        }
//        for (int i=0;i<n;i++)
//        {
//            if (a[i] == 0)
//                c0++;
//            else if (a[i] == 1)
//                c1++;
//            else
//                c2++;
//        }
//       // System.out.println(c0+" "+c1+" "+c2);
//
//        for (int i=0;i<n;i++)
//        {
//            if (i<c0)
//                a[i] = 0;
//            else if (i<c0+c1)
//                a[i] = 1;
//            else
//                a[i] = 2;
//
//        }
//        System.out.println();
//        for (int i:a)
//        {
//            System.out.print(i+" ");
//        }

    }
    static void  sortThreePonters(int a[])
    {
        int n = a.length;
        int i=0;
        int k = a.length-1;
        int j = 0;
        while (j<=k)
        {
            if (a[j] == 0 )
            {
                a[j] = a[i];
                a[i] = 0;
                i++;
                j++;
            }
            else if (a[j] == 2)
            {
                a[j] = a[k];
                a[k] = 2;
                k--;
            }
            else
            {
                j++;
            }

        }
    }
}
