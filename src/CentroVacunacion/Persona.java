package CentroVacunacion;

public class Persona implements Vacunable {

	static int EDAD_RIESGO = 60;
	static int EDAD_JOVEN = 30;

	private String dni;
	private String nombre;
	private int edad;
	private boolean esDeRiesgo;

	public Persona(String dni, String nombre, int edad, boolean esDeRiesgo) {
		super();
		setDni(dni);
		setNombre(nombre);
		setEdad(edad);
		setEsDeRiesgo(esDeRiesgo);
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	private void setEsDeRiesgo(boolean esDeRiesgo) {
		this.esDeRiesgo = esDeRiesgo;
	}

	@Override
	public Prioridad getPrioridad() {

		Prioridad p = Prioridad.MEDIA;

		if (this.esDeRiesgo || this.edad > this.EDAD_RIESGO) {

			p = Prioridad.MAXIMA;

		} else if (this.edad < this.EDAD_JOVEN) {

			p = Prioridad.MINIMA;

		}

		return p;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", esDeRiesgo=" + esDeRiesgo + "Prioridad " + this.getPrioridad() + "]";
	}
	
	

}
