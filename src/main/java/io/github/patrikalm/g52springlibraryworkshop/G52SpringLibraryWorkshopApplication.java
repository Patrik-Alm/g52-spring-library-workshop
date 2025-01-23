package io.github.patrikalm.g52springlibraryworkshop;

import io.github.patrikalm.g52springlibraryworkshop.entity.AppUser;
import io.github.patrikalm.g52springlibraryworkshop.repository.AppUserRepository;
import io.github.patrikalm.g52springlibraryworkshop.repository.BookLoanRepository;
import io.github.patrikalm.g52springlibraryworkshop.repository.BookRepository;
import io.github.patrikalm.g52springlibraryworkshop.repository.DetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class G52SpringLibraryWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(G52SpringLibraryWorkshopApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(AppUserRepository appUserRepository, BookLoanRepository bookLoanRepository, BookRepository bookRepository, DetailsRepository detailsRepository) {

        return args -> {

            AppUser appUser = new AppUser("Simon Elbrink", "1234");

        };
    }
}
