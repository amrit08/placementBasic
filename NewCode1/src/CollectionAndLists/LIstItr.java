package CollectionAndLists;

import java.util.*;

public class LIstItr {
    public static void main(String[] args)
    {

//        ArrayList<String> fruits =  new ArrayList<>();

     //  List<String> fruits = new LinkedList<>();

     //   List<String> fruits = new Vector<String>(20);

       // List<String> fruits = new Stack<>();

          Stack<String> fruits = new Stack<>();

        fruits.push("guava");
        fruits.push("abcd");
        fruits.push("def");
        fruits.push("ghi");

        System.out.println(fruits.size());

//        fruits.add("kiwi");
//        fruits.add("papaya");
//        fruits.add("mango");
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add(0,"mango");

        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits.pop());
        System.out.println(fruits.pop());
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits.peek());
        System.out.println(fruits);
        System.out.println(fruits.empty());


////Iteration through For-Loop
//
//        for (int i=fruits.size()-1;i>=0;i--)
//        {
//            System.out.println("fruits is"+fruits.get(i));
//        }

//        System.out.println("++++++++++++++++++++++++++++++");
////Iteration through for-each loop
//
        for (var fruit:fruits)
        {
            System.out.println("for each fruit"+fruit);
        }
//        System.out.println("++++++++++++++++++++++++++++++");
//Iteration through Iterator interface

//       Iterator<String> it= fruits.iterator();
//        while (it.hasNext())
//        {
//             System.out.println("Iterator"+it.next());
//        }
//        System.out.println("++++++++++++++++++++++++++++++");
//
////Iteration through List Iterator
//        ListIterator<String> lt = fruits.listIterator();
//        while (lt.hasNext())
//        {
//            lt.next();
////            System.out.println(lt.next());
//        }
//        while (lt.hasPrevious())
//        {
//            System.out.println(lt.previous());
//        }

        //Iteration through for-each method
//        fruits.forEach(a-> System.out.println(a));



//
//        List<String> smallList = fruits.subList(1,3);
//        System.out.println(smallList);
//

    }
}
