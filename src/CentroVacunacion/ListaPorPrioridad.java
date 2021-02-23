package CentroVacunacion;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaPorPrioridad extends ListaOrdenadaNodos<Integer, Vacunable> {

	@Override
	public int compare(Vacunable v1, Vacunable v2) {
		
		return (v1.getPrioridad().ordinal() - v2.getPrioridad().ordinal());
		
	}

	@Override
	public int compareByKey(Integer clave, Vacunable v) {
		
		return clave - v.getPrioridad().ordinal();
	}

}
