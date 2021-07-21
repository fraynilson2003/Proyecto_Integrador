package pe.edu.upeu.gui;



import conection.conexion;
import java.sql.ResultSet;
import pe.edu.upeu.modelo.UsuarioTO;



/**
 *
 * @author Fray
 */
public class Panel1_2 extends javax.swing.JFrame {
    
    

    
    public Panel1_2() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCrearUsu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btonCrearUsu = new javax.swing.JButton();
        btnP3retur = new javax.swing.JButton();
        usuNew = new javax.swing.JTextField();
        claveNew = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaCrearUsu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        etiquetaCrearUsu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCrearUsu.setText("Ingrese su usuario");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nueva contraseña");

        btonCrearUsu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btonCrearUsu.setText("Crear usuario");
        btonCrearUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCrearUsuActionPerformed(evt);
            }
        });

        btnP3retur.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnP3retur.setText("Regresar");
        btnP3retur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP3returActionPerformed(evt);
            }
        });

        usuNew.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuNewActionPerformed(evt);
            }
        });

        claveNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        claveNew.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Usuario");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adventissssssss.png"))); // NOI18N

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooooooo.png"))); // NOI18N
        jLabel91.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(claveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(268, 268, 268))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(194, 194, 194))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(usuNew, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etiquetaCrearUsu)
                                    .addGap(8, 8, 8)))
                            .addGap(273, 273, 273)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btonCrearUsu)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnP3retur, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(etiquetaCrearUsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btonCrearUsu)
                .addGap(57, 57, 57)
                .addComponent(btnP3retur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btonCrearUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCrearUsuActionPerformed
        conexion objConexion=new conexion();
        UsuarioTO oUsuarios=recuperarDatosGUI();
        Panel1_2 pnl1_2=new Panel1_2();
        Panel1 pnl1=new Panel1();        
        
        String strSentenciaInsert = String.format("INSERT INTO Usuarios(Usuario, Clave)VALUES ('%s','%s')",oUsuarios.getUsuario(), oUsuarios.getClave());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert); 
       try {
                objConexion=new conexion();
                ResultSet resultado=objConexion.consultarRegistros("SELECT * FROM Usuarios");
                   
                while (resultado.next()) {
                    
                    System.out.println(resultado.getString("Usuario"));
                    System.out.println(resultado.getString("Clave"));
            }
            objConexion.close();    
                
        } catch (Exception e) {
            System.out.println(e);
        }  

        pnl1.setVisible(true);
        
        //this.setVisible(false);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btonCrearUsuActionPerformed
    
    
    
    
    
    public UsuarioTO recuperarDatosGUI(){
        UsuarioTO oUsuarios= new UsuarioTO();
         
        oUsuarios.setUsuario(usuNew.getText());
        oUsuarios.setClave(claveNew.getText());
        
        return oUsuarios;
    }  
    
    
    private void btnP3returActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP3returActionPerformed
        Panel1 pnl1=new Panel1();
        pnl1.setVisible(true);
        this.setVisible(false);
        
        
       
    }//GEN-LAST:event_btnP3returActionPerformed

    private void usuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuNewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel1_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnP3retur;
    private javax.swing.JButton btonCrearUsu;
    private javax.swing.JPasswordField claveNew;
    private javax.swing.JLabel etiquetaCrearUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JTextField usuNew;
    // End of variables declaration//GEN-END:variables
}
