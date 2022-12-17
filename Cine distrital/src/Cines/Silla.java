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
    int Estado;
    String idSilla;
    float precio;
    public Silla(String Estado,String idSilla) {
    	this.idSilla=idSilla;
    	this.Estado=Integer.valueOf(Estado);
    	
    }
    
    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public String getIdSilla() {
        return idSilla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setIdSilla(String idSilla) {
        this.idSilla = idSilla;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
