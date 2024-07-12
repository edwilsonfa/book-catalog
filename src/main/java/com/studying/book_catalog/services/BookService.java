package com.studying.book_catalog.services;

import com.studying.book_catalog.models.Book;

import java.util.List;

public interface BookService {
    Book create(Book bookToCreated);
    Book update(Book bookToUpdated);
    void delete(Long id);
    Book findById(Long id);
    List<Book> findAll();
}
