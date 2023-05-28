package com.hibernaet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="book_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	@Column(length=30, name="book_name", nullable=false) 
	private String bookName;
	
	@Column(name="book_pages", length=10)
	private int bookPages;
	
	@Column(name="book_pricec", length=10)
	private double bookPrice;
	
	@ManyToOne //many book can be written by one author
	private Author author; //entity referance
	

}
