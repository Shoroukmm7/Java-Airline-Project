
package airport;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Book extends javax.swing.JFrame {

    ArrayList <String> id=new ArrayList();
    public Book() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        To = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        From = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton2.setText("Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 200, -1));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 200, -1));

        jTable1.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "From", "To", "Flight Name", "Date", "Dep Time", "Arr Time", "Price"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 780, 185));

        To.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egypt", "England", "France" }));
        To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToActionPerformed(evt);
            }
        });
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel2.setText("To :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel1.setText("From :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        From.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egypt", "England", "France" }));
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("BOOKNIG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 141, 38));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 200, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel4.setText("Flight ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 110, -1));

        ID.setToolTipText("enter Flight ID");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 237, -1));

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButton4.setText("Famous plase");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport/AAAA.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
        if(From.getSelectedItem()==To.getSelectedItem()){
            JOptionPane.showMessageDialog(this, "change one of country selected!!");
        }else{
            Scanner input;
            try{
                input = new Scanner(new File("Flight.txt"));
                String line;
                String []word = new String[8];

                while(input.hasNextLine()){
                    line = input.nextLine();
                    int i=0;
                    StringTokenizer st = new StringTokenizer(line);
                    while(st.hasMoreTokens())
                    {
                        
                        word[i] = st.nextToken();
                       
                        i++;
                    }
                    if(word[1].equals(From.getSelectedItem()) && word[2].equals(To.getSelectedItem()) )
                    {    
                        id.add(word[0]);
                        tb.addRow(word);
                       
                    }

                    line = null;

                }
               
                input.close();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.toString() );
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

    }//GEN-LAST:event_jTable1AncestorAdded

    private void ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToActionPerformed

    }//GEN-LAST:event_ToActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int f=0;
        
        for(int i = 0 ; i<id.size();i++)
    {
    if(ID.getText().equals(id.get(i)))
    {    f++;
        JOptionPane.showMessageDialog(this, "Enjoy your journy");
        this.setVisible(false);
        new login().setVisible(true);
        break;}
    }
        if(f==0)
        {
        JOptionPane.showMessageDialog(this, "please, enter correct flight ID!!");
        ID.setText(" ");
        }    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String place =(String) To.getSelectedItem();
        if(place == "France")
        {
            new France_Information().setVisible(true);}
        if(place == "Egypt"){
            new Egypt_Informaton().setVisible(true);}
        if(place == "England"){
            new England_Information().setVisible(true);}
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> From;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> To;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
