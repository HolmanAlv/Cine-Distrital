package TesterMain;
import java.io.FileNotFoundException;

import Modelo.FileManager.*;
import Modelo.Usuarios.User;
import Modelo.Usuarios.Worker;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FM a=new FM();
 String[] Billinfo=new String[4];
 Billinfo[0]="22345";
 Billinfo[1]="Billy";
 Billinfo[2]="Seller";
 Billinfo[3]="992";

 Worker Billy=new Worker(Billinfo);

 a.RecordProfile(Billy);
 
	}

}
