
package Interfaz;

import Domain.Books;
import File.StudentFile;
import file.BookFile;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frame_book extends javax.swing.JFrame {

    //inician los componentes
    public frame_book() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon picture= new ImageIcon("src/images/Pre.jpg");
        Icon icon= new ImageIcon(picture.getImage().getScaledInstance(lbl_wallpaper.getWidth(), lbl_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        lbl_wallpaper.setIcon(icon);
    }//fin frame_book

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipe = new javax.swing.JLabel();
        cb_tipe = new javax.swing.JComboBox<>();
        lbl_title = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_year = new javax.swing.JLabel();
        tfd_author = new javax.swing.JTextField();
        tfd_title = new javax.swing.JTextField();
        tfd_year = new javax.swing.JTextField();
        btn_insertBook = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tipe.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Tipe.setText("Tipe");
        getContentPane().add(Tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, 30));

        cb_tipe.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cb_tipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physical", "Digital" }));
        getContentPane().add(cb_tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 190, 30));

        lbl_title.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_title.setText("Title");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        lbl_author.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_author.setText("Author");
        getContentPane().add(lbl_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        lbl_year.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lbl_year.setText("Year");
        getContentPane().add(lbl_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        tfd_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_authorActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 190, 30));
        getContentPane().add(tfd_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 190, 30));
        getContentPane().add(tfd_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 190, 30));

        btn_insertBook.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_insertBook.setText("Insert");
        btn_insertBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertBookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insertBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 383, 190, 30));

        btn_return.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        getContentPane().add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 100, 30));
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_authorActionPerformed

    private void btn_insertBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertBookActionPerformed
        //inserta los libros en un archivo
        File file= new File("./books.dat");
       
        try{
            BookFile fileBook= new BookFile(file);
            // capturar los datos 
            String titleB = tfd_title.getText();
            String authorB = tfd_author.getText();
            int yearB = Integer.parseInt(tfd_year.getText());
            String tipeB =cb_tipe.getSelectedItem().toString();
            String codeB=fileBook.secuence() ;
            int availableB =1;
            
            ArrayList<Books> myArrayBook=fileBook.getBookstList();
            for (int i = 0; i <myArrayBook.size(); i++) {
                Books temp=myArrayBook.get(i);
                if(temp.getTitle().equalsIgnoreCase(titleB)){
                    codeB=temp.getCode();
                    availableB=temp.getAvailable()+1;
                    Books books = new Books(temp.getTipe(), codeB, temp.getTitle(), temp.getAuthor(), temp.getYear(),availableB);
                    fileBook.putValue(i, books);
                    
                }//end if
                
                    
            }//end for 
            
            if(!tfd_author.getText().equalsIgnoreCase("")&&!tfd_title.getText().equalsIgnoreCase("")){
            Books books = new Books(tipeB, codeB, titleB, authorB, yearB,availableB);
            fileBook.addEndRecord(books);
            
            }else
                JOptionPane.showMessageDialog(null, "Check all space");
            
            //resetea los campos de textos
            tfd_title.setText("");
            tfd_author.setText("");
            tfd_year.setText("");
        
        
        }//fin try
        catch(IOException ioe){
            System.out.println("Error 2009");
        }//fin catch
        catch(NumberFormatException num){
            JOptionPane.showMessageDialog(null, "Check all spaces");
        }
       
    }//GEN-LAST:event_btn_insertBookActionPerformed

    public Books[] idVectorBooks() throws IOException{
        
        //agrega los libros del array a un arreglo 
        File file= new File("./books.dat");
        BookFile fileBook= new BookFile(file);
        ArrayList<Books> arrayOfBooks= fileBook.getBookstList();
        Books vector[] = new Books[arrayOfBooks.size()];
        
        for (int i = 0; i < arrayOfBooks.size(); i++) {
            vector[i]=arrayOfBooks.get(i);
            
        }//fin for
       
    return vector;
    }//fin idVectorBooks
    
    
    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
// desabilita la ventana actual y pasa a la otra interfaz deseada
        frame_start start_frame = new frame_start();
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
            java.util.logging.Logger.getLogger(frame_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tipe;
    private javax.swing.JButton btn_insertBook;
    private javax.swing.JButton btn_return;
    private javax.swing.JComboBox<String> cb_tipe;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JTextField tfd_author;
    private javax.swing.JTextField tfd_title;
    private javax.swing.JTextField tfd_year;
    // End of variables declaration//GEN-END:variables
}
