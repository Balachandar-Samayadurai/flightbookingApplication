public class Booking {



    int flightId;

    int seatNo;

    @java.lang.Override
    public java.lang.String toString() {
        return "Booking{" +
                "flightId=" + flightId +
                ", seatNo=" + seatNo +
                '}';
    }

    public Booking(int flightId, int seatNo) {
        this.flightId = flightId;
        this.seatNo = seatNo;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
