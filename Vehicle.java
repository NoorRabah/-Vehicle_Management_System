
package vehiclemanagementsystemm;

public class Vehicle {
    protected int id;
protected String model;
protected int year;

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle(int id,String model, int year) {
        this.id=id;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", model=" + model + ", year=" + year + '}';
    }

   
    
    public void displayInfo(){
        System.out.print(", " + "id="+ id +", model=" + model + ", year=" + year + '}');
    
    }
    
}
