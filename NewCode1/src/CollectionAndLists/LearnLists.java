package CollectionAndLists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LearnLists
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(50);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(30);
        list.add(3);
        list.add(4);
        list.add(0,12);

        System.out.println(list);
        //System.out.println(list.get(0));
      //  System.out.println(list.indexOf(3));
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.set(1,200);
//        System.out.println(list);
//        list.add(300);
//        System.out.println(list);
//        list.add(1,100);
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
//        for (Integer x:list)
//        {
//            System.out.println(x);
//        }
////
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(90));
//        list.remove(1);
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list2);
//        list.retainAll(list2);
//        System.out.println(list);
//        System.out.println(list2);
//        System.out.println(list.containsAll(list2));
//        System.out.println(list.equals(list2));
//        list.clear();
//        System.out.println(list);
//        System.out.println(list2);
//        Object a[] = list.toArray();
//        for (Object e:a)
//        {
//            int temp = (Integer) e;
//            System.out.println(temp);
//        }

   List<Integer> subList =  list.subList(1,4);
        System.out.println(subList);
    }

}


