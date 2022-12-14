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
		String[] info = new String[5];
		Prop.load(Rw);
		if (Prop.getProperty(code) != null) {
			return new String[0];
		}
		info[0] = code;
		info[1] = Prop.getProperty(code);
		for (int i = 2; i < 5; i++) {
			info[i] = Prop.getProperty(code + "." + i);
		}
		return info;

	}

	@Override
	public void RecordProfile(String[] user) throws IOException {

		FileReader Rw = new FileReader("src/Users/RegisteredUsers.properties");
		String[] info;
		Prop.load(Rw);
		FileWriter Fw = new FileWriter("src/Users/RegisteredUsers.properties");
		Prop.setProperty(user[0], user[1]);
		for (int i = 2; i < 4; i++) {
			Prop.setProperty(user[0] + "." + i, user[i]);
		}
		Prop.store(Fw, "");
	}
}
