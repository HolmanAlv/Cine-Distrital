/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;
//main para que hagan las pruebas de funcionamiento

/**
 *
 * @author rdmon
 */
public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
/* esto es lo del prototype para meter los multiplex
    Sala sala[];
    sala= new Sala[5];
    Pelicula pelicula = new Pelicula();
    Empleado empleado = new Empleado();
    Multiplex prototype = new Multiplex(12, "a", 2, sala, pelicula, empleado);
    Multiplex copy1 = prototype.clone();
    Multiplex copy3 = prototype.clone();*/

//esto enrealidad iria en sala que va en el multiplex

  Sala sala;
  sala=new Sala();
  
  Silla sillas[];
   sillas= new Silla[60];
   //como parametro le enviamos rutas con el nombre asi sabemos que multiplex es
  sillas=sala.obtenerSillas("/Titan/funcion1.properties");
  for(int i=0;i<60;i++){
      System.out.println(i);
      System.out.println( sillas[i].precio);
  }
      System.out.println(sala.obtenerNombre("/Titan/funcion1.properties"));
      System.out.println(sala.obtenerHorario("/Titan/funcion1.properties"));
      
      sala.reOrdenarSillas("/Titan/funcion1.properties", sillas);
      ///esta parte solo cambia el estado de la silla en el array no cambia el del properties para eso se llama la anterior
      sillas=sala.cambiarEstadoSillaVendida(1, sillas);
      System.out.println(sillas[0].getEstado());
  }

}
