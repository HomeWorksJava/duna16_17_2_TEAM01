package com.kft.kalkulator;

import com.kft.kalkulator.datamodel.Kanape;
import com.kft.kalkulator.service.memory.DataStore;
import com.kft.kalkulator.service.memory.KanapeServiceImpl;

public class Teszt {

	public static void main(String[] argvs) {

		Kanape kanape = (Kanape) DataStore.lakas.getSzobak().get(0).getBerendezes().get(2);
		System.out.println(kanape.getUlohely());

		KanapeServiceImpl serv = new KanapeServiceImpl();
		System.out.println(serv.getButorById(2).getUlohely());
	}
}
