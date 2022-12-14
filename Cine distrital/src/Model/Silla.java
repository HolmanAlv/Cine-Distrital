package Model;

public class Silla {
    private int idSilla;
    private float precio;
    private static Silla instancia;

    public Silla(){

    }

    public Silla getInstancia(){
         if (instancia == null) {
            instancia = new Silla();
        }
        return instancia;
    }

}
