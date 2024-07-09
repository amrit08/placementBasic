package array;

public class ArrayP1 {
    public static void main(String[] args) {
        int numbers[] = {13,3,4,5,23,1,67} , sum=0;
        for (String str: args)
        {
            System.out.println(str);
        }

        for ( int number:numbers)
        {
            sum = sum +number;
        }

        System.out.println("sum is"+sum);
        int min = Integer.MAX_VALUE;
        for (int i=0;i< numbers.length;i++)
        {
            if(numbers[i]<min)
            {
                min = numbers[i];
            }
        }

        System.out.println("Minimum value is"+min);

        for (int a:numbers)
        {

            if (a<min)
            {
                min = a;
            }
        }

        System.out.println("Minimum value2 is "+min);

    }
}
