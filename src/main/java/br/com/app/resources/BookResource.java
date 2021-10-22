package br.com.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.domain.Book;
import br.com.app.domain.dto.BookDTO;
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
	
	@PutMapping(value = "/{id}")
	public ResponseEntity update(@PathVariable(name = "id") Integer id, @RequestBody BookDTO dto) {
		return ResponseEntity.ok().body(this.service.updateBook(dto, id));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity delete(@PathVariable(name = "id") Integer id) {
		return ResponseEntity.noContent();
	}
	
	
}
