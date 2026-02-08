
package airport;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrution = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        user = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrution.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        registrution.setForeground(new java.awt.Color(51, 153, 255));
        registrution.setText("Registration");
        registrution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrutionActionPerformed(evt);
            }
        });
        getContentPane().add(registrution, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 187, 58));

        admin.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(51, 153, 255));
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 187, 54));

        user.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        user.setForeground(new java.awt.Color(51, 153, 255));
        user.setText("User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 187, 58));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport/222.jpg"))); // NOI18N
        login.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                loginAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        this.setVisible(false);
        new passadmin().setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

    private void registrutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrutionActionPerformed
        this.setVisible(false);
        new Registration().setVisible(true);
      
    }//GEN-LAST:event_registrutionActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        this.setVisible(false);
        new use().setVisible(true);
        
    }//GEN-LAST:event_userActionPerformed

    private void loginAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_loginAncestorAdded
        
    }//GEN-LAST:event_loginAncestorAdded

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel login;
    private javax.swing.JButton registrution;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
