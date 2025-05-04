
package vehiclemanagementsystemm;

public class Car extends Vehicle {
private int numberOfDoors;
    private int engine;
    public Car() {
        
    }

    public Car(int numberOfDoors, int engine, int id, String model, int year) {
        super(id, model, year);
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }
    

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "numberOfDoors=" + numberOfDoors + ", engine=" + engine + '}';
    }
    
    
    @Override
    public void displayInfo(){
    
       System.out.print("Car{number of doors:"+numberOfDoors+", engine:"+engine);
         super.displayInfo();
    }
}
