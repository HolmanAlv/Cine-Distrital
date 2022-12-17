package Model.FileManager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MoviesData implements AbstractData{

	@Override
	public String[] Getinfo(String code) throws IOException {
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
		FileReader Movies=new FileReader(basepath+"/Cinema/peliculas.properties");
		Properties prop=new Properties();
		prop.load(Movies);
		String[] MoviesList=new String[prop.stringPropertyNames().size()];
	for(int i=0;i<MoviesList.length;i++) {
			MoviesList[i]=prop.getProperty("MV"+i);
		}
		return MoviesList;
	
	}

}
