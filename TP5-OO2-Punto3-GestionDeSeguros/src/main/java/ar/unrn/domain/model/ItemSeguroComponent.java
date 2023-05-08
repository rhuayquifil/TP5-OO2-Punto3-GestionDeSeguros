package ar.unrn.domain.model;

public class ItemSeguroComponent implements SeguroComponent {

	private double costo;

	public ItemSeguroComponent(double costo) {
		this.costo = costo;
	}

	public double costo() {
		return costo;
	}

	public void add(SeguroComponent seguro) {
	}

}
