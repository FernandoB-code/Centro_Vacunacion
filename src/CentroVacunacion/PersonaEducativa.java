package CentroVacunacion;

public abstract class PersonaEducativa extends Persona{

	private Nivel nivel;

	public PersonaEducativa(String dni, String nombre, int edad, boolean esDeRiesgo, Nivel nivel) {
		super(dni, nombre, edad, esDeRiesgo);
		this.nivel = nivel;
	}
	
	public Nivel getNivel() {
		
		return this.nivel;
		
	}
	

}
