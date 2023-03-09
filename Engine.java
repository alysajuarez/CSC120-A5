public class Engine {

    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    // constructor
    /**
    * constructs attributes for Engine class
    * @param FuelType f 
    *           one of four options
    * @param double currentFuelLevel
    *           amount in engine
    * @param double maxtFuelLevel
    *            total engine can hold
    */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f; // what goes here?
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
       
    }
    /**
    * accessor to get fuel type of engine
    * @return FuelType
    */
    public FuelType getFuelType() {
        return this.f;
    }

    /**
    * accessor to get current fuel level of engine
    * @return currentFuelLevel
    */
    public double getCurrentFuel() {
        return this.currentFuelLevel;
    }

    
    /**
    * accessor to get maximum fuel level for engine
    * @return maxFuelLevel
    */
    public double getMaxFuel() {
        return this.maxFuelLevel;
    }


    /**
    * method to fill fuel level back to maximum level
    * @param maxFuelType
    */
    public void refuel(double maxFuelLevel) {
        this.currentFuelLevel = this.maxFuelLevel;
    }


    /**
    * method that makes fuel level go down as train moves
    * @param maxFuelType
    */
    public void go() {
        while (this.currentFuelLevel > 0) {
            
        this.currentFuelLevel = this.currentFuelLevel - 1;
        if (this. currentFuelLevel > 0) {
                System.out.println("remaining fuel level: " + this.currentFuelLevel);
        }
        else {
            System.out.println("no more fuel");
        }
    }
    }

   

    /**
    * 
    * @param String list
    */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 30.0, 100.0);
        
        System.out.println(myEngine.getCurrentFuel());
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
            // why doesn't program stop running?
        }
    }

}