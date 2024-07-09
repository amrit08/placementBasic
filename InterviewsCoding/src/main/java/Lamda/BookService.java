package Lamda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService
{
    public List<Book> getBooksInSort()
    {
        List<Book> books = new BookDao().getBooks();

        //using normal comparator class
//        Collections.sort(books,new MyComparator());

        //using lamda expression
//        Collections.sort(books,(o1,o2)->
//                {
//                   // System.out.println("dsajk");
//                    return o2.getId() - o1.getId();
//                });
        Collections.sort(books,(o1,o2)-> o2.getId() - o1.getId());


        // using anonymous class
//        Collections.sort(books, new Comparator<Book>()
//        {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getId()-o1.getId();
//            }
//        });

        return books;
    }

    public static void main(String[] args)
    {
        List<Book> list = new  BookService().getBooksInSort();
        System.out.println(list);
    }

}

//using separte class
class MyComparator implements Comparator<Book>
{
    @Override
    public int compare(Book o1, Book o2)
    {
       // return o1.getName().compareTo(o2.getName());
        return o1.getId()-o2.getId();
    }
}


