package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/*
 * Clase princiapl de la app
 * ilp-101024
 */
public class Inicio {
	public static List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	public static List<VentaDto> listaVentas = new ArrayList<VentaDto>();

	/*
	 * Metodo principal de la app , que sera por la cual se lanze la app
	 * ilp-101024
	 */
	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		try {

			boolean cerrarMenu = false;
			int opc;
			while (!cerrarMenu) {
				opc = mi.mostrarMenuInicial();
				switch (opc) {
				case 0:
					System.out.println("Se cerrara el menu");
					fi.ficheroLog("Se cerrara el menu");
					cerrarMenu = true;
					System.out.println("#######################################");
					break;

				case 1:
					System.out.println("Se mostrara el menu Empleado");
					fi.ficheroLog("Se mostrara el menu Empleado");
					mi.mostrarMenuEmpleado();
					System.out.println("#######################################");
					break;
				case 2:
					System.out.println("Se mostrara el menu Gerencia");
					fi.ficheroLog("Se mostrara el menu Gerencia");
					mi.mostrarMenuGerencia();
					System.out.println("#######################################");
					break;
				default:
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Ocurrio un error en la app");
			fi.ficheroLog("Ocurrio un error en la app Error=".concat(e.getMessage()));

		}

	}

}
