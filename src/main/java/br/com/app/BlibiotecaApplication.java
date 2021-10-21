package br.com.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.app.domain.Book;
import br.com.app.repository.BookRepository;

@SpringBootApplication
public class BlibiotecaApplication implements CommandLineRunner{

	
	@Autowired
	BookRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(BlibiotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RODANDO A MILHÃO");
		
		Book book = new Book();
		book.setTitle("Harry Potter");
		book.setPublishingCompany("Rocco");
		book.setPhoto("https://i.imgur.com/UH3IPXw.jpg");
		book.setAuthors(Arrays.asList("JK Rowling"));
		
		Book book2 = new Book();
		book2.setTitle("Pai Rico, Pai Pobre");
		book2.setPublishingCompany("Rocco");
		book2.setPhoto("https://i.imgur.com/UH3IPXw.jpg");
		book2.setAuthors(Arrays.asList("Robert Kiyosaki","Sharon L. Lechter"));
		
		
		
		this.repo.save(book);
		
	}

}
