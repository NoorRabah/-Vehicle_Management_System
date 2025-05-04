package vehiclemanagementsystemm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VehicleManagementSystemm {

    public static void main(String[] args) {
      Scanner ob=new Scanner(System.in);
       // Random r=new Random();
        ArrayList<Vehicle> n = new ArrayList();
        while (true) {
            System.out.println("if you want to add vehicle enter (A)"+
                    ", else if you want to remove any vehicle enter (B)"+
                    ", else if you want to update information of vehicle enter(C)"+
                    ", else if you want to display information of any vehicle enter (D)"+
                    ", else if you want to sort vehicle enter (E)"+
                    ", finally if you want to exit all enter ((F)");
            System.out.print("enter now plz :)");
            char  cc = ob.next().charAt(0);
            if (cc == 'A') {
                add(n);
            } else if (cc == 'B') {
                remove(n);
            } else if (cc == 'C') {
                updateInfo(n);
            } else if (cc =='D') {
                displayAllInfo(n);

            } else if (cc == 'E') {
                n = sortt(n);

            } else if (cc == 'F') {
                break;

            }
        }

    }
    
             public static void add(ArrayList<Vehicle> n) {
                     Scanner ob=new Scanner(System.in);
                     char ch;
        System.out.println("enter v to add Vehicle");
        System.out.println("enter c to add Car");
        System.out.println("enter m to add motorcycle");
        System.out.println("enter t to add truck");
            ch=ob.next().charAt(0);
            if(ch=='v'){
                 System.out.println("enter  model and year of vehicle:");
               Vehicle v=new Vehicle(ob.nextInt(),ob.next(),ob.nextInt());
                   n.add(v);
               }
            else  if(ch=='c'){
               System.out.println("enter numberOfDoors, engine, id, model,  year");
                Car c=new Car(ob.nextInt(),ob.nextInt(),ob.nextInt(),ob.next(),ob.nextInt());
                n.add(c);
                }
            else if(ch=='m'){
               System.out.println("enter capacity, id, model,  year");
               Motorcycle m=new Motorcycle(ob.nextInt(), ob.nextInt(), ob.next(),ob.nextInt());
                n.add(m);
                }
            else if(ch=='t'){
              System.out.println("enter  cargoCapacity, id, model,  year");
                Truck t=new Truck(ob.nextInt(),ob.nextInt(), ob.next(),ob.nextInt());
                n.add(t);
                 }
            }
             
    static void remove(ArrayList<Vehicle> n) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter vehicle id to remove it plz :) = ");
        int id = in.nextInt();
        for (int i =n.size() - 1; i >= 0; i--) {
            if (n.get(i).getId() == id) {
                n.remove(i);
            }
        }
    }
    
    static void updateInfo(ArrayList<Vehicle> n) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter vehicle id : ");
        int id = in.nextInt();
        System.out.println("enter new color : ");
        String newModel = in.next();
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).getId() == id) {
                n.get(i).setModel(newModel);
            }
        }
    }

    static void displayAllInfo(ArrayList<Vehicle> n) {

        for (int i = 0; i < n.size(); i++) {
            n.get(i).displayInfo();
        }
    }

    static ArrayList<Vehicle> sortt(ArrayList<Vehicle> n) {

        ArrayList<Vehicle> v = new ArrayList();
        ArrayList<Car> c = new ArrayList();
        ArrayList<Truck> t = new ArrayList();
        ArrayList<Motorcycle> m = new ArrayList();
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) instanceof Car) {
                c.add((Car) n.get(i));
            } else if (n.get(i) instanceof Truck) {
                t.add((Truck) n.get(i));
            } else if (n.get(i) instanceof Motorcycle) {
                m.add((Motorcycle) n.get(i));
            } else {
                v.add(n.get(i));
            }
        }

        for (int i = 0; i < c.size() - 1; i++) {
            for (int j = 0; j < c.size() - 1; j++) {
                if (c.get(j).getNumberOfDoors() > c.get(j + 1).getNumberOfDoors()) {
                    Car temp = c.get(j);
                    c.set(j, c.get(j + 1));
                    c.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < t.size() - 1; i++) {
            for (int j = 0; j < t.size() - 1; j++) {
                if (t.get(j).getCargoCapacity() > t.get(j + 1).getCargoCapacity()) {
                    Truck temp = t.get(j);
                    t.set(j, t.get(j + 1));
                    t.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < m.size() - 1; i++) {
            for (int j = 0; j < m.size() - 1; j++) {
                if (m.get(j).getCapacity() > m.get(j + 1).getCapacity()) {
                    Motorcycle temp = m.get(j);
                    m.set(j, m.get(j + 1));
                    m.set(j + 1, temp);
                }
            }
        }
        n.clear();
        for (int i = 0; i < c.size(); i++) {
            n.add(c.get(i));
        }
        for (int i = 0; i < t.size(); i++) {
            n.add(t.get(i));
        }
        for (int i = 0; i < m.size(); i++) {
            n.add(m.get(i));
        }
        for (int i = 0; i < v.size(); i++) {
            n.add(v.get(i));
        }
        return n;
    }
                 
}
        
    

