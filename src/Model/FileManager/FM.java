package Model.FileManager;

import java.io.IOException;
import java.util.ArrayList;

import Cines.Funcion;
import Cines.Multiplex;
import Model.Usuarios.AbstractUser;

public class FM {
	//Fachada para el manejo de archivos
	AbstractData Profile;

	public FM() {
		//Crea una instancia de FileManager y le asigna una instancia de WorkersData
		this.Profile = new WorkersData();
	}

	public boolean checkprofile(String code) {
		//Funcion que verifica si un usuario esta registrado o no, ya sea como trabajador o como usuario del cine
		try {
			return Profile.Check(code);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return false;
	}

	public String[] getprofile(String code) {
		//Funcion que obtiene la informacion de un usuario o trabajador del cine
		try {
			return this.Profile.Getinfo(code);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return new String[0];
	}

	public void RecordProfile(AbstractUser a) {
		//Funcion que guarda o modifica la informacion de un usuario o trabajador del cine
		String[] data = new String[4];
		data[0] = a.getid();
		data[1] = a.getrole();
		data[2] = a.getname();
		data[3] = a.getP();
		try {
			this.Profile.RecordProfile(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String[] getPeliculas() {
		//Funcion que retorna las peliculas disponibles 
		MoviesData Moviesearcher=new MoviesData();
		try {
			
			return Moviesearcher.GetsubjectsList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String[0];
	}
	public String[] getMultiplexList() {
		//Funcion que retorna los multiplex diponibles
		MultiplexData Multiplexsearcher=new MultiplexData();
		try {
			return Multiplexsearcher.GetsubjectsList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String[0];
	
	}
	public ArrayList<Funcion> getTomorrowFunctions(String Multiplex) {
		//Funcion que retorna las funciones disponibles en un multiplex para el dia siguiente
		MultiplexData FunctionSearcher=new MultiplexData();
		try {
			return FunctionSearcher.GetRequiredFunctions(Multiplex);
		} catch (IOException  | NullPointerException e) {
			// TODO Auto-generated catch block
			return new ArrayList<Funcion>();
		}
	}
	

}
