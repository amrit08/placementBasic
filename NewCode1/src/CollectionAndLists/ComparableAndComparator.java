package CollectionAndLists;
import java.util.*;

class MyCustomDogComparator implements Comparator<Animal>
{
    @Override
    public int compare(Animal o1, Animal o2)
    {
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class ComparableAndComparator
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal(0,"Leo",10);
        Animal a2 = new Animal(1,"Aeo",20);
        Animal a3 = new Animal(0,"Beo",2);
        Animal a4 = new Animal(10,"ueo",11);
        Animal a5 = new Animal(1,"Deo",33);
        Animal a6 = new Animal(23,"heo",22);
        Animal a7 = new Animal(11,"ieo",45);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        dogs.add(a6);
        dogs.add(a7);

    //using comparable interface
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);

        //using comparator interface
        Collections.sort(dogs , new MyCustomDogComparator());
        System.out.println(dogs);



//        Collections.sort(dogs,(o1,o2)->
//        {
//           return o1.name.compareTo(o2.name);
//        });
//        System.out.println(dogs);

//        Collections.sort(dogs , Comparator.comparing(Animal::getAge)
//                .thenComparing(Animal::getName));
//
//        System.out.println(dogs);

//        int a[][] =
//        {
//                {4,3,1},
//                {4,1,1},
//                {1,4,7},
//                {0,2,3}
//
//        };
//        int row = a.length;
//        System.out.println(row);
//        int col = a[0].length;
//        System.out.println(col);
////        Arrays.sort(a, new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2)
////            {
////                return o1[0]-o2[0];
////            }
////        });
//
////        Arrays.sort(a, Comparator.comparingInt(arr -> arr[0]).
////                thenComparingInt(arr-> arr[1]));
//
//        Arrays.sort(a,(arr1,arr2)->
//        {
//            int i = 0;
//            while (i<3)
//            {
//               if (arr1[i] != arr2[i])
//               {
//                   return arr1[i]-arr2[i];
//               }
//               i++;
//            }
//            return arr1[i-1]-arr2[i-1];
//        });
//
//        for (int x[]:a)
//        {
//            for (int y:x)
//            {
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }
    }
}
