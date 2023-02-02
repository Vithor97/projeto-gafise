package com.example.gafise.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gafise.dto.model.Entreterimento;
import com.example.gafise.dto.model.Game;
import com.example.gafise.dto.model.Movie;
import com.example.gafise.dto.model.Personages;
import com.example.gafise.dto.model.TVShow;

@RestController()
@RequestMapping("/api/v{version}/entertainment")
public class EntreterimentoController {

	private List<Entreterimento> entertainments;

	public EntreterimentoController() {
		entertainments = new ArrayList<>();

		List<Personages> gta4 = new ArrayList<>();
		gta4.add(new Personages("Niko Bellic", "Claudio"));
		gta4.add(new Personages("Roman Bellic", "Edu"));
		entertainments.add(new Game("Grand Theft Auto IV", "Action-Adventure", gta4, "PlayStation 3"));

		List<Personages> bat = new ArrayList<>();
		bat.add(new Personages("Batman", "Christian bale"));
		entertainments.add(new Movie("The Dark Knight", "Action", bat, "Christopher Nolan"));

		List<Personages> got = new ArrayList<>();
		got.add(new Personages("Jon Snow", "Kit Harington"));
		got.add(new Personages("Daenerys", "Emilia Clarke"));
		entertainments.add(new TVShow("Game of Thrones", "Fantasy", got, 8));
	}

	@GetMapping
	public List<Entreterimento> getEntertainments() {
		Entreterimento g1 = new Game("Grand Theft Auto IV", "Action-Adventure", null, "PlayStation 3");
		return entertainments;
	}

	@GetMapping("/info")
	public Object getEntertainment(@RequestParam("name") String name) {

		for (Entreterimento entertainment : entertainments) {
			if (entertainment.getName().equalsIgnoreCase(name)) {
				return entertainment;
			}
		}
		return null;
	}

}
