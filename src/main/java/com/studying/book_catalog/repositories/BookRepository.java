package com.studying.book_catalog.repositories;

import com.studying.book_catalog.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
