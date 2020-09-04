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
public class ConAlgo implements Estado {
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
        if(this.Carrito.getArticulosArray().size()+this.Carrito.getPaquetes().size()==this.Carrito.getCapacidad()){
        
            this.Carrito.setEstado(new Lleno());
        }else{
             this.Carrito.getArticulosArray().add(art);
               JOptionPane.showMessageDialog(null,"Artículo Agregado Con Éxito");
        }
        
    }

    @Override
    public void RemoveCarrito(Articulo art) {
         if(this.Carrito.getArticulosArray().size() + this.Carrito.getPaquetes().size()==0){
             this.Carrito.setEstado(new Vacio());
         }else{
             this.Carrito.getArticulosArray().remove(art);
            // JOptionPane.showMessageDialog(null,"Articulo Eliminado Con Éxito");
         
         }
    }

    @Override
    public void Cancelar() {
    JOptionPane.showMessageDialog(null,"Carrito Eliminado Con Éxito");
         this.Carrito.setEstado(new Cancelado());
    }

    @Override
    public void addpaquete(Paquete paq) {
        if(this.Carrito.getPaquetes().size()+ this.Carrito.getArticulosArray().size()==this.Carrito.getCapacidad()){
            this.Carrito.setEstado(new Lleno());
        }else{
             this.Carrito.getPaquetes().add(paq);
               JOptionPane.showMessageDialog(null,"Paquete Agregado Con Éxito");
        }
        
    }

    @Override
    public void RemovePaquete(Paquete paq) {
        
        
         if(this.Carrito.getArticulosArray().size() + this.Carrito.getPaquetes().size()==0){
           
             this.Carrito.setEstado(new Vacio());
             
         }else{
             
             this.Carrito.getPaquetes().remove(paq);
              //JOptionPane.showMessageDialog(null,"Paquete Eliminado Con Éxito");
         
         }
      
        
    
    }
}
