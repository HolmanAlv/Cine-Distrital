package Controller;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Cines.Funcion;

import java.awt.GridLayout;
import Model.FileManager.FM;
import Model.Usuarios.User;
import Model.Ventas.Preventa;
import View.pestanaventa;

public class Ventas implements ActionListener, ItemListener {
	//Controlador de la interfaz de vendedor
	pestanaventa vista;
	FM manager;
	User AU;
	Preventa registro;
	Seat[][] sillas;
	ArrayList<Funcion> funciones;
	final int Addtotalsnacks = 1;
	final int Subtotalsnacks = 2;
	final int Addtotaltickets = 3;
	final int Subtotaltickets = 4;

	public Ventas(pestanaventa vista) {
		//Crea una instancia del controlador Ventas y se asigna a si mismo como Listener para los componentes de la vista pestanaventa
		
		this.vista = vista;
		this.manager = new FM();
		this.vista.PA.addActionListener(this);
		this.vista.min1.addActionListener(this);
		this.vista.min2.addActionListener(this);
		this.vista.min3.addActionListener(this);
		this.vista.plus1.addActionListener(this);
		this.vista.plus2.addActionListener(this);
		this.vista.plus3.addActionListener(this);
		this.vista.discount.addActionListener(this);
		this.vista.multiplex.addItemListener(this);
		this.vista.pelicula.addItemListener(this);
		this.vista.horario.addItemListener(this);
		this.vista.testbutton.addActionListener(this);
		//this.FillSeatsSpace();
		
		registro = new Preventa();
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//Listener para JComboBox
		// TODO Auto-generated method stub
if(e.getSource()==this.vista.multiplex) {
	this.updatepelicula();
}

if(e.getSource()==this.vista.pelicula) {
	try {
	this.updateFunciones((String)this.vista.multiplex.getSelectedItem(),(String)this.vista.pelicula.getSelectedItem());
	}catch(NullPointerException a) {
	a.printStackTrace();
	}
}
if(e.getSource()==this.vista.horario) {
	Funcion objetivo = new Funcion();
	for(int i=0;i<this.funciones.size();i++) {
		if(this.funciones.get(i).getHora().compareTo((String)this.vista.horario.getSelectedItem())==0) {
			objetivo=this.funciones.get(i);
		}
}
	this.FillSeatsSpace(objetivo);
	
	
}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Listener par JButtons
		if (e.getSource() == this.vista.PA) {
			AU = new User(this.manager.getprofile(this.vista.cedulaT.getText()));
			this.vista.Puntos.setText(this.AU.getpoints() + "");
			this.vista.PA.setEnabled(false);
			this.updatemultiplex();

		}
		if (e.getSource() == this.vista.plus1)// Compra de Snacks
		{
			try {
				this.vista.ct1.setText((Integer.valueOf(this.vista.ct1.getText()) + 1) + "");
				registro.addSnacks(1, 0);
			} catch (NumberFormatException ad) {
				this.vista.ct1.setText("0");
				this.vista.ct1.setText((Integer.valueOf(this.vista.ct1.getText()) + 1) + "");
				registro.addSnacks(1, 0);
			}
		}
		if (e.getSource() == this.vista.plus2) {
			try {
				this.vista.ct2.setText((Integer.valueOf(this.vista.ct2.getText()) + 1) + "");
				registro.addSnacks(1, 1);
			} catch (NumberFormatException ad) {
				this.vista.ct2.setText("0");
				this.vista.ct2.setText((Integer.valueOf(this.vista.ct2.getText()) + 1) + "");
				registro.addSnacks(1, 1);
			}
		}
		if (e.getSource() == this.vista.plus3) {
			try {
				this.vista.ct3.setText((Integer.valueOf(this.vista.ct3.getText()) + 1) + "");
				registro.addSnacks(1, 2);
			} catch (NumberFormatException ad) {
				this.vista.ct3.setText("0");
				this.vista.ct3.setText((Integer.valueOf(this.vista.ct3.getText()) + 1) + "");
				registro.addSnacks(1, 2);
			}
		}
		if (e.getSource() == this.vista.min1)// Cuando le das al menos en los snacks :v
		{
			try {
				if ((Integer.valueOf(this.vista.ct1.getText()) - 1) == 0) {
					this.vista.ct1.setText("Cantidad");
					registro.addSnacks(-1, 0);
				} else {
					this.vista.ct1.setText((Integer.valueOf(this.vista.ct1.getText()) - 1) + "");
					registro.addSnacks(-1, 0);
				}
			} catch (NumberFormatException ad) {

			}
		}
		if (e.getSource() == this.vista.min2) {
			try {
				if ((Integer.valueOf(this.vista.ct2.getText()) - 1) == 0) {
					this.vista.ct2.setText("Cantidad");
					registro.addSnacks(-1, 1);
				} else {
					this.vista.ct2.setText((Integer.valueOf(this.vista.ct2.getText()) - 1) + "");
					registro.addSnacks(-1, 1);
				}
			} catch (NumberFormatException ad) {

			}
		}
		if (e.getSource() == this.vista.min3) {
			try {
				if ((Integer.valueOf(this.vista.ct3.getText()) - 1) == 0) {
					this.vista.ct3.setText("Cantidad");
					registro.addSnacks(-1, 2);
				} else {
					this.vista.ct3.setText((Integer.valueOf(this.vista.ct3.getText()) - 1) + "");
					registro.addSnacks(-1, 2);
				}
			} catch (NumberFormatException ad) {

			}
		}
		if (e.getSource() == this.vista.testbutton) {
			JOptionPane.showMessageDialog(null,"Recuerda agradecerle al cliente por su compra");
			this.vista.dispose();
		}
		if(e.getSource()==this.vista.discount) {
       int puntos=AU.getpoints()-registro.descuento(AU.getpoints());
			this.vista.Puntos.setText(((puntos))+"");
			AU.addpoints(-puntos);
		}
		
	for(int i=0;i<this.sillas.length;i++) {
		for(int j=0;j<this.sillas[0].length;j++) {
		if(e.getSource()==this.sillas[i][j]) {
			this.sillas[i][j].Cambiar_estado_ocupacion();
			this.sillas[i][j].ActualizarBoton();
			if(this.sillas[i][j].getestado()) {
				this.registro.AddTickets(1);
			}else {
			this.registro.AddTickets(-1);
			}
		}
		}
	}
		Totalmod();
	}

	private void Totalmod() {
		//Modifica los precios de la interfaz a los valores guardados en el registro de preventa
		this.vista.TotalT.setText(this.registro.getTotalTicket() + "");
		this.vista.SDinero.setText(this.registro.getTotalSnacks() + "");
		this.vista.Total.setText(this.registro.getTotal() + "");
	}
	private void FillSeatsSpace(Funcion nueva) {
		//rellena la matriz de seleccion de asiento en funcion de la funcion escogida
		this.vista.board.removeAll();
        this.sillas=nueva.GenerarMatrizBotones();
		GridLayout rejilla=new GridLayout(10,6);
		this.vista.board.setLayout(rejilla);
		for(int i=0;i<this.sillas.length;i++) {
			for(int j=0;j<this.sillas[0].length;j++) {
			this.sillas[i][j].addActionListener(this);
			this.vista.board.add(this.sillas[i][j]);
			}
		}
		this.vista.board.repaint();
	}
	private void updatemultiplex() {
		//Rellena la JCombobox con los multiplex disponibles
		String[] multiplexlist=manager.getMultiplexList();
		for(int i=0;i<multiplexlist.length;i++) {
			this.vista.multiplex.addItem(multiplexlist[i]);
		}
	}
	private void updatepelicula() {
		//Rellena la JCombobox con las peliculas disponibles en el multiplex seleccionado
		this.vista.pelicula.removeAllItems();
		String[] movielist=manager.getPeliculas();
		for(int i=0;i<movielist.length;i++) {
			this.vista.pelicula.addItem(movielist[i]);
			System.out.println(movielist[i]);
		}
	}
	private void updateFunciones(String multiplex,String pelicula) {
		//Rellena la JCombobox con las Funciones disponibles para el dia siguiente
		if(pelicula==null) {
			return;
		}
		this.vista.horario.removeAllItems();
	 funciones=manager.getTomorrowFunctions(multiplex);
		for(int i=0;i<funciones.size();i++) {
			if(funciones.get(i).getMovie().getNombrepelicula().compareTo(pelicula)==0) {
			this.vista.horario.addItem(funciones.get(i).getHora());
			}
		}
	}
	
}
