package com.example.graphql.springbootgraphqldatafetcher.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.graphql.springbootgraphqldatafetcher.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	Book findByTitle(String title);
}
