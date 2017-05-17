package com.kft.kalkulator.datamodel;

public class Mennyiseg {

	private long ID;
	private int mennyiseg;

	public Mennyiseg(long ID, int mennyiseg) {
		this.ID = ID;
		this.mennyiseg = mennyiseg;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public int getMennyiseg() {
		return mennyiseg;
	}

	public void setMennyiseg(int mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
}
