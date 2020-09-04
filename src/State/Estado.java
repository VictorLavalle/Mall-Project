package State;

import Model.CarritoCompras;
import Model.Articulo;
import Decorator.Paquete;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public interface Estado {
    
    public void setCarrito(CarritoCompras carrito);
    public void addCarrito(Articulo art);
    public void RemoveCarrito(Articulo art);
    public void addpaquete(Paquete paq);
    public void RemovePaquete(Paquete paq);
    public void Cancelar();
}
