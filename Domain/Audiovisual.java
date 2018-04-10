package Domain;


public class Audiovisual {
    //atributos
    private String tipe  ;
    private String brand ;
    private String model;
    private String size;
    private String code;
    private int available;
    
    //constructores

    public Audiovisual() {
        this.tipe = "";
        this.brand = "";
        this.model = "";
        this.size = "";
        this.code = "";
        this.available = 0;
    }

    public Audiovisual(String tipe, String brand, String model, String size, String code,int available) {
        this.tipe = tipe;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.code = code;
        this.available = available;
    }
    
    //get and set

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
    

    @Override
    public String toString() {
        return "Audiovisual" + " tipe: " + tipe + " , brand=" + brand + " , model: " + model + " , size: " + size + " , code: " + code +" ,available: "+available;
    }
    
    public int sizeINBytes(){
        //reoner la suma en bytes de todos los atributos 
        return 4 + this.getTipe().length()*2 +
                   this.getBrand().length()*2 +
                   this.getModel().length()*2 +
                   this.getSize().length()*2 +
                   this.getCode().length()*2;
    }            

}//end Audiovisual