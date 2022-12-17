package Controller;

import java.awt.Color;

import javax.swing.JButton;

public class Seat extends JButton{
	//Boton que tiene las funciones graficas para el modulo de seleccion de asiento en la interfaz de vendedorn que c
private boolean sillaocupada;
private String id;
private String tiposilla;
public Seat(String id,int i) {
	//Crea una instancia del boton con un id y un estado de ocupacion
	super();
	identificartiposilla(id);
	Verificar_ocupacion_silla(i);
	ActualizarBoton();
}
private void identificartiposilla(String IDsilla) {
	//identifica el tipo de silla, preferencial o general y modifica el atributo de clase
	this.id=IDsilla;
	if((IDsilla.charAt(0)+"").compareTo("G")==0) {
		this.tiposilla="G";
	};
	if((IDsilla.charAt(0)+"").compareTo("P")==0) {
		this.tiposilla="P";
	};
}
private void Verificar_ocupacion_silla(int i) {
	//identifica el estado de ocupacion de la silla
	if(i==0) {
		this.sillaocupada=false;
	}else {
		this.sillaocupada=true;
	}
}
public void ActualizarBoton() {
	//Actualiza los atributos graficos del boton en funcion de su estado de ocupacion
	
	this.setText(this.id);
	if(this.sillaocupada) {
		this.setBackground(Color.RED);
	}
	if(!this.sillaocupada) {
		this.setBackground(Color.GREEN);
	}
}
public void Cambiar_estado_ocupacion() {
	//modifica el estado de ocupacion a su contrario
	this.sillaocupada=!this.sillaocupada;
}
public boolean getestado() {
	return this.sillaocupada;
}

}
