import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> carsAttached; 
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;

    
    /**
    * constructs attributes for Engine class
    * @param FuelType fuelType
    *           one of four options
    * @param double fuelCapacity
    * @param int nCars
    *            number of cars attached to train
    * @param int passengerCapacity
    *            number of passengers that can fit on train
    */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.fuelType = fuelType; 
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;

        // create engine
        engine = new Engine(FuelType.ELECTRIC, 30.0, 100.0);
        
        ArrayList<Passenger> passengersOnboardCarOne = new ArrayList<Passenger>();
        ArrayList<Passenger> passengersOnboardCarTwo = new ArrayList<Passenger>();
        ArrayList<Passenger> passengersOnboardCarThree = new ArrayList<Passenger>();

        Car carOne = new Car(passengersOnboardCarOne, 20);
        Car carTwo = new Car(passengersOnboardCarTwo, 20);
        Car carThree = new Car(passengersOnboardCarThree, 20);
        
        ArrayList<Car> carsAttached = new ArrayList<Car>();


    }

    /**
    * accessor to get engine
    * @return engine
    */
    public Engine getEngine(){
        return this.engine;
    }

    /**
    * accessor to get car by index
    * @return car
    */
    public Car getCar(int i){
        return carsAttached.get(i);
    }

    /**
    * accessor to get capacity across all cars in train
    * @return maxCapacity
    */
    public int getMaxCapacity(Car c){
        // need to find max capacity in each car then add together
        return c.getCapacity() * nCars;
    }

     /**
    * accessor to get seats remaining across all cars in train
    * @return seats remaining
    */
    public int seatsRemaining(Car c){
        // need to find seats remaining in each car then add together
        return c.seatsRemaining();
    }



    public static void main(String[] args){

        Train myTrain = new Train(FuelType.ELECTRIC, 100.00, 3, 60);
        System.out.println(myTrain.getCar(1));
    }

}


