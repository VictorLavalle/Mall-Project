package Vista;

import Model.Cliente;
import Model.CentroComercial;
import Model.Tienda;
import java.awt.Color;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 * @author Gabriel Islas
 * @author Victor Lavalle
 * @auhtor Eberth Mezeta
 */
public class CentroComercialV extends javax.swing.JFrame{

     private Cliente Cliente;
     private CentroComercial centro;
     Color Light=new Color(187, 187, 187);
     Color Back=new Color(60,63,65);
     Color Dark= new Color(18,18,18);
     Color PDark= new Color(187,134,252);
     Color GDark=new Color(3,218,198);
     Color RDark=new Color(229,20,0);
    public CentroComercialV(CentroComercial centro) {
        this.centro = centro;
      
        initComponents();
        LlenarComboboxTiendas();
        LlenarComboboxClientes();
        this.MostrarCarritoBTN.setEnabled(false);
        this.EntrarBTN.setEnabled(false);
        this.PedirCarritoBTN.setEnabled(false);
        this.CancelarCarritoBTN.setEnabled(false);
        this.TituloLBL.setText(this.centro.getNombre());
       MostrarActualizaciones();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
       
    }
    
    public void LlenarComboboxClientes(){
          this.ListaClientesCB.removeAllItems();
        Iterator i =centro.customers();
        while(i.hasNext()){
            this.ListaClientesCB.addItem(i.next().toString());
        }
    }
    
    
    
    public void LlenarComboboxTiendas(){
        this.ListaTiendasCB.removeAllItems();
        Iterator i =centro.getTiendas();
        while(i.hasNext()){
            this.ListaTiendasCB.addItem(i.next().toString());
        }
    }
    
    
    public void MostrarActualizaciones(){
         Iterator<Cliente> i = this.centro.customers();
         DefaultListModel modelo = new DefaultListModel();
         
         while(i.hasNext()){
            ArrayList<String>Mensajes= i.next().getNotificacionesProductos();
             for(int j=0;j<Mensajes.size();j++){
                  modelo.addElement(Mensajes.get(j)); 
             }
         }
         this.ListaAct.setModel(modelo);
    }
   
    
    /**
     * Creates new form CentroComercial
     */
    public CentroComercialV() {
        initComponents();
        LlenarComboboxTiendas();
        LlenarComboboxClientes();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloLBL = new javax.swing.JLabel();
        ListaClientesCB = new javax.swing.JComboBox<>();
        SelecionarClienteBTN = new javax.swing.JButton();
        ListaTiendasCB = new javax.swing.JComboBox<>();
        EntrarBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ClienteActualLBL = new javax.swing.JLabel();
        PedirCarritoBTN = new javax.swing.JButton();
        CancelarCarritoBTN = new javax.swing.JButton();
        MostrarCarritoBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaAct = new javax.swing.JList<>();
        DarkMode = new javax.swing.JRadioButton();
        Nota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloLBL.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        TituloLBL.setForeground(new java.awt.Color(0, 0, 0));
        TituloLBL.setText("FMAT Centro Comercial");
        jPanel1.add(TituloLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        ListaClientesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ListaClientesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        SelecionarClienteBTN.setForeground(new java.awt.Color(0, 0, 0));
        SelecionarClienteBTN.setText("Selecionar Cliente");
        SelecionarClienteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarClienteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(SelecionarClienteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        ListaTiendasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ListaTiendasCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, -1));

        EntrarBTN.setForeground(new java.awt.Color(0, 0, 0));
        EntrarBTN.setText("Entrar");
        EntrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(EntrarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 140, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ultimos Articulos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        ClienteActualLBL.setForeground(new java.awt.Color(0, 0, 0));
        ClienteActualLBL.setText("Cliente Actual:");
        jPanel1.add(ClienteActualLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        PedirCarritoBTN.setForeground(new java.awt.Color(0, 0, 0));
        PedirCarritoBTN.setText("Pedir Carrito");
        PedirCarritoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedirCarritoBTNActionPerformed(evt);
            }
        });
        jPanel1.add(PedirCarritoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        CancelarCarritoBTN.setForeground(new java.awt.Color(0, 0, 0));
        CancelarCarritoBTN.setText("Eliminar Carrito");
        CancelarCarritoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCarritoBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarCarritoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));

        MostrarCarritoBTN.setForeground(new java.awt.Color(0, 0, 0));
        MostrarCarritoBTN.setText("Mostrar Carrito");
        MostrarCarritoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCarritoBTNActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarCarritoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        ListaAct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notificaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        ListaAct.setForeground(new java.awt.Color(0, 0, 0));
        ListaAct.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaAct);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 350, 210));

        DarkMode.setText("Dark Mode");
        DarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkModeActionPerformed(evt);
            }
        });
        jPanel1.add(DarkMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        Nota.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        Nota.setText("Límite de Artículos en Carrito: 10");
        jPanel1.add(Nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarBTNActionPerformed
        
        //En esta parte//
        
        Iterator e = this.centro.getTiendas();
        
        while(e.hasNext()){
        
            Tienda tienda =(Tienda) e.next();
            if(tienda.getNombre().equals(this.ListaTiendasCB.getSelectedItem().toString())){
                this.setVisible(false);

                new TiendaV(this,this.Cliente,tienda).setVisible(true);
                JOptionPane.showMessageDialog(null, "¡ Bienvenido a "+tienda+" !");
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_EntrarBTNActionPerformed

    private void MostrarCarritoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCarritoBTNActionPerformed
        if(Cliente.getCarrito() != null){
         new CarritoV(this,Cliente).setVisible(true);
        setVisible(false);
        }
       
    }//GEN-LAST:event_MostrarCarritoBTNActionPerformed

    private void SelecionarClienteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarClienteBTNActionPerformed
      
        int Index = this.ListaClientesCB.getSelectedIndex();
       
        System.out.println(Index);
   
       this.PedirCarritoBTN.setEnabled(true);
        
        
        Iterator e = this.centro.customers();
        
            System.out.println(this.ListaClientesCB.getItemAt(Index));
        
        while(e.hasNext()){
            
            Cliente c = (Cliente) e.next();
            System.out.println(c.getNombre());
            if(c.getNombre().equals(this.ListaClientesCB.getItemAt(Index))){
             
                this.Cliente=c;
                break;
            }
                
        }
          this.ClienteActualLBL.setText("Cliente Actual:  "+ this.Cliente.getNombre());
        
        
        
        
    }//GEN-LAST:event_SelecionarClienteBTNActionPerformed

    private void PedirCarritoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedirCarritoBTNActionPerformed
        
        this.Cliente.setCarrito(centro.getCarrito());
        this.CancelarCarritoBTN.setEnabled(true);
        this.MostrarCarritoBTN.setEnabled(true);
        this.EntrarBTN.setEnabled(true); 
    }//GEN-LAST:event_PedirCarritoBTNActionPerformed

    private void CancelarCarritoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCarritoBTNActionPerformed
      if(this.Cliente.getCarrito()!=null){
      
            this.Cliente.getCarrito().Cancelar();
            this.Cliente.setCarrito(null);
      
      }
      
    }//GEN-LAST:event_CancelarCarritoBTNActionPerformed

    private void DarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkModeActionPerformed
        if(DarkMode.isSelected()){
    jPanel1.setBackground(Dark);
   DarkMode.setForeground(Color.WHITE);
   DarkMode.setBackground(Dark);
   TituloLBL.setForeground(Color.WHITE);
   ClienteActualLBL.setForeground(Color.WHITE);
   jLabel2.setForeground(Color.WHITE);
   SelecionarClienteBTN.setBackground(PDark);
   PedirCarritoBTN.setBackground(GDark);
   CancelarCarritoBTN.setBackground(RDark);
   EntrarBTN.setBackground(GDark);
   SelecionarClienteBTN.setForeground(Color.WHITE);
   PedirCarritoBTN.setForeground(Color.WHITE);
   CancelarCarritoBTN.setForeground(Color.WHITE);
   EntrarBTN.setForeground(Color.WHITE);
   Nota.setForeground(Color.WHITE);
        }
      
   else{
    TituloLBL.setForeground(Color.BLACK);
   ClienteActualLBL.setForeground(Color.BLACK);
     jPanel1.setBackground(Light);
   DarkMode.setForeground(Color.BLACK);
     DarkMode.setBackground(Light);
      jLabel2.setForeground(Color.BLACK);
      SelecionarClienteBTN.setBackground(Back);
        SelecionarClienteBTN.setBackground(Back);
   PedirCarritoBTN.setBackground(Back);
   CancelarCarritoBTN.setBackground(Back);
   EntrarBTN.setBackground(Back);
    EntrarBTN.setForeground(Color.WHITE);
       SelecionarClienteBTN.setForeground(Color.WHITE);
   PedirCarritoBTN.setForeground(Color.WHITE);
   CancelarCarritoBTN.setForeground(Color.WHITE);
    Nota.setForeground(Color.BLACK);
   }
// TODO add your handling code here:
    }//GEN-LAST:event_DarkModeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CentroComercialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroComercialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroComercialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroComercialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroComercialV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarCarritoBTN;
    private javax.swing.JLabel ClienteActualLBL;
    private javax.swing.JRadioButton DarkMode;
    private javax.swing.JButton EntrarBTN;
    private javax.swing.JList<String> ListaAct;
    private javax.swing.JComboBox<String> ListaClientesCB;
    private javax.swing.JComboBox<String> ListaTiendasCB;
    private javax.swing.JButton MostrarCarritoBTN;
    private javax.swing.JLabel Nota;
    private javax.swing.JButton PedirCarritoBTN;
    private javax.swing.JButton SelecionarClienteBTN;
    private javax.swing.JLabel TituloLBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
