package com.studying.book_catalog.services.impl;

import com.studying.book_catalog.models.Book;
import com.studying.book_catalog.repositories.BookRepository;
import com.studying.book_catalog.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create(Book bookToCreated) {
        return bookRepository.save(bookToCreated);
    }

    @Override
    public Book update(Book bookToUpdated) {
        return null;
    }

    @Override
    public void delete(Long id) {
       Book bookDel = this.findById(id);
       bookRepository.delete(bookDel);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
