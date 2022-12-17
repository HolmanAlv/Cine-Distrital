/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;

/**
 *
 * @author rdmon
 */

public class Multiplex implements Cloneable {
	//Un multiplex tiene una cantidad de salas y tiene programadas una cantidad de funciones para el dia siguiente
  private int idMultiplex;
  private String nombre;
  private int cantSalas;
  private Funcion[] Funciones;

  public Multiplex(int idMultiplex, String nombre) {
	  //Crea una instancia de Multiplex, asignandole un id y un nombre, ademas de el numero de salas default '5'
     this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = 5;
  }
  public Multiplex(String nombre, Funcion[] Funciones) {
	  //Crea una instancia de Multiplex asignandole un nombre y una lista de funciones para el dia siguiente, ademas del numero de salas default '5'
	  this.nombre=nombre;
	  this.cantSalas = 5;
	  this.Funciones=Funciones;
  }

  public void setProperty(int idMultiplex, String nombre, int cantSalas, Sala[] sala) {
	  // asigna a multiplex sus atributos basicos 
    this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = cantSalas;
  }

    public int getIdMultiplex() {
    	//retorna el id de un multiplex
        return idMultiplex;
    }

    public String getNombre() {
    	//retorna el nombre del multiplex
        return nombre;
    }

    public int getCantSalas() {
    	//retorna la cantidad de salas del multiplex
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
