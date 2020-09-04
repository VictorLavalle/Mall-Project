package Model;

import Observer.Observador;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class CentroComercial implements Observador{
    private String Nombre;
    private final ArrayList<Tienda>tiendas= new ArrayList<>();
    private final ArrayList<Cliente>cliente= new ArrayList<>();

    //Constructor
    public CentroComercial(String Nombre) {
        this.Nombre = Nombre;
    }

    //Metodos Get & Set
    public String getNombre() { return Nombre;  }
    public CarritoCompras getCarrito(){return new CarritoCompras();}
    public Iterator<Tienda> getTiendas(){ return tiendas.iterator(); }
   
    public void setNombre(String Nombre) { this.Nombre = Nombre;}
    
    
    //Funciones para controlar el centro comercial
   public void entrar(Cliente cliente){
       this.cliente.add(cliente);
   }
   
   
   public void Salir(Cliente cliente){
       this.cliente.remove(cliente);
   }
   
   
  public void anadirTienda(Tienda tienda){
      this.tiendas.add(tienda);
  }
   
   public Iterator<Cliente> customers(){
       return cliente.iterator();
   }
   

    @Override
    public void update(String nuevoProducto) {
          Iterator i = customers();
          while(i.hasNext()){
          Cliente clientenotify = (Cliente) i.next();
          clientenotify.notificarCliente("La tienda " + nuevoProducto + " ha añadido un nuevo producto");
          }
    } 
    
    
}
