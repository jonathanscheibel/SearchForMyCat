package br.com.searchformycat;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.searchformycat.entries.Animal;
import br.com.searchformycat.entries.Cat;
import br.com.searchformycat.exceptions.AnimalInexistenteException;
import br.com.searchformycat.searchengine.SearchEngine;
import br.com.searchformycat.searchengine.locations;
import javax.faces.context.FacesContext;

@ManagedBean
public class ExecuteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public void routeCat(){			
		
		Animal cat = new Cat();
		cat.setNameAnimal("String");
		cat.setNameOwner("Jonathan");
		cat.setTelOwner("(32) 984962700");

		SearchEngine searchEngine;
		try {
			searchEngine = new SearchEngine(cat);
			
			// Simulação dos percursos
			searchEngine.attach(new locations(-21.7290441, -43.452561));
			searchEngine.attach(new locations(-21.7290446, -43.452567));
			searchEngine.attach(new locations(-21.7294452, -43.452572));

			// Percursos por onde o bichano andou
			searchEngine.showReportLocations();
			
		} catch (AnimalInexistenteException e) {
			System.out.format("Erro: (Cod%s) %s", e.getCodError(), e.getMessage());
		}

	}

}
