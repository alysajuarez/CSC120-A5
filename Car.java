import java.util.ArrayList;
public class Car {

    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;


   
    /**
    * constructs attributes for Car class
    * @param ArrayList<Passenger> passengersOnboard
    *           array list that will hold car's passengers
    * @param int maxCapacity
    *           total passengers that can fit in a car
    */
    public Car(ArrayList<Passenger> passengersOnboard, int maxCapacity) {
        this.passengersOnboard = passengersOnboard;
        this.maxCapacity = maxCapacity;
    }

    /**
    * accessor to get passenger capacity of car
    * @return maxCapacity
    */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
    * method to get amount of passengers that can fit in a car
    * @return maxCapacity - passengersOnboard.size()
    */
    public int seatsRemaining(){
        return this.maxCapacity - passengersOnboard.size();
    }

    /**
    * method to add a passenger to a car if there is space
    * @param Passenger p
    */
    public void addPassenger(Passenger p) {
        try {
            passengersOnboard.add(p);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
            

    /**
    * method to remove a passenger from car if they are in it
    * @param Passenger p
    */
    public void removePassenger(Passenger p) {
        try {
            passengersOnboard.remove(p);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
    * method to print list of passengers on car
    */
    public void printManifest(){
        if (passengersOnboard.size() > 0) {
            System.out.println("there are " + passengersOnboard.size() + " passengers on this car");
        	System.out.println(passengersOnboard);
            
        }

        else {
            System.out.println("this car is EMPTY");
        }
    }

    public static void main(String[] args) {

        ArrayList<Passenger> passengersOnboardCarOne = new ArrayList<Passenger>();
      
        Car carOne = new Car(passengersOnboardCarOne, 20);
        System.out.println(carOne.getCapacity());
        Passenger alysa = new Passenger("alysa");
        Passenger renee = new Passenger("renee");

        carOne.addPassenger(alysa); 
        carOne.addPassenger(renee); 
        carOne.printManifest();
        System.out.println(carOne.seatsRemaining());
        carOne.removePassenger(alysa);
        carOne.printManifest();
    }


}