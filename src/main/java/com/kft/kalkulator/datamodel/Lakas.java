package com.kft.kalkulator.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Lakas {

	private List<Szoba> szobak = new ArrayList<Szoba>();
	private List<Mennyiseg> mennyisegek = new ArrayList<Mennyiseg>();

	public List<Szoba> getSzobak() {
		return szobak;
	}

	public void setSzobak(List<Szoba> szobak) {
		this.szobak = szobak;
	}

	public void addSzoba(Szoba szoba) {
		this.szobak.add(szoba);
	}

	public List<Mennyiseg> getMennyisegek() {
		return mennyisegek;
	}

	public void setMennyisegek(List<Mennyiseg> mennyisegek) {
		this.mennyisegek = mennyisegek;
	}

	public void addMennyiseg(Mennyiseg mennyiseg) {
		this.mennyisegek.add(mennyiseg);
	}
}
