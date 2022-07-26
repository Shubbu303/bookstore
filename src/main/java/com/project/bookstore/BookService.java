package com.project.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.bookstore.Dto.BookDto;
import com.project.bookstore.modal.Book;
import com.project.bookstore.repository.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepository;
	private final ModelMapper modelMapper;
	
	public BookService(BookRepository bookRepository,ModelMapper modelMapper) {
		this.bookRepository=bookRepository;
		this.modelMapper=modelMapper;
	}
	
	public List<BookDto> getBooks(){
	Iterable<Book> all=	bookRepository.findAll();
	List<BookDto> actualList = StreamSupport
			  .stream(all.spliterator(), false).map(book->modelMapper.map(book, BookDto.class))
			  .collect(Collectors.toList());
	
//	List<BookDto> actualList= new ArrayList<>();
//	BookDto book = BookDto.methodBuilder().title("my first book title").build();
//	BookDto book2 = BookDto.methodBuilder().title("my second book title").build();
//	actualList.add(book);
//	actualList.add(book2);
	return actualList;

	}

}
