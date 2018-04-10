package file;
import Domain.Audiovisual;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class AudiovisualFile {
    
     //declaracion de los atributos
    public RandomAccessFile randomAccessfile;
    private int reQuantity;//cantidad de registros que tiene un archivo
    private int reSize;//el tamaño b6ten bytes de los registros
    private String myFilePath;//ruta del archivo
    
    //constructor
public AudiovisualFile(File file) throws IOException{
    //guardar la ruta del archivo
    this.myFilePath= file.getPath();
    
    //tamaño maximo de cada registro en el archivo
    this.reSize=140;
    
    //validacion si el archivo existe para java
    if(file.exists() && !file.isFile()){
        throw new IOException(file.getName()+"is an inavailablefile");
    
    }else{
         //crea una nueva instancia del random acces file
         randomAccessfile= new RandomAccessFile(file, "rw");
         
         //indica cuantos registros tiene el archivo
         this.reQuantity = (int)Math.ceil((double)randomAccessfile.length()/(double)this.reSize);
         
    
    }

} // end 

//metodo para insertar un audiovisual en una posicion especifica (se necesita ingresar la posicion del equipo y el nombre)
    public boolean putValue(int position,Audiovisual audiovisualToInsert) throws IOException{
        //vamos a hacer una pequeña validacion de posicion
        if(position>= 0 && position<= this.reQuantity){
            
            //verificar que el tamaño sea el adecuado
            if(audiovisualToInsert.sizeINBytes()> this.reSize){
                System.err.println("1002 - record size is too large ");
                return false;
            }else{
                //escribir en archivo (se necesita colocarse en la posicion adecuada para escribir)
                randomAccessfile.seek(position* this.reSize);
                randomAccessfile.writeUTF(audiovisualToInsert.getTipe());
                randomAccessfile.writeUTF(audiovisualToInsert.getBrand());
                randomAccessfile.writeUTF(audiovisualToInsert.getModel());
                randomAccessfile.writeUTF(audiovisualToInsert.getSize());
                randomAccessfile.writeUTF(audiovisualToInsert.getCode());
                randomAccessfile.writeInt(audiovisualToInsert.getAvailable());
                return true;
            }
            
        }else{
            System.err.println("1001 - position is out of bounds");
            return false;
            
        }
        
       
    }//end putValue
    
    //metodo para insertar al final del archivo
    public boolean addEndRecord(Audiovisual audiovisual) throws IOException{
        
        boolean success = putValue(this.reQuantity, audiovisual);
        
        if(success ){
            ++this.reQuantity;//aumentar la variable de la cantidad de registros
        }
        return success;
    }
  
    //obtener un libro de una posocion especifica 
    public Audiovisual getAudiovisual(int position) throws IOException{
        
        //validar posicion
        if(position>= 0 && position<= this.reQuantity){
            //colocamos el brazo o en el ligar adcuado
            randomAccessfile.seek(position* this.reSize);
            //leer el vehiculo
            Audiovisual AudivisualTemp = new Audiovisual();
            AudivisualTemp.setTipe(randomAccessfile.readUTF());
            AudivisualTemp.setBrand(randomAccessfile.readUTF());
            AudivisualTemp.setModel(randomAccessfile.readUTF());
            AudivisualTemp.setSize(randomAccessfile.readUTF());
            AudivisualTemp.setCode(randomAccessfile.readUTF());
            AudivisualTemp.setAvailable(randomAccessfile.readInt());
            
        if(AudivisualTemp.getTipe().equals("deleted")){
            return null;
            
        }else{
            return AudivisualTemp;
        }    
            
        }else{
            System.err.println("1003 - position is out of bounds");
            return null ;
        }
        
    }
    
    //metodo para retornar todos los libros que estan dentro del archivo
    
    public ArrayList<Audiovisual> getAudiovisualList() throws IOException{
        //crear una instancia de un array list
        ArrayList<Audiovisual> arrayListOfAudiovisual = new ArrayList<>();
        
        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.reQuantity; i++) {
            Audiovisual AudiovisualTemp = this.getAudiovisual(i);
            
            //insertar ese vehiculo en la lista
            if(AudiovisualTemp != null){
            arrayListOfAudiovisual.add(AudiovisualTemp);
            }
        }
        return arrayListOfAudiovisual;
    }//end metodo
    
    public String secuence() throws IOException{
        ArrayList<Audiovisual> arrayOfStudent= this.getAudiovisualList();
        int size=arrayOfStudent.size();
        String secuence=String.format("%013d", size);
         
       return secuence;
    }
}