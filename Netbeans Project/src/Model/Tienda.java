package Model;

import Observer.*;
import Decorator.ArticuloVenta;
import Decorator.Paquete;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public abstract class Tienda {
    
    private String Nombre;
    private String ID;
    private final  ArrayList<Articulo> articulos = new ArrayList<>();
    private final  ArrayList<Cliente> clientes = new ArrayList<>();
    private  ArrayList<Paquete> paquetes = new ArrayList<>();
    private Observado observado= new Observado();

//Métodos Get & Set
    public String getNombre() {return Nombre;}
    public String getID() {return ID; }
    public Observado getObservado() {return observado;}
    public Iterator<Cliente> getClientes(){ return clientes.iterator(); }
    public Iterator<Paquete> getPaquetes() { return paquetes.iterator(); }
    public Iterator<Articulo> getArticulos(){return articulos.iterator(); }
    
    public void setNombre(String Nombre) { this.Nombre = Nombre;}
    public void setID(String ID) {this.ID = ID;}
    public void setObservado(Observado observado) { this.observado = observado;}
    public void setPaquetes(ArrayList<Paquete> paquetes) { this.paquetes = paquetes; }
    
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public abstract void entrar(Cliente cliente);

   public abstract void Salir(Cliente cliente);

   public void addACarrito( CarritoCompras carrito, Articulo articulo){
       carrito.Añadir(articulo);
   }

   public void elimDeCarrito(CarritoCompras carrito, Articulo articulo){
       carrito.Quitar(articulo);
   }

    public Paquete crearPaquete(ArrayList<Articulo>articulos, double descuento){
        
        ArticuloVenta paquete = null;

        if (!articulos.isEmpty()) {
            for (int i = 0; i < articulos.size(); i++) {
                if (i == 0) {
                    paquete = new Articulo(articulos.get(i).getNombre(), articulos.get(i).getID(),
                            articulos.get(i).getIDT(), articulos.get(i).getPrecio() * (1 - .20));
                } else {
                    paquete = new Paquete(paquete, articulos.get(i), descuento);
                 
                }
            }
        }
        return (Paquete) paquete;  
    }
    
    public void addPaquete(Paquete paquete)  {
           paquetes.add(paquete);
           observado.notificar(Nombre);
    }
    
    
   public void addArticulo(Articulo articulo){
       articulos.add(articulo);
       observado.notificar(Nombre);
       
   }

   public void agregarObservador(Observador observador){
       observado.agregarObservador(observador);
   }

   public void quitarObservador(Observador observador){
       observado.quitarObservador(observador);
   }
   
  public int sizeArt() {
        return articulos.size();
    }
  
     public int sizePaq() {
        return paquetes.size();
    }
     
    @Override
    public String toString() {
        return Nombre;
    }
            
}
