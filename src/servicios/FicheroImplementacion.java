package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Clase encargada de contener la logica de los metodos de ficheros de la app
 * ilp-101024
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ficheroLog(String dato) {
		String ruta= "C:\\Users\\ivan\\Desktop\\DWS\\iloposa\\auditoria\\Fichero-Log.txt";
		try {
			BufferedWriter escribe= new BufferedWriter(new FileWriter(ruta,true));
			escribe.write(dato.concat("\n"));
			escribe.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un error en el fichero Log");
		}
		
		
		
	}

}
