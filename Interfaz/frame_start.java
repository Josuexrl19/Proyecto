/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Nelson
 */
public class frame_start extends javax.swing.JFrame {

    /**
     * Creates new form frame_start
     */
    public frame_start() {
        initComponents();
        //se desabilitan los radio buttons
        radioButtonAudioLending.setEnabled(false);
        radioButtonBooksLending.setEnabled(false);
        radioButtonAudioMaterials.setEnabled(false);
        radioButtonBooksMaterials.setEnabled(false);
        setLocationRelativeTo(null);
        //se le pega el fondo al label
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btn_student = new javax.swing.JButton();
        btn_lending = new javax.swing.JButton();
        btn_material = new javax.swing.JButton();
        radioButtonBooksLending = new javax.swing.JRadioButton();
        radioButtonAudioLending = new javax.swing.JRadioButton();
        lbl_welcome2 = new javax.swing.JLabel();
        radioButtonBooksMaterials = new javax.swing.JRadioButton();
        lbl_welcome = new javax.swing.JLabel();
        radioButtonAudioMaterials = new javax.swing.JRadioButton();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_student.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_student.setText("Student");
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 40));

        btn_lending.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_lending.setText("Lending");
        btn_lending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lendingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lending, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 130, 40));

        btn_material.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_material.setText("Materials");
        btn_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 130, 40));

        buttonGroup1.add(radioButtonBooksLending);
        radioButtonBooksLending.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonBooksLending.setText("Books");
        radioButtonBooksLending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonBooksLendingActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonBooksLending, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, 30));

        buttonGroup1.add(radioButtonAudioLending);
        radioButtonAudioLending.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonAudioLending.setText("Audiovisual");
        radioButtonAudioLending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAudioLendingActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonAudioLending, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        lbl_welcome2.setFont(new java.awt.Font("Bodoni MT Black", 2, 24)); // NOI18N
        lbl_welcome2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_welcome2.setText("Orozco Fonseca");
        getContentPane().add(lbl_welcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        buttonGroup2.add(radioButtonBooksMaterials);
        radioButtonBooksMaterials.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonBooksMaterials.setText("Books");
        radioButtonBooksMaterials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonBooksMaterialsActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonBooksMaterials, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        lbl_welcome.setFont(new java.awt.Font("Bodoni MT Black", 2, 36)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(255, 255, 255));
        lbl_welcome.setText("Welcome to Bibliotech ");
        lbl_welcome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 460, 70));

        buttonGroup2.add(radioButtonAudioMaterials);
        radioButtonAudioMaterials.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonAudioMaterials.setText("Audiovisual");
        radioButtonAudioMaterials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAudioMaterialsActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonAudioMaterials, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        lbl_wallpaper.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lendingActionPerformed
        radioButtonAudioLending.setEnabled(true);
        radioButtonBooksLending.setEnabled(true);
        radioButtonAudioMaterials.setEnabled(false);
        radioButtonBooksMaterials.setEnabled(false);
           
    }//GEN-LAST:event_btn_lendingActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        // TODO add your handling code here:
        frame_student student_frame= new frame_student();
        student_frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materialActionPerformed
        radioButtonAudioLending.setEnabled(false);
        radioButtonBooksLending.setEnabled(false);
        radioButtonAudioMaterials.setEnabled(true);
        radioButtonBooksMaterials.setEnabled(true);
        
    }//GEN-LAST:event_btn_materialActionPerformed

    private void radioButtonBooksLendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonBooksLendingActionPerformed
        try{
        frame_lendingBook lendingBook = new frame_lendingBook();
        lendingBook.setVisible(true);
        this.setVisible(false);
        }catch(IOException ioe){
            System.out.println("Error-127");
        }
    }//GEN-LAST:event_radioButtonBooksLendingActionPerformed

    private void radioButtonAudioLendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAudioLendingActionPerformed
        
        frame_lendingAudiovisual lendingAudio = new frame_lendingAudiovisual();
        lendingAudio.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_radioButtonAudioLendingActionPerformed

    private void radioButtonBooksMaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonBooksMaterialsActionPerformed
        frame_book book_frame= new frame_book();
        book_frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_radioButtonBooksMaterialsActionPerformed

    private void radioButtonAudioMaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAudioMaterialsActionPerformed
        frame_audiovisual audio_frame= new frame_audiovisual();
        audio_frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_radioButtonAudioMaterialsActionPerformed

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
            java.util.logging.Logger.getLogger(frame_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lending;
    private javax.swing.JButton btn_material;
    private javax.swing.JButton btn_student;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel lbl_welcome2;
    private javax.swing.JRadioButton radioButtonAudioLending;
    private javax.swing.JRadioButton radioButtonAudioMaterials;
    private javax.swing.JRadioButton radioButtonBooksLending;
    private javax.swing.JRadioButton radioButtonBooksMaterials;
    // End of variables declaration//GEN-END:variables
}
