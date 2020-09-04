package Model;

import State.*;
import Decorator.Paquete;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class CarritoCompras  {
    
    private static final int Capacidad=10;

    private ArrayList<Articulo>Articulos;
    private ArrayList<Paquete>paquetes;
    private Estado estado;

//Constructor
    public CarritoCompras(){
        Articulos=new ArrayList<>();
        paquetes= new ArrayList<>();
        setEstado(new Vacio());
    }

    //Métodos Get 
    public ArrayList<Articulo> getArticulosArray() {return Articulos;}
    public Iterator<Articulo> getArticulos() { return Articulos.iterator(); } 
    public ArrayList<Paquete> getPaquetes() {return paquetes; }
    public Iterator<Paquete> getPaq(){ return paquetes.iterator();}
    public Estado getEstado() {return estado; }
    public int getCapacidad() {return Capacidad; }
    
    //Metodos Set
    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    
    public void setArticulos(ArrayList<Articulo> Articulos) {
        this.Articulos = Articulos;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        this.estado.setCarrito(this);
    }

    
 //Funciones para controlar el carrito de compras
    public void Añadir(Articulo art){
        this.estado.addCarrito(art);
    }

    
    public void Quitar(Articulo art){
        this.estado.RemoveCarrito(art);
    }

    
    public void Cancelar(){
        this.estado.Cancelar();
    }
    
    
    public void AñadirPaquete(Paquete paque){
        this.estado.addpaquete(paque);
    }
    
    
    public void QuitarPaquete(Paquete paque){
        this.estado.RemovePaquete(paque);
    }
   
      public int sizeArt() {
        return Articulos.size();
    }
  
     public int sizePaq() {
        return paquetes.size();
    }
    
}
