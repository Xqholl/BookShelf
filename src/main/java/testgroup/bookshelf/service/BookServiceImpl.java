package testgroup.bookshelf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.bookshelf.dao.BookDAO;
import testgroup.bookshelf.dao.BookDAOImpl;
import testgroup.bookshelf.model.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public List<Book> allBooks() {
        return bookDAO.allBooks();
    }

    @Override
    public void add(Book book) {
        bookDAO.add(book);

    }

    @Override
    public void delete(Book book) {
        bookDAO.delete(book);

    }

    @Override
    public void edit(Book book) {
        bookDAO.edit(book);

    }

    @Override
    public Book getById(int id) {
        return bookDAO.getById(id);

    }
}
