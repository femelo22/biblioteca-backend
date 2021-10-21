package br.com.app.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.domain.Book;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

	@PostMapping
	public ResponseEntity insert(@RequestBody Book book) {
		
		
		return null;
	}
	
	
	
	
}
