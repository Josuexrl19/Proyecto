package File;

import Domain.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class StudentFile {
    
    //declaracion de los atributos
    public RandomAccessFile randomAccessfile;
    private int reQuantity;//cantidad de registros que tiene un archivo
    private int reSize;//el tamaño b6ten bytes de los registros
    private String myFilePath;//ruta del archivo
    
    //constructor
public StudentFile(File file) throws IOException{
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

} // end vehicleFile 

//metodo para insertar un Student en una posicion especifica (se necesita ingresar la posicion del student y el nombre)
    public boolean putValue(int position,Student studentToInsert) throws IOException{
        //vamos a hacer una pequeña validacion de posicion
        if(position>= 0 && position<= this.reQuantity){
            
            //verificar que el tamaño sea el adecuado
            if(studentToInsert.sizeINBytes()> this.reSize){
                System.err.println("1002 - record size is too large ");
                return false;
            }else{
                //escribir en archivo (se necesita colocarse en la posicion adecuada para escribir)
                randomAccessfile.seek(position* this.reSize);
                randomAccessfile.writeUTF(studentToInsert.getName());
                randomAccessfile.writeUTF(studentToInsert.getLastName());
                randomAccessfile.writeUTF(studentToInsert.getResidence());
                randomAccessfile.writeUTF(studentToInsert.getCarrer());
                randomAccessfile.writeInt(studentToInsert.getYearOfIncome());
                randomAccessfile.writeUTF(studentToInsert.getId());
                return true;
            }
            
        }else{
            System.err.println("1001 - position is out of bounds");
            return false;
            
        }
        
       
    }//end putValue
    
    //metodo para insertar al final del archivo
    public boolean addEndRecord(Student student) throws IOException{
        
        boolean success = putValue(this.reQuantity, student);
        
        if(success ){
            ++this.reQuantity;//aumentar la variable de la cantidad de registros
        }
        return success;
    }
  
    //obtener un estudiante de una posocion especifica 
    public Student getStudent(int position) throws IOException{
        
        //validar posicion
        if(position>= 0 && position<= this.reQuantity){
            //colocamos el brazo o en el ligar adcuado
            randomAccessfile.seek(position* this.reSize);
            //leer el vehiculo
            Student StudentTemp = new Student();
            StudentTemp.setName(randomAccessfile.readUTF());
            StudentTemp.setLastName(randomAccessfile.readUTF());
            StudentTemp.setResidence(randomAccessfile.readUTF());
            StudentTemp.setCarrer(randomAccessfile.readUTF());
            StudentTemp.setYearOfIncome(randomAccessfile.readInt());
            StudentTemp.setId(randomAccessfile.readUTF());
            
        if(StudentTemp.getName().equals("deleted")){
            return null;
            
        }else{
            return StudentTemp;
        }    
            
        }else{
            System.err.println("1003 - position is out of bounds");
            return null ;
        }
        
    }
    
    //metodo para retornar todos los estudiantes que estan dentro del archivo
    
    public ArrayList<Student> getStudentList() throws IOException{
        //crear una instancia de un array list
        ArrayList<Student> arrayListOfStudent = new ArrayList<>();
        
        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < this.reQuantity; i++) {
            Student StudentTemp = this.getStudent(i);
            
            //insertar ese vehiculo en la lista
            if(StudentTemp != null){
            arrayListOfStudent.add(StudentTemp);
            }
        }
        return arrayListOfStudent;
    }//end metodo
    
    
    
    public String secuence() throws IOException{
        ArrayList<Student> arrayOfStudent= this.getStudentList();
        int size=arrayOfStudent.size();
        String consecutivo="";
        if(size==0)
            consecutivo="000";
        else if(size<9)
            consecutivo="00"+size;
        else if(size<99)
            consecutivo="0"+size;
        else
            consecutivo=""+size;
            
    
    return consecutivo;
    }

    
//    //meodo para borrar un estudiante buscado por nombre
//    public boolean deleteRecord (int series) throws IOException{
//        
//        Vehicle vehicleTemp;
//        
//        for (int i = 0; i < this.reQuantity; i++) {
//            vehicleTemp = this.getStudent(i) ;
//            
//            if(vehicleTemp.getSeries()==series){
//                vehicleTemp.setName("delete");
//                return this.putValue(i, vehicleTemp);
//            }//end if
//        }//end for
//        return false;
//        
//    }//end metodo
        
}


