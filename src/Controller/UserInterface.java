package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import Model.FileManager.FM;
import View.User;



public class UserInterface implements ActionListener,ItemListener {
User view;
int puntos;
String cedula;
FM manager;

	public UserInterface(User view,String[] profile){
	this.view=view;
	this.cedula=profile[0];
	this.puntos=Integer.valueOf(profile[3]);
	this.view.Cedula.setText(cedula);
	this.view.Puntos.setText(puntos+"");
	this.view.guardar.addActionListener(this);
	this.manager=new FM();
	String [] movies=this.manager.getPeliculas();
	for(int i=0;i<movies.length;i++) {
		this.view.comboBox.addItem(movies[i]);
	}
	
}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Muchas gracias por su opinion");
		this.view.dispose();
	}

}
