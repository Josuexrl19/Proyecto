
package file;
import Domain.Books;
import Domain.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class BookFile {
    
     //declaracion de los atributos
    public RandomAccessFile randomAccessfile;
    private int reQuantity;//cantidad de registros que tiene un archivo
    private int reSize;//el tamaño b6ten bytes de los registros
    private String myFilePath;//ruta del archivo
    
    //constructor
public BookFile(File file) throws IOException{
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

//metodo para insertar un libro en una posicion especifica (se necesita ingresar la posicion del libro y el nombre)
    public boolean putValue(int position,Books booksToInsert) throws IOException{
        //vamos a hacer una pequeña validacion de posicion
        if(position>= 0 && position<= this.reQuantity){
            
            //verificar que el tamaño sea el adecuado
            if(booksToInsert.sizeINBytes()> this.reSize){
                System.err.println("1002 - record size is too large ");
                return false;
            }else{
                //escribir en archivo (se necesita colocarse en la posicion adecuada para escribir)
                randomAccessfile.seek(position* this.reSize);
                randomAccessfile.writeUTF(booksToInsert.getTipe());
                randomAccessfile.writeUTF(booksToInsert.getCode());
                randomAccessfile.writeUTF(booksToInsert.getTitle());
                randomAccessfile.writeUTF(booksToInsert.getAuthor());
                randomAccessfile.writeInt(booksToInsert.getYear());
                randomAccessfile.writeInt(booksToInsert.getAvailable());
                return true;
            }
            
        }else{
            System.err.println("1001 - position is out of bounds");
            return false;
            
        }
        
       
    }//end putValue
    
    //metodo para insertar al final del archivo
    public boolean addEndRecord(Books books) throws IOException{
        
        boolean success = putValue(this.reQuantity, books);
        
        if(success ){
            ++this.reQuantity;//aumentar la variable de la cantidad de registros
        }
        return success;
    }
  
    //obtener un libro de una posocion especifica 
    public Books getBooks(int position) throws IOException{
        
        //validar posicion
        if(position>= 0 && position<= this.reQuantity){
            //colocamos el brazo o en el ligar adcuado
            randomAccessfile.seek(position* this.reSize);
            //leer el vehiculo
            Books BooksTemp = new Books();
            BooksTemp.setTipe(randomAccessfile.readUTF());
            BooksTemp.setCode(randomAccessfile.readUTF());
            BooksTemp.setTitle(randomAccessfile.readUTF());
            BooksTemp.setAuthor(randomAccessfile.readUTF());
            BooksTemp.setYear(randomAccessfile.readInt());
            BooksTemp.setAvailable(randomAccessfile.readInt());
            
        if(BooksTemp.getTitle().equals("deleted")){
            return null;
            
        }else{
            return BooksTemp;
        }    
            
        }else{
            System.err.println("1003 - position is out of bounds");
            return null ;
        }
        
    }
    
    //metodo para retornar todos los books que estan dentro del archivo
    
    public ArrayList<Books> getBookstList() throws IOException{
        //crear una instancia de un array list
        ArrayList<Books> arrayListOfBooks = new ArrayList<>();
        
        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.reQuantity; i++) {
            Books BooksTemp = this.getBooks(i);
            
            //insertar ese vehiculo en la lista
            if(BooksTemp != null){
            arrayListOfBooks.add(BooksTemp);
            }
        }
        return arrayListOfBooks;
    }//end metodo
    

    
    public String secuence() throws IOException{
        ArrayList<Books> arrayOfStudent= this.getBookstList();
        int size=arrayOfStudent.size();
        String consecutivo=String.format("%013d", size);
         
       return consecutivo;
    }


}
