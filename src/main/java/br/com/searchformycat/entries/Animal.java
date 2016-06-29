package br.com.searchformycat.entries;

public class Animal {

	private String name;
	private double age;
	private String nameOwner;
	private String telOwner;

	public String getNameAnimal() {
		return name;
	}

	public void setNameAnimal(String nameCat) {
		this.name = nameCat;
	}

	public double getAgeAnimal() {
		return age;
	}

	public void setAgeAnimal(double ageCat) {
		this.age = ageCat;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getTelOwner() {
		return telOwner;
	}

	public void setTelOwner(String telOwner) {
		this.telOwner = telOwner;
	}

}
