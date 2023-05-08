package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.ItemSeguroComponent;
import ar.unrn.domain.model.PaqueteSeguroComponent;
import ar.unrn.domain.model.SeguroComponent;

class PruebasUnitarias {

	@Test
	void paqueteConTodosLosSeguros() {
		SeguroComponent hogarSeguro = new ItemSeguroComponent(200);
		SeguroComponent automovilSeguro = new ItemSeguroComponent(100);
		SeguroComponent vidaSeguro = new ItemSeguroComponent(100);
		SeguroComponent medicosSeguro = new ItemSeguroComponent(150);

		SeguroComponent paqueteConTodosLosSeguros = new PaqueteSeguroComponent();
		paqueteConTodosLosSeguros.add(hogarSeguro);
		paqueteConTodosLosSeguros.add(automovilSeguro);
		paqueteConTodosLosSeguros.add(vidaSeguro);
		paqueteConTodosLosSeguros.add(medicosSeguro);

		assertEquals(440.0, paqueteConTodosLosSeguros.costo());
	}

	@Test
	void paqueteConUnSeguroYUnPaquete() {
		SeguroComponent hogarSeguro = new ItemSeguroComponent(200);
		SeguroComponent vidaSeguro = new ItemSeguroComponent(100);
		SeguroComponent medicosSeguro = new ItemSeguroComponent(150);

		SeguroComponent paqueteHogarYSalud = new PaqueteSeguroComponent();
		paqueteHogarYSalud.add(hogarSeguro);

		SeguroComponent paqueteSalud = new PaqueteSeguroComponent();
		paqueteSalud.add(vidaSeguro);
		paqueteSalud.add(medicosSeguro);

		paqueteHogarYSalud.add(paqueteSalud);

		assertEquals(382.5, paqueteHogarYSalud.costo());
	}

}
