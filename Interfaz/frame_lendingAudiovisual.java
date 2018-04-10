
package Interfaz;

import Domain.Audiovisual;
import Domain.LendingAudiovisual;
import Domain.Student;
import com.mxrck.autocompleter.TextAutoCompleter;
import file.AudiovisualFile;
import file.AudiovisualSerial;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frame_lendingAudiovisual extends javax.swing.JFrame {
    //inicia los frames,textAutoCompleter y los simplesDateFormat
    frame_audiovisual audiovisual_Frame= new frame_audiovisual();
    frame_student student_frame= new frame_student();
    Student studentToInsert=null;
    TextAutoCompleter completeSearch; 
    SimpleDateFormat format;
    
    public frame_lendingAudiovisual() {
        //inicia los componentes
        initComponents();
        setLocationRelativeTo(null);
        this.enableVariablesLending(false);
      
        radioButtonDevolution.setEnabled(false);
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
        
        tfd_entry.setEnabled(false);
        
    }//fin frame_LendingAudiovisual

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        calendar = new com.toedter.calendar.JDateChooser();
        lbl_entryDateBook = new javax.swing.JLabel();
        lbl_exitMaterials = new javax.swing.JLabel();
        lbl_leadingMaterials = new javax.swing.JLabel();
        tfd_search = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        tfd_entry = new javax.swing.JTextField();
        btn_generate = new javax.swing.JButton();
        lbl_verification = new javax.swing.JLabel();
        btn_check = new javax.swing.JButton();
        btn_lending = new javax.swing.JButton();
        tfd_check = new javax.swing.JTextField();
        radioButtonDevolution = new javax.swing.JRadioButton();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, 30));

        lbl_entryDateBook.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_entryDateBook.setText("Materials Devolution");
        getContentPane().add(lbl_entryDateBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 20));

        lbl_exitMaterials.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_exitMaterials.setText("Exit Materials");
        getContentPane().add(lbl_exitMaterials, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lbl_leadingMaterials.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_leadingMaterials.setText("Search Materials");
        getContentPane().add(lbl_leadingMaterials, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 20));

        tfd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_searchActionPerformed(evt);
            }
        });
        tfd_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfd_searchKeyPressed(evt);
            }
        });
        getContentPane().add(tfd_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, 30));

        btn_return.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 160, 30));

        tfd_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_entryActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 190, 30));

        btn_generate.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_generate.setText("Generate Date");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 190, 30));

        lbl_verification.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_verification.setText("Check ID");
        getContentPane().add(lbl_verification, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        btn_check.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 120, 30));

        btn_lending.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_lending.setText("Lending");
        btn_lending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lendingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lending, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 160, 30));

        tfd_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_checkActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 320, 30));

        buttonGroup1.add(radioButtonDevolution);
        radioButtonDevolution.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonDevolution.setText("Devolutions");
        radioButtonDevolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDevolutionActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonDevolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // desabilita la ventana actual y pasa a la otra interfaz deseada
        frame_start star = new frame_start();
        star.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_returnActionPerformed

    private void tfd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_searchActionPerformed
        
        
    }//GEN-LAST:event_tfd_searchActionPerformed

    public void enableVariablesLending(boolean variable){
        //desabilita los componenetes
        lbl_leadingMaterials.setEnabled(variable);
        lbl_exitMaterials.setEnabled(variable);
        lbl_entryDateBook.setEnabled(variable);
        tfd_search.setEnabled(variable);
        calendar.setEnabled(variable);
        btn_generate.setEnabled(variable);
        
    }//fin enableVariableLending
 
    
    private void tfd_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_searchKeyPressed
        
        //se cra la barra de busqueda
        try{
            Audiovisual vector[]= audiovisual_Frame.getVectorAudiovisual();
            completeSearch= new TextAutoCompleter(tfd_search);
            for (int i = 0; i <vector.length ; i++) {
                if(vector[i].getAvailable()>0){
                completeSearch.addItem(vector[i].getTipe()+" "+vector[i].getBrand());
                }
                
            }//fin for
            
        }//fin try
        catch(IOException ioe){
             System.out.println("Error 1234");
        }//fin catch

    }//GEN-LAST:event_tfd_searchKeyPressed

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
            
        
        //genera la fecha de la devolucion
        try{
            tfd_entry.setText(this.getCalendar());
       }//fin try
        catch(NullPointerException nullPointer){
           JOptionPane.showMessageDialog(null, "Insert to data please");
       }//fin catch
    }//GEN-LAST:event_btn_generateActionPerformed

    private void btn_lendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lendingActionPerformed
        //genera el prestamo
        File file= new File("./Audiovisual.dat");
        try{
           
            AudiovisualFile fileAudiovisual= new AudiovisualFile(file);
            LendingAudiovisual audioInsert= new LendingAudiovisual();
            AudiovisualSerial serialAudio=  new AudiovisualSerial();
        
            Audiovisual vector[]=audiovisual_Frame.getVectorAudiovisual();
            Boolean accesLending=false;
            Audiovisual audioVisualToLending=null;
            for (int i = 0; i < vector.length; i++) {
                
                if(tfd_search.getText().equalsIgnoreCase(vector[i].getTipe()+" "+vector[i].getBrand())){
                audioVisualToLending=vector[i];
                accesLending=true;
                
                }//fin if
                
            }//fin for
            
            if(accesLending!=false){
                
                
                audioInsert= new LendingAudiovisual(studentToInsert.getId(), studentToInsert.getName(), format.format(calendar.getDate()), tfd_entry.getText(), audioVisualToLending.getTipe(), audioVisualToLending.getBrand(), 0, "", "", audioVisualToLending.getModel(), audioVisualToLending.getSize(), audioVisualToLending.getCode(), audioVisualToLending.getAvailable());
                for (int i = 0; i < vector.length; i++) {
                    if(audioInsert.getTipe().equalsIgnoreCase(vector[i].getTipe())){
                        audioVisualToLending.setAvailable(audioVisualToLending.getAvailable()-1);
                        fileAudiovisual.putValue(i, audioVisualToLending);
                    }
                }
                serialAudio.insertLendingAudiovisual(audioInsert);
                tfd_entry.setText("");
                tfd_search.setText("");
                
            }//fin if
            else
                JOptionPane.showMessageDialog(null, "Select to materials");
        }//fin try
        catch(IOException ioe){
            System.out.println("Error 2005");
        } //fin catch
        catch(NullPointerException nu){
            JOptionPane.showMessageDialog(null, "Check all spaces");
        }
    }//GEN-LAST:event_btn_lendingActionPerformed

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        //comprueba el id y hace las validaciones
        Boolean acces=false;
        AudiovisualSerial bs = new AudiovisualSerial();
        ArrayList<LendingAudiovisual> ar = new ArrayList<>();
        
        try{
            Student vector[]=student_frame.idVectorStudent();
      
        for (int i = 0; i <vector.length; i++) {
            
            if(vector[i].getId().equalsIgnoreCase(tfd_check.getText())){
                acces=true;
                studentToInsert=vector[i];
                    
              
            }//fin if
        }//fin for
        if(acces==true){
                    
            
            radioButtonDevolution.setEnabled(true);
            tfd_check.setEnabled(false);
            lbl_verification.setEnabled(false);
            btn_check.setEnabled(false);
            this.enableVariablesLending(true);
            JOptionPane.showMessageDialog(null, "ID valid");
        }//fin if
        else{
            JOptionPane.showMessageDialog(null, "ID invalid");
            tfd_check.setText("");
        }//fin else
        
        }//fin try
        catch(IOException ioe){
            System.out.println("Error 2008");
        }//fin catch
    }//GEN-LAST:event_btn_checkActionPerformed

    private void tfd_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_checkActionPerformed
        //hace el mismo evento que el boton
        this.btn_checkActionPerformed(evt);
        
        radioButtonDevolution.setEnabled(true);
    }//GEN-LAST:event_tfd_checkActionPerformed

    private void radioButtonDevolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDevolutionActionPerformed
        //dirige a la interfaz de devolucion
        frame_devolutionAudiovisual devolution= new frame_devolutionAudiovisual();
        devolution.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_radioButtonDevolutionActionPerformed

    private void tfd_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_entryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_entryActionPerformed

    public String getCalendar(){
        Date date = calendar.getDate();
        format= new SimpleDateFormat("dd-MM-yyyy");
        String fecha= format.format(date);
        int newDay=Integer.parseInt(fecha.substring(0, 2))+5;
        int month=Integer.parseInt(fecha.substring(3,5));
        int year=Integer.parseInt(fecha.substring(6, 10));
        String dayS="",monthS="",yearS="",newDate="";
        if(month==1 ||month==3||month==5||month==7||month==8||month==10||month==12){
            if(newDay>31){
                dayS="0"+(newDay-31);
               
                if(month>=9&&month<12){
                    monthS=""+(month+=1);
                    yearS=""+year;
                }
                else if(month==12){
                       monthS="0"+1;
                       yearS=""+(year+1);      
                }
                else{
                    monthS="0"+(month+1);
                    yearS=""+year;
                }
                
            }//dia mayor a 31
            else if(newDay<10){
                dayS="0"+newDay;
                monthS=""+month;
                yearS=""+year;
            
            }//dia menor a 10
            else{
                dayS=""+newDay;
                monthS=""+month;
                yearS=""+year;
            }//dia mayor a 10 pero menor que 31
            
         return newDate=dayS+"/"+monthS+"/"+yearS;       
        
        
        }//fin if meses 31
        else if(month==4 ||month==6||month==9||month==11){
           if(newDay>30){
                dayS="0"+(newDay-30);
               
                if(month>=9&&month<12){
                    monthS=""+(month+=1);
                    yearS=""+year;
                }
                else if(month==12){
                       monthS="0"+1;
                       yearS=""+(year+1);      
                }
                else{
                    monthS="0"+(month+1);
                    yearS=""+year;
                }
                
            }//dia mayor a 30
            else if(newDay<10){
                dayS="0"+newDay;
                monthS=""+month;
                yearS=""+year;
            
            }//dia menor a 10
            else{
                dayS=""+newDay;
                monthS=""+month;
                yearS=""+year;
            }//dia mayor a 10 pero menor que 31
            
                
        return newDate=dayS+"/"+monthS+"/"+yearS; 
        
        }//fin if meses 30
        else{
            if(newDay>28){
                dayS="0"+(newDay-28);
               
                if(month>=9&&month<12){
                    monthS=""+(month+=1);
                    yearS=""+year;
                }
                else if(month==12){
                       monthS="0"+1;
                       yearS=""+(year+1);      
                }
                else{
                    monthS="0"+(month+1);
                    yearS=""+year;
                }
                
            }//dia mayor a 31
            else if(newDay<10){
                dayS="0"+newDay;
                monthS=""+month;
                yearS=""+year;
            
            }//dia menor a 10
            else{
                dayS=""+newDay;
                monthS=""+month;
                yearS=""+year;
            }//dia mayor a 10 pero menor que 31
            
            return newDate=dayS+"/"+monthS+"/"+yearS; 
        }//aqui va febrero
        
        
        
       
        
    }
    

    
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
            java.util.logging.Logger.getLogger(frame_lendingAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_lendingAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_lendingAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_lendingAudiovisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_lendingAudiovisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_lending;
    private javax.swing.JButton btn_return;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JLabel lbl_entryDateBook;
    private javax.swing.JLabel lbl_exitMaterials;
    private javax.swing.JLabel lbl_leadingMaterials;
    private javax.swing.JLabel lbl_verification;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JRadioButton radioButtonDevolution;
    private javax.swing.JTextField tfd_check;
    private javax.swing.JTextField tfd_entry;
    private javax.swing.JTextField tfd_search;
    // End of variables declaration//GEN-END:variables
}
