package com.example.graphql.springbootgraphqldatafetcher.service.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.graphql.springbootgraphqldatafetcher.repository.BookRepository;
import com.example.graphql.springbootgraphqldatafetcher.model.Book;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book> {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book get(DataFetchingEnvironment environment) {
		String title = environment.getArgument("title");
		return bookRepository.findByTitle(title);
	}


}
