package com.kft.kalkulator.service.memory;

import com.kft.kalkulator.datamodel.Butor;
import com.kft.kalkulator.datamodel.Mennyiseg;
import com.kft.kalkulator.datamodel.Szoba;
import com.kft.kalkulator.service.api.ButorService;

public class ButorServiceImpl implements ButorService {

	public long getAr(Butor butor, Mennyiseg mennyiseg) throws NullPointerException {
		return butor.getAr() * mennyiseg.getMennyiseg();
	}

	public Butor getButorById(long id) throws NullPointerException {
		for (Szoba szoba : DataStore.lakas.getSzobak()) {
			for (Butor butor : szoba.getBerendezes()) {
				if (butor.getID() == id) {
					return butor;
				}
			}
		}
		throw new NullPointerException();
	}

	public Mennyiseg getMennyisegById(long id) throws NullPointerException {
		for (Mennyiseg mennyiseg : DataStore.lakas.getMennyisegek()) {
			if (mennyiseg.getID() == id) {
				return mennyiseg;
			}
		}
		throw new NullPointerException();
	}

}
