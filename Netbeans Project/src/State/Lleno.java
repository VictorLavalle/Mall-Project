package State;

import Model.CarritoCompras;
import Model.Articulo;
import Decorator.Paquete;
import javax.swing.JOptionPane;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class Lleno implements Estado {
    private CarritoCompras Carrito;

    public CarritoCompras getCarrito() {
        return Carrito;
    }

    @Override
    public void setCarrito(CarritoCompras Carrito) {
        this.Carrito = Carrito;
    }

    @Override
    public void addCarrito(Articulo art) {
        
        
        JOptionPane.showMessageDialog(null,"Carrito lleno" );
    
    }

    @Override
    public void RemoveCarrito(Articulo art) {
        
        this.Carrito.getArticulosArray().remove(art);
        this.Carrito.setEstado(new ConAlgo());
        
    }

    @Override
    public void Cancelar() {
        JOptionPane.showMessageDialog(null,"Carrito Cancelado");
         this.Carrito.setEstado(new Cancelado());
    
    }

    @Override
    public void addpaquete(Paquete paq) {
    
       JOptionPane.showMessageDialog(null,"Carrito lleno" );
        
    }

    @Override
    public void RemovePaquete(Paquete paq) {
    
        this.Carrito.getPaquetes().remove(paq);
        this.Carrito.setEstado(new ConAlgo());
    
    }
 
}
