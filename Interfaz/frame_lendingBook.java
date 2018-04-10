/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Domain.Audiovisual;
import Domain.Books;
import Domain.LendingBooks;
import Domain.Student;
import File.StudentFile;
import com.mxrck.autocompleter.TextAutoCompleter;
import file.BookFile;
import file.BookSerial;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Nelson
 */
public class frame_lendingBook extends javax.swing.JFrame {
    //se declaran algunos metodos globales y las otras ventanas 
    frame_book book_frame= new frame_book();
     frame_student student_frame= new frame_student();
     File file= new File("books.dat");
     Student studentToInsert=null;
     TextAutoCompleter completeSearch; 
     SimpleDateFormat format;
      
     

     
    public frame_lendingBook() throws IOException  {
        initComponents();
        setLocationRelativeTo(null);
        //se declara el icono
        
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
        this.enableVariables(false);
        BookFile filebook= new BookFile(file);
        
       
        
        

        
        
    }
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
        
        
        
       
        
    }//end metodo
    
    public void completedAutoComplete() throws IOException{
        frame_student student_frame= new frame_student();
        completeSearch= new TextAutoCompleter(tfd_search);
        Student arregloStudent[]= student_frame.idVectorStudent();
        for (int i = 0; i < arregloStudent.length; i++) {
            completeSearch.addItem(arregloStudent[i].getName());
        }


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tfd_search = new javax.swing.JTextField();
        lbl_exitBook = new javax.swing.JLabel();
        lbl_entryBook = new javax.swing.JLabel();
        tfd_entry = new javax.swing.JTextField();
        btn_generate = new javax.swing.JButton();
        btn_lendingStudent = new javax.swing.JButton();
        lbl_leadingBook = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JDateChooser();
        btn_ckeckID = new javax.swing.JButton();
        tfd_checkID = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        radioButtonDevolution = new javax.swing.JRadioButton();
        lbl_checkID = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(tfd_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 270, 30));

        lbl_exitBook.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_exitBook.setText("Output Book");
        getContentPane().add(lbl_exitBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lbl_entryBook.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_entryBook.setText("Book Devolution");
        getContentPane().add(lbl_entryBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        tfd_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_entryActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 270, 30));

        btn_generate.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_generate.setText("Generate Code");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 250, 30));

        btn_lendingStudent.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_lendingStudent.setText("Lending");
        btn_lendingStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lendingStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lendingStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 220, 30));

        lbl_leadingBook.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_leadingBook.setText("Search");
        getContentPane().add(lbl_leadingBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 270, 30));

        btn_ckeckID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_ckeckID.setText("CheckID");
        btn_ckeckID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ckeckIDActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ckeckID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));

        tfd_checkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_checkIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_checkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 270, 30));

        btn_return.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 220, 30));

        buttonGroup1.add(radioButtonDevolution);
        radioButtonDevolution.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        radioButtonDevolution.setText("Devolution");
        radioButtonDevolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDevolutionActionPerformed(evt);
            }
        });
        getContentPane().add(radioButtonDevolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, 30));

        lbl_checkID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_checkID.setText("Check ID");
        getContentPane().add(lbl_checkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 20));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_searchActionPerformed
        
    }//GEN-LAST:event_tfd_searchActionPerformed

    private void tfd_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_searchKeyPressed
        //aqui se escucha acciones dle teclado y añade los disponibles
        try{
        Books vector[]=book_frame.idVectorBooks();
        completeSearch= new TextAutoCompleter(tfd_search);
            for (int i = 0; i <vector.length; i++) {
                if(vector[i].getAvailable()>0){
                completeSearch.addItem(vector[i].getTitle()+" "+vector[i].getAuthor());
                }
            }
        }catch(IOException ioe){
            System.out.println("Error 1234");
        
        }
            
    }//GEN-LAST:event_tfd_searchKeyPressed

    private void tfd_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_entryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_entryActionPerformed

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
        
        try{
        tfd_entry.setText(this.getCalendar());
       }catch(NullPointerException nullPointer){
           JOptionPane.showMessageDialog(null, "Insert the date please");
       }

    }//GEN-LAST:event_btn_generateActionPerformed

    private void btn_lendingStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lendingStudentActionPerformed
        try{
            BookFile filebook = new BookFile(file);
            Books vector[]=book_frame.idVectorBooks();
            Boolean accesLending=false;
            Books bookToLending=null;
            LendingBooks booksLending = new LendingBooks();
            BookSerial serialBook = new BookSerial();
        
        for (int i = 0; i < vector.length; i++) {
                
                if(tfd_search.getText().equalsIgnoreCase(vector[i].getTitle()+" "+vector[i].getAuthor())){
                bookToLending=vector[i];
                accesLending=true;
                
                
                
                }
                
            }
            if(accesLending!=false){
                
                
            booksLending = new LendingBooks(studentToInsert.getId(), studentToInsert.getName(), format.format(calendar.getDate()), tfd_entry.getText(), bookToLending.getAuthor(), bookToLending.getTitle(), 0, bookToLending.getTipe(), bookToLending.getCode(), bookToLending.getTitle(), bookToLending.getAuthor(),bookToLending.getYear(), bookToLending.getAvailable());
                    
            for (int i = 0; i < vector.length; i++) {
                if(booksLending.getTipe().equalsIgnoreCase(vector[i].getTipe())){
                    bookToLending.setAvailable(bookToLending.getAvailable()-1);
                    filebook.putValue(i, bookToLending);
                }
            }
                    serialBook.insertLendingBook(booksLending);
                    tfd_entry.setText("");
                    tfd_search.setText("");
                    
                }
                
                
            
            else
                JOptionPane.showMessageDialog(null, "Selec to book");
        }catch(IOException ioe){
        }catch(NullPointerException nu){
        JOptionPane.showMessageDialog(null, "Check all spaces");
        
        }
    }//GEN-LAST:event_btn_lendingStudentActionPerformed

    public void visibleVariables(boolean variable){
        lbl_leadingBook.setVisible(variable);
        lbl_exitBook.setVisible(variable);
        lbl_entryBook.setVisible(variable);
        tfd_entry.setVisible(variable);
        tfd_search.setVisible(variable);
        calendar.setVisible(variable);
        btn_generate.setVisible(variable);
        btn_lendingStudent.setVisible(variable);
       
    
    }
    
    public void enableVariables(boolean variable){
        lbl_leadingBook.setEnabled(variable);
        lbl_exitBook.setEnabled(variable);
        lbl_entryBook.setEnabled(variable);
        tfd_entry.setEnabled(variable);
        tfd_search.setEnabled(variable);
        calendar.setEnabled(variable);
        btn_generate.setEnabled(variable);
        btn_lendingStudent.setEnabled(variable);
       
    
    }
    
    private void btn_ckeckIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ckeckIDActionPerformed
        //comprueba el id y hace las validaciones
        Boolean acces=false;
        BookSerial bs = new BookSerial();
        ArrayList<LendingBooks> ar = new ArrayList<>();
        
        try{
        Student vector[]=student_frame.idVectorStudent();
      
        for (int i = 0; i <vector.length; i++) {
             
          if(vector[i].getId().equalsIgnoreCase(tfd_checkID.getText())){
              acces=true;
              studentToInsert=vector[i]; 
              
              
          }//fin if
        }//fin for
        if(acces==true){
                    
                 tfd_checkID.setEnabled(false);
                 lbl_checkID.setEnabled(false);
                 btn_ckeckID.setEnabled(false);
                 this.enableVariables(true);
                 JOptionPane.showMessageDialog(null, "ID valid");
                 tfd_checkID.setText("");
        
        }
        else{
            JOptionPane.showMessageDialog(null, "ID invalid");
            tfd_checkID.setText("");
        }
        
        }catch(IOException ioe){
            System.out.println("Problem-3001");
        }
        
        
    }//GEN-LAST:event_btn_ckeckIDActionPerformed

    private void radioButtonDevolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDevolutionActionPerformed
        frame_devolutionBook devolutionBook= new frame_devolutionBook();
        devolutionBook.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_radioButtonDevolutionActionPerformed

    private void tfd_checkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_checkIDActionPerformed

        this.btn_ckeckIDActionPerformed(evt);
    }//GEN-LAST:event_tfd_checkIDActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // desabilita la ventana actual y pasa a la otra interfaz deseada
        frame_start start_frame= new frame_start();
        start_frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_returnActionPerformed

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
            java.util.logging.Logger.getLogger(frame_lendingBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_lendingBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_lendingBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_lendingBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new frame_lendingBook().setVisible(true);
                }catch(IOException ioe){
                    System.out.println("problem-008");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ckeckID;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_lendingStudent;
    private javax.swing.JButton btn_return;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel lbl_checkID;
    private javax.swing.JLabel lbl_entryBook;
    private javax.swing.JLabel lbl_exitBook;
    private javax.swing.JLabel lbl_leadingBook;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JRadioButton radioButtonDevolution;
    private javax.swing.JTextField tfd_checkID;
    private javax.swing.JTextField tfd_entry;
    private javax.swing.JTextField tfd_search;
    // End of variables declaration//GEN-END:variables
}
