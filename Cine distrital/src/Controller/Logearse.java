package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.FileManager.FM;
import View.Login;
import View.pestanaventa;

public class Logearse implements ActionListener {
private Login win;
private FM manager;
public Logearse(Login win) {
	this.manager=new FM();
	this.win=win;
	win.Login.addActionListener(this);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String[] profile;
		if(e.getSource()==win.Login) {
			if(this.manager.checkprofile(win.CodigoE.getText())!=true) {
				JOptionPane.showMessageDialog(null, "El usuario no existe");
				return;
			}
			profile=manager.getprofile(win.CodigoE.getText());
			if(profile[1].compareTo("customer")==0) {
				//Abrir interfaz del usuario y cerrar el login
				JOptionPane.showMessageDialog(null, "Eres un usuario");
				win.setVisible(false);
				return;
			}else {
				//abrir interfaz de vendedor y cerrar el login
				win.setVisible(false);
				JOptionPane.showMessageDialog(null, "Eres un "+profile[1]);
				pestanaventa view =new pestanaventa();
				Ventas ctrl=new Ventas(view);
				view.setVisible(true);
				return;
			}
			
		}
	}

}
