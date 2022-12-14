package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Model.FileManager.FM;
import Model.Usuarios.User;
import Model.Ventas.Preventa;
import Vista.pestanaventa;

public class Ventas implements ActionListener, ItemListener {
	pestanaventa vista;
	FM manager;
	User AU;
	Preventa registro;
	final int Addtotalsnacks = 1;
	final int Subtotalsnacks = 2;
	final int Addtotaltickets = 3;
	final int Subtotaltickets = 4;

	public Ventas(pestanaventa vista) {
		this.vista = vista;
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
		this.manager = new FM();
		registro = new Preventa();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Puede que sea necesario modificar el codigo de los productos para ajustarlo
		// al modelo UML que se realizo
		if (e.getSource() == this.vista.PA) {
			AU = new User(this.manager.getprofile(this.vista.cedulaT.getText()));
			this.vista.Puntos.setText(this.AU.getpoints() + "");
			this.vista.PA.setEnabled(false);

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
			this.registro.AddTickets(1);
		}
		Totalmod();
	}

	private void Totalmod() {
		this.vista.TotalT.setText(this.registro.getTotalTicket() + "");
		this.vista.SDinero.setText(this.registro.getTotalSnacks() + "");
		this.vista.Total.setText(this.registro.getTotal() + "");
	}
}
