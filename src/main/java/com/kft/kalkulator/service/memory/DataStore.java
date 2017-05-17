package com.kft.kalkulator.service.memory;

import com.kft.kalkulator.datamodel.Butor;
import com.kft.kalkulator.datamodel.Kanape;
import com.kft.kalkulator.datamodel.Konyhaszekreny;
import com.kft.kalkulator.datamodel.Lakas;
import com.kft.kalkulator.datamodel.Szekreny;
import com.kft.kalkulator.datamodel.Szoba;

public class DataStore {
	public static final Lakas lakas = new Lakas();

	static {
		Szoba nappali = new Szoba();
		nappali.setName("nappali");

		nappali.addBerendezes(new Butor(0, 60, 40, 40, 1400, "IKEA", "szek"));
		nappali.addBerendezes(new Butor(1, 80, 120, 120, 22000, "IKEA", "asztal"));
		nappali.addBerendezes(new Kanape(2, 60, 200, 80, 200000, "KIKA", "kanape", 4));

		lakas.addSzoba(nappali);

		Szoba halo = new Szoba();
		halo.setName("halo");

		halo.addBerendezes(new Butor(3, 60, 200, 160, 142020, "KUKA", "agy"));
		halo.addBerendezes(new Szekreny(4, 220, 200, 80, 120000, "Fa Kft.", "gardrob", 12));

		lakas.addSzoba(halo);

		Szoba konyha = new Szoba();
		konyha.setName("konyha");

		konyha.addBerendezes(new Konyhaszekreny(5, 80, 60, 80, 40000, "Konyha Bt.", "also nagy", 4, true));
		konyha.addBerendezes(new Konyhaszekreny(6, 80, 40, 80, 30000, "Konyha Bt.", "also kicsi", 4, true));
		konyha.addBerendezes(new Konyhaszekreny(7, 40, 60, 80, 20000, "Konyha Bt.", "felso nagy", 1, false));
		konyha.addBerendezes(new Konyhaszekreny(8, 40, 40, 80, 20000, "Konyha Bt.", "felso kicsi", 1, false));

		lakas.addSzoba(konyha);
	}
}
