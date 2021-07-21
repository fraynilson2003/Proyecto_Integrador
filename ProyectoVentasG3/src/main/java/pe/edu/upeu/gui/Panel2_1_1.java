package pe.edu.upeu.gui;


import conection.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.modelo.VentaDetalleTO;




public class Panel2_1_1 extends javax.swing.JFrame {
DefaultTableModel modelo;
   
    public Panel2_1_1() {
        initComponents();
        String[] titulosInfVent={"IDProducto","Producto","PrecioProducto"};
        modelo = new DefaultTableModel(null, titulosInfVent); 
        tablaLista.setModel(modelo);
        mostrarDatos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtIDPro = new javax.swing.JTextField();
        txtCantVnt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnP5retur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Listo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIDPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProActionPerformed(evt);
            }
        });

        txtCantVnt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID Producto");

        btnP5retur.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnP5retur.setText("Regresar");
        btnP5retur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP5returActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar venta");

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaLista);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adventissssssss.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooooooo.png"))); // NOI18N
        jLabel9.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(txtIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantVnt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnP5retur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantVnt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnP5retur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnP5returActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP5returActionPerformed

        Panel2_1 pnl2_1=new Panel2_1();
        pnl2_1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnP5returActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion objConexion=new conexion();
        VentaDetalleTO oVentaDetalle=recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("INSERT INTO RegistroVenta(IDVenta, Producto, UnidadMedida, PrecioUnidMed, CantidadVenta, IGV, TotalSoles)VALUES (null,'%s','%s', '%s', '%s', '%s', '%s')", oVentaDetalle.getProducto(), oVentaDetalle.getUnidadMedida(), oVentaDetalle.getPrecioUnidMed(), oVentaDetalle.getCantidadVenta(), oVentaDetalle.getIGV(), oVentaDetalle.getTotalSoles());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert); 
          
        try {
                objConexion=new conexion();
                ResultSet resultado=objConexion.consultarRegistros("SELECT * FROM RegistroVenta");
                   
                while (resultado.next()) {
                    
                    System.out.println(resultado.getString("IDVenta"));
                    System.out.println(resultado.getString("Producto"));
                    System.out.println(resultado.getString("UnidadMedida"));
                    System.out.println(resultado.getString("PrecioUnidMed"));
                    System.out.println(resultado.getString("CantidadVenta"));
                    System.out.println(resultado.getString("IGV"));
                    System.out.println(resultado.getString("TotalSoles"));
            }
                objConexion.close();  
        } catch (Exception e) {
            System.out.println(e);
        } 
        this.limpiar();
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProActionPerformed

        public void mostrarDatos(){
        conexion objConexion=new conexion();
        
        //comando de sqLite
        //INSERT INTO RegistroVenta(IDVenta, Producto, UnidadMedida, PrecioUnidMed, CantidadVenta, IGV, TotalSoles)VALUES (null,'1/4 pollo', 'Unidad', '12', '3', '6.48', '36')
        
          try {
                objConexion=new conexion();
                ResultSet resultado=objConexion.consultarRegistros("SELECT * FROM ListaProducto");
                   
                while (resultado.next()) {
                    
                    System.out.println(resultado.getString("IDProducto"));
                    System.out.println(resultado.getString("Producto"));
                    System.out.println(resultado.getString("PrecioProducto"));
                  
                    
                    Object[] oTablaRegisVentas={resultado.getString("IDProducto"),resultado.getString("Producto"),resultado.getString("PRecioProducto")};
                    modelo.addRow(oTablaRegisVentas);
       
            }
                objConexion.close();  
        } catch (Exception e) {
            System.out.println(e);
        }  
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    public VentaDetalleTO recuperarDatosGUI(){
        VentaDetalleTO oVentaDetalle= new VentaDetalleTO();
        
     
        //ID venta
        int IDVenta = 0;
        
        
        
        
        //ID producto
        String IDPro=txtIDPro.getText().toUpperCase();
        String idproducto = "";
        if (IDPro.equals("P01")){
            idproducto="1/8 pollo";
        }else if(IDPro.equals("P02")){
            idproducto="1/4 pollo";
        }else if(IDPro.equals("P03")){
            idproducto="1/2 pollo";
        }else if(IDPro.equals("P04")){
            idproducto="1 pollo";
        }else if(IDPro.equals("B01")){
            idproducto="Gaseaosa InkaKola 500ml";
        }else if(IDPro.equals("B02")){
            idproducto="Gaseaosa InkaKola 2l";
        }else if(IDPro.equals("B03")){
            idproducto="Gaseaosa CocaCola 500ml";
        }else if(IDPro.equals("B04")){
            idproducto="Gaseaosa CocaCola 2l";
        }else if(IDPro.equals("B05")){
            idproducto="Chicha Morada individual";
        }else if(IDPro.equals("B06")){
            idproducto="Chicha Morada familiar";
        }else if(IDPro.equals("B07")){
            idproducto="Agua San Luis 500ml";
        }else if(IDPro.equals("H01")){
            idproducto="Papel Higienico";
        }
        
         String Unidadmed="";
         String PrecioUnid="";
        //Precio Prodcuto y unidad de medida
        if(idproducto.equals("1/8 pollo")){
            PrecioUnid="8.00";
            Unidadmed="Unidad";
        }else if(idproducto.equals("1/4 pollo")){
            PrecioUnid="14.50";
            Unidadmed="Unidad";
        }else if(idproducto.equals("1/2 pollo")){
            PrecioUnid="27.00";
            Unidadmed="Unidad";
        }else if(idproducto.equals("1 pollo")){
            PrecioUnid="52.00";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Gaseaosa InKakola 500ml")){
            PrecioUnid="2.5";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Gaseaosa InkaKola 2l")){
            PrecioUnid="10";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Gaseaosa CocaCola 500ml")){
            PrecioUnid="2.5";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Gaseaosa CocaCola 2l")){
            PrecioUnid="10";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Chicha Morada individual")){
            PrecioUnid="3.5";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Chicha Morada familiar")){
            PrecioUnid="9";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Agua San Luis 500ml")){
            PrecioUnid="1.2";
            Unidadmed="Unidad";
        }else if(idproducto.equals("Papel Higienico")){
            Unidadmed="Unidad";
            PrecioUnid="1";
        }
        
        
        //Cantidad de venta
        String cantventtxt=txtCantVnt.getText();       
        double cantventInt=Double.parseDouble(cantventtxt);
        
        
        
        //Total
        double preciounit=Double.parseDouble(PrecioUnid);        
        double total=cantventInt*preciounit;        
        
        String TotalSoles=String.valueOf(total);
        
        //IGV
        double igv=total*0.18;
        String IGV=String.valueOf(igv);
        

        oVentaDetalle.setIDVenta(IDVenta);
        oVentaDetalle.setProducto(idproducto);
        oVentaDetalle.setUnidadMedida(Unidadmed);       
        oVentaDetalle.setPrecioUnidMed(PrecioUnid);
        oVentaDetalle.setCantidadVenta(txtCantVnt.getText());
        oVentaDetalle.setIGV(IGV);
        oVentaDetalle.setTotalSoles(TotalSoles);
        
        
        return oVentaDetalle;
        
        
    }  
    public void limpiar(){
        txtCantVnt.setText("");
        txtIDPro.setText("");
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
            java.util.logging.Logger.getLogger(Panel2_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel2_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel2_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel2_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel2_1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnP5retur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField txtCantVnt;
    private javax.swing.JTextField txtIDPro;
    // End of variables declaration//GEN-END:variables
}
