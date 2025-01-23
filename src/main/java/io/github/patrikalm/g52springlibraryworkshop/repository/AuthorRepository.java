package io.github.patrikalm.g52springlibraryworkshop.repository;

import io.github.patrikalm.g52springlibraryworkshop.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

    List<Author> findByFirstName(String firstName);

    List<Author> findByLastName(String lastName);

    List<Author> findByFirstNameOrLastNameContains(String keyword);

    List<Author> findByBookId(Integer bookId);

    @Transactional(rollbackOn = Exception.class)
    Author updateAuthorNameById(Integer authorId, String newName);

    @Transactional(rollbackOn = Exception.class)
    Author deleteAuthorById(Integer authorId);


}
