package vehiclemanagementsystemm;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck() {
    }

    public Truck(int cargoCapacity, int id, String model, int year) {
        super(id, model, year);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo(){
    
       System.out.print("Truck{cargo capacity:"+cargoCapacity);
         super.displayInfo();
    }
   
    
}
