package com.example.demo;

import java.util.Optional;

public interface BookService {
	Iterable<Book> findAll();

	Book create(Book book);

	Optional<Book> find(String isbn);
}
