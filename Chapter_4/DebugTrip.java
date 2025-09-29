// A Trip has three constructors
// When one argument is passed,
//   it is the trip destination
// When two arguments are passed,
//   they are the destination and departure cities
// When three arguments are passed,
//   the last one is the mode of transportation for the trip

public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "Car";

    // Constructor with one argument (destination only)
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // Constructor with two arguments (destination and departure)
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    // Constructor with three arguments (destination, departure, and mode)
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
}
