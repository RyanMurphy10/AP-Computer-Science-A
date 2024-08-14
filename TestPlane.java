public class TestPlane {
    public static void main(String[] args) {
        System.out.println("\n**Testing starts");

        Plane p1 = new Plane("Delta", "737", 2018, 3500.0);
        Plane p2 = new Plane();

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n**Testing get methods:");
        System.out.println("Airline: " + p1.getAirline());
        System.out.println("Model: " + p1.getModel());
        System.out.println("GPH: " + p1.getGph());
        System.out.println("Year: " + p1.getYear());
        System.out.println("Next Inspection: " + p1.getHoursNextInspection());
        System.out.println("Flying Hours: " + p1.checkFlyingHours());
        System.out.println("Fuel in Tank: " + p1.checkGasGauge());

        System.out.println("\n**Testing addGas method:");
        p1.addGas(10000);
        p1.addGas(-5000);
        p1.addGas(60000);

        System.out.println("\n**Testing fly method:");
        p1.fly(5);
        p1.fly(-2);
        p1.fly(20);

        System.out.println("\n**Testing inspection methods:");
        p1.inspect();
        p1.checkForInspection();

        System.out.println("\n**Testing equals method:");
        System.out.println("Planes are equal: " + p1.equals(p2));

        // Testing new methods
        System.out.println("\n**Testing calcRange method:");
        double range = p1.calcRange();
        System.out.println("Maximum range: " + range + " hours");

        System.out.println("\n**Testing calcGasNeededToFillTank method:");
        double gasNeeded = p1.calcGasNeededToFillTank();
        System.out.println("Fuel needed to fill the tank: " + gasNeeded + " gallons");

        System.out.println("\n**Testing simulateMultiCityTrip method:");
        p1.simulateMultiCityTrip(3);
    }
}
