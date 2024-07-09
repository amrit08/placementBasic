package org.example;

public class HighestNumberArray 
{
    public static void main(String[] args) 
    {
        int a[] = {100,100};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        if (a.length<2)
        {
            System.out.println("Invalid");
            return;
        }

        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max1)
            {
                max2 = max1;
                max1 = a[i];
            } 
            else if (a[i]>max2 && a[i] != max1)
            {
                max3 = max2;
                max2 = a[i];
            }
            else if (a[i]>max3 && a[i]<max2)
            {
                max3 = a[i];
            }
        }
        System.out.println(max1 +" "+max2+" "+max3);
    }

}
