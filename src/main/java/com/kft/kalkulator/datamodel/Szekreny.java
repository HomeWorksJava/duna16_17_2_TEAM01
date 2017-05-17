package com.kft.kalkulator.datamodel;

public class Szekreny extends Butor {

	private int fiokSzam;

	public Szekreny(long ID, int magassagCm, int szelessegCm, int melysegCm, long ar, String gyarto, String nev, int fiokSzam) {
		super(ID, magassagCm, szelessegCm, melysegCm, ar, gyarto, nev);
		this.fiokSzam = fiokSzam;
	}

	public int getFiokSzam() {
		return fiokSzam;
	}

	public void setFiokSzam(int fiokSzam) {
		this.fiokSzam = fiokSzam;
	}
}
