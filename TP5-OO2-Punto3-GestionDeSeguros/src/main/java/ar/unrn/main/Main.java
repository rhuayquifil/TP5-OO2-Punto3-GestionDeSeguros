package ar.unrn.main;

import ar.unrn.domain.model.ItemSeguroComponent;
import ar.unrn.domain.model.PaqueteSeguroComponent;
import ar.unrn.domain.model.SeguroComponent;

public class Main {

	public static void main(String[] args) {

		SeguroComponent hogarSeguro = new ItemSeguroComponent(100);
		SeguroComponent automovilSeguro = new ItemSeguroComponent(100);

		SeguroComponent paqueteHogar = new PaqueteSeguroComponent();
		paqueteHogar.add(hogarSeguro);

		SeguroComponent paqueteHogarYAutomovil = new PaqueteSeguroComponent();
		paqueteHogarYAutomovil.add(paqueteHogar);
		paqueteHogarYAutomovil.add(automovilSeguro);

		System.out.println(paqueteHogarYAutomovil.costo());
	}

}
