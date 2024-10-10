package dtos;

/*
 * Clase Dto encargada de contener la informacion de los clientes
 * ilp-101024
 */
public class ClienteDto {
	
	//Atributos
	long id;
	String nombre="aaaa";
	String apellidos="aaaa";
	
	
	//Constructores
	public ClienteDto(long id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	public ClienteDto() {
		super();
	}


	//Getters y Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	
	
	

}

