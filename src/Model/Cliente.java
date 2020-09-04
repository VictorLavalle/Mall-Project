package Model;

import java.util.ArrayList;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class Cliente {
    
    private String Nombre;
    private CarritoCompras Carrito;
    private Tienda tienda;
    private ArrayList<String> notificacionesProductos;

    //Constructor1
    public Cliente(String Nombre) {
        this.Nombre = Nombre;
        this.Carrito=null;
        this.notificacionesProductos= new ArrayList<>();
    }
    
    //Constructor2
    public Cliente(String Nombre, CarritoCompras Carrito, Tienda tienda) {
        this.Nombre = Nombre;
        this.Carrito = Carrito;
        this.tienda = tienda;
    }
    
 //Métodos Get & Set
    public String getNombre() {return Nombre;}
    public CarritoCompras getCarrito() { return Carrito; }
    public Tienda getTienda() {return tienda;}
    public ArrayList<String> getNotificacionesProductos() {  return notificacionesProductos;}
    
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public void setCarrito(CarritoCompras Carrito) { this.Carrito = Carrito;}
    public void setTienda(Tienda tienda) {this.tienda = tienda;}
    public void setNotificacionesProductos(ArrayList<String> notificacionesProductos) {
        this.notificacionesProductos = notificacionesProductos;
    }

    //Metodo para el Observer
    public void notificarCliente(String TiendaSurtida){
     notificacionesProductos.add(TiendaSurtida);
    }

    @Override
    public String toString() {
        return  Nombre;
    }
}
