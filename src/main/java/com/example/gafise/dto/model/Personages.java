package com.example.gafise.dto.model;

public class Personages {
	
	private String name;
	private String actor;
	
	public Personages(String name, String actor) {
		super();
		this.name = name;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	

}
