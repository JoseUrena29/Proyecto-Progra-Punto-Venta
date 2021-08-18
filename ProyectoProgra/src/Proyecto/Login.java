/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import static Proyecto.Principal.MG;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        rol1 = new javax.swing.ButtonGroup();
        rol2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        LabelBienvenidos = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        BtnSalir = new javax.swing.JButton();
        LogoLogin = new javax.swing.JButton();
        Rbadministrador = new javax.swing.JRadioButton();
        Rbempleados = new javax.swing.JRadioButton();
        Buttoningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        LabelUsuario.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(0, 0, 51));
        LabelUsuario.setText("Usuario");

        LabelContraseña.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(0, 0, 51));
        LabelContraseña.setText("Contraseña");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        LabelBienvenidos.setFont(new java.awt.Font("Monotype Corsiva", 3, 60)); // NOI18N
        LabelBienvenidos.setForeground(new java.awt.Color(204, 0, 0));
        LabelBienvenidos.setText("Bienvenidos");

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(153, 0, 0));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        LogoLogin.setBackground(new java.awt.Color(255, 255, 255));
        LogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loginn.png"))); // NOI18N
        LogoLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        rol1.add(Rbadministrador);
        Rbadministrador.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Rbadministrador.setText("Administrador");
        Rbadministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Rbadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbadministradorActionPerformed(evt);
            }
        });

        rol1.add(Rbempleados);
        Rbempleados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Rbempleados.setText("Empleados");

        Buttoningresar.setBackground(new java.awt.Color(0, 0, 51));
        Buttoningresar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Buttoningresar.setForeground(new java.awt.Color(255, 255, 0));
        Buttoningresar.setText("INGRESAR");
        Buttoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtoningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Buttoningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(LogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelBienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelContraseña)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(LabelUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rbadministrador)
                        .addGap(58, 58, 58)
                        .addComponent(Rbempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBienvenidos)
                .addGap(20, 20, 20)
                .addComponent(LogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContraseña)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rbadministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rbempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttoningresar)
                    .addComponent(BtnSalir))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void ButtoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtoningresarActionPerformed
        //String usuario = txtusuario.getText();
        //String contraseña = String.valueOf(txtcontraseña.getText());
        //String rol = "";

        //if(Rbadministrador.isSelected()){
        //rol = "Rol1-Administrador";
        //}else if (Rbempleados.isSelected()){
        //  rol = "Rol2-Empleados";
        //}
        //Datos d = new Datos();
        //d.setUsuario(usuario);
        //d.setPassword(contraseña);
        //d.setRoles(rol);
        //Componentes.usuarios.add(d);
        String usuario = txtusuario.getText();
        String contraseña = String.valueOf(txtcontraseña.getText());
        String rol = "";

        if (Rbadministrador.isSelected()) {
            rol = "Rol1-Administrador";

            if (usuario.equals("3") && contraseña.equals("4")) {
                JOptionPane.showMessageDialog(rootPane, "USUARIO Y CONTRASEÑA CORRECTOS", "Bienvenido al Sistema", JOptionPane.INFORMATION_MESSAGE);
                Principal P = new Principal();
                P.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "USUARIO O CONTRASEÑA INCORRECTOS", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                txtusuario.setText("");
                txtcontraseña.setText("");
            }

        } else if (Rbempleados.isSelected()) {
            rol = "Rol2-Empleados";
            if (usuario.equals("1") && contraseña.equals("2")) {
                JOptionPane.showMessageDialog(rootPane, "USUARIO Y CONTRASEÑA CORRECTOS");
                Principal P = new Principal();
                P.setVisible(true);
                this.dispose();

                MG.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "USUARIO O CONTRASEÑA INCORRECTOS", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                txtusuario.setText("");
                txtcontraseña.setText("");
            }

        }


    }//GEN-LAST:event_ButtoningresarActionPerformed

    private void RbadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbadministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbadministradorActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton Buttoningresar;
    private javax.swing.JLabel LabelBienvenidos;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton LogoLogin;
    private javax.swing.JRadioButton Rbadministrador;
    private javax.swing.JRadioButton Rbempleados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup rol1;
    private javax.swing.ButtonGroup rol2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
