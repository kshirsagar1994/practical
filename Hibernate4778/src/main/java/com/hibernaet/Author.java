package com.hibernaet;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Author {
	
	@Id
	private int aId;
	@Column(name="author_name", length=20)
	private String name;
	
	@OneToMany //one author can write many books
	private List<Book> books;

}
