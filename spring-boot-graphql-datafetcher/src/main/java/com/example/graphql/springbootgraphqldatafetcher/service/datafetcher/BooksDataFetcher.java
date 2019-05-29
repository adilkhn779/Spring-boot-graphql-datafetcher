package com.example.graphql.springbootgraphqldatafetcher.service.datafetcher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.graphql.springbootgraphqldatafetcher.repository.BookRepository;
import com.example.graphql.springbootgraphqldatafetcher.model.Book;

import graphql.schema.DataFetcher;

@Component
public class BooksDataFetcher {
	@Autowired
	BookRepository bookRepository;

	public DataFetcher<List<Book>> getAllBook() {
		return dataFetchingEnvironment -> {
			return bookRepository.findAll();
		};
	}

	public DataFetcher<Book> getBookByTitle() {
		return dataFetchingEnvironment -> {
			return bookRepository.findByTitle(dataFetchingEnvironment.getArgument("tite"));
		};
	}

	public DataFetcher<Book> createNewBook() {
		return dataFetchingEnvironment -> {
			return bookRepository.save(new Book(dataFetchingEnvironment.getArgument("id"),
					dataFetchingEnvironment.getArgument("title"), dataFetchingEnvironment.getArgument("publisher"),
					dataFetchingEnvironment.getArgument("author"),dataFetchingEnvironment.getArgument("publishedDate")));
		};
	}

}
