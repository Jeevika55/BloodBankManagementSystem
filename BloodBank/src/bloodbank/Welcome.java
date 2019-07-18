/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;




import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class Welcome extends javax.swing.JFrame {
    
         public Welcome() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BloodMatch = new javax.swing.JButton();
        BloodBanks = new javax.swing.JButton();
        WhoNeeds = new javax.swing.JButton();
        BloodFacts = new javax.swing.JButton();
        WhyDonate1 = new javax.swing.JButton();
        ReceptionistLoginButton = new javax.swing.JButton();
        HospitalLoginButton = new javax.swing.JButton();
        AdminLoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setMinimumSize(new java.awt.Dimension(598, 510));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Donate blood.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 220);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 580, 220);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        BloodMatch.setBackground(new java.awt.Color(255, 0, 0));
        BloodMatch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BloodMatch.setForeground(new java.awt.Color(255, 255, 255));
        BloodMatch.setText("Blood Match");
        BloodMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodMatchActionPerformed(evt);
            }
        });

        BloodBanks.setBackground(new java.awt.Color(255, 0, 0));
        BloodBanks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BloodBanks.setForeground(new java.awt.Color(255, 255, 255));
        BloodBanks.setText("Blood Banks");
        BloodBanks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodBanksActionPerformed(evt);
            }
        });

        WhoNeeds.setBackground(new java.awt.Color(255, 0, 0));
        WhoNeeds.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WhoNeeds.setForeground(new java.awt.Color(255, 255, 255));
        WhoNeeds.setText("Who Needs Blood?");
        WhoNeeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhoNeedsActionPerformed(evt);
            }
        });

        BloodFacts.setBackground(new java.awt.Color(255, 0, 0));
        BloodFacts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BloodFacts.setForeground(new java.awt.Color(255, 255, 255));
        BloodFacts.setText("Blood Facts");
        BloodFacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodFactsActionPerformed(evt);
            }
        });

        WhyDonate1.setBackground(new java.awt.Color(255, 0, 0));
        WhyDonate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WhyDonate1.setForeground(new java.awt.Color(255, 255, 255));
        WhyDonate1.setText("Why Donate Blood?");
        WhyDonate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhyDonate1ActionPerformed(evt);
            }
        });

        ReceptionistLoginButton.setBackground(new java.awt.Color(255, 0, 0));
        ReceptionistLoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReceptionistLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        ReceptionistLoginButton.setText("Receptionist Login");
        ReceptionistLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceptionistLoginButtonActionPerformed(evt);
            }
        });

        HospitalLoginButton.setBackground(new java.awt.Color(255, 0, 0));
        HospitalLoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HospitalLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        HospitalLoginButton.setText("Hospital Login");
        HospitalLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalLoginButtonActionPerformed(evt);
            }
        });

        AdminLoginButton.setBackground(new java.awt.Color(255, 0, 0));
        AdminLoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminLoginButton.setText("Manager Login");
        AdminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(WhoNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReceptionistLoginButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(WhyDonate1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BloodFacts)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BloodBanks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminLoginButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BloodMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274)
                                .addComponent(HospitalLoginButton))))
                    .addComponent(jLabel1))
                .addGap(471, 471, 471))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WhyDonate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodBanks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WhoNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReceptionistLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BloodFacts, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalLoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodMatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 220, 580, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BloodMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodMatchActionPerformed
        this.dispose();
        BloodMatch bm = new BloodMatch();
        bm.setVisible(true);
    }//GEN-LAST:event_BloodMatchActionPerformed

    private void BloodBanksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodBanksActionPerformed
     this.dispose();
        BloodBanks bb=new BloodBanks();
       bb.setVisible(true);
    }//GEN-LAST:event_BloodBanksActionPerformed

    private void WhoNeedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhoNeedsActionPerformed
        this.dispose();
        WhoNeedsBlood wnb=new WhoNeedsBlood();
        wnb.setVisible(true);
    }//GEN-LAST:event_WhoNeedsActionPerformed

    private void BloodFactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodFactsActionPerformed
        this.dispose();
        BloodFacts bf=new BloodFacts();
        bf.setVisible(true);
    }//GEN-LAST:event_BloodFactsActionPerformed

    private void WhyDonate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhyDonate1ActionPerformed
        this.dispose();
        WhyDonateBlood wdb=new WhyDonateBlood();
       wdb.setVisible(true);
    }//GEN-LAST:event_WhyDonate1ActionPerformed

    private void ReceptionistLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceptionistLoginButtonActionPerformed
     this.dispose();
       Rlogin rl=new Rlogin();
      rl.setVisible(true);
    }//GEN-LAST:event_ReceptionistLoginButtonActionPerformed

    private void HospitalLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalLoginButtonActionPerformed
        this.dispose();
        LogInHospi lh=new LogInHospi();
        lh.setVisible(true);
    }//GEN-LAST:event_HospitalLoginButtonActionPerformed

    private void AdminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginButtonActionPerformed
        this.dispose();
        LogIn l=new LogIn();
        l.setVisible(true);
    }//GEN-LAST:event_AdminLoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Welcome() {
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLoginButton;
    private javax.swing.JButton BloodBanks;
    private javax.swing.JButton BloodFacts;
    private javax.swing.JButton BloodMatch;
    private javax.swing.JButton HospitalLoginButton;
    private javax.swing.JButton ReceptionistLoginButton;
    private javax.swing.JButton WhoNeeds;
    private javax.swing.JButton WhyDonate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}