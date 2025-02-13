package io.github.patrikalm.g52springlibraryworkshop.repository;

import io.github.patrikalm.g52springlibraryworkshop.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Book persist(Book book);

    Book merge(Book book);

    void remove(Book book);

    Book findByIsbnIgnoreCase(String isbn);

    Book findByTitleContains(String title);

    List<Book> findByMaxLoanDaysLessThan(int maxLoanDays);

}
