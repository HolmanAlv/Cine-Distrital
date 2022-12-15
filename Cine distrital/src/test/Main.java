package test;

import java.io.FileNotFoundException;

import Model.Cliente;
import Model.FileManager.*;
import Model.Usuarios.User;
import Model.Usuarios.Worker;

import java.util.Scanner;
import java.io.FileWriter;

public class Main {
	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * FM a = new FM();
	 * String[] Billinfo = new String[4];
	 * Billinfo[0] = "22345";
	 * Billinfo[1] = "Billy";
	 * Billinfo[2] = "Seller";
	 * Billinfo[3] = "992";
	 * 
	 * Worker Billy = new Worker(Billinfo);
	 * 
	 * a.RecordProfile(Billy);
	 */

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su número de identificación: ");
		int numeroIdentificacion = sc.nextInt();
		Cliente cliente = new Cliente(numeroIdentificacion);

		/*
		 * TODOS
		 * 1. leer la cedula del cliente y guardarla en un archivo, si ya existe pues sigue
		 * 2. seleccionar el multiplex, si ya existe sigue, sino lo crea
		 * 3. seleccionar la película a ver
		 * 4. seleccionar las sillas, al presionar crea la silla, si ya existe debe estar bloqueada
		 * 5. seleccionar la cantidad de snacks
		 * 6. mostrar la factura con la silla, los snakcs y los puntos
		 */
	}
	// }

}
