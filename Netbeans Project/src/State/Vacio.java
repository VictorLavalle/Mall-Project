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
public class Vacio implements Estado{
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
        this.Carrito.getArticulosArray().add(art);
        this.Carrito.setEstado(new ConAlgo());
           JOptionPane.showMessageDialog(null,"Artículo Agregado Con Éxito");
    }

    
    @Override
    public void RemoveCarrito(Articulo art) {
        JOptionPane.showMessageDialog(null,"Carrito Vacio");
    }

    
    @Override
    public void Cancelar() {
        JOptionPane.showMessageDialog(null,"Carrito Eliminado");
         this.Carrito.setEstado(new Cancelado());
    }
   
    
     @Override
    public void addpaquete(Paquete paq) {
        this.Carrito.getPaquetes().add(paq);
        this.Carrito.setEstado(new ConAlgo());
        JOptionPane.showMessageDialog(null,"Paquete Agregado Con Éxito");
    }
    

    @Override
    public void RemovePaquete(Paquete paq) {
       JOptionPane.showMessageDialog(null,"Carrito Vacio");
    }
    
    
}
