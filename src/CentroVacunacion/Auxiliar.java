package CentroVacunacion;

public class Auxiliar extends PersonaEducativa {

	private final int HS_PARA_MAXIMA_PRIORIDAD = 4;

	private int hsDiarias;

	public Auxiliar(String dni, String nombre, int edad, boolean esDeRiesgo, Nivel nivel, int hsDiarias) {
		super(dni, nombre, edad, esDeRiesgo, nivel);
		setHsDiarias(hsDiarias);
	}

	private void setHsDiarias(int hsDiarias) {
		this.hsDiarias = hsDiarias;
	}

	public Prioridad getPrioridad() {

		Prioridad p = Prioridad.MEDIA;

		if (this.hsDiarias > this.HS_PARA_MAXIMA_PRIORIDAD && this.getNivel().equals(Prioridad.MAXIMA)) {

			p = Prioridad.MAXIMA;

		}

		return p;
	}

}
