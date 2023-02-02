package com.example.gafise.dto.model;

import java.util.List;

import com.example.gafise.enums.Category;

public class Game extends Entreterimento {
	private String platform;

	public Game(String name, String genre, List<Personages> personages, String platform) {
		super(name, genre, personages, Category.GAME);
		this.platform = platform;
	}
	
	

	public String getPlatform() {
		return platform;
	}
}
