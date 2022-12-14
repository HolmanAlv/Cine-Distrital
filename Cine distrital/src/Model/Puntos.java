package Model;

import java.util.Date;

public class Puntos {
    private static Puntos instancia;
    private int cantidad;

    public static Puntos getInstancia(){
        if (instancia == null) {
            instancia = new Puntos();
        }
        return instancia;
    }

    public Date vencimientoPuntos(int cantidaPuntos){
        
        return null;
    }
}
