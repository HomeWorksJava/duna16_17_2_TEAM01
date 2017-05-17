package com.kft.kalkulator.service.memory;

import com.kft.kalkulator.datamodel.Kanape;
import com.kft.kalkulator.datamodel.Mennyiseg;
import com.kft.kalkulator.service.api.KanapeService;

public class KanapeServiceImpl extends ButorServiceImpl implements KanapeService {

	public long getAr(Kanape kanape, Mennyiseg mennyiseg) throws NullPointerException {
		return kanape.getAr() * mennyiseg.getMennyiseg();
	}

	@Override
	public Kanape getButorById(long id) throws NullPointerException {
		return (Kanape) super.getButorById(id);
	}

}
