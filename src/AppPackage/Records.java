/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import Controllers.upLoadingDatabase;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABRIEL
 */
public class Records extends javax.swing.JFrame {

    /**
     * Creates new form Records
     */
    upLoadingDatabase upload = new upLoadingDatabase();

    public Records() {
        initComponents();
        upload.fillpatientTable(jTable1, "");
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        finder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(980, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PATIENT ID", "PATIENT NAME", "CONTACT", "DATE", "DISEASE"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(3);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 850, 400));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 150, 80));

        finder.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        finder.setBorder(null);
        finder.setOpaque(false);
        finder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finderActionPerformed(evt);
            }
        });
        finder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                finderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                finderKeyTyped(evt);
            }
        });
        getContentPane().add(finder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 280, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RECORDS2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 980, 770));

        setSize(new java.awt.Dimension(988, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Lab().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void finderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finderActionPerformed

    private void finderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finderKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_finderKeyTyped

    private void finderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finderKeyPressed
        // TODO add your handling code here:
         jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","PATIENT ID","PATIENT NAME","CONTACT","DATE","SYMPTOMS"}));
        upload.fillpatientTable(jTable1, finder.getText());
    }//GEN-LAST:event_finderKeyPressed

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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }
      private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("close.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField finder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
