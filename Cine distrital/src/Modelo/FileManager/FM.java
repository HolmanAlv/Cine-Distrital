package Modelo.FileManager;

import java.io.IOException;

import Modelo.Usuarios.AbstractUser;

public class FM {
AbstractData Profile;

public FM() {
	this.Profile=new WorkersData();
}
public boolean checkprofile(String code) {
	try {
		return Profile.Check(code);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return false;
}
public String[] getprofile(String code) {
	try {
		return this.Profile.Getinfo(code);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return new String[0];
}
public void RecordProfile(AbstractUser a) {
	String[] data=new String[4];
	data[0]=a.getid();
	data[1]=a.getname();
	data[2]=a.getrole();
	data[3]=a.getP();
	try {
		this.Profile.RecordProfile(data);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
