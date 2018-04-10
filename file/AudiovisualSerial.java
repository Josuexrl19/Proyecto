package file;

import Domain.LendingAudiovisual;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




public class AudiovisualSerial {
   
    //Insertar objeto en el archivo 
    public void insertLendingAudiovisual(LendingAudiovisual insertAudiovisual){
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LendingAudiovisual.dat",true);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(insertAudiovisual);
    
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
    
    }//fin insertLendingAudiovisual
    
    public ArrayList<LendingAudiovisual> getListAudiovisual(){
       
        ArrayList<LendingAudiovisual> myArray = new ArrayList<>();
        
        try{
            
            FileInputStream fis = new FileInputStream("./LendingAudiovisual.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LendingAudiovisual audioTemp;
            audioTemp= (LendingAudiovisual) ois.readObject();
            
            while(audioTemp!=null){
                myArray.add(audioTemp);
                ois = new ObjectInputStream(fis);
                audioTemp= (LendingAudiovisual) ois.readObject();
            }//fin while
            
        }catch(ClassNotFoundException cnfe){
            
        }catch(IOException ioe){
            return myArray;
        }
        return null;
    }//fin getListAudiovisual
    
    //borrar un archivo
    public void delete(ArrayList<LendingAudiovisual> array,String ID){
        
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try{
        fos = new FileOutputStream("./LendingAudiovisual.dat");
        oos = new ObjectOutputStream(fos);
        ArrayList<LendingAudiovisual> newArray= new ArrayList<>();
        
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
    
}//fin audiovisual serial
