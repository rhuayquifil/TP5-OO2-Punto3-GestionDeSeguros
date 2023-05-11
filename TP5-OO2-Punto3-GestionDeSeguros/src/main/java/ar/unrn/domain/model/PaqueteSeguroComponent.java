package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.Objects;

public class PaqueteSeguroComponent implements SeguroComponent {

	private ArrayList<SeguroComponent> listaSeguro;

	public PaqueteSeguroComponent() {
		this.listaSeguro = new ArrayList<SeguroComponent>();
	}

	public void add(SeguroComponent itemSeguro) {
		Objects.requireNonNull(itemSeguro);
		this.listaSeguro.add(itemSeguro);

	}

	public double costo() {
		double costoPaquete = 0;
		for (SeguroComponent itemSeguro : listaSeguro) {
			costoPaquete += itemSeguro.costo() * (1 - 0.05); // aca aplicar descuento
		}
		return costoPaquete;
	}

}
