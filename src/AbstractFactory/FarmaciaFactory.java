package AbstractFactory;

import Model.Tienda;
import Model.Farmacia;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class FarmaciaFactory extends TiendaFactory {
    @Override
    public Tienda createTienda() {
        return Farmacia.getInstancia();
    }
}
