package Model.FileManager;

import java.io.IOException;

import Model.Usuarios.AbstractUser;

public interface AbstractData {
	public String[] Getinfo(String code) throws IOException;

	public boolean Check(String code) throws IOException;

	public void RecordProfile(String[] user) throws IOException;
	
	public String[] GetsubjectsList() throws IOException;
	
}
