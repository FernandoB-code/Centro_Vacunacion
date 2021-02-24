package CentroVacunacion;

import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class CentroVacunacion {

	private final int CANT_COLAS = 6;
	private final int CANT_COLUMNAS = 4;

	private ColaNodos<Vacunable>[] vacunables;

	public CentroVacunacion() {

		this.vacunables = new ColaNodos[CANT_COLAS];

		for (int i = 0; i < CANT_COLAS; i++) {

			this.vacunables[i] = new ColaNodos<>();
		}

	}

	public void agregar() {

		this.vacunables[0].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[0].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[0].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[0].add(new PerroDeRescate(" "));
		this.vacunables[1].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[2].add(new Docente("", "", 32, false, Nivel.INICIAL, ""));
		this.vacunables[3].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[4].add(new Auxiliar("", "", 39, true, Nivel.SECUNDARIO, 6));
		this.vacunables[5].add(new PersonaMedica("", "", 62, true, ""));
		this.vacunables[5].add(new Auxiliar("", "", 39, false, Nivel.SECUNDARIO, 1));
		this.vacunables[0].add(new Persona("", "", 49, false));
		this.vacunables[1].add(new Persona("", "", 29, true));
		this.vacunables[2].add(new Persona("", "", 29, false));
		this.vacunables[3].add(new Persona("", "", 49, false));
		this.vacunables[4].add(new Persona("", "", 29, true));
		this.vacunables[5].add(new Persona("", "", 28, false));

		for (int i = 0; i < vacunables.length; i++) {

			this.vacunables[i].add(new Persona("", "", 49, false));
			this.vacunables[i].add(new Persona("", "", 29, true));
			this.vacunables[i].add(new Persona("", "", 29, false));
			this.vacunables[i].add(new PerroDeRescate(" "));
			this.vacunables[i].add(new PersonaMedica("", "", 62, true, ""));
			this.vacunables[i].add(new Docente("", "", 32, false, Nivel.INICIAL, ""));
			this.vacunables[i].add(new PersonaMedica("", "", 62, true, ""));
			this.vacunables[i].add(new Auxiliar("", "", 39, false, Nivel.SECUNDARIO, 6));

		}

	}

	public int[][] obtenerCantidadesPorColaYPrioridad() {

		int[][] matriz = new int[this.vacunables.length][CANT_COLUMNAS];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < CANT_COLUMNAS; j++) {

				matriz[i][j] = this.cantidadesPorCola(this.vacunables[i])[j]; // Devuelve un array que se recorre con J,
																				// a la par de la matriz.

			}

		}
		return matriz;

	}

	private int[] cantidadesPorCola(ColaNodos<Vacunable> v) {

		int[] cantidades = new int[CANT_COLUMNAS];

		int cantTotal = 0;

		Vacunable cent = new PerroDeRescate("");

		Vacunable candidatoActual;

		v.add(cent);

		candidatoActual = v.remove();

		while (candidatoActual != cent) {

			cantidades[candidatoActual.getPrioridad().ordinal()]++;

			cantTotal++;

			v.add(candidatoActual);

			candidatoActual = v.remove();

		}

		cantidades[3] = cantTotal; // Cantidad total de vacunables en la cola

		return cantidades;

	}

	public void mostrarObtenerCantidadesPorColaYPrioridad() {

		int[][] m = obtenerCantidadesPorColaYPrioridad();

		System.out.print("P.Maxima");
		System.out.print(" P.Media");
		System.out.print(" P.Minima");
		System.out.print(" Total");
		System.out.println(" ");

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				System.out.print("     ");
				System.out.print(m[i][j] + " ");

			}

			System.out.println(" ");

		}

		System.out.println("---------------------------------");

	}

	private ListaPorPrioridad obtenerListaOrdenada() {

		ListaPorPrioridad lista = new ListaPorPrioridad();

		ColaNodos<Vacunable> cola;

		Vacunable v;

		for (int i = 0; i < CANT_COLAS; i++) {

			// System.out.println(i + " val i");

			cola = this.vacunables[i];

			while (!cola.isEmpty()) { // CUIDADO de no hacer el remove antes del while.

				v = cola.remove();

				lista.add(v);

			}

		}

		System.out.println(lista.size() + " tamaño lista");

		return lista;

	}

	public ColaNodos<Vacunable> obtenerColaPorPrioridad() {

		ListaPorPrioridad lista = obtenerListaOrdenada();

		ColaNodos<Vacunable> ColaPorPrioridad = new ColaNodos<Vacunable>();

		for (Vacunable vacunable : lista) {

			ColaPorPrioridad.add(vacunable);

		}

		return ColaPorPrioridad;

	}

	public void mostrarColaPorPrioridad() {

		System.out.println(" -- CANDIDATOS: -- ");

		ColaNodos<Vacunable> ColaPorPrioridad = obtenerColaPorPrioridad();

		Vacunable cent = new PerroDeRescate("");

		Vacunable candidatoActual;

		ColaPorPrioridad.add(cent);

		candidatoActual = ColaPorPrioridad.remove();

		while (candidatoActual != cent) {

			System.out.println(candidatoActual.toString());

			ColaPorPrioridad.add(candidatoActual);

			candidatoActual = ColaPorPrioridad.remove();

		}

	}

}
