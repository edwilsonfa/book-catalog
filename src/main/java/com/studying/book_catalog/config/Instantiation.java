/*
package com.studying.book_catalog.config;

import com.studying.book_catalog.models.Book;
import com.studying.book_catalog.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Susan J. Fowler", "Microsserviços Prontos Para a Produção", 120.0);
        Book book2 = new Book("Peter Jandl Junior", "Java Guia do Programador", 100.0);
        Book book3 = new Book("Robert C. Martin", "Código Limpo", 150.0);

        bookRepository.saveAll(Arrays.asList(book1,book2,book3));

    }
}
*/
