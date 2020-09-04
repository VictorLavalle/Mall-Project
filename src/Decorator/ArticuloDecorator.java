package Decorator;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @author Eberth Mezeta
 */
public class ArticuloDecorator implements ArticuloVenta {
    
    private ArticuloVenta venta;

    public ArticuloDecorator(ArticuloVenta venta) {
        setVendible(venta);
    }
    
    //Metodo Set
    public void setVendible(ArticuloVenta venta) { this.venta = venta;}
    
    //Metodos Get
    public ArticuloVenta getVendible() { return venta; }
    
    @Override
    public String getNombre() { return venta.getNombre();}
    
    @Override
    public double getPrecio() { return venta.getPrecio();}
    
}
