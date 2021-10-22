package br.com.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.domain.Book;
import br.com.app.repository.BookRepository;
import br.com.app.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	
	@Autowired
	private BookService service;

	@PostMapping
	public ResponseEntity insert(@RequestBody Book book) {
		
		return ResponseEntity.ok().body(this.service.saveBook(book));
	}
	
	
	@GetMapping
	public ResponseEntity findAll() {
		return ResponseEntity.ok().body(this.service.getBooks());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity findById(@PathVariable(name = "id") Integer id) {
		
		return ResponseEntity.ok().body(this.service.findBookById(id));
		
	}
	
	
}
