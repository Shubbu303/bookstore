package com.project.bookstore.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.project.bookstore.modal.Book;

public interface BookRepository extends CrudRepository<Book, UUID> {


}
