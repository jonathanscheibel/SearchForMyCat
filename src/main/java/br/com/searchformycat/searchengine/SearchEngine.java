package br.com.searchformycat.searchengine;

import java.util.ArrayList;

import br.com.searchformycat.entries.*;
import br.com.searchformycat.exceptions.AnimalInexistenteException;

public class SearchEngine {

	private final String API_ATUAL = "maps.google";

	private String api;
	private Animal myAnimal;
	private ArrayList<locations> localizations;

	public SearchEngine(Animal animal) throws AnimalInexistenteException {
		if (animal == null){
			throw new AnimalInexistenteException("O seu animal não pode ser nullo! \n", 1);
		}
	
		localizations = new ArrayList<locations>();
		setApi(API_ATUAL);
		setMyAnimal(animal);
	}

	public void showReportLocations() {
		for (locations locations : localizations) {
			System.out.print(myAnimal.getNameAnimal() + ": ");
			System.out.print("Lat: " + locations.getLatitude() + "  ");
			System.out.println("Lon: " + locations.getLongitude());
		}
	}

	public void attach(locations localization) {
		localizations.add(localization);
	}

	public void detach(locations localization) {
		localizations.remove(localization);
	}

	public Animal getMyAnimal() {
		return myAnimal;
	}

	protected void setMyAnimal(Animal animal) {
		this.myAnimal = animal;
	}

	protected String getApi() {
		return api;
	}

	protected void setApi(String api) {
		this.api = api;
	}

}
