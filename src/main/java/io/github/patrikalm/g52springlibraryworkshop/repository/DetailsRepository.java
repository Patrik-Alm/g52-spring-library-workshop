package io.github.patrikalm.g52springlibraryworkshop.repository;

import io.github.patrikalm.g52springlibraryworkshop.entity.Details;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetailsRepository extends CrudRepository<Details, Integer> {

    Details persist(Details details);

    Details merge(Details details);

    void remove(Details details);

    Details findByEmail(String email);

    List<Details> findByNameContains(String name);

    List<Details> findByNameIgnoreCase(String name);

}
