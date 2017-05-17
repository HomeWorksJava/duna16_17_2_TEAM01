package com.kft.kalkulator.datamodel;

public class Konyhaszekreny extends Szekreny {

	// also vagy felso szekreny
	private boolean also;

	public Konyhaszekreny(long ID, int magassagCm, int szelessegCm, int melysegCm, long ar, String gyarto, String nev, int fiokSzam, boolean also) {
		super(ID, magassagCm, szelessegCm, melysegCm, ar, gyarto, nev, fiokSzam);
		this.also = also;
	}

	public boolean isAlso() {
		return also;
	}

	public void setAlso(boolean also) {
		this.also = also;
	}
}
