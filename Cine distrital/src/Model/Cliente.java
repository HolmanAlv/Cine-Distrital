package Model;

public class Cliente {
    private static Cliente instancia;
    private int idCliente;
    private Puntos puntos;

    public Cliente(int idCliente){
        this.idCliente = idCliente;
        this.puntos = Puntos.getInstancia();
    }
    
    public static Cliente getInstancia(int idCliente){
         if (instancia == null) {
            instancia = new Cliente(idCliente);
        }
        return instancia;
    }
}
