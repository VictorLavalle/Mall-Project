package Observer;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
import java.util.ArrayList;

public class Observado {
    
    private final ArrayList<Observador> observadores;
    
    //Constructores
    public Observado(){
        observadores = new ArrayList<>();
    }
    
    //Metodos
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }
    
    
    public void quitarObservador(Observador observador){
        observadores.remove(observador);
    }
    
    
    public void notificar(String nuevoProducto){
        observadores.forEach((observador) -> {
            observador.update(nuevoProducto);
        });
    }
}
