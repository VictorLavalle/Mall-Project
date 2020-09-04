package Model;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class Zapateria extends Tienda {

    private static Zapateria instancia;
    
    //Constructor de la buena suerte :)
    private Zapateria(){}

    public static Zapateria getInstancia(){
        if(instancia == null){
            instancia = new Zapateria();
        }
        return instancia;
    }

    @Override
    public void entrar(Cliente cliente) {
      cliente.setTienda(this);
    }

    @Override
    public void Salir(Cliente cliente) {
        cliente.setTienda(null);
    }

}
