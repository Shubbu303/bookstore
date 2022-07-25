package com.project.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookstore.Dto.BookDto;

@RestController
public class BookController {

	@GetMapping("api/v1/books")
	public ResponseEntity<List<BookDto>> getBooks(){
		BookDto book = BookDto.methodBuilder().title("my first book title").build();
	List<BookDto> books = new ArrayList<>();
	books.add(book);
	return ResponseEntity.ok(books);
	}
}
