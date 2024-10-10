package utilidades;

import controladores.Inicio;
/*
 * Clase encargada de contener la logica de los metodos de utilidad de la app
 * ilp-101024
 */
public class Util {
	/*
	 * Metodo encargado de la autogeneracion de la id de los clientes 
	 * ilp-101024
	 */
	public static long autogeneracionIdCliente() {
		long id;
		if (Inicio.listaClientes.size() == 0) {
			id = 1;
		} else {

			id = Inicio.listaClientes.get(Inicio.listaClientes.size() - 1).getId() + 1;
		}

		return id;
	}
	/*
	 * Metodo encargado de la autogeneracion de la id de las ventas 
	 * ilp-101024
	 */
	public static long autogeneracionIdVentas() {
		long id;
		if (Inicio.listaVentas.size() == 0) {
			id = 1;
		} else {

			id = Inicio.listaVentas.get(Inicio.listaVentas.size() - 1).getIdVenta() + 1;
		}

		return id;
	}
}
