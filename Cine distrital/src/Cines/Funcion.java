package Cines;

import Controller.Seat;

public class Funcion {
private Pelicula Movie;
private String Hora;
private String idSala;
private Silla[] Distribuciondeasientos=new Silla[0];
public Funcion(Pelicula Movie, String Hora, String idSala) {
	this.setMovie(Movie);
	this.setHora(Hora);
	this.setIdSala(idSala);
}
public Funcion() {
	
}
public void setDistribuciondeasientos(Silla[] Distribuciondeasientos) {
	this.Distribuciondeasientos=Distribuciondeasientos;
}
public Seat[][] GenerarMatrizBotones() {
	Seat[][] seatMatrix=new Seat[6][9];
	for(int i=0;i<this.Distribuciondeasientos.length;i++) {
		seatMatrix[Integer.valueOf(this.Distribuciondeasientos[i].getIdSilla().charAt(1)+"")][Integer.valueOf(this.Distribuciondeasientos[i].getIdSilla().charAt(2)+"")]
		=new Seat(this.Distribuciondeasientos[i].getIdSilla(),this.Distribuciondeasientos[i].getEstado());
	}
	return seatMatrix;
}

public Pelicula getMovie() {
	return Movie;
}
public void setMovie(Pelicula movie) {
	Movie = movie;
}
public String getHora() {
	return Hora;
}
public void setHora(String hora) {
	Hora = hora;
}
public String getIdSala() {
	return idSala;
}
public void setIdSala(String idSala) {
	this.idSala = idSala;
}


}
