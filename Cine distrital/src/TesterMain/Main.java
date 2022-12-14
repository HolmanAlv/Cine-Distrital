package TesterMain;

import java.io.FileNotFoundException;

import Controlador.Logearse;
import Model.FileManager.*;
import Model.Usuarios.User;
import Model.Usuarios.Worker;
import Vista.Login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * FM a=new FM(); String[] Billinfo=new String[4]; Billinfo[0]="22345";
		 * Billinfo[1]="Seller"; Billinfo[2]="Billy"; Billinfo[3]="Multiplex"; Worker
		 * Billy=new Worker(Billinfo); a.RecordProfile(Billy); Billinfo[0]="24716171";
		 * Billinfo[1]="customer"; Billinfo[3]="35"; User Donna=new User(Billinfo);
		 * a.RecordProfile(Donna);
		 */
		Login view = new Login();
		Logearse ctrl = new Logearse(view);
		view.setVisible(true);

	}

}
