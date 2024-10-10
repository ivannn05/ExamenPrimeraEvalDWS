package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import controladores.Inicio;
import dtos.ClienteDto;
import dtos.VentaDto;
import utilidades.Util;
/*
 * Clase encargada de contener la logica de los metodos encargados de la operativa de la app
 * ilp-101024
 */
public class OperaticaImplementacion implements OperativaInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public void crearNuevoCliente() throws Exception {

		boolean aux = false;
		do {
			ClienteDto cliente = new ClienteDto();
			cliente.setId(Util.autogeneracionIdCliente());
			System.out.println("Indique el nombre del cliente");
			cliente.setNombre(sc.next());
			System.out.println("Indique los apellidos del cliente");
			cliente.setApellidos(sc.next());

			Inicio.listaClientes.add(cliente);
			System.out.println("Desea añadir otro cliente mas? S o N");
			String respuesta = sc.next();
			if (respuesta.equals("N")) {
				aux = true;
			}
		} while (!aux);
	}

	@Override
	public void aniadirCompraACliente() throws Exception {
		VentaDto venta = new VentaDto();
		venta.setIdVenta(Util.autogeneracionIdVentas());
		System.out.println("Indique el id del cliente");
		venta.setIdCliente(sc.nextLong());
		System.out.println("Indique el importe de la venta");
		venta.setImporte(sc.nextInt());
		LocalDateTime fechaInstan=LocalDateTime.now();
		venta.setFechaInstante(fechaInstan);
		Inicio.listaVentas.add(venta);
	}

	@Override
	public void calculoVentasMensuales() throws Exception{
		System.out.println("Indique la fecha en formato MM-yyyy");
		String fecha=sc.next();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-yyyy");
		LocalDateTime fechaUsu=LocalDateTime.parse(fecha, formato);
		int importeTotal=0;
		for (VentaDto vent:Inicio.listaVentas) {
			if (vent.getFechaInstante().getMonthValue()==fechaUsu.getMonthValue()) {
				importeTotal=vent.getImporte();
			}
			
		}
		System.out.println("El importe de ese mes es="+importeTotal);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
