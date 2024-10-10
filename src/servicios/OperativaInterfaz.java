package servicios;
/*
 * Clase interfaz encargada de contener las cabeceras de los metodos de la operativa 
 * ilp-101024
 */

public interface OperativaInterfaz {

	/*
	 * Metodo encargado de crear un nurvo cliente
	 *  ilp-101024
	 */
	public void crearNuevoCliente() throws Exception;

	/*
	 * Metodo encargado de aniadir compras a los clientes 
	 * ilp-101024
	 */
	public void aniadirCompraACliente() throws Exception;

	/*
	 * Metodo encargado de mostrara el importe de las ventas de ese mes
	 * ilp-101024
	 */
	public void calculoVentasMensuales() throws Exception;
}
