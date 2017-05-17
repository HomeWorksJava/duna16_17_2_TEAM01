package com.kft.kalkulator.service.api;

import com.kft.kalkulator.datamodel.Kanape;
import com.kft.kalkulator.datamodel.Mennyiseg;

public interface KanapeService {

	public long getAr(Kanape kanape, Mennyiseg mennyiseg) throws NullPointerException;

	public Kanape getButorById(long id) throws NullPointerException;

	public Mennyiseg getMennyisegById(long id) throws NullPointerException;
}
