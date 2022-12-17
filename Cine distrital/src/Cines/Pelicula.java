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
    //no puse nada por que veo que tiene muchos atributos tal ves no necesitemos tantos
	private String nombrepelicula;
	public Pelicula(String nombre) {
		this.nombrepelicula=nombre;
	}

	public String getNombrepelicula() {
		return nombrepelicula;
	}

	public void setNombrepelicula(String nombrepelicula) {
		this.nombrepelicula = nombrepelicula;
	}
	
}
