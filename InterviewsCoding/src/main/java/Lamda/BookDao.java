package Lamda;

import java.util.ArrayList;
import java.util.List;

public class BookDao
{
    public static  List<Book> getBooks()
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"Core Java",400));
        books.add(new Book(362,"Hibernate",130));
        books.add(new Book(120,"Spring",260));
        books.add(new Book(590,"WebService",300));
        return books;

    }


}
