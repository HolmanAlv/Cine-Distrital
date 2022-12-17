/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;

/**
 *
 * @author rdmon
 */
public class Silla {
	//Guarda la informacion necesaria sobre un asiento 
    int Estado;
    String idSilla;
    float precio;
    public Silla(String Estado,String idSilla) {
    	//Crea una instancia de silla con un estado y un id de silla
    	this.idSilla=idSilla;
    	this.Estado=Integer.valueOf(Estado);
    	
    }
    
    public int getEstado() {
    	//Retorna el estado de ocupacion de una silla
        return Estado;
    }

    public void setEstado(int Estado) {
    	//Asigna un estado de ocupacion a una silla
        this.Estado = Estado;
    }

    public String getIdSilla() {
    	//Retorna el id de una silla
        return idSilla;
    }

    public float getPrecio() {
    	//retorna el precio de la silla dependiendo de su tipo
        return precio;
    }

    public void setIdSilla(String idSilla) {
        this.idSilla = idSilla;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
