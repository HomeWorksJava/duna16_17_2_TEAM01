package com.kft.kalkulator.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Szoba {

	private String name;
	private List<Butor> berendezes = new ArrayList<Butor>();

	public Szoba() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Butor> getBerendezes() {
		return berendezes;
	}

	public void setBerendezes(List<Butor> berendezes) {
		this.berendezes = berendezes;
	}

	public void addBerendezes(Butor butor) {
		berendezes.add(butor);
	}
}
