import java.util.ArrayList;
public class Passenger {
    
    private String name;

    // constructor
    /**
    * constructs attributes for Passenger class
    * @param String name
    */
    public Passenger(String n) {
        this.name = n;
    }

    /**
    * method to add passenger to a car 
    * @param Car c
    */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
    * method to remove passenger to a car 
    * @param Car c
    */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
    * 
    * @param String list
    */
    public static void main(String[] args) {
        ArrayList<Passenger> passengersOnboardCarOne = new ArrayList<Passenger>(); 
        // why do i need to initialise it again?
        Passenger alysa = new Passenger("alysa");
        Passenger renee = new Passenger("renee");
        
        Car carOne = new Car(passengersOnboardCarOne, 20);
        alysa.boardCar(carOne);
        renee.boardCar(carOne);
        carOne.printManifest();
        alysa.getOffCar(carOne); // how do i call Passenger methods that use Car methods?
        carOne.printManifest();
    }

}
