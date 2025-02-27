public class Token {
    public String airline; public String time; public String departureA; public String arrivalA;
    public Token(String airline, String time, String departureA, String arrivalA) {
        this.airline = airline;
        this.time = time;
        this.departureA = departureA;
        this.arrivalA = arrivalA;
    }

    @Override
    public String toString() {
        return "{Airline: "+ airline + ", Time: "+time + ", Departure: "+departureA + ", Arrival: "+arrivalA + "}";
    }

}
