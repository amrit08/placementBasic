package ArraysProblems;

import java.util.ArrayList;

public class MultipleLeftRotation
{
    public static void main(String[] args)
    {
        int a[] ={1,2,3,4,5};
        int b[] = {1,2,3,4,5};
      //  int c[] = new int[a.length];
       // int ans[][]  = new int[b.length][a.length];
        int ans[][] = multipleRotations(a,b);

        for (int i[]:ans)
        {
            printArray(i);
            System.out.println();
        }

//        for(int k=0;k<a.length;k++)
//        {
//            c[k] = a[k];
//        }

//        int temp[] = new int[2*a.length];
//        for (int i=0;i<a.length;i++)
//        {
//            temp[i] = a[i];
//        }
//        for (int i=a.length,j=0;i<temp.length;i++,j++)
//        {
//            temp[i] = a[j];
//        }
//        for (int i:temp)
//        {
//            System.out.print(i+" ");
//        }
////
//        for (int i=0;i<b.length;i++)
//        {
//            int c = 0;
//            for (int j = (b[i])%(a.length);j<a.length+(b[i])%(a.length); j++)
//            {
//                ans[i][c] = temp[j];
//                c++;
//            }
//        }

//        for (int i[]:ans)
//        {
//            for (int j:i)
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        for (int i=0;i<b.length;i++)
//        {
//            leftRotateByK(a,b[i]);
//            for (int j=0;j<a.length;j++)
//            {
//                ans[i][j] = a[j];
//            }
//            for(int k=0;k<a.length;k++)
//            {
//                a[k] = c[k];
//            }
//        }
//        for (int i[]:ans)
//        {
//            for (int j:i)
//            {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        leftRotateByK(a,3);
//        printArray(a);

        //This my own logic **************************//
//        int a[] = {1,2,3,4,5};
//        int b[] = {2,3};
//        ArrayList<int[]> list = new ArrayList<>();
//       // int c[][] = new int[b.length][a.length];
//      //  int row = 0;
//
//        System.out.println("Array before rotation");
//        for (int i:a)
//        {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        int k = 0;
//        for (int j=1;j<=3;j++)
//        {
//            int x=a[0];
//           // int count =0;
//            for (int i = 0; i < a.length - 1; i++)
//            {
//                a[i] = a[i+1];
//              //  count++;
//            }
//            a[a.length-1] = x;
//            if (b[k] == j)
//            {
//                int d[] = new int[a.length];
//
//                for (int m=0;m<a.length;m++)
//                {
//                    d[m]=  a[m];
//                }
//
//                list.add(d);
////                    for (int l=0;l<c[0].length;l++)
////                    {
////                        c[row][l] = a[l];
////                    }
//                k++;
////                    row++;
//            }
//        }
//
//        System.out.println("Array after rotation");
////        for (int i[]:c)
////        {
////            for (int j:i)
////            {
////                System.out.print(j + " ");
////            }
////            System.out.println();
////        }
//        for (int i[] :list)
//        {
//            for (int j:i)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //*****************************Mylogic*********************//

    }

    static void printArray(int a[])
    {
        for (int e:a)
        {
            System.out.print(e+" ");
        }
    }

//    static void  leftRotateByK(int a[],int k)
//    {
//        int n = a.length-1;
//        for (int i=0;i<k;i++)
//        {
//            int temp = a[0];
//            for (int j=0;j<n;j++)
//            {
//                a[j] = a[j+1];
//            }
//            a[n] = temp;
//        }
//    }
    static int [][] multipleRotations(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        int ans[][] = new int[m][n];

        int temp[] = new int[2*n];

        for (int i=0;i<a.length;i++)
        {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        for (int i=0;i<m;i++)
        {
            int offset = (b[i])%n;
            for (int j=0;j<n;j++)
            {
                ans[i][j] = temp[j+offset];
            }
        }
        return ans;
    }
}
