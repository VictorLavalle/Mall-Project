package Launcher;

import AbstractFactory.*;
import Model.*;
import Vista.CentroComercialV;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se crea el centro comerical
        CentroComercial centro = new CentroComercial("FMAT Centro Comercial");
        
        //Se crean las tiendas
        TiendaFactory libreria = new LibreriaFactory();
        TiendaFactory zapateria = new ZapateriaFactory();
        TiendaFactory farmacia = new FarmaciaFactory();
        libreria.createTienda();
        zapateria.createTienda();
        farmacia.createTienda();
        
        //Entran los clientes
        centro.entrar(new Cliente("Eberth Mezeta"));
        centro.entrar(new Cliente("Victor Lavalle"));
        centro.entrar(new Cliente("Gabriel Islas"));  
        
  //Se cargan los artículos
    //Zapatos
        Articulo Zapato1= new Articulo("Air Jordan 6","23329","Zapateria",2230);
        Articulo Zapato2= new Articulo("Yeezys Off White","88135","Zapateria",2640);
        Articulo Zapato3= new Articulo("Vans Skate","14637","Zapateria",650);
        Articulo Zapato4= new Articulo("Air Force 1","42048","Zapateria",1600);
        Articulo Zapato5= new Articulo("Crocs","69731","Zapateria",800);
     //Libros
        Articulo Libro1= new Articulo("Don Quijote","6261","Farmacia",250);
        Articulo Libro2= new Articulo("La divina comedia","320","Libreria",550);
        Articulo Libro3= new Articulo("H.P Lovecraft","654","Libreria",390);
        Articulo Libro4= new Articulo("Harry Potter y la Piedra Filosofal","1499","Libreria",420);
        Articulo Libro5= new Articulo("Hunger Games","7264","Libreria",500);
     //Farmaceuticos
        Articulo Farma1= new Articulo("Cubre Bocas","6261","Farmacia",20);
        Articulo Farma2= new Articulo("Gel Anitbacterial","1212","Farmacia",80);
        Articulo Farma3= new Articulo("Lysol","8963","Farmacia",120);
        Articulo Farma4= new Articulo("Paracetamol","8123","Farmacia",50);
        Articulo Farma5= new Articulo("Naproxeno","9114","Farmacia",100);
        
//Se instancia la Zapatería
        Zapateria.getInstancia().setNombre("Zapateria TAF");
        Zapateria.getInstancia().setID("JDBAK");
        Zapateria.getInstancia().agregarObservador(centro);
        Zapateria.getInstancia().addArticulo(Zapato1);
        Zapateria.getInstancia().addArticulo(Zapato2);
        Zapateria.getInstancia().addArticulo(Zapato3);
        Zapateria.getInstancia().addArticulo(Zapato4);
        Zapateria.getInstancia().addArticulo(Zapato5);
         centro.anadirTienda(Zapateria.getInstancia());
            //Se  crean e instancian los paquetes de la zapateria
              //Paq 1
            ArrayList<Articulo> paqZapatos1 = new ArrayList<>();
            paqZapatos1.add(Zapato1);
            paqZapatos1.add(Zapato2);
            Zapateria.getInstancia().addPaquete(Zapateria.getInstancia().crearPaquete(paqZapatos1, 0.25));
               //Paq 2
            ArrayList<Articulo> paqZapatos2 = new ArrayList<>();
            paqZapatos2.add(Zapato3);
            paqZapatos2.add(Zapato5);
            Zapateria.getInstancia().addPaquete(Zapateria.getInstancia().crearPaquete(paqZapatos2, 0.30));
                //Paq 3
            ArrayList<Articulo> paqZapatos3 = new ArrayList<>();
            paqZapatos3.add(Zapato4);
            paqZapatos3.add(Zapato5);
            Zapateria.getInstancia().addPaquete(Zapateria.getInstancia().crearPaquete(paqZapatos3, 0.20));
            
            
         //Se instancia la Libereria
        Libreria.getInstancia().setNombre("Libreria Dante");
        Libreria.getInstancia().setID("DGWJS");
        Libreria.getInstancia().addArticulo(Libro1);
        Libreria.getInstancia().addArticulo(Libro2);
        Libreria.getInstancia().addArticulo(Libro3);
        Libreria.getInstancia().addArticulo(Libro4);
        Libreria.getInstancia().addArticulo(Libro5);
         centro.anadirTienda(Libreria.getInstancia());
         //Se  crean e instancian los paquetes de la Libreria
              //Paq 1
            ArrayList<Articulo> paqLibros1 = new ArrayList<>();
            paqLibros1.add(Libro1);
            paqLibros1.add(Libro5);
            Libreria.getInstancia().addPaquete(Libreria.getInstancia().crearPaquete(paqLibros1, 0.20));
               //Paq 2
            ArrayList<Articulo> paqLibros2 = new ArrayList<>();
            paqLibros2.add(Libro2);
            paqLibros2.add(Libro4);
            Libreria.getInstancia().addPaquete(Libreria.getInstancia().crearPaquete(paqLibros2, 0.15));
        
            
        //Se instancia la Farmacia
        Farmacia.getInstancia().setNombre("Farmacia YZA");
        Farmacia.getInstancia().setID("FHRO");
        Farmacia.getInstancia().addArticulo(Farma1);
        Farmacia.getInstancia().addArticulo(Farma2);
        Farmacia.getInstancia().addArticulo(Farma3);
        Farmacia.getInstancia().addArticulo(Farma4);
        Farmacia.getInstancia().addArticulo(Farma5);
        centro.anadirTienda(Farmacia.getInstancia());
           //Se  crean e instancian los paquetes de la Farmacia
              //Paq 1
            ArrayList<Articulo> paqFarma1 = new ArrayList<>();
            paqFarma1.add(Farma1);
            paqFarma1.add(Farma2);
            Farmacia.getInstancia().addPaquete(Farmacia.getInstancia().crearPaquete(paqFarma1, 0.10));
           

        //Se crea la ventana Swing
        CentroComercialV c = new CentroComercialV(centro);
        c.setVisible(true);
         JOptionPane.showMessageDialog(null, "¡ Bienvenido a FMAT Centro Comercial !");
        
    }
    
}
