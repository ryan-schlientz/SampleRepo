package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.db.FakeDB;
import com.revature.model.Pokemon;

public class PokemonService {

	public static Pokemon getPokemon(int id) {
		return FakeDB.team.get(id);
	}
	
	public static void addPokemon(Pokemon p) {
		FakeDB.team.put(p.getId(), p);
	}

	public static List<Pokemon> getAllPokemon() {
		return new ArrayList<Pokemon>(FakeDB.team.values());
	}
	
}
