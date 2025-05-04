
package vehiclemanagementsystemm;

public class Motorcycle extends Vehicle {
   private  int capacity; 

    public Motorcycle() {
    }

    public Motorcycle(int capacity, int id, String model, int year) {
        super(id, model, year);
        this.capacity = capacity;
    }

   

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "capacity=" + capacity + '}';
    }
 @Override
    public void displayInfo(){
    
       System.out.print("Motorcycle{Capacity:"+capacity);
         super.displayInfo();
    }
   
}
