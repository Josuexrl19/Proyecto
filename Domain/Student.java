
package Domain;


public class Student {
    //atributos
    private String name;
    private String lastName;
    private String residence;
    private String carrer;
    private int yearOfIncome;
    private String id;
    //constructores

    public Student() {
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.carrer = carrer;
        this.yearOfIncome = yearOfIncome;
        this.id = id;
    }

    public Student(String name, String lastName, String residence, String carrer, int yearOfIncome, String id) {
        this.name = name;
        this.lastName = lastName;
        this.residence = residence;
        this.carrer = carrer;
        this.yearOfIncome = yearOfIncome;
        this.id = id;
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getYearOfIncome() {
        return yearOfIncome;
    }

    public void setYearOfIncome(int yearOfIncome) {
        this.yearOfIncome = yearOfIncome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante" + "Nombre= " + name + ",Apellido= " + lastName + ",Residencia= " + residence + ",Carrera= " + carrer + ",Año de Ingreso= " + yearOfIncome + ",Carnet= " + id;
    }

    
    
    public int sizeINBytes(){
      //reoner la suma en bytes de todos los atributos 
      return 4+ this.getName().length()*2 +
                this.getLastName().length()*2+
                this.getResidence().length()*2+
                this.getCarrer().length()*2+
                this.getId().length()*2;
    }
    
    

}// fin student
