package testgroup.bookshelf.dao;

import org.springframework.stereotype.Repository;
import testgroup.bookshelf.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class BookDAOImpl implements BookDAO {

        private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
        private static Map<Integer, Book> books = new HashMap<>();

        static {
        Book book1 = new Book();
        book1.setId(AUTO_ID.getAndIncrement());
        book1.setTitle("Портрет Дориана Грея");
        book1.setAuthor("Оскар Уайльд");
        book1.setGenre("Роман");
        book1.setRead(true);
        books.put(book1.getId(),book1);

        Book book2 = new Book();
        book2.setId(AUTO_ID.getAndIncrement());
        book2.setTitle("Униженные и оскорбленные");
        book2.setAuthor("Достоевский Ф.М.");
        book2.setGenre("Художественная литература");
        book2.setRead(true);
        books.put(book2.getId(),book2);

        Book book3 = new Book();
        book3.setId(AUTO_ID.getAndIncrement());
        book3.setTitle("Поющие в терновнике");
        book3.setAuthor("Колин Маккалоу");
        book3.setGenre("Роман");
        book3.setRead(true);
        books.put(book3.getId(),book3);
    }


    @Override
    public List<Book> allBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void add(Book book) {
        book.setId(AUTO_ID.getAndIncrement());
        books.put(book.getId(), book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book.getId());

    }

    @Override
    public void edit(Book book) {
        books.put(book.getId(), book);

    }

    @Override
    public Book getById(int id) {
        return books.get(id);
    }
}
