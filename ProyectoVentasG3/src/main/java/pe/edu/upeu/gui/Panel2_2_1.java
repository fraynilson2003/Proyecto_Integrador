
package pe.edu.upeu.gui;


import conection.conexion;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.modelo.StockProductoTO;



/**
 *
 * @author Fray
 */
public class Panel2_2_1 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form Panel2_2_1
     */
    public Panel2_2_1() {
        initComponents();String[] titulosInfVent={"IDPro","Producto","UnidMed", "CantidadTotal"};
        modelo = new DefaultTableModel(null, titulosInfVent); 
        tableStockProd.setModel(modelo);
        this.mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtIDPro = new javax.swing.JTextField();
        txtCantnew = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnP6retur = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStockProd = new javax.swing.JTable();
        txtCanAnt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUnidMed = new javax.swing.JTextField();
        txtPrecioUnid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIDPro.setEditable(false);
        txtIDPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad a agregar");

        jLabel2.setText("IDProducto");

        btnP6retur.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnP6retur.setText("Regresar");
        btnP6retur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP6returActionPerformed(evt);
            }
        });

        txtProducto.setEditable(false);

        tableStockProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableStockProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStockProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStockProd);

        txtCanAnt.setEditable(false);
        txtCanAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanAntActionPerformed(evt);
            }
        });

        jLabel4.setText("Producto");

        jLabel5.setText("Cantidad Actual");

        jLabel6.setText("Unidad Med");

        txtUnidMed.setEditable(false);

        jLabel7.setText("PrecioUnidad");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("registrar compra");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooooooo.png"))); // NOI18N
        jLabel9.setText("jLabel4");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adventissssssss.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProducto)
                            .addComponent(txtIDPro, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addComponent(txtUnidMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCanAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioUnid)
                            .addComponent(txtCantnew, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnP6retur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioUnid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantnew, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnP6retur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProActionPerformed
    public void mostrarDatos(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        } 
        conexion objConexion=new conexion();
        try {
            objConexion=new conexion();
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM StockProductos");

            while (resultado.next()) {

                System.out.println(resultado.getString("IDPro"));
                System.out.println(resultado.getString("Producto"));
                System.out.println(resultado.getString("UnidMed"));
                System.out.println(resultado.getString("CantidadTotal"));
                
                 Object[] oStockProductos={resultado.getString("IDPro"),resultado.getString("Producto"),resultado.getString("UnidMed"),resultado.getString("CantidadTotal")};
                 modelo.addRow(oStockProductos); 
            }
            objConexion.close(); 
            //objConexion.close();  
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        conexion objConexion = new conexion();
        conexion objConexion2 = new conexion();
        StockProductoTO ostockPro = recuperarDatosGUI();
        StockProductoTO odetalleCompra = recuperarDatosGUI2();
        
        
        String strSentenciaInsert = String.format("UPDATE StockProductos SET Producto='%s', UnidMed='%s', CantidadTotal='%s' WHERE IDPro='%s'", ostockPro.getProducto(), ostockPro.getUnidMed(), ostockPro.getCantidadTotal(), ostockPro.getIDPro());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);

        this.mostrarDatos();          
         
        String strSentenciaInsert2 = String.format("INSERT INTO RegistroCompraProductos(IDCompra, Producto, UnidMed, PrecioUnid, Cantidad, IGV, TotalSoles)VALUES (null, '%s', '%s', '%s', '%s', '%s', '%s')", odetalleCompra.getProductos(), odetalleCompra.getUnidMeds(), odetalleCompra.getPrecioUnid(), odetalleCompra.getCantidad(), odetalleCompra.getIGV(), odetalleCompra.getTotalSoles() );
        objConexion2.ejecutarSentenciaSQL(strSentenciaInsert2); 
          
        try {
                objConexion2=new conexion();
                ResultSet resultado=objConexion2.consultarRegistros("SELECT * FROM RegistroCompraProductos");
                   
                while (resultado.next()) {
                    
                    System.out.println(resultado.getString("IDCompra"));
                    System.out.println(resultado.getString("Producto"));
                    System.out.println(resultado.getString("UnidMed"));
                    System.out.println(resultado.getString("PrecioUnid"));
                    System.out.println(resultado.getString("Cantidad"));
                    System.out.println(resultado.getString("IGV"));
                    System.out.println(resultado.getString("TotalSoles"));
            }
             objConexion2.close();      
                
        } catch (Exception e) {
            System.out.println(e);
        } 
       this.limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiar(){
        txtIDPro.setText("");
        txtCanAnt.setText("");
        txtProducto.setText("");
        txtUnidMed.setText("");
        txtCantnew.setText("");
        txtPrecioUnid.setText("");
        
    }
    
    
    
    private void btnP6returActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP6returActionPerformed
        conexion objConexion=new conexion();
        objConexion.close(); 
        
        Panel2_2 pnl2_2=new Panel2_2();
        pnl2_2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnP6returActionPerformed

    private void tableStockProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockProdMouseClicked
       
        if (evt.getClickCount()==1) {
            JTable receptor=(JTable)evt.getSource();
            
            txtIDPro.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());         
            txtUnidMed.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtCanAnt.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
        
        }
        
    }//GEN-LAST:event_tableStockProdMouseClicked

    private void txtCanAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanAntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanAntActionPerformed
public StockProductoTO recuperarDatosGUI() {
        //conexion objConexion = new conexion();
        StockProductoTO ostockPro = new StockProductoTO();

        //ID producto
        String IDPro = txtIDPro.getText().toUpperCase();
        String idproducto = "";
        if (IDPro.equals("C01")) {
            idproducto = "Pollos";
        } else if (IDPro.equals("V01")) {
                idproducto = "Kilos de papa";
        } else if (IDPro.equals("B01")) {
            idproducto = "Gaseaosa InkaKola 500ml";
        } else if (IDPro.equals("B02")) {
            idproducto = "Gaseaosa InkaKola 2l";
        } else if (IDPro.equals("B03")) {
            idproducto = "Gaseaosa CocaCola 500ml";
        } else if (IDPro.equals("B04")) {
            idproducto = "Gaseaosa CocaCola 2l";
        } else if (IDPro.equals("B07")) {
            idproducto = "Agua San Luis 500ml";
        } else if (IDPro.equals("H01")) {
            idproducto = "Papel Higienico";
        }

        
        String UnitM="";
        if (idproducto.equals("Pollos")) {
            UnitM="Unidades";
        }else if (idproducto.equals("Kilos de papa")) {
            UnitM="Kilogramos";      
        } else if (idproducto.equals("Gaseaosa InkaKola 500ml")) {
            UnitM="Unidades";
        } else if (idproducto.equals("Gaseaosa InkaKola 2l")) {
            UnitM="Unidades";
        } else if (idproducto.equals("Gaseaosa CocaCola 500ml")) {
            UnitM="Unidades";
        } else if (idproducto.equals("Gaseaosa CocaCola 2l")) {
            UnitM="Unidades";
        } else if (idproducto.equals("Agua San Luis 500ml")) {
            UnitM="Unidades";
        } else if (idproducto.equals("Papel Higienico")) {
            UnitM="Unidades";       
        }
        

        Object[] neww={3,4,5,6};
        System.out.println(neww[2]);
        
        double numm=Double.parseDouble(neww[2].toString());

        String num1=txtCanAnt.getText();
        int CantA=Integer.parseInt(num1);
        String num2=txtCantnew.getText();
        int CantN=Integer.parseInt(num2);

        int CanTotal=CantA+CantN;
        String Total = String.valueOf(CanTotal);
        
        
        
        ostockPro.setIDPro(IDPro);
        ostockPro.setProducto(idproducto);       
        ostockPro.setUnidMed(UnitM);
        ostockPro.setCantidadTotal(Total);
        
        
        return ostockPro;
        
}
public StockProductoTO recuperarDatosGUI2() {
        StockProductoTO odetalleCompra = new StockProductoTO();
        
        //Contador
        int contador=0;
        
        //Convertir en doubles los datos numericos
        double preciounit=Double.parseDouble(txtPrecioUnid.getText());
        double cantidad=Double.parseDouble(txtCantnew.getText());
        //Operaciones para sacar los nuevos datos
        double total=preciounit*cantidad;
        double igv=total*0.18;
        //Convirtiendo en texto para subir al registro
        String Total=String.valueOf(total);
        String IGV=String.valueOf(igv);
        
        
       
        
        odetalleCompra.setIDCompra(contador);
        odetalleCompra.setProductos(txtProducto.getText());
        odetalleCompra.setUnidMeds(txtUnidMed.getText());
        odetalleCompra.setPrecioUnid(txtPrecioUnid.getText());
        odetalleCompra.setCantidad(txtCantnew.getText());        
        odetalleCompra.setIGV(IGV);
        odetalleCompra.setTotalSoles(Total);
        
        
        return odetalleCompra;
    
    
}








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
            java.util.logging.Logger.getLogger(Panel2_2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel2_2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel2_2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel2_2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel2_2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnP6retur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStockProd;
    private javax.swing.JTextField txtCanAnt;
    private javax.swing.JTextField txtCantnew;
    private javax.swing.JTextField txtIDPro;
    private javax.swing.JTextField txtPrecioUnid;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtUnidMed;
    // End of variables declaration//GEN-END:variables
}
