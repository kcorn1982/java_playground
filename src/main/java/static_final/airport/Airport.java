package static_final.airport;

public class Airport {
    public String name;

    public Airport(String name) {
        this.name = name;
    }

    public void updateAirportStatus(boolean airportStatus){
        AirportStatus.airportOpen = airportStatus;
    }

    public void checkInPassenger(){
        if (AirportStatus.airportOpen == false){
            System.out.println("sorry airport shut");
        } else {
            System.out.println("have a great holiday");
        }
    }


}
