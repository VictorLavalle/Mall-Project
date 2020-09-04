package AbstractFactory;

import Model.Tienda;
import Model.Zapateria;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class ZapateriaFactory extends TiendaFactory {
    @Override
    public Tienda createTienda() {
        return Zapateria.getInstancia();
    }
}
