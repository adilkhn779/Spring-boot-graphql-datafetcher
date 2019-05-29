package com.example.graphql.springbootgraphqldatafetcher.service.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.graphql.springbootgraphqldatafetcher.repository.BookRepository;
import com.example.graphql.springbootgraphqldatafetcher.model.Book;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>>{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> get(DataFetchingEnvironment environment) {
		return bookRepository.findAll();
	}


}
