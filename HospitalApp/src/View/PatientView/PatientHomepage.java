/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.PatientView;

import View.AdminView.AdminHomepage;
import View.StartScreen;
import hospitalapp.SystemDatabase;
import static hospitalapp.SystemDatabase.appointments;
import static hospitalapp.SystemDatabase.prescriptions;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author sbloxham2
 */




public class PatientHomepage extends javax.swing.JFrame {

    /**
     * Creates new form PatientHomepage
     */
    public PatientHomepage() {
        initComponents();
        
        lblWelcomeMsg.setText("Welcome back " + SystemDatabase.findUser(SystemDatabase.getCurrentUserID()).getFirstName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcomeMsg = new javax.swing.JLabel();
        btnDeleteAccount = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnViewAppointment = new javax.swing.JButton();
        btnViewPrescription = new javax.swing.JButton();
        btnGiveFeedback = new javax.swing.JButton();
        btnRequestAppointment = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcomeMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeMsg.setText("Welcome Back");

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnViewAppointment.setText("View Appointment");
        btnViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentActionPerformed(evt);
            }
        });

        btnViewPrescription.setText("View Prescription");
        btnViewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPrescriptionActionPerformed(evt);
            }
        });

        btnGiveFeedback.setText("Give Feedback");
        btnGiveFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveFeedbackActionPerformed(evt);
            }
        });

        btnRequestAppointment.setText("Request Appointment");
        btnRequestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAppointmentActionPerformed(evt);
            }
        });

        btnViewHistory.setText("View History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblWelcomeMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRequestAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnGiveFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcomeMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnViewPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRequestAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnViewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGiveFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAccount))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void checkNotifs(){
        
        boolean newAppointment = false;
        boolean newPrescription = false;
        
        
        
        for (int i = SystemDatabase.prescriptions.size() -1; i >= 0; i--) 
        {
            
            if(prescriptions.get(i).getPatientID().equals(SystemDatabase.getCurrentUserID()) && prescriptions.get(i).getRecieved() == false)
            {
                
                newPrescription = true;
                
            }
            }
        
        
        for (int i = SystemDatabase.appointments.size() -1; i >= 0; i--) 
        {
            
            if(appointments.get(i).getPatientID().equals(SystemDatabase.getCurrentUserID()) && appointments.get(i).getStatus().equals("verified"))
            {
                
                newAppointment = true;
                
            }
            }
        
        
         if(newAppointment == true)
        {
            showMessageDialog(null, "You Have an Upcoming Appointment [Go To View Appointments for Details]");
        }
         
          if(newPrescription == true)
        {
            showMessageDialog(null, "You Have Unregistered Prescriptions, go to a secretary to recieve your medicine [View the Prescription in the 'View Prescription' tab]");
        }
        
        
    }
    
    
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        
            new StartScreen().setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        
        new DeleteAccount().setVisible(true);
        
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnGiveFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveFeedbackActionPerformed
        // TODO add your handling code here:
        
        
            new GiveFeedback().setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_btnGiveFeedbackActionPerformed

    private void btnRequestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAppointmentActionPerformed
        // TODO add your handling code here:
        
        
        new RequestAppointment().setVisible(true);
                    this.dispose();
        
        
        
    }//GEN-LAST:event_btnRequestAppointmentActionPerformed

    private void btnViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentActionPerformed
        // TODO add your handling code here:
        
        
        
        new ViewAppointment().setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_btnViewAppointmentActionPerformed

    private void btnViewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPrescriptionActionPerformed
        // TODO add your handling code here:
        
        
        new ViewPrescription().setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_btnViewPrescriptionActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        
          
        new ViewHistory().setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_btnViewHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnGiveFeedback;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRequestAppointment;
    private javax.swing.JButton btnViewAppointment;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JButton btnViewPrescription;
    private javax.swing.JLabel lblWelcomeMsg;
    // End of variables declaration//GEN-END:variables
}
