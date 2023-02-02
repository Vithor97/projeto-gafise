package com.example.gafise.dto.model;

import java.util.List;

import com.example.gafise.enums.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class TVShow extends Entreterimento {

	   private int numberOfSeasons;


	    public TVShow(String name, String genre, List<Personages> personages, int numberOfSeasons) {
		super(name, genre, personages, Category.TVSHOW);
		this.numberOfSeasons = numberOfSeasons;
	}


		public int getNumberOfSeasons() {
	        return numberOfSeasons;
	    }
}
