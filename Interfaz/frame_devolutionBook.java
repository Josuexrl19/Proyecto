
package Interfaz;

import Domain.LendingAudiovisual;
import Domain.LendingBooks;
import file.AudiovisualSerial;
import file.BookSerial;
import java.awt.Image;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frame_devolutionBook extends javax.swing.JFrame {
        
        //se crea arraylist global
        BookSerial serialBooksSerial=new BookSerial();
        ArrayList<LendingBooks> myArray = serialBooksSerial.getListBook();
        LendingBooks audiovisuaBooks= new LendingBooks();
        LendingBooks booksLending=null;
        SimpleDateFormat format;
        
    
    public frame_devolutionBook() {
        //se inician los componentes 
        initComponents();
        btn_delete.setEnabled(false);
        calendar.setEnabled(false);
        visibleVariables(false);
        setLocationRelativeTo(null);
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
        
        
    }//fin frame_devolutionBook

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfd_searchLending = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        lbl_deliveryDay = new javax.swing.JLabel();
        lbl_searchLending = new javax.swing.JLabel();
        tfd_dateOutput = new javax.swing.JTextField();
        tfd_id = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        tfd_amount = new javax.swing.JTextField();
        lbl_returnDay = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        btn_verification = new javax.swing.JButton();
        tfd_title = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        lbl_amount = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfd_searchLending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_searchLendingActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_searchLending, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        btn_enter.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_enter.setText("Enter");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        lbl_deliveryDay.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_deliveryDay.setText("Delivery Day");
        getContentPane().add(lbl_deliveryDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, 30));

        lbl_searchLending.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_searchLending.setText("Search Lending");
        getContentPane().add(lbl_searchLending, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 20));

        tfd_dateOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_dateOutputActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_dateOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 180, 30));
        getContentPane().add(tfd_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 170, 30));

        lbl_id.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_id.setText("ID");
        getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 70, 30));
        getContentPane().add(tfd_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 180, 30));

        lbl_returnDay.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_returnDay.setText("Return Date");
        getContentPane().add(lbl_returnDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 90, 30));

        lbl_title.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_title.setText("Title");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 70, 30));
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 180, 30));

        btn_verification.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_verification.setText("Verification");
        btn_verification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificationActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verification, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 160, 30));
        getContentPane().add(tfd_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 180, 30));

        btn_return.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 483, 120, 30));

        btn_delete.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 180, 30));

        lbl_amount.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_amount.setText("Amount");
        getContentPane().add(lbl_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 70, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public  void visibleVariables(boolean variable){
    
        //desabilita los label
        tfd_id.setEnabled(variable);
        tfd_amount.setEnabled(variable);
        tfd_dateOutput.setEnabled(variable);
        tfd_title.setEnabled(variable);
      
    }//fin visibleVariable
    
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        
        //verifica el ID y trae los elementos de dicho ID
        boolean acces=false;
        for (int i = 0; i < myArray.size(); i++) {
            if(tfd_searchLending.getText().equalsIgnoreCase(myArray.get(i).getID())){
                acces=true;
                btn_delete.setEnabled(true);
                calendar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "ID found");
                tfd_id.setText(myArray.get(i).getID());
                tfd_title.setText(myArray.get(i).getTitles());
                tfd_dateOutput.setText(myArray.get(i).getDateOutput());
                tfd_amount.setText("");
                booksLending=myArray.get(i);
                tfd_searchLending.setEnabled(false);
                btn_enter.setEnabled(false);
                
                
            }//fin if
            
        }//fin for
        if(acces!=true){
            JOptionPane.showMessageDialog(null, "ID invalid");
            tfd_searchLending.setText("");
        }
        
    }//GEN-LAST:event_btn_enterActionPerformed

    private void tfd_dateOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_dateOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_dateOutputActionPerformed

    private void tfd_searchLendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_searchLendingActionPerformed
        this.btn_enterActionPerformed(evt);
    }//GEN-LAST:event_tfd_searchLendingActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        //borra un libro del archivo
        if(!tfd_amount.getText().equalsIgnoreCase("")){
            LendingBooks bookLending= new LendingBooks();
            BookSerial serialBookSerial=new BookSerial();
            ArrayList<LendingBooks> aux= serialBookSerial.getListBook();
            serialBookSerial.delete(aux, tfd_id.getText());
            ArrayList<LendingBooks> au= serialBookSerial.getListBook();
            JOptionPane.showMessageDialog(null, "Delete succes");
            tfd_dateOutput.setText("");
            tfd_amount.setText("");
            tfd_id.setText("");
            tfd_title.setText("");
            btn_delete.setEnabled(false);
            calendar.setEnabled(false);
            visibleVariables(false);
            tfd_searchLending.setEnabled(true);
            btn_enter.setEnabled(true);
            
            
        }
        else
            JOptionPane.showMessageDialog(null, "Check to verification");
    }//GEN-LAST:event_btn_deleteActionPerformed

     public String getCalendar(){
        Date date = calendar.getDate();
        format= new SimpleDateFormat("dd-MM-yyyy");
        String fecha= format.format(date);
        int newDay=Integer.parseInt(fecha.substring(0, 2));
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
        
        
        
       
        
    }//end metodo
    
    private void btn_verificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificationActionPerformed
        //metodo que verifica si tiene una multa o no
            try {
                
                String dateToDevolution= booksLending.getDateOutput();
                String dateToDelivery= this.getCalendar();
                int dateToDevolutions= Integer.parseInt(dateToDevolution.substring(0, 2));
                int dateToDeliverys=Integer.parseInt(dateToDelivery.substring(0, 2));
                int monthToDevolution=Integer.parseInt(dateToDevolution.substring(3, 4));
                int monthToDelivery=Integer.parseInt(dateToDelivery.substring(3, 4));
                
                if(dateToDeliverys==dateToDevolutions&&monthToDelivery==monthToDevolution){
                    tfd_amount.setText("$0");
                    btn_verification.setEnabled(false);
                }
                else if((dateToDeliverys-dateToDevolutions)>0&&monthToDelivery==monthToDevolution){
                    
                        tfd_amount.setText("$2000");
                        btn_verification.setEnabled(false);
                    
                
                }//fin if
                else if(monthToDevolution<monthToDelivery){
                        tfd_amount.setText("$2000");
                        btn_verification.setEnabled(false);
                }
                else if(dateToDevolutions-5<dateToDeliverys&&monthToDelivery==monthToDevolution){
                        tfd_amount.setText("$0");
                        btn_verification.setEnabled(false);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Entry date invalid");
                    tfd_amount.setText("");
                
                }
               
            }//fin try 
//            catch (IOException ex) {
//                System.out.println("Problem-1002");
//            }//fin catch
            catch(NullPointerException nu){
                JOptionPane.showMessageDialog(null, "Insert the date to delivery");
            }//fin catch
    }//GEN-LAST:event_btn_verificationActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // desabilita la ventana actual y pasa a la otra interfaz deseada
        frame_start start_frame= new frame_start();
        start_frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(frame_devolutionBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_devolutionBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_devolutionBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_devolutionBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_devolutionBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_verification;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_deliveryDay;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_returnDay;
    private javax.swing.JLabel lbl_searchLending;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField tfd_amount;
    private javax.swing.JTextField tfd_dateOutput;
    private javax.swing.JTextField tfd_id;
    private javax.swing.JTextField tfd_searchLending;
    private javax.swing.JTextField tfd_title;
    // End of variables declaration//GEN-END:variables
}
