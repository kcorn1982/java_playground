package static_final.airport;

public class Booking {

    public static void main(String[] args) {
        Airport gatwick = new Airport("Gatwick");
        Airport heathrow = new Airport("Heathrow");

        gatwick.updateAirportStatus(true);
        heathrow.updateAirportStatus(true);

        gatwick.updateAirportStatus(false);

        gatwick.checkInPassenger();
        heathrow.checkInPassenger();


    }
}
