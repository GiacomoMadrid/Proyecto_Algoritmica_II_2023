/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Giacomo Salvador
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBase = new javax.swing.JPanel();
        btnActualizarInfo = new javax.swing.JToggleButton();
        btnVerHorarios = new javax.swing.JToggleButton();
        scrollHorarios = new javax.swing.JScrollPane();
        tabHorarios = new javax.swing.JTable();
        panFotoPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panDescripcion = new javax.swing.JPanel();
        txtUserPaterno = new javax.swing.JLabel();
        txtUserMaterno = new javax.swing.JLabel();
        txtUserCargo = new javax.swing.JLabel();
        txtUserDNI = new javax.swing.JLabel();
        txtUserCorreo = new javax.swing.JLabel();
        txtUserCelular = new javax.swing.JLabel();
        lblUserPaterno = new javax.swing.JLabel();
        lblUserMaterno = new javax.swing.JLabel();
        lblUserCargo = new javax.swing.JLabel();
        lblUserDNI = new javax.swing.JLabel();
        lblUserCorreo = new javax.swing.JLabel();
        lblUserCelular = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JToggleButton();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JEMS | Inicio");

        panBase.setBackground(new java.awt.Color(255, 255, 255));

        btnActualizarInfo.setBackground(new java.awt.Color(0, 48, 80));
        btnActualizarInfo.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        btnActualizarInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarInfo.setText("Actualizar Información");

        btnVerHorarios.setBackground(new java.awt.Color(0, 48, 80));
        btnVerHorarios.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        btnVerHorarios.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHorarios.setText("Ver Horarios");
        btnVerHorarios.setToolTipText("");

        tabHorarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 80)));
        tabHorarios.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        tabHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7", null, null, null, null, null, null, null},
                {"8", "", null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora/Día", "Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"
            }
        ));
        tabHorarios.setToolTipText("");
        tabHorarios.setGridColor(new java.awt.Color(0, 0, 0));
        tabHorarios.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabHorarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabHorarios.setShowGrid(true);
        scrollHorarios.setViewportView(tabHorarios);
        tabHorarios.getAccessibleContext().setAccessibleName("");

        panFotoPerfil.setBackground(new java.awt.Color(255, 255, 255));
        panFotoPerfil.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N

        javax.swing.GroupLayout panFotoPerfilLayout = new javax.swing.GroupLayout(panFotoPerfil);
        panFotoPerfil.setLayout(panFotoPerfilLayout);
        panFotoPerfilLayout.setHorizontalGroup(
            panFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFotoPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFotoPerfilLayout.setVerticalGroup(
            panFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFotoPerfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        panDescripcion.setForeground(new java.awt.Color(0, 125, 0));

        txtUserPaterno.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserPaterno.setText("Apellido Paterno:");

        txtUserMaterno.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserMaterno.setText("Apellido Materno:");

        txtUserCargo.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserCargo.setText("Cargo:");

        txtUserDNI.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserDNI.setText("DNI:");

        txtUserCorreo.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserCorreo.setText("Correo Electrónico:");

        txtUserCelular.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        txtUserCelular.setText("Celular:");

        lblUserPaterno.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserPaterno.setText("surnameF");

        lblUserMaterno.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserMaterno.setText("surnameM");

        lblUserCargo.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserCargo.setText("position");

        lblUserDNI.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserDNI.setText("dni");

        lblUserCorreo.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserCorreo.setText("user");

        lblUserCelular.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserCelular.setText("phone");

        javax.swing.GroupLayout panDescripcionLayout = new javax.swing.GroupLayout(panDescripcion);
        panDescripcion.setLayout(panDescripcionLayout);
        panDescripcionLayout.setHorizontalGroup(
            panDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUserCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblUserCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lblUserCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDescripcionLayout.setVerticalGroup(
            panDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDescripcionLayout.createSequentialGroup()
                        .addComponent(lblUserPaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserMaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUserCelular))
                    .addGroup(panDescripcionLayout.createSequentialGroup()
                        .addComponent(txtUserPaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserMaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserCelular)))
                .addContainerGap())
        );

        btnLogOut.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(0, 48, 80));
        btnLogOut.setText("Cerrar Sesión");
        btnLogOut.setAutoscrolls(true);
        btnLogOut.setBorderPainted(false);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("name");

        javax.swing.GroupLayout panBaseLayout = new javax.swing.GroupLayout(panBase);
        panBase.setLayout(panBaseLayout);
        panBaseLayout.setHorizontalGroup(
            panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(22, 22, 22))
            .addGroup(panBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panBaseLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnVerHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(panBaseLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(panDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panBaseLayout.setVerticalGroup(
            panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBaseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBaseLayout.createSequentialGroup()
                        .addComponent(panDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBaseLayout.createSequentialGroup()
                        .addComponent(panFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserName)
                        .addGap(18, 18, 18)))
                .addComponent(scrollHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActualizarInfo;
    public javax.swing.JToggleButton btnLogOut;
    private javax.swing.JToggleButton btnVerHorarios;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblUserCargo;
    public javax.swing.JLabel lblUserCelular;
    public javax.swing.JLabel lblUserCorreo;
    public javax.swing.JLabel lblUserDNI;
    public javax.swing.JLabel lblUserMaterno;
    private javax.swing.JLabel lblUserName;
    public javax.swing.JLabel lblUserPaterno;
    private javax.swing.JPanel panBase;
    private javax.swing.JPanel panDescripcion;
    private javax.swing.JPanel panFotoPerfil;
    private javax.swing.JScrollPane scrollHorarios;
    private javax.swing.JTable tabHorarios;
    private javax.swing.JLabel txtUserCargo;
    private javax.swing.JLabel txtUserCelular;
    private javax.swing.JLabel txtUserCorreo;
    private javax.swing.JLabel txtUserDNI;
    private javax.swing.JLabel txtUserMaterno;
    private javax.swing.JLabel txtUserPaterno;
    // End of variables declaration//GEN-END:variables
}
