package arrays;

public class ProblemsOnArray
{
    public static void main(String[] args)
    {
        int numbers[] = {45,12,6,7,15,3,2,1};
        int sum = 0;

// Find the sum of all numbers in array
        // Using normal loop
//        for (int i = 0; i < numbers.length; i++)
//        {
//            sum += numbers[i];
//        }

        //Using  for-each loop
//        for (int number : numbers)
//        {
//            sum += number;
//        }
//        System.out.println("Total sum is"+sum);

        //**************************-----------------*****************//
    //Problems- Find the minimum number in array

  //  int min = numbers[0];
    int min = 0;
   // int min =   Integer.MAX_VALUE;
        //int index = 0;
    for (int i =0;i< numbers.length-1;i++)
    {
        if (numbers[i+1]<numbers[min])
        {
            //index =i;
            //min = numbers[i];
            min = i+1;

        }
    }
        System.out.println("Minimum number is"+min);
       // System.out.println("Minimum index is"+index);

    //using for-each loop
//        for(int number:numbers)
//        {
//            if (number<min)
//            {
//                min = number;
//            }
//
//        }
//        System.out.println("Minimum number is"+min);
      //  System.out.println(Integer.MAX_VALUE);

        // Find the maximum number in array
//
//        int max = Integer.MIN_VALUE;
//        for(int number:numbers)
//        {
//            if (number>max)
//            {
//                max = number;
//            }
//
//        }
//
//        System.out.println("Maximum number is"+max);
//************************++++++++++++++++++****************************//

        // 2-D Array
        // row->roll no of students
        // column ->subject position
        //marks[][] -> value is the actual marks

      //  int marks[][] = new int[4][3];
        // repeation of code
//        marks[0][0] = 12;
//        marks[0][1] = 45;
//        marks[0][2] = 89;
//
//        marks[1][0] = 15;
//        marks[1][1] = 23;
//        marks[1][2] = 67;
//
//        marks[2][0] = 59;
//        marks[2][1] = 74;
//        marks[2][2] = 89;
//
//        marks[3][0] = 29;
//        marks[3][1] = 39;
//        marks[3][2] = 12;

//        int marks[][]={
//                       {12,45,89},
//                        {12,67,87},
//                        {14,84,45},
//                        {14,67,36}
//                        };
//
//        System.out.println(marks[2][1]);

    }

}