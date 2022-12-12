package Modelo.FileManager;

import java.io.IOException;

import Modelo.Usuarios.AbstractUser;

public interface AbstractData {
	public String[] Getinfo(String code) throws IOException; 
	public boolean Check(String code) throws IOException;
	public void RecordProfile(String[] user) throws IOException;
}
