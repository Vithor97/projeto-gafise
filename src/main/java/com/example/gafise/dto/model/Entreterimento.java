package com.example.gafise.dto.model;

import java.util.List;

import com.example.gafise.enums.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class Entreterimento {
	private String name;
	private String genre;
	private List<Personages> personages;
	private Category catogory;

//    public Entreterimento(String name, String genre) {
//        this.name = name;
//        this.genre = genre;
//    }

	public Entreterimento(String name, String genre, List<Personages> personages) {
		super();
		this.name = name;
		this.genre = genre;
		this.setPersonages(personages);
	}

	public Entreterimento(String name, String genre, List<Personages> personages,
			Category catogory) {
		super();
		this.name = name;
		this.genre = genre;
		this.catogory = catogory;
		this.personages = personages;
	}

	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public List<Personages> getPersonages() {
		return personages;
	}

	public void setPersonages(List<Personages> personages) {
		this.personages = personages;
	}

	public Category getCatogory() {
		return catogory;
	}

	public void setCatogory(Category catogory) {
		this.catogory = catogory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
