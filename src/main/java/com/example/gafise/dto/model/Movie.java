package com.example.gafise.dto.model;

import java.util.List;

import com.example.gafise.enums.Category;

public class Movie extends Entreterimento {
	private String director;

	public Movie(String name, String genre, List<Personages> personages, String director) {
		super(name, genre, personages, Category.FILM);
		this.director = director;
	}

	public String getDirector() {
		return director;
	}
}
