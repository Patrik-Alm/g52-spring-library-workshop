package io.github.patrikalm.g52springlibraryworkshop.repository;

import io.github.patrikalm.g52springlibraryworkshop.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.parser.Part;

import java.time.LocalDate;
import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    AppUser findByUsername(String username);

    List<AppUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);

    List<AppUser> findByDetailsId(Integer detailsId);

    AppUser findByDetails_EmailIgnoreCase(String email);

}
