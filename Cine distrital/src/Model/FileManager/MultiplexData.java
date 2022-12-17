package Model.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Properties;

import Cines.Funcion;
import Cines.Pelicula;
import Cines.Silla;

public class MultiplexData implements AbstractData{

	@Override
	public String[] Getinfo(String code) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Check(String code) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void RecordProfile(String[] user) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] GetsubjectsList() throws IOException {
		// TODO Auto-generated method stub
	
		File a=new File("");
		   String basepath=a.getAbsolutePath();
	    File Directory=new File(basepath+"/Cinema/MultiplexD");
	   return Directory.list();
	}
	public ArrayList<Funcion> GetRequiredFunctions(String multiplex) throws IOException,NullPointerException {
		// TODO Auto-generated method stub
		ArrayList<Funcion> funcionesdemanana=new ArrayList<Funcion>();
		LocalDate today= LocalDate.now();
		File a=new File("");
		   String basepath=a.getAbsolutePath();
		   String directorio=basepath+"/Cinema/MultiplexD/"+multiplex;
	    File Directory=new File(directorio);
	   String[] Funciones= Directory.list();
	   for(int i=0;i<Funciones.length;i++) {
		   FileReader fr=new FileReader(directorio+"/"+Funciones[i]);
		   Properties prop=new Properties();
		   prop.load(fr);
		   LocalDate fecha=LocalDate.parse(prop.getProperty("Fecha"));
		   if(today.plusDays(1).isEqual(fecha)){
			   Funcion show=new Funcion((new Pelicula(prop.getProperty("Pelicula"))),prop.getProperty("Hora"),prop.getProperty("Sala"));
			   show.setDistribuciondeasientos(GetDistribucionSillas(Funciones[i],multiplex));
			   funcionesdemanana.add(new Funcion((new Pelicula(prop.getProperty("Pelicula"))),prop.getProperty("Hora"),prop.getProperty("Sala")));
		   }
	   }
	   return funcionesdemanana;
	   
	}
	public Silla[] GetDistribucionSillas(String Funcion,String multiplex) throws IOException{
		File a=new File("");
		   Silla[] asientos=new Silla[60];
		   String basepath=a.getAbsolutePath();
		   String directorio=basepath+"/Cinema/MultiplexD/"+multiplex+"/"+Funcion;
		   FileReader fr=new FileReader(directorio);
		   Properties prop=new Properties();
		   prop.load(fr);
		   prop.remove("Hora");
		   prop.remove("Fecha");
		   prop.remove("Pelicula");
		   prop.remove("Sala");
		  Object[] Ids=  prop.stringPropertyNames().toArray();
		  
		   
		   for(int i=0;i<60;i++) {
				   asientos[i]=new Silla(prop.getProperty((String) Ids[i]),(String)Ids[i]);
				   System.out.println(i);
		   }
		   return asientos;
		
	}

}
