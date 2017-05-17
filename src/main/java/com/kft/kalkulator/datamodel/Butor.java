package com.kft.kalkulator.datamodel;

public class Butor {

	protected long ID;
	protected int magassagCm;
	protected int szelessegCm;
	protected int melysegCm;

	private long ar;
	private String gyarto;
	private String nev;

	public Butor(long ID, int magassagCm, int szelessegCm, int melysegCm, long ar, String gyarto, String nev) {
		this.ID = ID;
		this.magassagCm = magassagCm;
		this.szelessegCm = szelessegCm;
		this.melysegCm = melysegCm;
		this.ar = ar;
		this.gyarto = gyarto;
		this.nev = nev;
	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public int getMagassagCm() {
		return magassagCm;
	}

	public void setMagassagCm(int magassagCm) {
		this.magassagCm = magassagCm;
	}

	public int getSzelessegCm() {
		return szelessegCm;
	}

	public void setSzelessegCm(int szelessegCm) {
		this.szelessegCm = szelessegCm;
	}

	public int getMelysegCm() {
		return melysegCm;
	}

	public void setMelysegCm(int melysegCm) {
		this.melysegCm = melysegCm;
	}

	public long getAr() {
		return ar;
	}

	public void setAr(long ar) {
		this.ar = ar;
	}

	public String getGyarto() {
		return gyarto;
	}

	public void setGyarto(String gyarto) {
		this.gyarto = gyarto;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

}
