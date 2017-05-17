package com.kft.kalkulator.service.memory;

import com.kft.kalkulator.datamodel.Szoba;
import com.kft.kalkulator.service.api.SzobaService;

public class SzobaServiceImpl implements SzobaService {

	public Szoba getSzobaByNev(String nev) throws NullPointerException {
		for (Szoba szoba : DataStore.lakas.getSzobak()) {
			if (szoba.getName().equals(nev)) {
				return szoba;
			}
		}
		throw new NullPointerException();
	}

}
