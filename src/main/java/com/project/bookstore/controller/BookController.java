package com.project.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookstore.BookService;
import com.project.bookstore.Dto.BookDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Api(value = "Book API", tags= {"Books API"}, produces = "application/json")
@Tag(name = "Books API",description = "all api related to book store")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/v1/books")
	@ApiOperation(value="get list of books", produces = "application/json",response = BookDto[].class)
	@ApiResponses(value= {
			@ApiResponse(code =200,message="Fetching book data successfull"),
			@ApiResponse(code=403,message = "Accessing resource is forbidden"),
			@ApiResponse(code=404,message="Not found")
	})
	public ResponseEntity<List<BookDto>> getBooks(){
		List<BookDto> books =bookService.getBooks();
	return ResponseEntity.ok(books);
	}
	
	
}
