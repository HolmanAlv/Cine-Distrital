package Controller;

import java.awt.Color;

import javax.swing.JButton;

public class Seat extends JButton{
private boolean sillaocupada;
private String id;
private String tiposilla;
public Seat(String id,int i) {
	super();
	identificartiposilla(id);
	Verificar_ocupacion_silla(i);
	ActualizarBoton();
}
private void identificartiposilla(String IDsilla) {
	this.id=IDsilla;
	if((IDsilla.charAt(0)+"").compareTo("G")==0) {
		this.tiposilla="G";
	};
	if((IDsilla.charAt(0)+"").compareTo("P")==0) {
		this.tiposilla="P";
	};
}
private void Verificar_ocupacion_silla(int i) {
	if(i==0) {
		this.sillaocupada=false;
	}else {
		this.sillaocupada=true;
	}
}
public void ActualizarBoton() {
	
	this.setText(this.id);
	if(this.sillaocupada) {
		this.setBackground(Color.RED);
	}
	if(!this.sillaocupada) {
		this.setBackground(Color.GREEN);
	}
}
public void Cambiar_estado_ocupacion() {
	this.sillaocupada=!this.sillaocupada;
}

}
