package br.com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.domain.Book;
import br.com.app.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repo;
	
	public Book saveBook(Book book) {
		return this.repo.save(book);
	}
	
	public List<Book> getBooks(){
		return this.repo.findAll();
	}
	
	public Book findBookById(Integer id){
		return this.repo.findById(id).orElseThrow();
	}
	
}
