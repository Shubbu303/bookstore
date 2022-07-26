package com.project.bookstore.Dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//to create getter and setter 
@Builder(builderMethodName = "methodBuilder",buildMethodName = "build")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="Book dto", description ="All details about book")
public class BookDto {
	
	@ApiModelProperty(
			readOnly = true,
			value="UUID",
			dataType = "UUID",
			example = "3fa85f64-5717-4562-b3fc-2c963f66afa6",
			notes="auto generated",
			required = true)
	private UUID id;
	
	@ApiModelProperty(
			value="title",
			dataType = "String",
			example = "book- title")
	private String title;
	
	@ApiModelProperty(
			value="Description",
			dataType = "String",
			example = "This is my first book")
	private String description;
	
	@ApiModelProperty(
			value="release year",
			dataType = "int",
			example = "2022")
	private int releaseYear;

}
