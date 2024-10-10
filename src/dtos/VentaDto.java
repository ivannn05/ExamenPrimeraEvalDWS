package dtos;

import java.time.LocalDateTime;

/*
 * Clase Dto encargada de contener los datos de las ventas 
 * ilp-101024
 */
public class VentaDto {
//Atributos
	long idVenta;
	long idCliente;
	int importe = 00;
	LocalDateTime fechaInstante = LocalDateTime.of(9999, 12, 31, 23, 59);

	// Constructores

	public VentaDto(long idVenta, long idCliente, int importe, LocalDateTime fechaInstante) {
		super();
		this.idVenta = idVenta;
		this.idCliente = idCliente;
		this.importe = importe;
		this.fechaInstante = fechaInstante;
	}

	public VentaDto() {
		super();
	}

	// Getters y Setters
	public long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public LocalDateTime getFechaInstante() {
		return fechaInstante;
	}

	public void setFechaInstante(LocalDateTime fechaInstante) {
		this.fechaInstante = fechaInstante;
	}

	@Override
	public String toString() {
		return "VentaDto [idVenta=" + idVenta + ", idCliente=" + idCliente + ", importe=" + importe + ", fechaInstante="
				+ fechaInstante + "]";
	}

}

