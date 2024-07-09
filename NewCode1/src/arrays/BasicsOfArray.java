package arrays;

public class BasicsOfArray {

    public static void main(String[] args) {

//        int age[] = new int[5];
//        age[0] = 1;
//        age[1] = 4;
//        age[2] = 6;
//        for (int x:age)
//        {
//            System.out.println(x);
//        }
//        System.out.println(age.length);

        int marks[] = {2,4,5,67,89};
        System.out.println(marks[3]);

        String names[] = {"AKKJD","kjalka","kdsajl","kjdsaldsa"};

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Names is"+names[i]);
        }

        for (String name : names)
        {
            System.out.println("for each"+name);
        }
        
    }
}