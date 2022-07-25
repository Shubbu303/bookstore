package com.project.bookstore.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//to create getter and setter 
@Builder(builderMethodName = "methodBuilder",buildMethodName = "build")
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	private String title;

}
