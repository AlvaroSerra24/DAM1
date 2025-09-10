package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;



public class EnvioPorFicheros implements Envio,Serializable{

	@Override
	public void enviarPublicidad(String destino, String mensaje) {
		// TODO Auto-generated method stub
		PrintWriter salida;
		try {	
			salida = new PrintWriter(new File("Ofertadestino.txt"));
			salida.println(mensaje);
			salida.flush();
			salida.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
