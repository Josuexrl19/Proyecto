
package Domain;

import java.io.Serializable;


public class LendingBooks extends Books implements Serializable {

    //atributos
    private String ID;
    private String Name;
    private String dateInput;
    private String dateOutput;
    private String authors;
    private String titles;
    private int available;
    private int amount;

    //constructores
    public LendingBooks() {
    }

   
    public LendingBooks(String ID, String Name, String dateInput, String dateOutput, String authors,String titles, int amount,String tipe, String code, String title, String autor, int year, int available) {
        super(tipe, code, title, autor, year, available);
        this.ID = ID;
        this.Name = Name;
        this.dateInput = dateInput;
        this.dateOutput = dateOutput;
        this.authors = authors;
        this.titles= titles;
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

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
     public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
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
        return "LendingBooks " + "ID=" + ID + ", Name=" + Name + ", dateInput=" + dateInput + ", dateOutput=" + dateOutput + ", authors=" + authors + ", titles=" + titles + ", available=" + available + ", amount=" + amount + '}';
    }

    
}//end lendingBooks
