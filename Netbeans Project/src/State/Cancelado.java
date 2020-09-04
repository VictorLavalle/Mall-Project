package State;

import Model.CarritoCompras;;
import Model.Articulo;
import Decorator.Paquete;
import javax.swing.JOptionPane;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class Cancelado implements Estado {

   private CarritoCompras Carrito;

    public CarritoCompras getCarrito() { return Carrito; }

   @Override
    public void setCarrito(CarritoCompras Carrito) {
        this.Carrito = Carrito;
    }

    
    @Override
    public void addCarrito(Articulo art) {
        JOptionPane.showMessageDialog(null, "El carrito Fue Eliminado");
      
        
    }

    @Override
    public void RemoveCarrito(Articulo art) {
         JOptionPane.showMessageDialog(null, "El Carrito Fue Eliminado");
         System.out.println("El Carrito Fue Cancelado");
    }

    
    @Override
    public void Cancelar() {
         JOptionPane.showMessageDialog(null, "El Carrito Ya Ha Sido Eliminado");
    }

    
    @Override
    public void addpaquete(Paquete paq) {
         JOptionPane.showMessageDialog(null, "El Carrito Fue Eliminado");
    }

    
    @Override
    public void RemovePaquete(Paquete paq) {
         JOptionPane.showMessageDialog(null, "El Carrito Fue Eliminado");
    }
    
    
}
