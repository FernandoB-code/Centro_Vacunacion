package CentroVacunacion;

public class PerroDeRescate implements Vacunable {

	private String raza;

	public PerroDeRescate(String raza) {
		super();
		setRaza(raza);
	}

	private void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public Prioridad getPrioridad() {
		
		return Prioridad.MINIMA;
	}

	@Override
	public String toString() {
		return "PerroDeRescate [raza=" + raza + "PRIORIDAD " + this.getPrioridad() + "]";
	}
	
	
	

}
