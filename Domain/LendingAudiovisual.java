
package Domain;

import Interfaz.frame_audiovisual;
import java.io.Serializable;


public class LendingAudiovisual extends Audiovisual implements Serializable{
    //atributos
    private String ID;
    private String Name;
    private String dateInput;
    private String dateOutput;
    private String tipe;
    private String brand;
    private int available;
    private int amount;
    
    //constructores
    public LendingAudiovisual() {
    }
    
    //se aplica herencia 
    public LendingAudiovisual(String ID, String Name, String dateInput, String dateOutput, String tipe, String brand, int amount, String tipes, String brands, String model, String size, String code, int available) {
        super(tipe, brand, model, size, code, available);
        this.ID = ID;
        this.Name = Name;
        this.dateInput = dateInput;
        this.dateOutput = dateOutput;
        this.tipe = tipe;
        this.brand = brand;
        this.available= available;
        this.amount = amount;
    }

    // get and set
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

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

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LendingAudiovisual{" + "ID=" + ID + ", Name=" + Name + ", dateInput=" + dateInput + ", dateOutput=" + dateOutput + ", tipe=" + tipe + ", brand=" + brand + ", available=" + available + ", amount=" + amount + '}';
    }
    
    
    
   
}//fin lending audiovisual



