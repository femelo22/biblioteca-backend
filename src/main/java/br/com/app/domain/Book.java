package br.com.app.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import br.com.app.domain.dto.BookDTO;


@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	@NotBlank(message = "title cannot be blank")
	private String title;
	
	@Column(name = "publishing_company")
	@NotBlank(message = "publishing company cannot be blank")
	private String publishingCompany;
	
	@Column(name = "photo")
	@NotBlank(message = "photo cannot be blank")
	private String photo;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Column(name = "authors")
	private List<String> authors;
	
	public Book() {
		
	}
	
	public Book(BookDTO dto) {
		this.title = dto.getTitle();
		this.publishingCompany = dto.getPublishingCompany();
		this.photo = dto.getPhoto();
		this.authors = dto.getAuthors();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}
