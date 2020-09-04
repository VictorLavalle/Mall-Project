package Model;

import Decorator.ArticuloVenta;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class Articulo implements ArticuloVenta {
    private String Nombre;
    private String ID;
    private String IDT;
    private double Precio;

    //Constructor
    public Articulo(String Nombre, String ID, String IDT, double Precio) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.IDT = IDT;
        this.Precio = Precio;
    }

    //Metodos Get & Set
    @Override
    public String getNombre() { return Nombre;}
    public String getID() { return ID;}
    public String getIDT() { return IDT; }
    @Override
    public double getPrecio() {return Precio; }
    
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public void setID(String ID) {  this.ID = ID;}
    public void setPrecio(double Precio) { this.Precio = Precio;}
    public void setIDT(String IDT) { this.IDT = IDT; }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " Precio:$" + Precio;
    }

}
