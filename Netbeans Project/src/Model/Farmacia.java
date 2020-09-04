package Model;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class Farmacia extends Tienda {

    private static Farmacia instancia;
    
    //Constructor de la buena suerte :)
    private Farmacia(){}

    //Constructor 
    public static Farmacia getInstancia(){
        if(instancia == null){
            instancia = new Farmacia();
        }
        return instancia;
    }

    @Override
    public void entrar(Cliente cliente) {}

    @Override
    public void Salir(Cliente cliente) {}
    
}
