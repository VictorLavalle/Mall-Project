package Model;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class Libreria extends Tienda {

    private static Libreria instancia;

    private Libreria(){}

    public static Libreria getInstancia(){
        if(instancia == null){
            instancia = new Libreria();
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
