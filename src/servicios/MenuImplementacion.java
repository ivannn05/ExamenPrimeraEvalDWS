package servicios;

import java.util.Scanner;
/*
 * Clase implementacion encargada de contener toda  la logica de los metodos de los menus
 * ilp-101024
 */
public class MenuImplementacion implements MenuInterfaz {

	FicheroInterfaz fi = new FicheroImplementacion();
	Scanner sc = new Scanner(System.in);

	@Override
	public int mostrarMenuInicial() {
		MenuInterfaz mi = new MenuImplementacion();
		int opc;
		System.out.println("Seleccione una opcion");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Menu Empleado");
		System.out.println("2.Menu Gerencia");
		opc = sc.nextInt();
		return opc;
	}

	@Override
	public void mostrarMenuEmpleado() throws Exception {
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperaticaImplementacion();
		boolean cerrarMenu = false;
		int opc;
		while (!cerrarMenu) {
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerrar Menu");
			System.out.println("1.Calculo total de ventas");
			System.out.println("2.Añadir compras a un cliente");
			opc = sc.nextInt();

			switch (opc) {
			case 0:
				System.out.println("Se cerrara el menu");
				fi.ficheroLog("Se cerrara el menu");
				cerrarMenu = true;
				System.out.println("#######################################");
				break;

			case 1:
				System.out.println("Selecciono calculo total de ventas");
				fi.ficheroLog("Selecciono calculo total de ventas");
				op.calculoVentasMensuales();
				System.out.println("#######################################");
				break;
			case 2:
				System.out.println("Selecciono añadir compras a un cliente");
				fi.ficheroLog("Selecciono añadir compras a un cliente");
				op.aniadirCompraACliente();
				System.out.println("#######################################");
				break;
			default:
				System.out.println("Esta opcion no existe");
				fi.ficheroLog("Esta opcion no existe");
				break;
			}
		}

	}

	@Override
	public void mostrarMenuGerencia() throws Exception {
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperaticaImplementacion();
		boolean cerrarMenu = false;
		int opc;
		while (!cerrarMenu) {
			System.out.println("Seleccione una opcion");
			System.out.println("0.Cerrar Menu");
			System.out.println("1.Crear nuevo cliente");

			opc = sc.nextInt();

			switch (opc) {
			case 0:
				System.out.println("Se cerrara el menu");
				fi.ficheroLog("Se cerrara el menu");
				cerrarMenu = true;
				System.out.println("#######################################");
				break;

			case 1:
				System.out.println("Selecciono Crear nuevo cliente");
				fi.ficheroLog("Selecciono Crear nuevo cliente");
				op.crearNuevoCliente();
				System.out.println("#######################################");
				break;

			default:
				System.out.println("Esta opcion no existe");
				fi.ficheroLog("Esta opcion no existe");
				break;
			}
		}

	}

}
