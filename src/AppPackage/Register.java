/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import Controllers.patientController;
import java.awt.Toolkit;
import java.util.ServiceConfigurationError;
import javax.swing.JOptionPane;
import model.patient;

/**
 *
 * @author GABRIEL
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        patientNumber = new javax.swing.JTextField();
        PatientName = new javax.swing.JTextField();
        patientID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 777, 909, -1));

        patientNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        patientNumber.setBorder(null);
        patientNumber.setOpaque(false);
        patientNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientNumberKeyTyped(evt);
            }
        });
        getContentPane().add(patientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 425, 320, 40));

        PatientName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        PatientName.setBorder(null);
        PatientName.setOpaque(false);
        PatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameActionPerformed(evt);
            }
        });
        getContentPane().add(PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 212, 320, 40));

        patientID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        patientID.setBorder(null);
        patientID.setOpaque(false);
        getContentPane().add(patientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 313, 320, 40));

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 150, 70));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 140, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1b2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 962, -1));

        setSize(new java.awt.Dimension(980, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //validating the fill form
        if ( (this.PatientName.getText().equals("")) || (this.patientNumber.getText().equals("")) || 
                (this.patientID.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Fill the form");
        }
        //validating the Fill form
        else if (this.PatientName.getText().equals(""))
         {
            JOptionPane.showMessageDialog(null,"Enter the patient name");
            
         }
         else if (this.patientID.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null, "Enter the patient's hospital ID");
         }
         else if (this.patientNumber.getText().equals(""))
         {
             JOptionPane.showMessageDialog(null, "Enter the patient's number");
         }
         else{
         String patientName = this.PatientName.getText();
         String patientID = this.patientID.getText();
         String patientNumber = this.patientNumber.getText();
            patient p = new patient();
        p.setID(0);
        p.setPatientName(patientName);
        p.setPatientID(patientID);
        p.setPatientNumber(patientNumber);

        patientController uc =new patientController();
        int res =uc.patientCreateAccounts(p);
        
        if(res > 0){
            JOptionPane.showMessageDialog(null, "saved");
            new Stepper1().setVisible(true);
            this.dispose();
        }
        else{
          JOptionPane.showMessageDialog(null, "registration fails");
        }
         }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Stepper1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void patientNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientNumberKeyTyped
        // TODO add your handling code here:
        // Does not allow letters but numbers
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_patientNumberKeyTyped

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    private Register(String msg){
        msg ="Complete  the form";
    }
    
    
    private void validateFillTextfield()
    {
        
    }
      private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("close.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PatientName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField patientNumber;
    // End of variables declaration//GEN-END:variables
}