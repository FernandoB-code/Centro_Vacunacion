package CentroVacunacion;



public class Test {

	public static void main(String[] args) {
		
		CentroVacunacion c = new CentroVacunacion();
		
		c.agregar(); // cargar datos
		
		c.mostrarObtenerCantidadesPorColaYPrioridad(); // crear y mostar la matriz
		
		c.mostrarColaPorPrioridad(); // test para verificar que la cola unica se haya ordenado correctamente. Los datos del constructor estan cargados de manera parcial.
		

	}

}
