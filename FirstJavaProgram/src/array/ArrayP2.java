package array;

public class ArrayP2 {
    public static void main(String[] args) {

        int a[] = {2,5,6,8,9,1};
        int temp;

        System.out.println("Original Array");
        for (int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Modified Array");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>a[a.length-1])
            {
                temp = a[i];
                a[i] = a[a.length-1];
                a[a.length-1] = temp;
            }
            System.out.println(a[i]);

        }

        System.out.println();
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
}
