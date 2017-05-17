package com.kft.kalkulator.datamodel;

public class Kanape extends Butor {

	private int ulohely;

	public Kanape(long ID, int magassagCm, int szelessegCm, int melysegCm, long ar, String gyarto, String nev, int ulohely) {
		super(ID, magassagCm, szelessegCm, melysegCm, ar, gyarto, nev);
		this.ulohely = ulohely;
	}

	public int getUlohely() {
		return ulohely;
	}

	public void setUlohely(int ulohely) {
		this.ulohely = ulohely;
	}
}
