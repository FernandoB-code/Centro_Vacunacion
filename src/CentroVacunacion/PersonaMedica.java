package CentroVacunacion;

public class PersonaMedica extends Persona {

	private String matricula;

	public PersonaMedica(String dni, String nombre, int edad, boolean esDeRiesgo, String matricula) {
		super(dni, nombre, edad, esDeRiesgo);
		setMatricula(matricula);
	}

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public Prioridad getPrioridad() {

		return Prioridad.MAXIMA;
	}

}
