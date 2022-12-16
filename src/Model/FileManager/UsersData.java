package Model.FileManager;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Properties;

import Model.Usuarios.AbstractUser;

public class UsersData implements AbstractData {
	private Properties Prop;

	public UsersData() {
		this.Prop = new Properties();
	}

	public boolean Check(String code) throws IOException {
		FileReader Rw = new FileReader("src/Users/RegisteredUsers.properties");
		Prop.load(Rw);
		if (Prop.getProperty(code) != null) {

			return true;
		}
		return false;

	}

	public String[] Getinfo(String code) throws IOException {
		FileReader Rw = new FileReader("src/Users/RegisteredUsers.properties");
		String[] info = new String[4];
		Prop.load(Rw);
		if (Prop.getProperty(code) == null) {
			return new String[0];
		}
		info[0] = code;
		info[1] = Prop.getProperty(code);
		info[3] = Prop.getProperty(code + ".1");
		return info;

	}

	@Override
	public void RecordProfile(String[] user) throws IOException {

		FileReader Rw = new FileReader("src/Users/RegisteredUsers.properties");
		String[] info;
		Prop.load(Rw);
		FileWriter Fw = new FileWriter("src/Users/RegisteredUsers.properties");
		Prop.setProperty(user[0], user[1]);
		Prop.setProperty(user[0] + ".1", user[3]);
		Prop.store(Fw, "");
	}

	@Override
	public String[] GetsubjectsList() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
}
