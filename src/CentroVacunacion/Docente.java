package CentroVacunacion;

public class Docente extends PersonaEducativa {

	private String titulo;

	public Docente(String dni, String nombre, int edad, boolean esDeRiesgo, Nivel nivel, String titulo) {
		super(dni, nombre, edad, esDeRiesgo, nivel);
		setTitulo(titulo);
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Prioridad getPrioridad() {

		return Prioridad.MAXIMA;
	}

}
