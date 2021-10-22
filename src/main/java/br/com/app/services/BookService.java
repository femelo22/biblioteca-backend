package br.com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.domain.Book;
import br.com.app.domain.dto.BookDTO;
import br.com.app.repository.BookRepository;
import br.com.app.services.exceptions.ElementNotFoundException;

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
		return this.repo.findById(id).orElseThrow(() -> new ElementNotFoundException("Book not found."));
	}
	
	public Book updateBook(BookDTO dto, Integer id) {
		Book book = new Book(dto);
		book.setId(id);
		
		return this.repo.save(book);
	}
	
	public void deleteBook(Integer id) {
		this.repo.deleteById(id);
	}
	
}
