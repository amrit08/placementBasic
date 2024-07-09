package ArrayBasicProblems;
//find the smallest number in array
public class SmallestNumberInArray
{
    public static void main(String[] args)
    {
        int a[] = {3,1,0,5,9,2,1,3};
        int min = Integer.MAX_VALUE;
        for(int num:a)
        {
            if (num<min)
                min = num;
        }

        System.out.println("Minimum number is"+min);

    }
}
