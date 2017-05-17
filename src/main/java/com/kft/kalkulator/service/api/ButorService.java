package com.kft.kalkulator.service.api;

import com.kft.kalkulator.datamodel.Butor;
import com.kft.kalkulator.datamodel.Mennyiseg;

public interface ButorService {

	public long getAr(Butor butor, Mennyiseg mennyiseg) throws NullPointerException;

	public Butor getButorById(long id) throws NullPointerException;

	public Mennyiseg getMennyisegById(long id) throws NullPointerException;
}
