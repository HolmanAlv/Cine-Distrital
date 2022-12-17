package Cines;

import Controller.Seat;

public class Funcion {
	//Una funcion es cuando se programa la emision de una pelicula en un horario determinado
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
	//Asigna una distribucion de asientos a la Funcion en el horario determinado
	this.Distribuciondeasientos=Distribuciondeasientos;
	
}
public Seat[][] GenerarMatrizBotones() {
	// Genera una matriz de botones de la clase Seat
	Seat[][] seatMatrix=new Seat[6][10];
	System.out.println(this.Distribuciondeasientos.length+"pene");
	for(int i=0;i<this.Distribuciondeasientos.length;i++) {
		seatMatrix[Integer.valueOf(this.Distribuciondeasientos[i].getIdSilla().charAt(1)+"")][Integer.valueOf(this.Distribuciondeasientos[i].getIdSilla().charAt(2)+"")]
		=new Seat(this.Distribuciondeasientos[i].getIdSilla(),this.Distribuciondeasientos[i].getEstado());
	}
	
	return seatMatrix;
}

public Pelicula getMovie() {
	//Retorna la pelicula asignada a la funcion
	return Movie;
}
public void setMovie(Pelicula movie) {
	//Asigna una pelicula a la funcion determinada
	Movie = movie;
}
public String getHora() {
	//Retorna la hora asignada a la funcion determinada
	return Hora;
}
public void setHora(String hora) {
	//Asigna una hora a la funcion determinada
	Hora = hora;
}
public String getIdSala() {
	//Retorna el id de la sala asignada a la funcion
	return idSala;
}
public void setIdSala(String idSala) {
	//Asigna una sala a la funcion determinada
	this.idSala = idSala;
}


}
