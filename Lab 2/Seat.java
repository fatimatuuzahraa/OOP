enum SeatType {
    REGULAR(12),
    PREMIUM(18),
    VIP(25);

    private double cost;

    SeatType(double cost){
        this.cost = cost;
    }

    public double getPrice(){
        return cost;
    }
}

public class Seat {

    private String rowLabel;
    private String seatCode;
    private SeatType seatCategory;
    private boolean reserved;

    public Seat(String rowLabel, int seatNumber, SeatType seatCategory){
        this.rowLabel = rowLabel;
        this.seatCategory = seatCategory;
        this.seatCode = rowLabel + seatNumber;
        this.reserved = false;
    }

    public String getSeatID(){
        return seatCode;
    }

    public SeatType getType(){
        return seatCategory;
    }

    public boolean isBooked(){
        return reserved;
    }

    public void bookSeat(){
        reserved = true;
    }

    @Override
    public String toString(){
        return String.format(
                "SeatID:%s Type:%s Price:%.2f Booked:%b",
                seatCode, seatCategory, seatCategory.getPrice(), reserved
        );
    }
}