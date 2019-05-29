package com.example.graphql.springbootgraphqldatafetcher.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Book {
	@Id
	private String id;
	private String title;
	private String publisher;
	private String author;
	private String publishedDate;

}
