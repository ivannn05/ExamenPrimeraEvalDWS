package servicios;

/*
 * Clase encargada de contener las cabeceras de los metodos enrcagados del menu
 * ilp-101024
 */
public interface MenuInterfaz {
	/*
	 * Metodo encargado de mostrar el menu principal 
	 * ilp-101024
	 */
	public int mostrarMenuInicial();
	/*
	 * Metodo encargado de mostrar el menu Empleado
	 *  ilp-101024
	 */

	public void mostrarMenuEmpleado() throws Exception;

	/*
	 * Metodo encargado de mostrar el menu Gerencia 
	 * ilp-101024
	 */
	public void mostrarMenuGerencia() throws Exception;

}
