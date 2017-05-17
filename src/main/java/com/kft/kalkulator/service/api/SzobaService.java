package com.kft.kalkulator.service.api;

import com.kft.kalkulator.datamodel.Szoba;

public interface SzobaService {

	public Szoba getSzobaByNev(String nev) throws NullPointerException;
}
