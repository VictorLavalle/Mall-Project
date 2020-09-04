package Decorator;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class Paquete extends ArticuloDecorator {

    private ArticuloVenta articuloAgregado;
    private double descuento;
    private String idTienda;
    
    public Paquete(ArticuloVenta paquete, ArticuloVenta articuloAgregado, double descuento) {
        super(paquete);
        setArticuloAgregado(articuloAgregado);
        setDescuento(descuento);
    }
    
   //Métodos Get
    public ArticuloVenta getArticuloAgregado() {return articuloAgregado; }
    public double getDescuento() {  return descuento;}
    public String getIdTienda() {return idTienda; }
    
        @Override
    public String getNombre() {
        return getVendible().getNombre() 
                + " + " + getArticuloAgregado().getNombre();
    }
    
    @Override
    public double getPrecio() {
       return getVendible().getPrecio() 
               + getArticuloAgregado().getPrecio() * (1 - getDescuento());
    }
    
    //Métodos Set
    public void setArticuloAgregado(ArticuloVenta articuloAgregado) {this.articuloAgregado = articuloAgregado;}
    public void setDescuento(double descuento) {this.descuento = descuento;}
    public void setIdTienda(String idTienda) { this.idTienda = idTienda;}

}
