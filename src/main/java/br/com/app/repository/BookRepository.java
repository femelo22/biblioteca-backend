package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
