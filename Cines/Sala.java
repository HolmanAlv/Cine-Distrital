/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cines;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author rdmon
 */
public class Sala {
    int idSala;
    Pelicula pelicula;
    String tipoSilla;
    Silla[] sillas= new Silla[60];
    
    public Silla[] cambiarEstadoSillaVendida(int id, Silla[] sillas) {
        //metodo para la venta de silla
        for (int i = 0; i < sillas.length; i++) {
            if (sillas[i].getIdSilla()==id) {
                sillas[i].setEstado(Boolean.FALSE);
            }
        }
        return sillas;
    }
  
    public void reOrdenarSillas(String s, Silla[] silla) {
        Properties prop = new Properties();
        int aux = 0;
        Silla sillas[];
        sillas = new Silla[60];
        try ( FileReader input = new FileReader("C:/Users/rdmon/Documents/NetBeansProjects/modelos/src/main/java/Prototype" + s)) {
            prop.load(input);
            FileWriter FW = new FileWriter("C:/Users/rdmon/Documents/NetBeansProjects/modelos/src/main/java/Prototype" + s);
            for (int i = 0; i < 60; i++) {

                sillas[i] = new Silla();
                if (i < 40) {
                    aux = i + 1;
                    if (silla[i].getEstado() == false) {
                        prop.setProperty(("G" + aux), "1");
                    }
                } else {
                    aux = i + 1;
                    if (silla[i].getEstado() == false) {
                        prop.setProperty(("P" + aux), "1");
                    }
                }
            }
            prop.store(FW, "");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Silla[] obtenerSillas(String s) {
        Properties prop = new Properties();
        int aux = 0;
        Silla sillas[];
        sillas = new Silla[60];
        try ( InputStream input = new FileInputStream("C:/Users/rdmon/Documents/NetBeansProjects/modelos/src/main/java/Prototype" + s)) {
            prop.load(input);

            for (int i = 0; i < 60; i++) {
                sillas[i] = new Silla();
                if (i < 40) {
                    aux = i + 1;
                    String property = prop.getProperty("G" + aux);
                    sillas[i].setIdSilla(aux);
                    sillas[i].setPrecio(11000);
                    if (property.equalsIgnoreCase("0")) {
                        sillas[i].setEstado(Boolean.TRUE);
                    } else {
                        sillas[i].setEstado(Boolean.FALSE);
                    }

                } else {
                    aux = i + 1;
                    String property = prop.getProperty("P" + aux);
                    sillas[i].setIdSilla(aux);
                    sillas[i].setPrecio(15000);
                    if (property.equalsIgnoreCase("0")) {
                        sillas[i].setEstado(Boolean.TRUE);
                    } else {
                        sillas[i].setEstado(Boolean.FALSE);
                    }

                }

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sillas;
    }

    public String obtenerNombre(String s) {
        Properties prop = new Properties();

        try ( InputStream input = new FileInputStream("C:/Users/rdmon/Documents/NetBeansProjects/modelos/src/main/java/Prototype" + s)) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String property = prop.getProperty("nombre");
        return property;
    }

    public String obtenerHorario(String s) {
        Properties prop = new Properties();

        try ( InputStream input = new FileInputStream("C:/Users/rdmon/Documents/NetBeansProjects/modelos/src/main/java/Prototype" + s)) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String property = prop.getProperty("hora");
        return property;
    }

}
