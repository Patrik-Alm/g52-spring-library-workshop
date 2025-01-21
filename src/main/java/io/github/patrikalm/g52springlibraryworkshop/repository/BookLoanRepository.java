package io.github.patrikalm.g52springlibraryworkshop.repository;


import io.github.patrikalm.g52springlibraryworkshop.entity.BookLoan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookLoanRepository extends CrudRepository<BookLoan, Integer> {

    List<BookLoan> findByAppUserId(String appUserId);

    List<BookLoan> findByBookId(Integer bookId);

    List<BookLoan> findByNotReturned();

    List<BookLoan> findByBookNotReturnedAndDueDateBefore(LocalDate perDate);

    List<BookLoan> findByLoanDateBetween(LocalDate startDate, LocalDate endDate);

    BookLoan setReturnedByBookLoanId(Integer bookLoanId);
}
