package Model.FileManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import Model.Usuarios.*;

public class WorkersData implements AbstractData {
	private Properties Prop;
	private AbstractData next;

	public WorkersData() {
		this.Prop = new Properties();
		this.next = new UsersData();
	}

	public boolean Check(String code) throws IOException {
		// Revisa si el trabajador existe
		FileReader Rw = new FileReader("src/Users/RegisteredWorkers.properties");
		Prop.load(Rw);
		if (Prop.getProperty(code) != null) {
			return true;
		}
		// Si no lo encuentra, delega el resultado a UsersData(Chain of responsibility)
		return next.Check(code);

	}

	public String[] Getinfo(String code) throws IOException {
		// Obtiene la informacion del trabajador
		FileReader Rw = new FileReader("src/Users/RegisteredWorkers.properties");
		String[] info;
		Prop.load(Rw);
		if (Prop.getProperty(code) == null) {
			return next.Getinfo(code);
		} else
			info = new String[4];
		info[0] = code;
		info[1] = Prop.getProperty(code);
		for (int i = 2; i < 4; i++) {
			info[i] = Prop.getProperty(code + "." + i);
		}
		// Si no lo encuentra, delega el resultado a UsersData(Chain of responsibility)
		return info;

	}

	@Override
	public void RecordProfile(String[] user) throws IOException {
		// TODO Auto-generated method stub
		// Metodo para guardar un perfil, si no es un trabajador WorkersData lo delega a
		// UsersData
		FileReader Rw = new FileReader("src/Users/RegisteredWorkers.properties");
		Prop.load(Rw);
		if (user[2].compareTo("customer") == 0) {

			if (Prop.getProperty(user[0]) == null) {
				next.RecordProfile(user);
			} else {
				System.out.println("Error: No se puede usar una misma ID como trabajador y cliente");
			}
		} else {
			if (next.Check(user[0]) == false) {
				FileWriter Fw = new FileWriter("src/Users/RegisteredWorkers.properties");

				Prop.setProperty(user[0], user[1]);
				for (int i = 2; i < 4; i++) {
					Prop.setProperty(user[0] + "." + i, user[i]);
				}
				Prop.store(Fw, "");
			} else {
				System.out.println("Error: No se puede usar una misma ID como trabajador y cliente");
			}

		}
	}

	@Override
	public String[] GetsubjectsList() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
