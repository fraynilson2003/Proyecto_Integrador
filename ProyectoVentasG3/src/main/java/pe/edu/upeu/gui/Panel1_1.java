package pe.edu.upeu.gui;


import conection.conexion;
import java.sql.ResultSet;

/**
 *
 * @author Fray
 */
public class Panel1_1 extends javax.swing.JFrame {
    /*conexion objConexion=new conexion();
    Connection conn= null;
    PreparedStatement pst =null;
    ResultSet rs= null;  */
    
           
     
               
    public Panel1_1() {
        initComponents();
       
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtingrUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnInitSe = new javax.swing.JButton();
        btnP2retur = new javax.swing.JButton();
        txtingrClave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese su usuario");

        txtingrUsu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtingrUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingrUsuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        btnInitSe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInitSe.setText("Ingresar");
        btnInitSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitSeActionPerformed(evt);
            }
        });

        btnP2retur.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnP2retur.setText("Regresar");
        btnP2retur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2returActionPerformed(evt);
            }
        });

        txtingrClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtingrClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar sesion");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adventissssssss.png"))); // NOI18N

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooooooo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtingrClave)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtingrUsu)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInitSe)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(btnP2retur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtingrUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtingrClave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnInitSe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnP2retur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtingrUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingrUsuActionPerformed
       
    }//GEN-LAST:event_txtingrUsuActionPerformed

    private void btnInitSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitSeActionPerformed
        conexion objConexion=new conexion();
        Panel2 pnl2=new Panel2();
        
        String usua=txtingrUsu.getText();
        String Clav=txtingrClave.getText();
        
        ResultSet ingresar=objConexion.consultarRegistros("SELECT * FROM Usuarios WHERE Usuario='"+usua+"' AND Clave='"+Clav+"'");
        
        System.out.println("1111111");
 
        try {
            if(ingresar.next()){
                System.out.println("222222");
                pnl2.setVisible(true);
                this.setVisible(false);                
            }
            objConexion.close();  
            
        } catch (Exception e) {
            System.out.println(e);
        }                
   
        
            
    }//GEN-LAST:event_btnInitSeActionPerformed

    private void btnP2returActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2returActionPerformed
        Panel1 pnl1=new Panel1();
        pnl1.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnP2returActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { 
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Panel1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitSe;
    private javax.swing.JButton btnP2retur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPasswordField txtingrClave;
    private javax.swing.JTextField txtingrUsu;
    // End of variables declaration//GEN-END:variables
}
