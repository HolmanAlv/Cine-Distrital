/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;

/**
 *
 * @author rdmon
 */
public class Pelicula {
   //Guarda la informacion necesaria sobre una pelicula
	private String nombrepelicula;
	public Pelicula(String nombre) {
		//Crea una instancia de pelicula asignandole un nombre
		this.nombrepelicula=nombre;
	}

	public String getNombrepelicula() {
		//retorna el nombre de pelicula
		return nombrepelicula;
	}

	public void setNombrepelicula(String nombrepelicula) {
		//asigna un nombre a pelicula
		this.nombrepelicula = nombrepelicula;
	}
	
}
