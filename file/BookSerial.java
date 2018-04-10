package file;

import Domain.LendingAudiovisual;
import Domain.LendingBooks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookSerial {
    //Insertar objeto en el archivo 
    public void insertLendingBook(LendingBooks insertBook){
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LendingBook.dat",true);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(insertBook);
    
    }catch(FileNotFoundException fnfe){
        
    }catch(IOException ioe){
        
    }finally{
        try{
            if(fos!=null)
                fos.close();
            if(oos!=null)
                oos.close();
        }catch(IOException ioe){
            System.out.println("Problem 112");
            
        }
    }//fin finally
    
    }//fin insertLendingBook
    
    public ArrayList<LendingBooks> getListBook(){
       
        ArrayList<LendingBooks> myArray = new ArrayList<>();
        
        try{
            
            FileInputStream fis = new FileInputStream("./LendingBook.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LendingBooks BookTemp;
            BookTemp= (LendingBooks) ois.readObject();
            
            while(BookTemp!=null){
                myArray.add(BookTemp);
                ois = new ObjectInputStream(fis);
                BookTemp= (LendingBooks) ois.readObject();
            }//fin while
            
        }catch(ClassNotFoundException cnfe){
            
        }catch(IOException ioe){
            return myArray;
        }
        return null;
    }//fin getListBook
    
     //borrar un archivo
    public void delete(ArrayList<LendingBooks> array,String ID){
        
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LendingBook.dat");
        oos = new ObjectOutputStream(fos);
        ArrayList<LendingBooks> newArray= new ArrayList<>();
        
        for (int i = 0; i < array.size(); i++) {
            if(!array.get(i).getID().equalsIgnoreCase(ID)){
                newArray.add(array.get(i));
            
            }  
        }
        for (int i = 0; i < newArray.size(); i++) {
            oos.writeObject(newArray.get(i));
            
        }
        
        
    }catch(FileNotFoundException fnfe){
        
    }catch(IOException ioe){
        
    }finally{
        try{
            if(fos!=null)
                fos.close();
            if(oos!=null)
                oos.close();
        }catch(IOException ioe){
            System.out.println("Problem 112");
            
        }
    }//fin finally
        
    }//fin delete
    
    
    
}//fin book serial
