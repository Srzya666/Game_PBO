/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Game;
import Config.Koneksi;

/**
 *
 * @author surya
 */
public class Dasboard extends javax.swing.JFrame {

    /**
     * Creates new form Dasboard
     */
    public Dasboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Play = new javax.swing.JButton();
        Leader = new javax.swing.JButton();
        Play2 = new javax.swing.JButton();
        Play3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BrainSnap");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 28, -1, -1));

        Play.setBackground(new java.awt.Color(51, 204, 0));
        Play.setFont(new java.awt.Font("Ravie", 1, 30)); // NOI18N
        Play.setForeground(new java.awt.Color(255, 255, 255));
        Play.setText("PLAY");
        Play.setAlignmentX(0.5F);
        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        jPanel1.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 232, -1, -1));

        Leader.setBackground(new java.awt.Color(221, 221, 31));
        Leader.setFont(new java.awt.Font("Ravie", 1, 30)); // NOI18N
        Leader.setForeground(new java.awt.Color(255, 255, 255));
        Leader.setText("LEADERBOARD");
        Leader.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Leader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderActionPerformed(evt);
            }
        });
        jPanel1.add(Leader, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        Play2.setBackground(new java.awt.Color(0, 0, 153));
        Play2.setFont(new java.awt.Font("Ravie", 1, 30)); // NOI18N
        Play2.setForeground(new java.awt.Color(255, 255, 255));
        Play2.setText("ABOUT");
        Play2.setAlignmentX(0.5F);
        Play2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play2ActionPerformed(evt);
            }
        });
        jPanel1.add(Play2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        Play3.setBackground(new java.awt.Color(204, 51, 0));
        Play3.setFont(new java.awt.Font("Ravie", 1, 30)); // NOI18N
        Play3.setForeground(new java.awt.Color(255, 255, 255));
        Play3.setText("EXIT");
        Play3.setAlignmentX(0.5F);
        Play3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play3ActionPerformed(evt);
            }
        });
        jPanel1.add(Play3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 800, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayActionPerformed

    private void LeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderActionPerformed
        // TODO add your handling code here:
         LeaderBoard lead = new LeaderBoard();
         lead.setVisible(true);
    }//GEN-LAST:event_LeaderActionPerformed

    private void Play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Play2ActionPerformed

    private void Play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Play3ActionPerformed

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
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Leader;
    private javax.swing.JButton Play;
    private javax.swing.JButton Play2;
    private javax.swing.JButton Play3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}