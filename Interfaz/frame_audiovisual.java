
package Interfaz;

import Domain.Audiovisual;
import Domain.Books;
import file.AudiovisualFile;
import file.BookFile;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frame_audiovisual extends javax.swing.JFrame {

    //Iniciar los componentes 
    public frame_audiovisual() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
        lbl_other.setVisible(false);
        tfd_other.setVisible(false);
        
    }//fin frame_audiovisual


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tipe = new javax.swing.JLabel();
        cb_tipe = new javax.swing.JComboBox<>();
        lbl_brand = new javax.swing.JLabel();
        lbl_model = new javax.swing.JLabel();
        tfd_brand = new javax.swing.JTextField();
        lbl_size = new javax.swing.JLabel();
        tfd_model = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        lbl_other = new javax.swing.JLabel();
        tfd_other = new javax.swing.JTextField();
        cb_size = new javax.swing.JComboBox<>();
        btn_return = new javax.swing.JButton();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(700, 555));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tipe.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_tipe.setText("Type of Material");
        getContentPane().add(lbl_tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 30));

        cb_tipe.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cb_tipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Proyector", "Speakers", "CD´S", "DVD´S", "Other" }));
        cb_tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipeActionPerformed(evt);
            }
        });
        getContentPane().add(cb_tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 200, 30));

        lbl_brand.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_brand.setText("Brand");
        getContentPane().add(lbl_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 60, 20));

        lbl_model.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_model.setText("Model");
        getContentPane().add(lbl_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 51, 20));
        getContentPane().add(tfd_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, 30));

        lbl_size.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_size.setText("Size");
        getContentPane().add(lbl_size, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 51, 22));
        getContentPane().add(tfd_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 210, 30));

        btn_insert.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_insert.setText("Insert Materials");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 210, 30));

        lbl_other.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_other.setText("Indicate wich");
        getContentPane().add(lbl_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 110, 30));

        tfd_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_otherActionPerformed(evt);
            }
        });
        tfd_other.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfd_otherKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfd_otherKeyTyped(evt);
            }
        });
        getContentPane().add(tfd_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 140, 30));

        cb_size.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Big" }));
        getContentPane().add(cb_size, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 210, 30));

        btn_return.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 90, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_tipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipeActionPerformed
        // Abilita los labels y los texfield
        if(cb_tipe.getSelectedItem().toString()=="Other"){
            lbl_other.setVisible(true);
            tfd_other.setVisible(true);
            btn_insert.setEnabled(false);
            
        }//fin if
        if(cb_tipe.getSelectedItem().toString()!="Other"){
            lbl_other.setVisible(false);
            tfd_other.setVisible(false);
            btn_insert.setEnabled(true);
        }//fin if
        
    }//GEN-LAST:event_cb_tipeActionPerformed

    private void tfd_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_otherActionPerformed
        // TODO add your handling code here:
        if(!tfd_other.getText().equalsIgnoreCase(""))
            btn_insert.setEnabled(true);
    }//GEN-LAST:event_tfd_otherActionPerformed

    private void tfd_otherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_otherKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfd_otherKeyPressed

    private void tfd_otherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_otherKeyTyped

    }//GEN-LAST:event_tfd_otherKeyTyped

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        
        //inserta los materiales en el archivo
        File file= new File("./Audiovisual.dat");
        try{
            //captura los datos 
            AudiovisualFile fileAudiovisual= new AudiovisualFile(file);
            String tipeA= cb_tipe.getSelectedItem().toString();
            String brandA= tfd_brand.getText();
            String modelA= tfd_model.getText();
            String sizeA=cb_size.getSelectedItem().toString();
            String codeA=fileAudiovisual.secuence();
            int availableA =1;
            
            ArrayList<Audiovisual> myArrayAudiovisual=fileAudiovisual.getAudiovisualList();
            for (int i = 0; i <myArrayAudiovisual.size(); i++) {
                Audiovisual temp=myArrayAudiovisual.get(i);
                
                if(temp.getTipe().equalsIgnoreCase(tipeA)){
                    codeA=temp.getCode();
                    availableA=temp.getAvailable()+1;
                    Audiovisual audiovisual = new Audiovisual(tipeA, temp.getBrand(), temp.getModel(), temp.getSize(), codeA,availableA);
                    fileAudiovisual.putValue(i, audiovisual);    
                }//end if       
                    
            }//end for 
          if(cb_tipe.getSelectedItem().toString().equalsIgnoreCase("other")){ 
                String tipeAudio= tfd_other.getText();
                if(!tfd_model.getText().equals("")&&!tfd_brand.getText().equals("")){
                    Audiovisual audiovisual = new Audiovisual(tipeAudio, brandA, modelA, sizeA, codeA,availableA);
                    fileAudiovisual.addEndRecord(audiovisual);
                    tfd_brand.setText("");
                    tfd_model.setText("");
                    tfd_other.setText("");
                    cb_tipe.setSelectedIndex(0);
                    cb_size.setSelectedIndex(0);
                }
                else
                    JOptionPane.showMessageDialog(null, "Check all space");
                                                                                
            }//fin if
          else{
                //inserta el audiovisual
                if(!tfd_model.getText().equals("")&&!tfd_brand.getText().equals("")){
                    Audiovisual audiovisual = new Audiovisual(tipeA, brandA, modelA, sizeA, codeA,availableA);
                    fileAudiovisual.addEndRecord(audiovisual);
                    System.out.println(audiovisual);
                }
                else
                    JOptionPane.showMessageDialog(null, "Check all space");
                
                //resetea los campos de texto
                tfd_brand.setText("");
                tfd_model.setText("");
                tfd_other.setText("");
                cb_tipe.setSelectedIndex(0);
                cb_size.setSelectedIndex(0);
            }//fin else      
        }//fin try
        catch(IOException ioe){
            System.out.println("Error 2002");
        
        }//fin catch
    }//GEN-LAST:event_btn_insertActionPerformed

    public Audiovisual[] getVectorAudiovisual() throws IOException{
        //se captura los materiales del array y los pasa a un arreglo 
        File file= new File("./Audiovisual.dat");
        AudiovisualFile fileAudiovisual= new AudiovisualFile(file);
        ArrayList<Audiovisual> arrayOfAudiovisual= fileAudiovisual.getAudiovisualList();
        Audiovisual vector[] = new Audiovisual[arrayOfAudiovisual.size()];
        for (int i = 0; i < arrayOfAudiovisual.size(); i++) {
            vector[i]=arrayOfAudiovisual.get(i);
            
        }//fin for 
       
    return vector;
    }//fin Audiovisual
    
    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // desabilita la ventana actual y pasa a la otra interfaz deseada
        frame_start star_frame= new frame_start();
        star_frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_returnActionPerformed


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
            java.util.logging.Logger.getLogger(frame_audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_audiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_audiovisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_return;
    private javax.swing.JComboBox<String> cb_size;
    private javax.swing.JComboBox<String> cb_tipe;
    private javax.swing.JLabel lbl_brand;
    private javax.swing.JLabel lbl_model;
    private javax.swing.JLabel lbl_other;
    private javax.swing.JLabel lbl_size;
    private javax.swing.JLabel lbl_tipe;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField tfd_brand;
    private javax.swing.JTextField tfd_model;
    private javax.swing.JTextField tfd_other;
    // End of variables declaration//GEN-END:variables
}
