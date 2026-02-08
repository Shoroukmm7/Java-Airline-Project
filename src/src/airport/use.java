
package airport;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class use extends javax.swing.JFrame {

    /**
     * Creates new form use
     */
    public use() {
        initComponents();
    }

     private static String toString(char[] s2) {
        String string = new String (s2);
        return string;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport/222.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 250, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 250, -1));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport/222.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Scanner input;
        try{
            input = new Scanner(new File("user.txt"));
            String line;
            String []word = new String[8];
            String n=null;
            char[] s2=pass.getPassword();
            String ss2 = toString(s2);
            int flag=0;
            while(input.hasNextLine()){
                line = input.nextLine();
                int i=0 ;
                
                StringTokenizer st = new StringTokenizer(line);
                
                while(st.hasMoreTokens())
                {

                    word[i] = st.nextToken();
                    n = word[1]+" " +word[2];
                    i++;
                }
                if(n.equals(name.getText()) && word[3].equals(ss2))
                {
                    flag++;
                      this.setVisible(false);
                      new Book().setVisible(true);
                      break;
                      
                }
                

                line = null;

            }
            if(flag==0)
            {
                JOptionPane.showMessageDialog(this, "wrong name or password");
                name.setText("");
                pass.setText("");
            }
            input.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.toString() );
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new use().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables

   
}
