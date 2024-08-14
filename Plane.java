import java.text.DecimalFormat;
import java.util.Random;

public class Plane {
    private String airline;
    private String model;
    private int year;
    private double hoursFlown;
    private double hoursNextInspection;
    private double fuelInTank;
    private double gph; // Gallons per hour
    private boolean engineOn = false;
    private boolean landed = true;
    
    private static final double TANK_CAPACITY = 50000.0;
    private static final int HOURS_BETWEEN_INSPECTION = 48;
    private static DecimalFormat df = new DecimalFormat("###,##0.00");

    // Default constructor
    public Plane() {
        this.airline = "Southwest";
        this.model = "747";
        this.year = 2021;
        this.gph = 3600.0;
        this.fuelInTank = TANK_CAPACITY;
        this.hoursFlown = 0.0;
        this.hoursNextInspection = HOURS_BETWEEN_INSPECTION;
    }

    // Parameterized constructor
    public Plane(String airline, String model, int year, double gph) {
        this.airline = airline;
        this.model = model;
        this.year = year;
        this.gph = gph;
        this.fuelInTank = TANK_CAPACITY;
        this.hoursFlown = 0.0;
        this.hoursNextInspection = HOURS_BETWEEN_INSPECTION;
    }

    // Accessor methods
    public String getAirline() { return airline; }
    public String getModel() { return model; }
    public double getGph() { return gph; }
    public int getYear() { return year; }
    public double getHoursNextInspection() { return hoursNextInspection; }
    public double checkFlyingHours() { return hoursFlown; }
    public double checkGasGauge() { return fuelInTank; }
    
    public String toString() {
        return airline + " " + model + " " + year + 
               " Flight Hours: " + df.format(hoursFlown) + 
               " JetFuel in Tank: " + df.format(fuelInTank);
    }

    // Mutator methods
    public void setAirline(String airline) { this.airline = airline; }
    public void setModel(String model) { this.model = model; }
    public void setGph(double gph) { this.gph = gph; }
    public void setYear(int year) { this.year = year; }

    // Phase 2 methods
    public void addGas(double gallons) {
        if (engineOn || !landed) {
            System.out.println(airline + " " + model + " " + year + " must be landed and OFF to add fuel.");
            return;
        }
        if (gallons < 0) {
            System.out.println(airline + " " + model + " " + year + " gallons cannot be a negative number - Fuel in Tank after the fill up: " + df.format(fuelInTank));
        } else if (fuelInTank + gallons > TANK_CAPACITY) {
            fuelInTank = TANK_CAPACITY;
            System.out.println(airline + " " + model + " " + year + " tank overflowed - Fuel in Tank after the fill up: " + df.format(fuelInTank));
        } else {
            fuelInTank += gallons;
            System.out.println(airline + " " + model + " " + year + " added fuel: " + df.format(gallons) + " - Fuel in Tank after the fill up: " + df.format(fuelInTank));
        }
    }

    public void fly(double hours) {
        if (!engineOn) {
            System.out.println(airline + " " + model + " " + year + " must be ON to fly.");
            return;
        }
        if (hours < 0) {
            System.out.println(airline + " " + model + " " + year + " cannot fly negative miles.");
        } else if (fuelInTank < hours * gph) {
            double possibleHours = fuelInTank / gph;
            hoursFlown += possibleHours;
            fuelInTank = 0;
            System.out.println(airline + " " + model + " " + year + " ran out of fuel after flying " + df.format(possibleHours) + " hours.");
        } else {
            hoursFlown += hours;
            fuelInTank -= hours * gph;
            System.out.println(airline + " " + model + " " + year + " flew " + df.format(hours) + " hours.");
        }
    }

    public void inspect() {
        hoursNextInspection = hoursFlown + HOURS_BETWEEN_INSPECTION;
        System.out.println(airline + " " + model + " " + year + " has been inspected, next inspection is: " + df.format(hoursNextInspection));
    }

    public void checkForInspection() {
        if (hoursFlown >= hoursNextInspection) {
            System.out.println(airline + " " + model + " " + year + " - It is time to inspect.");
        } else {
            System.out.println(airline + " " + model + " " + year + " - Plane is OK, no need to inspect.");
        }
    }

    public boolean equals(Plane other) {
        return this.airline.equals(other.airline) && this.model.equals(other.model) && this.year == other.year;
    }

    // Phase 3 methods
    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            System.out.println(airline + " " + model + " " + year + " – engine started.");
        }
    }

    public void landAndStopEngine() {
        if (engineOn && !landed) {
            landed = true;
            engineOn = false;
            System.out.println(airline + " " + model + " " + year + " – was landed and stopped.");
        }
    }

    private double calcRange() {
        return fuelInTank / gph;
    }

    private double calcGasNeededToFillTank() {
        return TANK_CAPACITY - fuelInTank;
    }

    public void simulateMultiCityTrip(int numberCities) {
        Random rand = new Random();

        for (int i = 0; i < numberCities; i++) {
            double maxRange = calcRange();
            int hoursToNextCity = rand.nextInt((int)maxRange) + 1;  // Generate a random number between 1 and maxRange

            System.out.println("\n**Trip to city " + (i + 1) + ":");
            startEngine();
            fly(hoursToNextCity);
            landAndStopEngine();

            double gasNeeded = calcGasNeededToFillTank();
            addGas(gasNeeded);  // Fill the tank for the next trip
        }
    }
}
