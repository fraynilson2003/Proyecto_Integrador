package pe.edu.upeu.gui;



import conection.conexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;




public class Panel2_1_2 extends javax.swing.JFrame {
   DefaultTableModel modelo;
   

    
    public Panel2_1_2() {
        initComponents();
        String[] titulosInfVent={"IDVenta","Producto","UnidadMedida","PrecioUnidMed","CantidadVenta","IGV","TotalSoles"};
        modelo = new DefaultTableModel(null, titulosInfVent); 
        tableRegisVent.setModel(modelo);
        mostrarDatos();
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegisVent = new javax.swing.JTable();
        btnP3retur = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        popupMenu1.setLabel("popupMenu1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableRegisVent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableRegisVent);

        btnP3retur.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnP3retur.setText("Regresar");
        btnP3retur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP3returActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("reporte ventas");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adventissssssss.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooooooo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnP3retur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnP3retur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnP3returActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP3returActionPerformed
        Panel2_1 pnl2_1=new Panel2_1();
        pnl2_1.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnP3returActionPerformed
    public void mostrarDatos(){
        conexion objConexion=new conexion();
        

        
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
                    
                    Object[] oTablaRegisVentas={resultado.getString("IDVenta"),resultado.getString("Producto"),resultado.getString("UnidadMedida"),resultado.getString("PrecioUnidMed"),resultado.getString("CantidadVenta"),resultado.getString("IGV"),resultado.getString("TotalSoles")};
                    modelo.addRow(oTablaRegisVentas);
       
            }
                objConexion.close();  
        } catch (Exception e) {
            System.out.println(e);
        }  
        
    
    }
    
    
   public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel2_1_2().setVisible(true);
            }
        });
    }

     
       
       
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnP3retur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tableRegisVent;
    // End of variables declaration//GEN-END:variables
}
