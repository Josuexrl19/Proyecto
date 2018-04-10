package Domain;


public class Books {
    //atributos
    private String tipe;
    private String code;
    private String title;
    private String author;
    private int year;
    private int available;
    //constructores
    public Books() {
        this.tipe = "";
        this.code = "";
        this.title = "";
        this.author = "";
        this.year = 0;
        this.available=0;
    }

    public Books(String tipe, String code, String title, String autor, int year,int available) {
        this.tipe = tipe;
        this.code = code;
        this.title = title;
        this.author = autor;
        this.year = year;
        this.available=available;
    }

    //get and set
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Books " + "tipe= " + tipe + ", code=" + code + ", title=" + title + ", author=" + author + ", year=" + year + ", available=" + available ;
    }

    public int sizeINBytes(){
      //reoner la suma en bytes de todos los atributos 
      return 8 + this.getTipe().length()*2 +
                 this.getCode().length()*2 +
                this.getTitle().length()*2 +
                this.getAuthor().length()*2;
    }            


}//fin books