package Model;

import java.io.FileWriter;
import java.io.FileReader;

public class Cliente {
    private static Cliente instancia;
    private int idCliente;
    private Puntos puntos;

    public Cliente(int idCliente){
        this.idCliente = idCliente;
        this.puntos = Puntos.getInstancia();
        this.guardarCliente(idCliente);
    }
    
    public static Cliente getInstancia(int idCliente){
         if (instancia == null) {
            instancia = new Cliente(idCliente);
        }
        return instancia;
    }

    public void guardarCliente(int numeroIdentificacion){

        try {
				FileWriter archivo = new FileWriter("archivo_identificacion.txt");
                
				archivo.write(Integer.toString(numeroIdentificacion));
				archivo.close();
				System.out.println("Su número de identificación se ha guardado correctamente en el archivo");
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error al guardar el número de identificación");
			}
    }
}
