/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;

/**
 *
 * @author rdmon
 */

//aca en el multplex debemos poner las salas que manejen las sillas 
public class Multiplex implements Cloneable {
  private int idMultiplex;
  private String nombre;
  private int cantSalas;
  private Funcion[] Funciones;

  public Multiplex(int idMultiplex, String nombre) {
     this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = 5;
  }
  public Multiplex(String nombre, Funcion[] Funciones) {
	  this.nombre=nombre;
	  this.cantSalas = 5;
	  this.Funciones=Funciones;
  }

  public void setProperty(int idMultiplex, String nombre, int cantSalas, Sala[] sala, Pelicula pelicula) {
    this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = cantSalas;
  }

    public int getIdMultiplex() {
        return idMultiplex;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantSalas() {
        return cantSalas;
    }

 
  

  @Override
  public Multiplex clone() throws CloneNotSupportedException {
    try {
      return (Multiplex) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
   public void ObtenerPeliculas() {
	   
   }
}
