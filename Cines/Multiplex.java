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
  private Sala[] sala;
  private Pelicula pelicula;
  private Empleado empleado;

  public Multiplex(int idMultiplex, String nombre, int cantSalas, Sala[] sala, Pelicula pelicula, Empleado empleado) {
     this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = cantSalas;
  this.sala = sala;
  this.pelicula = pelicula;
  this.empleado = empleado;
  }

  public void setProperty(int idMultiplex, String nombre, int cantSalas, Sala[] sala, Pelicula pelicula, Empleado empleado) {
    this.idMultiplex = idMultiplex;
  this.nombre = nombre;
  this.cantSalas = cantSalas;
  this.sala = sala;
  this.pelicula = pelicula;
  this.empleado = empleado;
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

    public Sala[] getSala() {
        return sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
  

  @Override
  public Multiplex clone() throws CloneNotSupportedException {
    try {
      return (Multiplex) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
}
