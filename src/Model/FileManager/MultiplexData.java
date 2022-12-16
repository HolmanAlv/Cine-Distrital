package Model.FileManager;

import java.io.File;
import java.io.IOException;

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

}
