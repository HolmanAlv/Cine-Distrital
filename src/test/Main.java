package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Cines.Funcion;
import Model.FileManager.*;
import Model.Usuarios.User;
import Model.Usuarios.Worker;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FM a = new FM();
		/*String[] Billinfo = new String[4];
		Billinfo[0] = "22345";
		Billinfo[1] = "Billy";
		Billinfo[2] = "Seller";
		Billinfo[3] = "992";

		Worker Billy = new Worker(Billinfo);

		a.RecordProfile(Billy);
*/
		ArrayList<Funcion> Funciones=a.getTomorrowFunctions("Americas");
		for(int i=0;i<Funciones.size();i++) {
			System.out.println(Funciones.get(i).getMovie().getNombrepelicula());
		}
	}

}
